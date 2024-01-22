package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class openPolicyFilesWithoutLogin {
    public static WebDriver driver;
    @BeforeClass
    void setUp(){
        //PropertiesFile.setPropertiesFile();
        driver = new ChromeDriver();
        driver.get("https://shopplay.vn/auth/login");
        //driver.get(PropertiesFile.getPropValue("url"));
        //System.out.println(PropertiesFile.getPropValue("url"));
    }
    @Test
    public static void validateHuongDanDatHangUrlWithoutLogin() throws InterruptedException {
        //WebDriver driver = new ChromeDriver();
        //driver.get("https://staging.shopplay.vn/auth/login");
        driver.findElement(By.cssSelector("a[href='/huong-dan-dat-hang']")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://shopplay.vn/huong-dan-dat-hang");
    }

    @Test
    public static void validateVanChuyenGiaoNhanUrlWithoutLogin() throws InterruptedException {
        // WebDriver driver = new ChromeDriver();
        //driver.get("https://staging.shopplay.vn/auth/login");
        driver.findElement(By.cssSelector("a[href='/chinh-sach-van-chuyen']")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://shopplay.vn/chinh-sach-van-chuyen");
    }

    @Test
    public static void validateBaoHanhVaChamSocKhachHangUrlWithoutLogin() throws InterruptedException {
        //WebDriver driver = new ChromeDriver();
        //driver.get("https://staging.shopplay.vn/auth/login");
        driver.findElement(By.cssSelector("a[href='/chinh-sach-bao-hanh']")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://shopplay.vn/chinh-sach-bao-hanh");
    }

    @Test
    public static void validateThanhToanHoanTienUrlWithoutLogin() throws InterruptedException {
        //WebDriver driver = new ChromeDriver();
        //driver.get("https://staging.shopplay.vn/auth/login");
        driver.findElement(By.cssSelector("a[href='/chinh-sach-thanh-toan']")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://shopplay.vn/chinh-sach-thanh-toan");
    }

    @Test
    public static void validateDieuKienGiaoDichChungUrlWithoutLogin() throws InterruptedException {
        // WebDriver driver = new ChromeDriver();
        // driver.get("https://staging.shopplay.vn/auth/login");
        driver.findElement(By.cssSelector("a[href='/dieu-kien-giao-dich-chung']")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://shopplay.vn/dieu-kien-giao-dich-chung");
    }

    @Test
    public static void validateChinhSachBaoMatThongTinUrlWithoutLogin() throws InterruptedException {
        //WebDriver driver = new ChromeDriver();
        // driver.get("https://staging.shopplay.vn/auth/login");
        driver.findElement(By.cssSelector("a[href='/bao-mat-thong-tin-ca-nhan']")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://shopplay.vn/bao-mat-thong-tin-ca-nhan");
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
