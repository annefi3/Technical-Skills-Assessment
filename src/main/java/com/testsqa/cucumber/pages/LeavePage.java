package com.testsqa.cucumber.pages;

import com.testsqa.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {
    private WebDriver driver;
    public LeavePage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    public JavascriptExecutor js;

    @FindBy(xpath= "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Leave']")
    WebElement btnleave;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement txtLeave;

    @FindBy(xpath = "//a[normalize-space()='Apply']")
    WebElement btnApply;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    WebElement txtApplyLeave;

    public void goToBtnLeave(){
        btnleave.click();
    }
    public String getTxtLeave() {
        return txtLeave.getText();
    }
    public void goToBtnApply(){
        btnApply.click();
    }

    public String getTxtApplyLeave() {
        return txtApplyLeave.getText();
    }

}
