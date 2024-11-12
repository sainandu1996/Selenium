import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {
    public static void main (String [] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=3R624t3q4Zg");
         System.out.println(driver.getTitle());
         System.out.println(driver.getCurrentUrl());
         driver.close();
         //Calling Method from other class
         MethodsinJava a = new MethodsinJava();
         String s= a.GetData();
         //Calling Static method without creating object
         MethodsinJava.GetData2();


    }

}
