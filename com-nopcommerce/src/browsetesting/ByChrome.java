package browsetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ByChrome {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        //creating object for chrome driver
        WebDriver driver = new ChromeDriver();
        //open url
        driver.get(baseUrl);
        driver.manage().window().maximize();//to maximize window
        //provide implicity wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //print the title of the page
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        //print the current url
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        //print the page source
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        //find the web element for email field
        WebElement emailfield = driver.findElement(By.id("Email"));
        //provide email address by send key  to email field
        emailfield.sendKeys("prime123@gmail.com");
        //find password field
        WebElement passwordField = driver.findElement(By.id("Password"));
        //provide  password by send key to p[assword field
        passwordField.sendKeys("prime123");
        //closing driver
        driver.close();

    }
}
