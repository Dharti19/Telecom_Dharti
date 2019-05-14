package org.test.cucumbr;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/",monochrome=true, dryRun = false, strict=true,  glue="org.test.cucumbr", plugin="html:Report")

public class TestRunner {

	

}
