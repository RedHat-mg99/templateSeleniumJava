package elements;

import org.openqa.selenium.By;

public class onMainPage {
    public static By loadLoginPage = By.xpath("//div[@class='taikhoan']//a[2]");
    public static By loadRegisterPage = By.xpath("//div[@class='taikhoan']//a[1]");
    public static By shoppingLogo = By.className("shopping_cart");
    public static By searchBar = By.xpath("//form[@class='search-form clearfix']//input[@class='search-text']");
    public static By searchButton = By.xpath("//form[@class='search-form clearfix']//button[@class='search-btn']");

    public static By solutions = By.xpath("//div[@class='MuiStack-root css-ckbju8']");
    public static By mobileApplicationTesting = By.xpath("//div[@class='MuiBox-root css-0']//span[@class='MuiTypography-root MuiTypography-buttonLabel css-3nj0wx']");
    
}
