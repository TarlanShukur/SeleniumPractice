package day04_WebElements_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;

public class C03_Xpath {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com/");

      //  driver.navigate().refresh();

        Thread.sleep(7000);
       /* driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().refresh(); */


        WebElement aramaKutusu=driver.findElement((By.xpath("//input[@type='text']")));

        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        WebElement aramaSonucu=driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        System.out.println(aramaSonucu.getText());

        String [] sonucSayisi=aramaSonucu.getText().split(" ");
        System.out.println(sonucSayisi[2]);

        driver.findElement(By.xpath("(//h2)[1]")).click();

        driver.close();

    }
}
