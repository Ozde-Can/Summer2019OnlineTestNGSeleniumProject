package assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BrowserUtils;

public class Task2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        driver.navigate().to("https://www.dice.com/");

        driver.navigate().to("https://www.indeed.com/");
        BrowserUtils.wait(2);

        driver.navigate().back();
        BrowserUtils.wait(2);
        System.out.println(driver.getTitle() );
        System.out.println(driver.getCurrentUrl() );

        driver.navigate().forward();
        BrowserUtils.wait(2);
        System.out.println(driver.getTitle() );
        System.out.println(driver.getCurrentUrl() );

        driver.close();

        driver.quit();

    }
}
