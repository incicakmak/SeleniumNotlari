package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriversMethodlari {
    public static void main(String[] args) throws InterruptedException {

        /*
        jar dosyalarını yukleyerek Selenium'u kullanır hale getirdik
        ancak her bir class'in hangi browser ile calismasini istiyorsak
        o browser ile ilgili drivers'i class'da tanımlamamız lazım

        BROWSER İLE İLGİLİ TERCHMİZ DOGRULTUSUNDA
        İLGİLİ AYARLARI YAPMAK İCİN JAVA'DAKİ sYSTEM CLASSINDAN
        SetProperty()
 kullanilir.

          methoda 2 oarametre ekleyeceğiz
          1. parametre herkes icin aynı  :webdriver.chrome.driver
          2. parametre bu driver'in dosya yolu herkesin bilgisayarında farklı olabilir
          windows bilgisayarda sonunda .exe yazılmalıdır.
          maclerde .exe olmaz

         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        // istenen sayfaya gitmek icin
        driver.get("https://www.wisequarter.com");

        Thread.sleep(3000);

        driver.close();

    }



}
