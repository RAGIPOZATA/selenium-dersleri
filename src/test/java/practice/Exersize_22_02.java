package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Exersize_22_02 {

    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass

    public static void teardown(){driver.close();
    }
    @Test
    public void test01(){

        // url'ye git: https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        // ilk adı doldur
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kalender");

        // soyadını doldur
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Tersgider");

        // cinsiyeti kontrol et
        driver.findElement(By.id("sex-0")).click();

        // deneyimi kontrol edin
        driver.findElement(By.id("exp-0")).click();

        // tarihi doldur
        driver.findElement(By.id("datepicker")).sendKeys("28.07.2017");

        // mesleğinizi seçin -> Otomasyon Test Cihazı
        driver.findElement(By.id("profession-1")).click();

        // aracınızı seçin -> Selenyum Web Sürücüsü
        driver.findElement(By.id("tool-2")).click();

        // kıtanızı seçin -> Antartika
        /*WebElement ddm=driver.findElement(By.xpath("//select/[@id='continentsx']"));
        Select select=new Select(ddm);
        select.selectByVisibleText("Antartica");*/

        // komutunuzu seçin -> Tarayıcı Komutları

        // gönder düğmesine tıklayın

    }


}
