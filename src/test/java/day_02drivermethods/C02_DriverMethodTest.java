package day_02drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https:www.amazon.com");

        String actualTitle=driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        if (actualTitle.contains("Amazon")){
            System.out.println("Test Pass");
        }else {
            System.out.println("Test Failed");
        }

        Thread.sleep(3000);


        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        if (actualUrl.contains("amazon")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        String amazonWindowHandle=driver.getWindowHandle();
        System.out.println("amazonWindowHandle = " + amazonWindowHandle);

        String amazonHTML = driver.getPageSource();
        if (amazonHTML.contains("Gateway")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        driver.close();
        // driver.quit();


    }
}




