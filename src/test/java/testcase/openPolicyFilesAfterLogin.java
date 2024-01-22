package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class openPolicyFilesAfterLogin {
    static WebDriver driver;

    @BeforeClass
    void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://shopplay.vn/auth/login");
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/span/div[1]/div[1]/div[1]/input")).sendKeys("0903253722");
        driver.findElement(By.cssSelector("[type=password]")).sendKeys("Test@123");
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/span/button")).click();
        Thread.sleep(1000);
    }

    @Test
    public static void validateHuongDanDatHangUrlAfterLogin() throws InterruptedException {
        driver.findElement(By.cssSelector("a[href='/huong-dan-dat-hang']")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://shopplay.vn/huong-dan-dat-hang");
    }

    public static void validateVanChuyenGiaoNhanUrlAfterLogin() throws InterruptedException {
        driver.findElement(By.cssSelector("a[href='/chinh-sach-van-chuyen']")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://shopplay.vn/chinh-sach-van-chuyen");
    }

    @Test
    public static void validateBaoHanhVaChamSocKhachHangUrlAfterLogin() throws InterruptedException {
        driver.findElement(By.cssSelector("a[href='/chinh-sach-bao-hanh']")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://shopplay.vn/chinh-sach-bao-hanh");
    }

    @Test
    public static void validateThanhToanHoanTienUrlAfterLogin() throws InterruptedException {
        driver.findElement(By.cssSelector("a[href='/chinh-sach-thanh-toan']")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://shopplay.vn/chinh-sach-thanh-toan");
    }

//    @Test
//    public static void checkChangeTitleHoantien() throws InterruptedException {
//        WebElement element = driver.findElement(By.cssSelector("a[href='/chinh-sach-thanh-toan']"));
//        string linkText = element.getText();
//        Thread.sleep(1000);
//        assertThat
//    }

    @Test
    public static void validateDieuKienGiaoDichChungUrlAfterLogin() throws InterruptedException {
        driver.findElement(By.cssSelector("a[href='/dieu-kien-giao-dich-chung']")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://shopplay.vn/dieu-kien-giao-dich-chung");
    }

    @Test
    public static void validateChinhSachBaoMatThongTinUrlAfterLogin() throws InterruptedException {
        driver.findElement(By.cssSelector("a[href='/bao-mat-thong-tin-ca-nhan']")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://shopplay.vn/bao-mat-thong-tin-ca-nhan");
    }



    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
