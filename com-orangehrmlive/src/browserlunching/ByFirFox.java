package browserlunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ByFirFox {
    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //print the title of page
        String titlePage = driver.getTitle();
        System.out.println(titlePage);

        //print the current url
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        //print the page source
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        // the web element for username field
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

        //find the web element for password field to provide password
        WebElement passWord = driver.findElement(By.id("txtPassword"));
        passWord.sendKeys("admin123");
        driver.close();
    }
}