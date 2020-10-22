package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class login_Page {
    // import selenium webDriver
    private WebDriver driver;

    @Test
    //import chrome driver
    public void setup() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "resources/chromeDriver.exe");
        driver = new ChromeDriver();

        //input project Url = Wayapaychat  signin url
        driver.get("https://app.mywayapaychat.com/");
        //waiting for globally
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        // maximize the window
        driver.manage().window().maximize();
        //get page title
        System.out.println(driver.getTitle());
        //locate username field
        driver.findElement(By.className("PhoneInputInput")).sendKeys("xxxxxxxx");
        //locate password field
        driver.findElement(By.id("password")).sendKeys("xxxxxxxx");
        //click on the sign in button
        driver.findElement(By.xpath("//*[@id=\"page_login\"]/div/div[1]/div/div/div/div/div/form/div[4]")).click();
        Thread.sleep(10000);
        // close the browser after test
        driver.quit();

    }

    //initiate the test run command
    public static void main(String arg[]) throws InterruptedException {
        login_Page test = new login_Page();
        test.setup();

    }

}

