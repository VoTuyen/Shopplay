package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class showPopupAddToCart {
    static WebDriver driver;

    @BeforeClass
    void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://shopplay.vn/auth/login");
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/span/div[1]/div[1]/div[1]/input")).sendKeys("0903253722");
        driver.findElement(By.cssSelector("[type=password]")).sendKeys("Test@123");
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/span/button")).click();
        Thread.sleep(1000);
    }

    @Test
    public static void validateShowPopup() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"102\"]/div[1]/a/div/span/img[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"product\"]/div/div/div[2]/div[3]/div/button")).click();
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//*[@class='toasted-container top-right']/div"));
        String tilte = element.getText();
        System.out.println(tilte);
        //Thread.sleep(500);
        Assert.assertEquals(tilte, "Thêm vào giỏ hàng thành công.");
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
