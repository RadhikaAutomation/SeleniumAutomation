package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Akshay\\Selenium\\chromedriver-75.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.linkText("Create a new account")).click();

		WebElement name = driver.findElement(By.xpath("//input[contains(@name,'name')]"));
		name.sendKeys("Bharat");
		WebElement login = driver.findElement(By.xpath("//input[contains(@name,'login')]"));
		login.sendKeys("Bharat");
		WebElement check = driver.findElement(By.xpath("//input[(@value='Check availability')]"));
		check.click();

		WebElement chemsgck = driver.findElement(By.id("check_availability"));
		chemsgck.click();
		System.out.println(driver.findElement(By.id("check_availability")).getText());

		WebElement pwd = driver.findElement(By.xpath("//input[contains(@name,'passwd')]"));
		pwd.sendKeys("NewUser");

		WebElement cpwd = driver.findElement(By.xpath("//input[contains(@name,'confirm_passwd')]"));
		cpwd.sendKeys("NewUser");

		WebElement altemail = driver.findElement(By.xpath("//input[contains(@name,'altemail')]"));
		altemail.sendKeys("NewUser");

		WebElement mobno = driver.findElement(By.xpath("//input[contains(@name,'mobno')]"));
		mobno.sendKeys("1234567890");

		WebElement Day = driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
		Select DOBday = new Select(Day);
		DOBday.selectByVisibleText("05");
		
		WebElement Month = driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
		Select DobMonth = new Select(Month);
		DobMonth.selectByVisibleText("JAN");
		
		WebElement Year = driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));
		Select DobYear = new Select(Year);
		DobYear.selectByVisibleText("1990");

		WebElement Gender = driver.findElement(By.xpath("//input[(@value='f')]"));
		Gender.click();
		
		WebElement country = driver.findElement(By.id("country"));
		Select Coun = new Select(country);
		Coun.selectByVisibleText("Austria");
	}

}
