package page_fucntion;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class lookup_fucntion {
	@FindBy(css="kendo-dropdownlist#var18f580f86dc button")
	public static WebElement UseTemplateofCustomer;
	
	@FindBy(css ="kendo-combobox[formcontrolname=\"contractType\"] button")
	public static WebElement contracttype;
	
	@FindBy(css ="kendo-combobox[formcontrolname=\"contractSubType\"] button")
	public static WebElement contractsubtype;
	
	@FindBy(css ="kendo-combobox[formcontrolname=\"contractSecondaryType\"] button")
	public static WebElement contractsecondarytype;
	
	@FindBy(css ="kendo-multiselect#var18f58185da1 input")
	public static WebElement contractowner;
	
	
	
	@FindBy(css = "kendo-dropdownlist#var18f5823964e button")
	public static WebElement timeperiod;
	
	@FindBy(css = "kendo-dropdownlist#var18f58240a87 button")
	public static WebElement masteragreement;

	@FindBy(css = "kendo-dropdownlist#var18f58248b03 button")
	public static WebElement AutomaticExtensionRequired;
	
	@FindBy(css = "kendo-dropdownlist#var18f582684a2 button")
	public static WebElement contractcondition;

	@FindBy(css = "kendo-multiselect#var18f5826e3e2 input")
	public static WebElement currency;
	
	@FindBy(css = "kendo-dropdownlist#var190b5ca73c7 button")
	public static WebElement includingVAT10percent;
	
	@FindBy(css = "kendo-dropdownlist#var18f5827fad9 button")
	public static WebElement basecodition;
	
	@FindBy(css = "kendo-dropdownlist#var190b61eae96 button")
	public static WebElement paymenttype;
	
	@FindBy(css = "kendo-dropdownlist#var190b620048d button")
	public static WebElement wheathertopayinvoice;
	
	@FindBy(css = "kendo-dropdownlist#var18f58293fca button")
	public static WebElement repeatablepayments;
	
	@FindBy(css = "kendo-multiselect#var18f5829720e input")
	public static WebElement contractpriority;
	
	@FindBy(css = "kendo-dropdownlist#var18f582aa5cf button")
	public static WebElement paymentinternal;
	
	@FindBy(css = "kendo-dropdownlist#var18f582adfc0 button")
	public static WebElement paymentterm;
	
	@FindBy(css = "kendo-dropdownlist#var190b6243387 button")
	public static WebElement paymentdate;
	
	@FindBy(css = "kendo-dropdownlist#var18f582b21b8 button")
	public static WebElement penaltycalculatedmethod;
	
	@FindBy(css = "kendo-numerictextbox#var18f853f0f80 input")
	public static WebElement dailyrateofliquidateddemages;
	
	@FindBy(css = "kendo-dropdownlist#var18f582dca16 button")
	public static WebElement penaltycalculationbase;
	
	@FindBy(css = "kendo-dropdownlist#var18f8541d823 button")
	public static WebElement maximumamountofliquidateddemages;
	
	
	@FindBy(css = "kendo-dropdownlist#var19054381c11 button")
	public static WebElement chooseclientvendor;
	
	@FindBy(css = "kendo-multiselect#var18f5c85c382 input")
	public static WebElement countrycode;
	
	@FindBy(css = "kendo-multiselect#var18f5c8e46b5 input")
	public static WebElement clientname;
	
	@FindBy(css = "kendo-multiselect#var1905438e5f2 input")
	public static WebElement vendorname;
	
	@FindBy(css = "kendo-multiselect#var18f5c9110f1 input")
	public static WebElement companynumbername;
	
	@FindBy(css = "kendo-dropdownlist#var18f5cb2442a button")
	public static WebElement hasdebate;
	
	@FindBy(css = "kendo-dropdownlist#var18f5cb39f84 button")
	public static WebElement reason;
	
	@FindBy(css = "kendo-dropdownlist#var18f5cbc9888 button")
	public static WebElement ContractDraftReviewalDecision;
	
	@FindBy(css = "kendo-dropdownlist#var18f9fe32a55 button")
	public static WebElement KhorooBag;
	
	@FindBy(css = "kendo-dropdownlist#var18f5cb0746f button")
	public static WebElement budgettype;
	
	@FindBy(css = "kendo-dropdownlist#var18f9ff7017e button")
	public static WebElement VATtype;
	
	@FindBy(css = "kendo-multiselect#var19090f06594 input")
	public static WebElement selectlayer;
	
	@FindBy(css = "kendo-dropdownlist#var18f5cc0eee9 button")
	public static WebElement ContractDraftLawyerApprovalDecision;
	

	@FindBy(css = "kendo-dropdownlist#var18f5cc258de button")
	public static WebElement ContractDraftAuthorizerDecision;
	
	
	@FindBy(css=".k-animation-container li")
	public static List<WebElement> type1;
	
	
	
	public static void selectlookupvalue(String... values)
	{
		
		
		for (String value : values) {
				for (WebElement e : type1) {
				if (e.getText().trim().contains(value))

				{
					e.click();
					break;
				}
			}
		}
		}
}
