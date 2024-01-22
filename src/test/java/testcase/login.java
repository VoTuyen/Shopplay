package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class login {

    public static WebDriver driver;

    @Test
    public static void validateLoginSuccessUrl() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://shopplay.vn/auth/login");
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/span/div[1]/div[1]/div[1]/input")).sendKeys("0903253722");
        driver.findElement(By.cssSelector("[type=password]")).sendKeys("Test@123");
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/span/button")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://shopplay.vn/");
    }

    @AfterClass
    void tearDown(){
       driver.quit();
   }

}
