package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features= {".//Features/"},
		features= {".//Features/LoginDDT.feature"},
		//features= {".//Features/Login.feature",".//Features/xyz.feature"},
		//features= {".//Features/LoginDDTExcel.feature"},
		//features= {".//Features/Login.feature"},
		glue="stepsDefinitions",
		plugin= {
				"pretty", "html:reports/myreport.html",
				 "rerun:target/rerun.txt"
				},
		dryRun=false
		//tags="@sanity"  // this will execute scenarios tagged with @sanity
		//tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
		//tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
		//tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
				)
           
           /*testRunner is a built in file bcoz we specified @RunWith(Cucumber.class) annotation 
              will run the class with out mention main method*/ 
                              
           /* testRunner will talk to the Feature file 
             Feature file will talk to the Steps
             Steps methods will used to the PageObject classes to performs the actions
            */
            /*Pretty is a keyword it will helps to generate html reports
             * .// to specify direct location of feature file
             *  DryRun=true to specify this will not perform actual execution it will check
             *  every Feature step having corresponding method is created or not in stepsDefintions class
             *  and showing in console window
             *   dryRun=false By default we need to specify false it will performs the actual execution */

public class TestRunner {

}
