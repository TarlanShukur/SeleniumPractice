package day_02drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodsTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String amazonUrl="http://amazon.com";
        String techProUrl ="http://techproeducation.com";
        driver.get(amazonUrl);

        String actualTitle = driver.getTitle();
        System.out.println("Amazon Sayfasinin baslik bilgisi =" +actualTitle);

        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        driver.get(techProUrl);

        String techProEducationTitle = driver.getTitle();
        System.out.println("techProEducationTitle Sayfasinin baslik bilgisi = " + techProEducationTitle);

        String techProEducationUrl = driver.getCurrentUrl();
        System.out.println(" techProEducationUrl = " + techProEducationUrl);





    }
}
