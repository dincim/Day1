package practiceinheritance;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTest {

	static WebDriver driver;
	static String url="https://app.fairbit.com/auth/login";
	static String title="Fairbit";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/muratdinc/Documents/Libraries/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String sText = js.executeScript("return document.title;").toString();
		System.out.println(sText);
		
		String key = "id_token";
		js = ((JavascriptExecutor)driver);
        String result = (String)js.executeScript(String.format("return window.localStorage.getItem('%s');", key));
        try {
            Thread.sleep(1000);
            Object executeScript = js.executeScript("return window.localStorage.getItem('id_token');");
            String token = executeScript.toString();
            js.executeScript("return window.localStorage.removeItem('id_token');");
            driver.navigate().refresh();
            String urlResult = driver.getCurrentUrl();
            assertEquals(url, urlResult);
        }catch(Exception e) {
            System.out.println(e);
        }
	}

}
