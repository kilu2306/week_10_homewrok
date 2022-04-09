package browserlunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class ByEdge {
    public static void main(String[] args) {
        String url ="https://opensource-demo.orangehrmlive.com/";
        //set property
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //print the title pf page
        System.out.println(driver.getTitle());
        //print the current url
        System.out.println(driver.getCurrentUrl());
        //print the page source
        System.out.println(driver.getPageSource());
        //to find web element for user name field
        WebElement userName= driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        //find the web elemnet for password field
        WebElement passWord= driver.findElement(By.id("txtPassword"));
        passWord.sendKeys("admin123");
        driver.close();


    }
}
