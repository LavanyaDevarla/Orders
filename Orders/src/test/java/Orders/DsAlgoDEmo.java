package Orders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DsAlgoDEmo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\deepu\\eclipse-workspace\\Hello-World\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.findElement(By.xpath("//button[contains(text(),'Get Started')]")).click();
	driver.findElement(By.xpath("//a[@href='/login']")).click();
	driver.findElement(By.id("id_username")).sendKeys("reddy.lavi2@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Lavanya2911");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//driver.findElement(By.xpath("//html/body/div[2]/div[1]/div/div/a")).click();
	driver.findElement(By.xpath(" //body/div[3]/div[1]/div[1]/div[1]/a[1]")).click();
	driver.findElement(By.xpath("//a[@class='list-group-item']")).click();
	driver.findElement(By.xpath("//a[@class='btn btn-info']")).click();
	driver.findElement(By.xpath("//button[@type='button']")).click();
	
	
	}
}