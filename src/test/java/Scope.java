import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Scope {
    public static void main(String[] args) throws  InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //Count of Links
        List<WebElement> a = driver.findElements(By.tagName("a"));
        System.out.println(a.size());


        //Getting count of links in footer section
        WebElement  footerLinks   = driver.findElement(By.id("gf-BIG")); //limiting web driver scope
        System.out.println( footerLinks.findElements(By.tagName("a")).size());

        //Count of links in 1st section of footer
          WebElement firstSection=  footerLinks.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println( firstSection.findElements(By.tagName("a")).size());

        //Checking if links are opening for the above
        //opening links in new tabs
        for(int i =1; i<firstSection.findElements(By.tagName("a")).size();i++) {

            String enteringLinks = Keys.chord(Keys.COMMAND, Keys.ENTER);
            firstSection.findElements(By.tagName("a")).get(i).sendKeys(enteringLinks);
            Thread.sleep(6000);
        }
            Set<String> windowHandles = driver.getWindowHandles();
            Iterator<String> iterator = windowHandles.iterator();


            while(iterator.hasNext()){
                driver.switchTo().window(iterator.next());
                System.out.println(driver.getTitle());
            }





    }
}
