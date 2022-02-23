package privatePom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static WebDriver driver;
	@Test
	public void test() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		
		Pom pom = new Pom();
		pom.loginToApp("mgr123", "mgr!23");
		
	}
}
