package day_02drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.techproeducation.com/");

        Thread.sleep(3000);

        driver.navigate().to("https://www.amazon.com/");

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.quit();





    }
}
