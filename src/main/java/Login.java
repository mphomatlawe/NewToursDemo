import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\JavaProjects\\Intellij\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/newtours/");

        driver.findElement(By.xpath("//a[contains(text(),'SIGN-ON')]")).click();

        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@name='submit']")).click();

        if (driver.findElement(By.xpath("//h3[contains(.,'Login Successfully')]")).isDisplayed()){

            System.out.println("Pass");

        }else

            System.out.println("failed");
        driver.close();

    }
}
