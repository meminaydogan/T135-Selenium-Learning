package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // get(String url) verilen url'e gider
        // url yazarken www yazmasakda olabilir
        // ancak https:// yazmazsak kod çalışmaz

        driver.get("https://www.testotomasyonu.com");

        System.out.println(driver.getCurrentUrl()); // https://www.testotomasyonu.com/

        Thread.sleep(3000);
        driver.quit();

    }
}
