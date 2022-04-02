package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/Login.feature",
        glue = {"stepdefinitions"},
        snippets = SnippetType.CAMELCASE,
        tags = "@Login"
)
public class LoginNequiRunner {

}
