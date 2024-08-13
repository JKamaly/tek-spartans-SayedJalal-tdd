package playground;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import java.time.Duration;

public class Activity1 {

    public static WebDriver driver;

    @BeforeMethod
    public void setupTest(){
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testFacebookTitle(){
        String applicationTitle = driver.getTitle();
        System.out.println(applicationTitle);
        Assert.assertEquals(applicationTitle, "Facebook - log in or sign up");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }







}
