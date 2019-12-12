package assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BrowserUtils;

import java.util.concurrent.PriorityBlockingQueue;

public class Task3 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        driver.navigate().to("http://www.amazon.com/");

        String title = driver.getTitle();
        BrowserUtils.wait(3);

        if(title.contains("sale")){
            System.out.println("verified");
        }else{
            System.out.println("not-verified");
        }

        driver.close();

        driver.quit();
    }
}
