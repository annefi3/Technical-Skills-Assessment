package com.testsqa.cucumber;

import com.testsqa.cucumber.drivers.DriverSingleton;
import com.testsqa.cucumber.utils.Constants;
import com.testsqa.cucumber.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class Hooks {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ExtentReports reports = new ExtentReports("target/extent-report.html");

    @Before
    public static void setUp(){
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        TestScenarios[] test = TestScenarios.values();
        extentTest = reports.startTest(test[Utils.testCount].getTestCaseName());
        Utils.testCount++;
    }
    @After
    public void endTestCase(){
        reports.endTest(extentTest);
        reports.flush();
    }
    @AfterStep
    public void getResultStatus(Scenario scanario) throws IOException {
        if (scanario.isFailed()){
            String screenshotPath = Utils.getScreenshot(driver, scanario.getName()).replace(" "," ");
            extentTest.log(LogStatus.FAIL, scanario.getName()+"\n"
                    +extentTest.addScreenCapture(screenshotPath));
        }
    }

    @AfterAll
    public static void quitBrowser() {
        delay(3);
        DriverSingleton.closeObjectInstance();
    }

    public static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
