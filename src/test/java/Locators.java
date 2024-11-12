import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public  static void main (String[] args) throws  InterruptedException{

        //Implicit wait didnt work here
        //Thread.sleep(5000);
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Saikrishna");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshetty");
        driver.findElement(By.className("submit")).click();

        //<p class="error">* Incorrect username or password </p>
        //CSS locator tagname.classname
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

        //<a href="#" css="1">Forgot your password?</a>
        //Link Text
        driver.findElement(By.linkText("Forgot your password?")).click();

        //Used thread.sleep because it  the element_intercepted error occured coz of sliding
        Thread.sleep(2000);


        //<input type="text" placeholder="Name" css="1">
        //Xpath Locator //Tagname[attribute="value"]
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sai Krishna");

        //<input type="text" placeholder="Email">
        //Css Location using the tagname Tagname[attribute='value']
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Saikrishna@gmail.com");

        //Same tag of above but indexing using Xpath if there are no unique attributes
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        //CSS Selector using Indexing
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Sai@gmail.com");

        //Traverse from parent to child in Xpath just use tah name
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("4567");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //<button class="reset-pwd-btn" xpath="1">Reset Login</button>
         driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();

         //Traversing Parent to child in CSS
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());


    }
}
