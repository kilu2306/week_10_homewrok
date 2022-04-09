package browselounching;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTesting {
    public static void main(String[] args) {
        String url = "https://courses.ultimateqa.com/users/sign_in";
        String browser = "firefox";
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            new ChromeDriver().get(url);
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
            new FirefoxDriver().get(url);
        } else
            System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
        new EdgeDriver().get(url);

    }
}