import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //wait until all components are loaded
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //wait until basic elements are loaded
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();


    }
}
