import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.net.URL;
import java.time.Duration;


public class seleniumallure {


    private static final Logger LOGGER = LoggerFactory.getLogger(seleniumallure.class.getName());
    private URL pathResources = seleniumallure.class.getResource("/files/");


    @Test
    @Description("Some detailed test description")
    public void googlesearch() throws Exception {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.google.com");

        WebElement searchtext = driver.findElement(By.xpath("//input[@class='gLFyf']"));
        searchtext.sendKeys("andasis");

        searchtext.submit();

        driver.quit();

    }


    @Test
    public void amazonsearch() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");


        WebElement searchtext = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchtext.sendKeys("C++ code");

        searchtext.submit();


        driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();

        driver.quit();

    }

    @Test
    public void mvnrepositorysearch() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.mvnrepository.com");


        WebElement searchtext = driver.findElement(By.xpath("//input[@id='query']"));
        searchtext.sendKeys("TestNG");

        searchtext.submit();


        driver.findElement(By.xpath("//a[@href='/artifact/org.testng/testng']")).click();

        driver.findElement(By.xpath("//a[@class='vbtn release']")).click();

        driver.findElement(By.xpath("//textarea[@id='maven-a']")).click();

        driver.quit();

    }

}
