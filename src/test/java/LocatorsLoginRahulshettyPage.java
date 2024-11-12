import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Arrays;

public class LocatorsLoginRahulshettyPage {
    public static void main (String[] args) throws  InterruptedException {
        WebDriver driver = new ChromeDriver();
        String name ="Saikrishna";
        String Key = getPassword(driver);

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Saikrishna");



        driver.findElement(By.name("inputPassword")).sendKeys(Key);
        driver.findElement(By.className("submit")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.tagName("p")).getText());

        //Assertion to check if its logged in
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        System.out.println(driver.findElement(By.xpath("//div/h2")).getText());

        //Assertion to check with login name
        Assert.assertEquals(driver.findElement(By.xpath("//div/h2")).getText(),"Hello "+name+",");

        //<button class="logout-btn" css="1">Log Out</button>
        //Xpath with text
        driver.findElement(By.xpath("//button[text()='Log Out']"));
        //driver.close();
    }

    //creating a method to get the dynamic password from webpage
    public static String getPassword(WebDriver driver) throws InterruptedException



    {

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText =driver.findElement(By.cssSelector("form p")).getText();

//Please use temporary password 'rahulshettyacademy' to Login.

        String[] passwordArray = passwordText.split("'");

// String[] passwordArray2 = passwordArray[1].split("'");

// passwordArray2[0]

        String password = passwordArray[1].split("'")[0];

        return password;

//0th index - Please use temporary password

//1st index - rahulshettyacademy' to Login.



//0th index - rahulshettyacademy

//1st index - to Login.





    }













}