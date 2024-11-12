import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DynamicDropdown
{
    public  static void main(String[] args) throws  InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        ////option[@value = 'AIP']
        driver.findElement(By.xpath("//a[@value='HYD']")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);


        //CalenderUI

        driver.findElement(By.cssSelector("a.ui-state-default ui-state-highlight")).click();


        //Autosuggestion Dropdowns

        driver.findElement(By.id("autosuggest")).sendKeys("IND");
        Thread.sleep(2000);
        List<WebElement> options  =     driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for( WebElement option :options)
        {
            if (option.getText().equalsIgnoreCase("India"))
            {
                option.click();
                break;
            }
        }







    }
}
