package day05_xpath_cssselector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_CssSelector {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        driver.findElement(By.cssSelector("button[onclick=\"addElement()\"]")).click();
        Thread.sleep(3000);

        WebElement deleteButtom = driver.findElement(By.cssSelector("button[class=\"added-manually\"]"));
        if (deleteButtom.isDisplayed()){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        Thread.sleep(3000);
        deleteButtom.click();

        Thread.sleep(3000);

        WebElement addRemoveText=driver.findElement(By.cssSelector("h3"));
        System.out.println(addRemoveText.isDisplayed() ? "Test Passed" : "Test Failed");


        driver.close();

    }
}
