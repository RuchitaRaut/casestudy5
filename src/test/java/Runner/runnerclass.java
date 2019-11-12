package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\exercs4.feature",
                 glue="TestCase",
               plugin="junit:target\\xmlreport.xml",
              // plugin="json:target\\jsonreport.json")
                 //plugin="html:target\\htmlreport")
                 tags= {"~@payment"})
public class runnerclass {

}
