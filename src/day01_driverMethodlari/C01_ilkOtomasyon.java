package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkOtomasyon {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("http://www.testotomasyonu.com");

        Thread.sleep(5000);

        // driver.close();
        driver.quit();

    }
}
