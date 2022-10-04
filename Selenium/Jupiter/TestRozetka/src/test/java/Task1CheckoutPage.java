import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task1CheckoutPage {
    @Test
    public void testCheckout() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String searchFirstResult = "(//button[contains(@class,'buy-button ng-star-inserted')])[1]";
        String openShoppingCart = "//button[@class='header__button ng-star-inserted header__button--active']";
        String openCheckout = "//a[@class='button button_size_large button_color_green cart-receipt__submit ng-star-inserted']";

        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        //search input google and click on it
        WebElement searchFieldGoogle = driver.findElement(By.xpath("//input[@name='q']"));
        searchFieldGoogle.click();
        //input in google search values and submit
        searchFieldGoogle.sendKeys("Rozetka ua");
        searchFieldGoogle.submit();
        //click on first element after google search
        WebElement refToRozetka = driver.findElement(By.xpath("//h3[1]"));
        refToRozetka.click();
        //refresh page rozetka.ua
        driver.navigate().refresh();
        //search input field, enter values and submit
        WebElement searchFieldRozetka = driver.findElement(By.name("search"));
        searchFieldRozetka.click();
        searchFieldRozetka.sendKeys("зонтик");
        searchFieldRozetka.sendKeys(Keys.ENTER);
        //wait search results and choose first
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchFirstResult)));
        driver.findElement(By.xpath(searchFirstResult)).click();
        //wait shopping cart button and click on it
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(openShoppingCart)));
        driver.findElement(By.xpath(openShoppingCart)).click();
        //wait checkout button and click on it
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(openCheckout)));
        driver.findElement(By.xpath(openCheckout)).click();
        //wait download checkout page and get url
        wait.until(ExpectedConditions.urlContains("checkout"));
        System.out.println(driver.getCurrentUrl());
        if (driver.getCurrentUrl().equals("https://rozetka.com.ua/checkout/"))
            System.out.println("Current URL is equal expected");
        else System.out.println("Something wrong");
        driver.close();
    }
}
