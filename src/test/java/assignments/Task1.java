package assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import utils.BrowserUtils;

public class Task1 {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        driver.navigate().to(" https://www.cybertekschool.com/");
        driver.close();


        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver firefoxdriver = new FirefoxDriver();
        firefoxdriver.get("http://google.com");
        BrowserUtils.wait(2);
        firefoxdriver.navigate().to(" http://practice.cybertekschool.com/");
        firefoxdriver.close();




    }


}