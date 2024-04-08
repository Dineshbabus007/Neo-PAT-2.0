package stepdef;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(features="src/test/resources", glue="stepdef" ,monochrome = true, dryRun = false, strict = false, tags = "@bulk")

public class runner extends AbstractTestNGCucumberTests{

	
	
}

       