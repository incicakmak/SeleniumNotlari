package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {

    public static void main(String[] args) {

         System.setProperty("Webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.wisequarter.com");

        System.out.println(driver.getWindowHandle());
        // CDwindow-35D79E8DFCF0205B000135E96D393BF0
       // CDwindow-5A4D19A0336A12581A132DB792ADFC05
        //getWindowHandle selenium tarafindan her driver sayfasi icin uretilen
        //unique handle degerini dondurur.
        //getWindowHandle() ise test sirasinda birden fazla sayfa acilmissa
        //bir set olarak tum sayfalarin window handle degerlerini dondurur.

        System.out.println(driver.getPageSource());

        // sayfa kodlari "2 hours weekly meeting with the team" iceriyor mu test edin


        String expectedIcerik = "2 hours weekly meeting with the team";

        String actualSayfaKodlari = driver.getPageSource();

        if (actualSayfaKodlari.contains(expectedIcerik)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }


        driver.quit();
        //close() ve quit() ikiside sayfa kapatmak icin kullanilir.
        // close() sadece bir sayfa kapatirken
        //quit() test sırasında acılan tum sayfalari kapatır

    }



}
