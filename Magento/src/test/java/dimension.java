

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dimension {
@Test	
public void Main() {
	
WebDriver driver=new ChromeDriver();
WebDriverManager.chromedriver().setup();
driver.get("https://www.naukri.com/mnjuser/homepage");


}
}
