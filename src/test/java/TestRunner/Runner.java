package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
   
                features="src/test/resources",
                glue={"stepDefinition"},
                dryRun = false,
                //tags = "@TC4",
                plugin = {"pretty", "json:target/cucumber.json",
                                    "html:target/htmlreport.html"}
 
)
public class Runner  extends AbstractTestNGCucumberTests{
    
    
}
