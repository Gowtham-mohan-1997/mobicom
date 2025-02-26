package common_fucntion;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class common_fucntion {
	public static WebDriver driver = null;
	public static Properties properties = null;

	public static Properties loadpropertyfile() throws IOException {

		FileInputStream fileinputstream = new FileInputStream("configure.properties");
		properties = new Properties();
		properties.load(fileinputstream);
		return properties;

	}

	@Before
	public void launchbrowser() throws IOException {

		loadpropertyfile();

		String browser = properties.getProperty("browser");

		String url = properties.getProperty("url");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	 

	@After
	public void teardown() {
		try {
	        if (driver != null) {
	            driver.quit();
	            System.out.println("Browser closed successfully.");
	        }
	    } catch (Exception e) {
	        System.err.println("Error during teardown: " + e.getMessage());
	        throw e; // Rethrow to include in CompositeCucumberException
	    }
	}
}
