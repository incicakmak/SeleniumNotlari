package day02_webelements_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ImplicitlyWait {
    public static void main(String[] args) {

        System.setProperty("web.driver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
         driveri bir web uygulamasına gonderdigimizde o sayfanın acılması
         orada istedigimiz islemleri yapmak icin
         elementleri bulması gibi islemler zaman gerektirebilir.

        ImplicitlyWait butun zaman isteyen islemler icin
        driver'in ne kadar bekleyecegini belirlerler.


         */
    }


}
