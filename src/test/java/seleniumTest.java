import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commons.recordScreen;
import commons.takeScreenshot;



public class seleniumTest {

    // public FirefoxOptions options;
    public WebDriver driver;
    public static String browser = "Safari";
    public ITestResult result;

    @BeforeTest
    void Setup() throws IOException, AWTException{
        switch (browser) {
            case "Firefox": driver = new FirefoxDriver(); break;
            case "Safari": driver = new SafariDriver(); break;
        
            default: driver = new SafariDriver();
                break;
        }

        
        driver.manage().window().maximize();
        recordScreen.startRecord(browser);
    }

    @Test
    void TestCase1() throws InterruptedException, IOException{
        driver.get("https://www.saucedemo.com/v1/");
        driver.findElement(elements.onLoginPage.userName).sendKeys("standard_user");
        driver.findElement(elements.onLoginPage.password).sendKeys("secret_sauce");
        driver.findElement(elements.onLoginPage.loginBtn).click();
        Thread.sleep(2000);
        takeScreenshot.captureScreenshot(driver, "result");
    }

    @Test
    void TestCase2() throws InterruptedException, IOException{
        driver.get("https://www.saucedemo.com/v1/");
        WebElement userNameField = driver.findElement(elements.onLoginPage.userName);
        userNameField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(RelativeLocator.with(By.tagName("input")).below(userNameField));
        passwordField.sendKeys("secret_sauce");
        WebElement loginBtnField = driver.findElement(RelativeLocator.with(By.tagName("input")).below(passwordField));
        loginBtnField.click();
        Thread.sleep(2000);
    }

    @Test
    void TestCase3(){
        driver.navigate().to("https://www.saucedemo.com/v1/inventory.html");
        List<WebElement> inventoryList = driver.findElements(By.className("inventory_item"));
        System.out.println("Number of elements: "+ inventoryList.size());
        for (int i=0; i<inventoryList.size();i++){
            System.out.println(inventoryList.get(i).getAttribute("margin-right"));
        }
        
    }

    @AfterTest
    void release() throws IOException{
        recordScreen.stopRecord();
        driver.quit();
    }

}
