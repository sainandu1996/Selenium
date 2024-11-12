import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Assignment2 {

    public  static  void  main(String[] args) throws  InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();

        WebDriverWait a = new WebDriverWait(driver, Duration.ofSeconds(5));
        a.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/button[2]")));

        driver.findElement(By.xpath("//div/button[2]")).click();

         WebElement dropdown =    driver.findElement(By.cssSelector("select.form-control"));
         Select options = new Select(dropdown);
         options.selectByIndex(2);

         driver.findElement(By.cssSelector("input#terms")).click();
         driver.findElement(By.cssSelector("input#signInBtn")).click();

         WebDriverWait ab = new WebDriverWait(driver, Duration.ofSeconds(5));
         ab.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn.btn-info")));

           List<WebElement> products = driver.findElements(By.cssSelector("button.btn.btn-info"));
         for(int i = 0;i<products.size();i++){
            driver.findElement(By.cssSelector("button.btn.btn-info")).click();
         }

         driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();







    }
}
