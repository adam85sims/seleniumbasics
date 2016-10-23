package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowserMaximize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.w3schools.com/");

		driver.manage().window().maximize();

		driver.close();
	}

}
