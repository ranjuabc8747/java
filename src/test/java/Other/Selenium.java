package Other;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.atlassian.com/");
		RemoteWebDriver r= (RemoteWebDriver) driver;
		String c="window.scrollTo(0,document.body.scrollHeight)";
		r.executeScript(c);
	}

}
