import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class endtoEndFlight {
    public  static  void  main(String [] args) throws  InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        driver.findElement(By.xpath("//a[@value='HYD']")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();


        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
            System.out.println("The to date is enabled");
            Assert.assertTrue(true);

        }
        else {
            Assert.assertTrue(false);
        }

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);

        //loop to slect multiple clicks on adults
        for(int i =0; i<=5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
      driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();



    }
}
