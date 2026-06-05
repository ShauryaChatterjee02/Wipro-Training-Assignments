package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.JsonReader;

public class SauceDemoLoginTest extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() throws Exception {

        return JsonReader.getJsonData(
                "src/test/resources/testdata/loginData.json");
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username,
                          String password) {

        driver.findElement(By.id("user-name"))
                .sendKeys(username);

        driver.findElement(By.id("password"))
                .sendKeys(password);

        driver.findElement(By.id("login-button"))
                .click();

        System.out.println(
                "Login executed for user: "
                        + username);

        String currentUrl =
                driver.getCurrentUrl();

        if(username.equals("standard_user")
                || username.equals("problem_user")
                || username.equals("performance_glitch_user")) {

            Assert.assertTrue(
                    currentUrl.contains("inventory"),
                    "Login Failed");
        }
    }
}