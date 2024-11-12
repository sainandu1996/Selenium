import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class Assignment3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Checkbox click and grab -- use get attribute to grab text
       WebElement option =  driver.findElement(By.xpath("//input[@value='option2']"));
       option.click();
        WebElement value =   driver.findElement(By.xpath("//input[@value='option2']"));
        String valuee= value.getAttribute("value");
        System.out.println(valuee);

        //selecting option2 dynamically

          WebElement dropdown=  driver.findElement(By.id("dropdown-class-example"));
        Select a = new Select(dropdown);
        a.selectByValue(valuee);

        //editbox dynamically
        driver.findElement(By.id("name")).sendKeys(valuee);
        driver.findElement(By.id("alertbtn")).click();
         String word = driver.switchTo().alert().getText();
         String wordd= word.split(",")[0].split(" ")[1];
        Assert.assertEquals(valuee,wordd);
        driver.switchTo().alert().accept();



    }
}
