package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/feature/Sophos.feature", glue= {"Definitions"}, snippets= SnippetType.CAMELCASE, tags= "@tag1")

public class Runner {
	

}
