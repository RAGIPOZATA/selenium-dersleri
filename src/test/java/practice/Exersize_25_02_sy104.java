package practice;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilites.TestBaseClsss;

public class Exersize_25_02_sy104 extends TestBaseClsss {

    @Test
    public void test(){
        //   Handle Dropdown
        // 1. http://zero.webappsecurity.com/ Adresine gidin
        driver.get("http://zero.webappsecurity.com/");

        //2. Sign in butonuna basin
        driver.findElement(By.id("signin_button")).click();

        //3. Login kutusuna “username” yazin
        driver.findElement(By.id("user_login")).sendKeys("username");

        //4. Password kutusuna “password.” yazin
        driver.findElement(By.id("user_password")).sendKeys("password");

        //5. Sign in tusuna basin
        driver.findElement(By.name("submit")).click();

        //6. Pay Bills sayfasina gidin
        driver.navigate().back();
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.id("pay_bills_link")).click();

        //7. “Purchase Foreign Currency” tusuna basin
        driver.findElement(By.linkText("Purchase Foreign Currency")).click();

        //8. “Currency” drop down menusunden Eurozone’u secin
        WebElement ddm= driver.findElement(By.xpath("//select[@id='pc_currency']"));
        Select select=new Select(ddm);
        select.selectByIndex(6);

        //9. “amount” kutusuna bir sayi girin
        driver.findElement(By.id("pc_amount")).sendKeys("2000");

        //10. “US Dollars” in secilmedigini test edin
        WebElement dollars= driver.findElement(By.id("pc_inDollars_true"));
        Assert.assertFalse(dollars.isSelected());

        //11. “Selected currency” butonunu secin
        driver.findElement(By.id("pc_inDollars_false")).click();

        //12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
        driver.findElement(By.id("pc_calculate_costs")).click();
        driver.findElement(By.id("purchase_cash")).click();

        //13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini
        //    kontrol edin.
       WebElement text=driver.findElement(By.id("alert_content"));
       Assert.assertTrue(text.isDisplayed());

    }




}
