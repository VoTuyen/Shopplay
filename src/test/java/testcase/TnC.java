package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TnC {
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
    public static void validateShowTnC() throws InterruptedException {
        driver.findElement(By.xpath("//*[@aria-label='Toggle cart sidebar']")).click();
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"cart-checkout\"]/div[2]/div/div[4]/strong"));
        String TnC = element.getText();
        System.out.println(TnC);
        Assert.assertEquals(TnC,"Nhấn \"Đặt hàng\" đồng nghĩa với việc bạn đồng ý tuân theo Điều khoản Shop Play");
    }
}
