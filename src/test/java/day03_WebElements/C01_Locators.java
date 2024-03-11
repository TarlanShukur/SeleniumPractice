package day03_WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://amazon.com");


        //WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        //aramaKutusu.sendKeys("iphone");
        //aramaKutusu.submit();

        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

        driver.findElement(By.name("field-keywords")).sendKeys("iphone", Keys.ENTER);






        driver.close();






    }
}


