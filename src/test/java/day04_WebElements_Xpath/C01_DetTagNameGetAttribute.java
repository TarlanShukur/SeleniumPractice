package day04_WebElements_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_DetTagNameGetAttribute {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.techproeducation.com/");

        WebElement aramaKutusu =driver.findElement(By.id("searchHeaderInput"));
        String actualTagName = aramaKutusu.getTagName();
        String expectedTagName = "input";

        if (actualTagName.equals(expectedTagName)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }


        String actualAttributeValue =aramaKutusu.getAttribute("class");
        String expectedAttributeValue="form-input";

        if (actualAttributeValue.equals(expectedAttributeValue)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        Thread.sleep(3000);

        driver.close();




    }
}
