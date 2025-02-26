package page_fucntion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class page_fucntion {
	@FindBy(xpath = "//span[text()=\" Contract  List \"]")
	public static WebElement contractlist;
	
	@FindBy(css = "div span[title=\"New Contract Request\"]")
	public static WebElement newcontractrequest;
	
	@FindBy(css = "kendo-textbox[id=\"var18f4cc33891\"] input")
	public static WebElement contracttitle;
	
	@FindBy(xpath = "//span[text()=\"Contract Template\"]")
	public static WebElement ContractTemplate;
	
	@FindBy(css = "button[themecolor=\"primary\"] span i[class=\"fa-solid fa-filter\"]")
	public static WebElement apply;

	@FindBy(css = ".k-calendar-nav-today")
	public static WebElement today;
	
	@FindBy(xpath = "//span[text()=\"Create\"]")
	public static WebElement create;
	
	@FindBy(xpath = "//span[text()=\" Proceed with template. \"]")
	public static WebElement proceedwithtemplate;
	
	@FindBy(xpath = "//span[text()=\" Next \"]")
	public static WebElement next;
	
	@FindBy(xpath = "//span[text()=\"Save\"]")
	public static WebElement save;
	
	@FindBy(css = "kendo-datepicker#var18f58225c49 button")
	public static WebElement contractenddate;
	
	@FindBy(css = "kendo-numerictextbox#var18f763f665e input")
	public static WebElement contracttimeline;
	
	@FindBy(css = "kendo-textbox#var18fba0ffa43 input")
	public static WebElement contractperiod;
	
	@FindBy(css = "kendo-textarea#var18f582546d9 textarea")
	public static WebElement briefdescription;
	
	@FindBy(css = "div#var1905d8c3d1e kendo-upload div[tabindex=\"0\"]")
	public static WebElement selectassetfile;
	
	@FindBy(css = "div#var19208d9f702 kendo-upload div[tabindex=\"0\"]")
	public static WebElement AttachSupportingDocuments;
	
	@FindBy(css = "kendo-numerictextbox#var1927a48407c input")
	public static WebElement exchangerange;
	
	@FindBy(css = "kendo-numerictextbox#var18f5827506a input")
	public static WebElement contractamount;
	
	@FindBy(css = "kendo-textbox#var18f5cb32be9 input")
	public static WebElement evaluationcriteria;
	
	@FindBy(css = "kendo-textarea#var18f5cb35b9f textarea")
	public static WebElement contractconclusion;
	
	@FindBy(xpath = "//span[text()=\" Upload Template \"]")
	public static WebElement uploadtemplate;
	
	
	@FindBy(css = "div input[accept=\".docx\"]")
	public static WebElement uploadtemplate1;
	
	@FindBy(css = "kendo-textarea#var18f9ff815f9 textarea")
	public static WebElement decisionmadelog;
	
	@FindBy(css = "kendo-datepicker#var18fa004c91d button")
	public static WebElement contractcompletiondate;
	
	@FindBy(css = "button[fillmode=\"flat\"] span h3")
	public static WebElement logout1;
	
	@FindBy(css = "button[title=\"Logout\"]")
	public static WebElement logout2;
	
	@FindBy(xpath = "//span[text()=\" Inbox \"]")
	public static WebElement inbox;
	
	@FindBy(xpath = "//td[text()=\" CONTRACT MANAGEMENT \"]")
	public static WebElement contractmanagement;
	
	@FindBy(css = "div[role=\"presentation\"] tbody tr[data-kendo-grid-item-index=\"0\"] td[data-kendo-grid-column-index=\"0\"]")
	public static WebElement selectfirsttask;
	
	@FindBy(xpath = "//span[text()=\"Complete Task\"]")
	public static WebElement completetask;

	
	@FindBy(css = "div[role=\"presentation\"] tbody tr[data-kendo-grid-item-index=\"0\"] td[data-kendo-grid-column-index=\"0\"]")
	public static WebElement contractlistselectfirsttask;
	
	@FindBy(xpath = "//span[text()=\"Renew Contract\"]")
	public static WebElement renewcontract;
	
	@FindBy(css = "kendo-textarea#var1906d0957fc textarea")
	public static WebElement reasonforrenewcontract;
	
	@FindBy(xpath = "/html/body/app-root/app-app-container/div[1]/div[2]/div[3]/app-app-common-detail/div[2]/div/div/div[1]/div/div")
	public static WebElement contractnumber;
	
	@FindBy(xpath = "/html/body/app-root/app-app-container/div[1]/div[2]/div[3]/app-task-details/div/div/div/div/div[1]/div/div/div[2]/div/div/div[3]/div[2]")
	public static WebElement contractnumber1;
	
	@FindBy(css = "div#var190a6b804e0 kendo-upload input")
	public static WebElement BriefInformationDocumentReupload;
	
	@FindBy(css = "div[id=\"k-tabstrip-tabpanel-0\"] kendo-upload[id=\"browse\"] input")
	public static WebElement BriefInformationDocumentReupload1;
	
	@FindBy(css = "div#var190a68d63eb kendo-upload input")
	public static WebElement uploadsignedcontract;
	
	@FindBy(xpath = "//span[text()=\" Contract Renewals \"]")
	public static WebElement contractrenewal;
	
	@FindBy(xpath = "//span[text()=\"Place On Hold\"]")
	public static WebElement placeonhold;
	
	@FindBy(css = "kendo-datepicker#var1905e765139 button")
	public static WebElement freezeenddate;
	
	@FindBy(css = "kendo-textarea#var1905e769d82 textarea")
	public static WebElement reasonforfreeze;
	
	@FindBy(xpath = "//span[text()=\"Release Hold\"]")
	public static WebElement releasehold;
	
	@FindBy(css = "kendo-textarea#var1906c8cb098 textarea")
	public static WebElement useremarks;
	
	@FindBy(css = "kendo-textarea#var1905350f2ad textarea")
	public static WebElement reasonfortermination;
	
	@FindBy(xpath = "//span[text()=\"Terminate\"]")
	public static WebElement terminate;
	
	@FindBy(xpath = "//span[text()=\" Save \"]")
	public static WebElement savedocument;


	@FindBy(xpath = "/html/body/app-root/app-app-container/div[1]/div[2]/div[3]/app-app-common-detail/div[2]/div/div/div[4]/div")
	public static WebElement status;
}
