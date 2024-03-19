package day02_webelement_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_DriverManage {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.manage().window().maximize();
        System.out.println("maximize konum : " + driver.manage().window().getPosition());


        Thread.sleep(3000);

        driver.manage().window().fullscreen();
        System.out.println("full screen konum : "+ driver.manage().window().getPosition());
        Thread.sleep(3000);

        driver.manage().window().minimize();
        System.out.println("minimize konum : " + driver.manage().window().getPosition());
        Thread.sleep(3000);

        driver.quit();
    }
}
