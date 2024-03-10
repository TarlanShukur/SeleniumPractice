package day01_driverilktest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C01_DriverTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver chromedriver = new ChromeDriver();
        chromedriver.get("https://google.com");



        WebDriverManager.edgedriver().setup();
        WebDriver edgeDriver =new EdgeDriver();
        edgeDriver.get("https://google.com");

        WebDriverManager.firefoxdriver().setup();
        WebDriver fireFoxDriver = new FirefoxDriver();
        fireFoxDriver.get("https://google.com");

    }
}
