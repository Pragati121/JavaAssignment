package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
//import java.util.Properties;

public class BillingInfo {
    WebDriver driver;
    public static Properties prop;
    By Firstname=By.xpath("//input[@name='firstName']");
    By Lastname=By.xpath("//input[@name='lastName']");
    By Zipcode=By.xpath("//input[@id='postal-code']");
    By Continue=By.xpath("//input[@name='continue']");
    By Finish = By.xpath("//button[@name='finish']");
    public BillingInfo(WebDriver driver){
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void BillMethod(){
        try {
            prop = new Properties();
            FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//TestData//Resource.properties");
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.findElement(Firstname).sendKeys(prop.getProperty("fName"));
        driver.findElement(Lastname).sendKeys(prop.getProperty("lName"));
        driver.findElement(Zipcode).sendKeys(prop.getProperty("zipCode"));
        driver.findElement(Continue).click();
        driver.findElement(Finish).click();
    }
////        driver.findElement(Firstname).sendKeys("pragati");
////        driver.findElement(Lastname).sendKeys("sharma");
//        driver.findElement(Zipcode).sendKeys("153884");

    }

