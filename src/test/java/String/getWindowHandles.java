package String;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class getWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actiTIME.com/");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(5000);
		Set<String> allwid = driver.getWindowHandles();
		String expectedTitle = "actiTIME Online Terms of Service";
		int count = allwid.size();
		System.out.println(count);
		for(String wid:allwid)
		{
			String title = driver.switchTo().window(wid).getTitle();
			System.out.println(title);
			//System.out.println(wid);
			if(title.contains("actiTIME - Time Tracking Software"))
			{
				driver.close();
				
			}
			
			}
	}}


