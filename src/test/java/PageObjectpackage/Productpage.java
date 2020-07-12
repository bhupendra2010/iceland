package PageObjectpackage;

import commonpackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class Productpage extends DriverFactory {

    public void selectproduct(){
        WebElement search=driver.findElement(By.id("header-search"));
        search.sendKeys("socks");
        search.sendKeys(Keys.ENTER);
    }
    public void productlist(){
        List<WebElement>products=driver.findElements(By.cssSelector("div[class='product-name']"));
        products.size();
        Random random=new Random();
        WebElement randomno=products.get(random.nextInt(products.size()));
        randomno.click();
    }
    public void selectitem(){
        WebElement select=driver.findElement(By.id("add-to-cart"));
        select.click();
        driver.findElement(By.id("dropdown-postcode-input")).sendKeys("RH10 5HH");
    }
}
