package browselounching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ByChrome {
    public static void main(String[] args) {
        String url="https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;
        driver.get(url);
        //to  maange window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //print the title od the page
        String pageTitle= driver.getTitle();
        System.out.println(pageTitle);
//print the current url
        String currentUrl= driver.getCurrentUrl();
        System.out.println(currentUrl);
        //print the page source
        String pageSource= driver.getPageSource();
        System.out.println(pageSource);
        //to find web element for email field
        WebElement emailField= driver.findElement(By.id("user[email]"));
        emailField.sendKeys("prime1234@gmail.com");
        //to find web element for password field
        WebElement passWord= driver.findElement(By.name("user[password]"));
        passWord.sendKeys("prime123");
        driver.close();


    }
}
