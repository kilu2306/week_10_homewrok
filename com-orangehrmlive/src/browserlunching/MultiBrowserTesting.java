package browserlunching;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTesting {
    public static void main(String[] args) {
        String browser = "edge";
        String url = "https://opensource-demo.orangehrmlive.com/";
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            new ChromeDriver().get(url);
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
            new FirefoxDriver().get(url);

        } else System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
        new EdgeDriver().get(url);

    }
}
