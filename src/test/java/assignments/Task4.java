package assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BrowserUtils;

public class Task4 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        driver.navigate().to("http://www.newtours.demoaut.com/");

        driver.findElement(By.name("userName")).sendKeys("tutorial");
        BrowserUtils.wait(1);
        driver.findElement(By.name("password")).sendKeys("tutorial");
        BrowserUtils.wait(1);
        driver.findElement(By.name("login")).click();

        String title = driver.getTitle();
        BrowserUtils.wait(2);
        if(title.contains("Find a Flight")){
            System.out.println("verified");
        }else{
            System.out.println("non-verified");
        }

        driver.close();

    }
}
