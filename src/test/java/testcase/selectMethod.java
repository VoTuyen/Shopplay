package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class selectMethod {

    WebDriver driver = new EdgeDriver();



    @Test
    void test() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://thanh-tuyen.netlify.app/");

        //Khởi tạo 1 object cho class WebDriverWait và 1 bien tham chiếu wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"posts\"]")));
        element1.click();
        Thread.sleep(1000);
        Select dropdown1 = new Select(element1);
        dropdown1.selectByValue("100");

        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"albumns\"]")));
        element2.click();
        Thread.sleep(1000);
        Select dropdown2 = new Select(element2);
        dropdown2.selectByValue("10");

//        List<WebElement> dropdowns1 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"posts\"]")));
//        for (WebElement dropdown1 : dropdowns1) {
//            Select select1 = new Select(dropdown1);
//            select1.selectByIndex(0);
//        }

//        List<WebElement> dropdowns2 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"albumns\"]")));
//        for (WebElement dropdown2 : dropdowns2) {
//            Select select2 = new Select(dropdown2);
//            select2.selectByValue("1");
//        }


    }
}
