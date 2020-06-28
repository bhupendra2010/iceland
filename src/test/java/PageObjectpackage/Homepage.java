package PageObjectpackage;

import commonpackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Homepage extends DriverFactory {

    public void baseurl(){
        driver.getCurrentUrl();
    }
    public void Register(){
        driver.findElement(By.cssSelector("a[class='user-register']")).click();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)");
    }
    public void Detail(){
        Select dropdown=new Select(driver.findElement(By.id("dwfrm_profile_customer_title")));
        System.out.println(dropdown.getOptions().size());
        List<WebElement>options=dropdown.getOptions();
        for (WebElement option:options){
            System.out.println(option.getText());
            dropdown.selectByVisibleText("Mr");
        }

    }
}
