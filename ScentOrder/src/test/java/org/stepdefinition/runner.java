package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions
(features = "TestCases/suite1",glue = "org.stepdefinition",monochrome = true,dryRun = false,strict = false,
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:Reports","junit:Reports\\junitreport.xml","json:Reports\\jsonreport.json"})
public class runner {

}
