package com.orangehrm.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/Features/Login.feature",
    glue = {"com.orangehrm.test"},
    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}