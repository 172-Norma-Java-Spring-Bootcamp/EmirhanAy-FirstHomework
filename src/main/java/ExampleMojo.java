

import org.apache.maven.Maven;
import org.apache.maven.model.Developer;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
/*
* @author Emirhan Ay
*/

@Mojo(name = "example", defaultPhase = LifecyclePhase.INITIALIZE)
public class ExampleMojo extends AbstractMojo {


    @Parameter(property = "project", readonly = true)
    MavenProject project;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        Developer developer = new Developer();
        developer.setEmail("dev.emirhanay@gmail.com");
        developer.setName("Emirhan Ay");

        project.addDeveloper(developer);


        getLog().info("This project is developed by " + project.getDevelopers().get(0).getName());




    }
}
