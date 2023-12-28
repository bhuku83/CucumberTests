package com.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//import org.testng.annotations.BeforeClass;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"com/features/TestFeature.feature"},
        glue = {"stepDefinitions"},
        //stepNotifications = true,
        monochrome = true

)

public class TestRunnerClass {

}
