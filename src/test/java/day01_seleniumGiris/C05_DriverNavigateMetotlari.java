package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_DriverNavigateMetotlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver", "drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // wisequarter anasayfaya gidin
        driver.get("https://www.wisequarter.com");
        Thread.sleep(6000);
        // yeniden amazon anasayfaya gidin
        driver.navigate().back();
        Thread.sleep(6000);
        // wisequarter anasayfaya donun
        driver.navigate().forward();
        Thread.sleep(6000);
        // navigate().to(),   driver.get() ile ayni islemi yapar
        driver.navigate().to("https://www.youtube.com");
        driver.navigate().refresh();
        Thread.sleep(6000);
        driver.close();
    }
}
