package browsetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class ByEdge {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        //to maximize screen
        driver.manage().window().maximize();
        //to give implicity wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //print the title of the page
        String titlePage = driver.getTitle();
        System.out.println(titlePage);
        //print the current url
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        //print the page source
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        //find webelement for emailfield
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("prime1234@gmail.com");
        //find webelement for passwordfiled
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("prime123");
        //close the browser
        driver.close();
    }
}
