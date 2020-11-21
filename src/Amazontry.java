import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/giris/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement textsearch = driver.findElement(By.id("twotabsearchtextbox"));
		textsearch.sendKeys("archana");
		
		WebElement btnsearch = driver.findElement(By.className("nav-input"));
		btnsearch.click();

	}

}
