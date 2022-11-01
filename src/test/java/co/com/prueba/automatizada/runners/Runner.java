package co.com.prueba.automatizada.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/retoqvision.feature",
        tags = "@scenario1",
        glue = "co.com.prueba.automatizada.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class Runner {
}
