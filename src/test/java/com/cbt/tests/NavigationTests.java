package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import com.google.common.base.Verify;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        Thread.sleep(3000);

        String getCurrentUrl = driver.getCurrentUrl();
        String actualCurentUrl = "https://google.com";
        String titleGoogle = driver.getTitle();
        System.out.println("title = " + titleGoogle);

        driver.get("https://etsy.com");
        Thread.sleep(3000);
        String titleEtsy = driver.getTitle();
        System.out.println("etsyTitle = " + titleEtsy);

        driver.navigate().back();
        String currentTitleGoogle = driver.getTitle();

        Verify verifyGoogle = StringUtility.getVerifyEquals(currentTitleGoogle, titleGoogle);

        driver.navigate().forward();
        String currentTitleEtsy = driver.getTitle();

        Verify verifyEtsy = StringUtility.getVerifyEquals(currentTitleEtsy, titleEtsy);



        driver.quit();

    }
}
