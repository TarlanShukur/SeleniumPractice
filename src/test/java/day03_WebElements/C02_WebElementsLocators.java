package day03_WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementsLocators {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.google.com/");


        WebElement searchBox =driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium");
        searchBox.submit();

        Thread.sleep(3000);

        String actualTitle= driver.getTitle();

        if (actualTitle.contains("selenium")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        List<WebElement> links =driver.findElements(By.tagName("a"));
        System.out.println("linklerin sayisi = " + links.size());

        for ( WebElement w :links ) {
            if (!w.getText().isEmpty()){
                System.out.println(w.getText());
            }

        }

        driver.close();

    }
}
