import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Users/giris/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.janbasktraining.com/login");
		WebElement username = driver.findElement(By.id("login_name"));
		username.sendKeys("archanagsoni31@gmail.com");
		WebElement pass = driver.findElement(By.id("login_pass"));
		pass.sendKeys("Vihaan@02");
		WebElement signin = driver.findElement(By.className("buttonctadarkbtn"));
		signin.click();
		
	}

}
