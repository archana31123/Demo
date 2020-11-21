package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllAnotations {
@Test
	public void testcase1() {
		//System.setProperty("webdriver.chrome.driver","C:/Users/giris/Downloads/chromedriver_win32/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
	//	driver.findElement(By.xpath("//*[@value='Female']")).click();
	System.out.println("This is my first test case..");
	}
@Test
public void testcase2() {
	System.out.println("This is my second test case.");
}
@BeforeMethod
public void be4remethod() {
	System.out.println("This method should execute before test case.");
}
@AfterMethod
public void afterremethod() {
	System.out.println("This method should execute After test case.");
}

@BeforeClass
public void beforecls() {
	System.out.println("This method should execute before class.");
	
}
@AfterClass
public void aftercls() {
	System.out.println("This method should execute after class.");
	
}
}
