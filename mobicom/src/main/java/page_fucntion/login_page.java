package page_fucntion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	

	@FindBy(css = "input[name=\"loginName\"]")
	public static WebElement username;
	
	@FindBy(css = "kendo-textbox[name=\"loginPassword\"] input")
	public static WebElement password;
	
	@FindBy(xpath = "//button[text()=\"Login\"]")
	public static WebElement login;
	
	

	


}
