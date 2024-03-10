package day_02drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_ImplicityWait {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://www.techproeducation.com/");

        String expectedTitle = "TechPro Education";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle.equals(expectedTitle) ? "Test Passed" : "Test Failed");

        driver.get("https://facebook.com");

        if (driver.getCurrentUrl().contains("facebook")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        driver.navigate().back();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        driver.close();



    }
}
