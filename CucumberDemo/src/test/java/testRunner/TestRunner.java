package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					//features= {".//Features/"},
					//features= {".//features/Login.feature"},  //This executed originally no tags
					//features= {".//features/Registration.feature"},
					//features= {".//Features/LoginDDTExcel.feature"},
					features= {".//Features/Login.feature",".//Features/Registration.feature"},
					//features= {"@target/rerun.txt"},
					glue={"stepDefinitions", "hooks"}, 
					plugin= {
							  "pretty", "html:reports/myreport.html", 
							  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							  "rerun:target/rerun.txt",
							},
							
					dryRun=false, //true, only checks mapping between scenario steps and step definition methods
					monochrome=true,    // to avoid junk characters in output, mainly in Jenkins
					publish=true  // to publish report in cucumber server
					//tags="@sanity"  // this will execute scenarios tagged with @sanity
					//tags="@regression"
					//tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
					//tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
					//tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
		)
public class TestRunner {

		}
