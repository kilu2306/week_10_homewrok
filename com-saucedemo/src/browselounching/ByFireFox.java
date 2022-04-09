package browselounching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ByFireFox {
    public static void main(String[] args) {
        String url = "https://www.saucedemo.com/";
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        //to manage window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //print the title of page
        System.out.println(driver.getTitle());
        //print curent url
        System.out.println(driver.getCurrentUrl());
        //print the page source
        System.out.println(driver.getPageSource());
        // to find web element for username field
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("kinjal108");
        //to find web element for password field
        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys("prime123");

        driver.close();
    }
}
