package TestRunner;
 
import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
   
                features={"src/test/resources"},
                glue={"stepDefinition"},
                dryRun = true,
                //tags = "@TC4",
                plugin = {"pretty", "json:target\\cucumber.json",
                                    "html:target\\htmlreport.html"}
 
)
public class Runner {
   
   
}