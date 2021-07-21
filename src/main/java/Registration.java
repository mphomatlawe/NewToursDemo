import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;



public class Registration {

    public static void main(String[] args){
//Chrome driver path to be declared
       System.setProperty("webdriver.chrome.driver","C:\\JavaProjects\\Intellij\\Drivers\\chromedriver.exe");
       //declaring new variable
       WebDriver driver = new ChromeDriver();
       //Maximize window
       driver.manage().window().maximize();
       //open website
       driver.get("http://demo.guru99.com/test/newtours/");

       driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
       driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("mpho");
       driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("matlawe");
       driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234567891");
       driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("test@email.com");
       driver.findElement(By.xpath("//input[@nam='address1']")).sendKeys("58 west road");
       driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Johannesburg");
       driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Gauteng");
       driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("0122");

       //DropDown box country selection

       WebElement element = driver.findElement(By.name("country"));
       Select sel = new Select(element);
       sel.selectByValue("SOUTH AFRICA");

       driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("mmatlawe");
       driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("mpho");
       driver.findElement(By.xpath("//input[contains(@name,'confirmPassword')]")).sendKeys("mpho");
       driver.findElement(By.xpath("//input[contains(@name,'submit')]")).click();

       //verification of successful registration
       if (driver.findElement(By.xpath("//b[contains(.,'Note: Your user name is mmatlawe.')]")).isDisplayed()){

          System.out.println("Registration Passed");
       }else

          System.out.println("Registration Failed");

       driver.close();





    }
}
