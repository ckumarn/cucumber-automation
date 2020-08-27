package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
/*
 * @CucumberOptions( features = "src/test/java/features",
 * glue="stepDefinations",tags="@PortalTest",strict=true,monochrome=true,
 * plugin= {"pretty","html:target/cucumber","json:target/cucumber.json",
 * "junit:target/cukes.xml"})
 */
@CucumberOptions(
        features = {"src/test/java/features/"},
        glue = "stepDefinations",
        tags = {"@PortalTest, @WebTest, @MobileTest, @SmokeTest"},
        strict = true,
        dryRun = false,
        monochrome  = true,
        		format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/json-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun-reports/rerun.txt","junit:target/cukes.xml"
        })
public class TestRunner {

}
