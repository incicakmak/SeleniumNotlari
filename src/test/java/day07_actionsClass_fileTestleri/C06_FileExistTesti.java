package day07_actionsClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;
import java.nio.file.Files;
import java.nio.file.Paths;

import static utilities.TestBaseClass.driver;

public class C06_FileExistTesti extends TestBase{

    @Test
    public void test01(){
        //2. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");
        //3. logo.png dosyasını indirelim
        driver.findElement(By.xpath("//a[text()='data.txt']")).click();
        //4. Dosyanın başarıyla indirilip indirilmediğini test edelim
        bekle(7);

        // dosya downloads'a inecegi icin dinamik dosya yolu olusturalim
        String dinamikDosyaYolu= System.getProperty("user.home")+"\\ Downloads\\data.txt";
        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));
    }

}
