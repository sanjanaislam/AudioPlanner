package com.AP.TestRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests; 

public class TestNGTestRunner {
	
	@CucumberOptions (
			
			features = {"Feature"},
			glue = { "com.AP.StepDef"},
			tags = {"@userlogin"}
			
		)	
		
        public class TestRunner extends AbstractTestNGCucumberTests{}
	
}
