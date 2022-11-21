package Orders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class juiceOrder3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\deepu\\eclipse-workspace\\Hello-World\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://juice-shop.herokuapp.com/#/login");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Lavi29@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Lavi123");
	driver.findElement(By.xpath("//button[@id='loginButton']")).click();

}}
