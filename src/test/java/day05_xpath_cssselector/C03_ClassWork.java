package day05_xpath_cssselector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ClassWork {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("http://zero.webappsecurity.com/");


        driver.findElement(By.cssSelector("button[type='button']")).click();

        WebElement login = driver.findElement(By.cssSelector("input[type='text']"));
        login.sendKeys("username", Keys.TAB, "password", Keys.ENTER);
        Thread.sleep(3000);

        driver.navigate().back();

        driver.findElement(By.cssSelector("li[id='onlineBankingMenu']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[.='Pay Bills']")).click();
        Thread.sleep(2000);

        WebElement amount=driver.findElement(By.cssSelector("input[name='amount']"));
        amount.sendKeys("500",Keys.TAB,"2020-09-10",Keys.TAB,Keys.TAB);
        Thread.sleep(3000);
        amount.sendKeys(Keys.ENTER);

        WebElement message=driver.findElement(By.xpath("(//span[1])"));
        String actualSuccessMessage = message.getText();
        String expectedSuccesMessage="The payment was successfully submitted.";
        if (actualSuccessMessage.equals(expectedSuccesMessage)){
            System.out.println("Test Passes");
        }else {
            System.out.println("Test Failed");
        }

        driver.close();





    }
}
