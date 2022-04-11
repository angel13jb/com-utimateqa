package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl="https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();//using edge driver
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximize size
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//implicitly time
        String title= driver.getTitle();//get page title
        System.out.println(title);
        String currentUrl= driver.getCurrentUrl();//get current url
        System.out.println("current URL="+currentUrl);
        WebElement emailField= driver.findElement(By.id("user[email]"));//find email element
        emailField.sendKeys("prime123@gmail.com");
        WebElement password= driver.findElement(By.name("user[password]"));//find password element
        password.sendKeys("Prime123");
        //closing url
        driver.close();
    }
}
