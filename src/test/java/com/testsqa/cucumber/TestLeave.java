package com.testsqa.cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testsqa.cucumber.pages.LeavePage;
import com.testsqa.cucumber.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import libtest.LiblaryTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLeave {
    public static WebDriver driver;
    public static LoginPage pageLog;
    public static LeavePage leavePage = new LeavePage();

    public static ExtentTest extentTest;

    public TestLeave() {
        driver = LiblaryTest.driver;
        pageLog = new LoginPage();
        extentTest = LiblaryTest.extentTest;
    }

    @When("Admin click menu Leave")
    public void admin_click_menu_leave() {
        leavePage.goToBtnLeave();
        extentTest.log(LogStatus.PASS, "Admin click menu Leave");
    }
    @And("User go to page Leave")
    public void user_go_to_page_leave() {
        System.out.println("User go to page Leave");
        Assert.assertEquals(leavePage.getTxtLeave(), "Leave");
    }
    @And("Admin click menu Apply")
    public void admin_click_menu_Apply() {
        leavePage.goToBtnApply();
        extentTest.log(LogStatus.PASS, "Admin click menu Apply");
    }

    @Then("User go to page Apply")
    public void user_go_to_page_Apply() {
        System.out.println("User go to page Apply");
        Assert.assertEquals(leavePage.getTxtApplyLeave(), "Apply Leave");
    }

}
