import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static org.jsoup.nodes.Document.OutputSettings.Syntax.xml;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\bhupe\\Iceland\\src\\test\\resources",
        plugin = {"html:target/cucumber-html-report",
                "json:target/cucumber-json-report.json",
                "junit:target/cucumber-xml-report.xml",
                "pretty:target/cucumber-pretty-report.txt"})
public class Runner {
}
