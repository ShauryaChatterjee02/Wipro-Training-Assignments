package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.CSVReader;

public class SauceDemoLoginTestCSV extends BaseTest {

    @DataProvider(name = "csvData")
    public Object[][] csvData() throws Exception {

        return CSVReader.getCSVData(
                "src/test/resources/testdata/loginData.csv");
    }

    @Test(dataProvider = "csvData")
    public void loginTest(String username, String password) {

        driver.findElement(By.id("user-name"))
              .sendKeys(username);

        driver.findElement(By.id("password"))
              .sendKeys(password);

        driver.findElement(By.id("login-button"))
              .click();

        System.out.println("Login executed for: " + username);

        if (!username.equals("locked_out_user")) {

            Assert.assertTrue(
                    driver.getCurrentUrl().contains("inventory"),
                    "Login Failed for " + username);
        }
    }
}