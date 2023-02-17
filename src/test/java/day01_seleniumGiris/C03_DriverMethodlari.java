package day01_seleniumGiris;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class C03_DriverMethodlari {

    public static void main(String[] args) {

        System.setProperty("web.driver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // gittiginiz sayfadaki title ve url'yi yazdirin
        System.out.println("URL : "+driver.getCurrentUrl());
        System.out.println("Baslik : "+driver.getTitle());

        // amazon anasayfaya gittiginizi test edin

        // Test expected result ile actual result'in karşilastirilmasidir.
        //ornegin url amazon iceriyorsa diyebiliriz.

        String expectedIcerik="amazon";
        String actualUrl=driver.getCurrentUrl();

      if (actualUrl.contains(expectedIcerik)){// amazon sayfasina gittiysek
          System.out.println("Test PASSED");
      }else {
          System.out.println("Test FAILED");
      }



    }


}
