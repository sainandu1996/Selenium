import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class miscellaneous {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=gxU1wlBAsig");

        //Maximize
        driver.manage().window().maximize();

        //delete all cookies
        driver.manage().deleteAllCookies();

        //delete specific cookie like session id
       // driver.manage().deleteCookie("");

        //Take Screenshot and save in local
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("/Applications/screenshot.png"));
    }
}
