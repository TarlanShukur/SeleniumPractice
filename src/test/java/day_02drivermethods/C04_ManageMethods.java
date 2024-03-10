package day_02drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_ManageMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techproeducation.com/");

        Thread.sleep(3000);

        System.out.println("Sayfanin konumu = " +driver.manage().window().getPosition());

        System.out.println("Sayfanin olculeri = " + driver.manage().window().getSize());

        driver.manage().window().minimize();
        Thread.sleep(3000);

        driver.manage().window().maximize();

        System.out.println("Sayfanin konumu = " + driver.manage().window().getSize());
        System.out.println("Sayfanin olculeri = " + driver.manage().window().getSize());


        Thread.sleep(3000);

        driver.manage().window().fullscreen();

        Thread.sleep(3000);

        System.out.println("Sayfanin konumu = " + driver.manage().window().getSize());
        System.out.println("Sayfanin olculeri = " + driver.manage().window().getSize());

        driver.close();











    }
}
