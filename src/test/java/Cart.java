import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Cart {
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver=new ChromeDriver();

       //Implicit wait -global wait
       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
       String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
      driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        addItems(driver,itemsNeeded);

        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

        //Explicit Wait for targeted elements

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");



        driver.findElement(By.cssSelector("button.promoBtn")).click();
        //Thread.sleep(4000);
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
        Assert.assertEquals("Code applied ..!", driver.findElement(By.cssSelector("span.promoInfo")).getText());
    }



        public static  void addItems(WebDriver driver,String[] itemsNeeded)
        {
            int j=0;
            List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
            for(int i=0;i<products.size();i++)
            {
                String[] name=products.get(i).getText().split("-");
                String formattedName=name[0].trim();
//format it to get actual vegetable name
//convert array into array list for easy search
//  check whether name you extracted is present in arrayList or not-
                List itemsNeededList = Arrays.asList(itemsNeeded);
                if(itemsNeededList.contains(formattedName))
                {
                    j++;
//click on Add to cart
                    driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                    if(j==itemsNeeded.length)
                    {
                        break;
                    }

                }



            }
    }


    }




