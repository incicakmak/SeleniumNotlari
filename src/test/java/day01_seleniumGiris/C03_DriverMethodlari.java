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




    }


}
