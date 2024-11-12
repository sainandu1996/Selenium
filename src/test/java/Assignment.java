import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
    public  static  void  main(String[] args) throws  InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("sai");
        driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("Sai@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("Sai");
        driver.findElement(By.id("exampleCheck1")).click();
        WebElement staticdropdown =    driver.findElement(By.id("exampleFormControlSelect1"));

        Select dropdown = new Select(staticdropdown);
        dropdown.selectByIndex(1);


        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.className("form-control")).sendKeys("04/14/1996");
        driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
        //System.out.println(   driver.findElement(By.xpath("//div/strong")).getText());
        System.out.println(driver.findElement(By.cssSelector(".alert")).getText());
    }
}
