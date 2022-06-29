package tests;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver= new ChromeDriver();
//
//        driver.get("https://www.duotech.io/");

        Faker faker= new Faker();
        System.out.println(faker.address().firstName());
        System.out.println(faker.address().lastName());
        System.out.println(faker.business().creditCardNumber());
        System.out.println(faker.address().streetAddress());
        System.out.println(faker.chuckNorris().fact());

    }
   @Test
    public void verifyTitleTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.duotech.io/");
        Assert.assertEquals(driver.getTitle(),"<title>Software QA Automation Engineer program | SDET | QA School | Software Testing");
      driver.quit();
    }
    @Test
    public void verifyURLTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.duotech.io/");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.duotech.io/");
        driver.quit();
    }
}
