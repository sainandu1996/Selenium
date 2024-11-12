import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ChromeOption {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        //Bypassing BadSSL
        options.setAcceptInsecureCerts(false);

        //Setting Up Proxy
        //Create object then pass the value

        Proxy proxy = new Proxy();
        proxy.setHttpProxy("ipaddress:444");
        options.setCapability("proxy", proxy);

        //Blocking Popup windows while Automation
        options.setExperimentalOption("ExcludeSwitches", Arrays.asList("disable-popup-blocking"));

        //Setting Download Directory

        Map<String, Object>  prefs = new HashMap<String,Object>();
        prefs.put("download.default_directory", "/directory/path");
        options.setExperimentalOption("prefs",prefs);


        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());
    }
}
