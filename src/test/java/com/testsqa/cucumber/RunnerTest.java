package com.testsqa.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features/1.Login.feature",
                    "src/main/resources/features/2.Recruitment.feature",
                    "src/main/resources/Features/3.Leave.feature"},
        glue = {"com.testsqa.cucumber"},
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {

}