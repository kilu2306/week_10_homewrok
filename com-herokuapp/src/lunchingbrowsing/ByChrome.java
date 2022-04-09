package lunchingbrowsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ByChrome {
    public static void main(String[] args) {
       String url="http://the-internet.herokuapp.com/login";
       System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //to maximize screen
        driver.manage().window().maximize();
        //to provide implicity wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //proint the title of the oage
        String titlePage= driver.getTitle();
        System.out.println(titlePage);

        //to print the current url
        String currentUrl= driver.getCurrentUrl();
        System.out.println(currentUrl);

        // print the page source
        String pageSource= driver.getPageSource();
        System.out.println(pageSource);

        // to find web element for username field
        WebElement userName= driver.findElement(By.name("username"));
        userName.sendKeys("Kinjal108");

        //to find element for password field
        WebElement passWord= driver.findElement(By.name("password"));
        passWord.sendKeys("prime123");

        driver.close();
    }
}
