package org.vw.qa.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.vw.qa.PageObject.LoginHomePage;

public class LoginTest {


    private LoginTest() {

    }

    @Test
    public void LoginIntoApplication() throws Exception {
        LoginHomePage login = new LoginHomePage();
        login.signInLocally();
        login.enterUsername("G49KEM4");
        login.enterPassword("G49KEM4");


    }

    @Test
    public void testOnFirefoxLatestVersionWithSeleniumManager() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://author-p125316-e1232273.adobeaemcloud.com/libs/granite/core/content/login.html?resource=%2F&$$login$$=%24%24login%24%24&j_reason=unknown&j_reason_code=unknown");
        driver.findElement(By.xpath("//coral-accordion-item-label[contains(.,'Sign in locally (admin tasks only)')]")).click();
        driver.findElement(By.xpath("//input[@id='username']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).click();
        driver.findElement(By.xpath("//button[@id='submit-button']")).click();



    }
}
