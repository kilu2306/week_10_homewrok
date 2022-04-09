package browserlunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ByChrome {
    public static void main(String[] args) {
        String url="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();//to maximze xcreen
        //to provide implicity wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //print the title of page
        String titlePage= driver.getTitle();
        System.out.println(titlePage);
        //print the current url
        String currentUrl= driver.getCurrentUrl();
        System.out.println(currentUrl);
        //print the page source
        String pageSource= driver.getPageSource();
        System.out.println(pageSource);
        // the web element for username field
        WebElement userName= driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        //find the web elemnet for password field
        WebElement passWord= driver.findElement(By.id("txtPassword"));
        passWord.sendKeys("admin123");
        driver.close();
    }
}
