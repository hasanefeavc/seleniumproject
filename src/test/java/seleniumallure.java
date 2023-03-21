import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.net.URL;
import java.time.Duration;

public class seleniumallure {



    private static final Logger LOGGER = LoggerFactory.getLogger(seleniumallure.class.getName());
    private URL pathResources = seleniumallure.class.getResource("/files/");


    @Test
    public void googlesearch() throws Exception {

        String chromeDriverLocation = null;
        String currentProjectLocation = System.getProperty("user.dir");
        chromeDriverLocation = currentProjectLocation.concat("/home/efe/Downloads/chromedriver_linux64/chromedriver");


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://www.google.com");

        WebElement searchtext = driver.findElement(By.xpath("//input[@class='gLFyf']"));
        searchtext.sendKeys("mvnrepository");

        searchtext.submit();

        driver.quit();

    }


    @Test
    public void amazonsearch() {

        String chromeDriverLocation = null;
        String currentProjectLocation = System.getProperty("user.dir");
        chromeDriverLocation = currentProjectLocation.concat("/home/efe/Downloads/chromedriver_linux64/chromedriver");


        System.setProperty("webdriver.chrome.drive", chromeDriverLocation);
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
    public void facebooksearchsearch() {

        String chromeDriverLocation = null;
        String currentProjectLocation = System.getProperty("user.dir");
        chromeDriverLocation = currentProjectLocation.concat("/home/efe/Downloads/chromedriver_linux64/chromedriver");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://tr-tr.facebook.com/");


        WebElement emailtext = driver.findElement(By.xpath("//input[@id='email']"));
        emailtext.sendKeys("hasanefeavc");

        WebElement passtext = driver.findElement(By.xpath("//input[@id='pass']"));
        passtext.sendKeys("hasanefeavc");

        WebElement button = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));

        button.submit();


    }

}
