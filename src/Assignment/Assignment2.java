package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Rakini");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("BHavishy1213@gmail.com");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("121212");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement option = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select Gender = new Select(option);
		Gender.selectByVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("02/17/1998");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());

	}

}
