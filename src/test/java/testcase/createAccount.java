package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class createAccount {
    WebDriver driver;
    @Test
    public void createNewAccountSuccess() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://shopplay.vn/auth/login");
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/span/div[2]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/div[2]/span/div[1]/input")).sendKeys("0361234511");

        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/div[2]/span/div[2]/div[1]/div/input")).sendKeys("Test@123");
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/div[2]/span/div[3]/div[1]/div/input")).sendKeys("Test@123");
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/button")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://shopplay.vn/auth/login");
    }
    @Test
    public void loginSuccessWithNewAccount() throws InterruptedException{
        driver.get("https://shopplay.vn/auth/login");
        //driver.findElement(By.cssSelector("[type=text]")).sendKeys("0361234511");
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/span/div[1]/div[1]/div[1]/input")).sendKeys("0361234511");
        driver.findElement(By.cssSelector("[type=password]")).sendKeys("Test@123");
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/span/button")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://shopplay.vn/");
        System.out.print(driver.getCurrentUrl());
    }
    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
