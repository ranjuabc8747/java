package Other;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Practice2 {
	@Test
	public void t()
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		a.sendKeys("t").perform();
	}

}
