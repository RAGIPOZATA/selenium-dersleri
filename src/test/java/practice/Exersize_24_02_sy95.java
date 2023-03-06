package practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilites.TestBase;

public class Exersize_24_02_sy95 extends TestBase {
    @Test
    public void yanlisEmailTesti(){
        /*Assertions
    1. Bir Class olusturalim YanlisEmailTesti
    2. http://automationpractice.com/index.php sayfasina gidelim*/
    driver.get("https://www.amazon.com/");

    //3. Sign in butonuna basalim
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();

    //4. Email kutusuna @isareti olmayan bir mail yazip enter’a
        WebElement emailBox=driver.findElement(By.id("ap_email"));
        emailBox.sendKeys("vuslat-42hotmail.com"+ Keys.ENTER);

    //bastigimizda “Invalid email address” uyarisi ciktigini test edelim*/
        WebElement uyari=driver.findElement(By.xpath("//span[@class='a-list-item']"));
        Assert.assertTrue(uyari.isDisplayed());


    }

}
