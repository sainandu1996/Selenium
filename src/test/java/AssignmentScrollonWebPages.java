import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AssignmentScrollonWebPages {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //rows count
        List<WebElement> rows = driver.findElements(By.cssSelector(".table-display tr"));
        System.out.println(rows.size());

        //coloums count
       List<WebElement> coloumns = driver.findElements(By.cssSelector(".table-display th"));
        System.out.println(coloumns.size());

        //getting text from 2nd row
        System.out.println( driver.findElement(By.xpath("//table/tbody/tr[3]")).getText());

    }
}
