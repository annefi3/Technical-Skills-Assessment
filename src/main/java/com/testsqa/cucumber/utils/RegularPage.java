package com.testsqa.cucumber.utils;

import com.testsqa.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;

public class RegularPage {
    public static void delayDuration(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void scrollPage(String atas, String bawah) {
        JavascriptExecutor js;
        js = (JavascriptExecutor) DriverSingleton.getDriver();
        js.executeScript("window.scrollBy(" + atas + "," + bawah + ")");
        System.out.println("Scroll bar");
    }
}
