package steps.com.ua;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = ("steps.com.ua"),
        plugin = "pretty"
)

public class RunnerTest {



}
