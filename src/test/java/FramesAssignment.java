import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();

        // Switch to the top frame
        driver.switchTo().frame("frame-top");

// Switch to the middle frame
        driver.switchTo().frame("frame-middle");

// interact with elements in the middle frame
        String middleFrameText = driver.findElement(By.tagName("body")).getText();
        System.out.println("Text in middle frame: " + middleFrameText);

// Switch back to default content
        driver.switchTo().defaultContent();


    }
}
