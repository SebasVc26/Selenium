/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Sebastian
 */
public class JavaApplication3 {

    static WebDriver driver;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver",
                "F:\Universidad\Selenium\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www/amazon.com");
        System.out.println("Page tittle is" + driver.getTitle());
        driver.quit();
    }
    
}
