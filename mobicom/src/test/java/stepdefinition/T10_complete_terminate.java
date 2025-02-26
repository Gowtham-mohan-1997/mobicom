package stepdefinition;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.v85.runtime.model.Timestamp;
import org.openqa.selenium.support.PageFactory;

import common_fucntion.common_fucntion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_fucntion.login_page;
import page_fucntion.lookup_fucntion;
import page_fucntion.page_fucntion;
import page_fucntion.utility;

public class T10_complete_terminate extends common_fucntion{
	public static String select;
	public String receiptValue1 =new Timestamp(System.currentTimeMillis()).toString();


	@Given("create contract request with yes")
	public void create_contract_request_with_yes() throws IOException, InterruptedException {
		launchbrowser();
		Thread.sleep(1000);
		PageFactory.initElements(driver, login_page.class);
		PageFactory.initElements(driver, page_fucntion.class);
		login_page.username.sendKeys(properties.getProperty("iniatiator"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
		Thread.sleep(1000);
	
		
		Thread.sleep(1000);
		utility.clickWithWait(page_fucntion.contractlist);
		Thread.sleep(1000);
		utility.clickWithWait(page_fucntion.newcontractrequest);
		Thread.sleep(3000);

		PageFactory.initElements(driver, lookup_fucntion.class);
		page_fucntion.contracttitle.sendKeys(receiptValue1);
		Thread.sleep(3000);

		lookup_fucntion.UseTemplateofCustomer.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue("Yes");
		Thread.sleep(1000);
		page_fucntion.ContractTemplate.click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);

		lookup_fucntion.contracttype.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue("800 - Work execution");
		Thread.sleep(1000);

		utility.clickWithWait(lookup_fucntion.contractsubtype);
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue("Work execution contracts related to Marketing");
		Thread.sleep(1000);

		utility.clickWithWait(lookup_fucntion.contractsecondarytype);
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue("Ажил гүйцэтгэх гэрээ маркетинг");
		Thread.sleep(1000);

		utility.clickWithWait(page_fucntion.uploadtemplate);
		Thread.sleep(1000);
		page_fucntion.uploadtemplate1.sendKeys("/home/gautham/Downloads/sample1.docx");
		Thread.sleep(8000);
		for (int i = 0; i < 20; i++) {
			try {
				page_fucntion.proceedwithtemplate.click();
				Thread.sleep(3000);

				break;
			} catch (Exception e) {
				Thread.sleep(1000);
			}

		}
		page_fucntion.next.click();
		Thread.sleep(3000);
		page_fucntion.savedocument.click();
		Thread.sleep(3000);

		lookup_fucntion.contractowner.click();
		Thread.sleep(3000);

		lookup_fucntion.selectlookupvalue(properties.getProperty("contractowner"));
		Thread.sleep(1000);

		page_fucntion.contractenddate.click();
		Thread.sleep(1000);
		page_fucntion.today.click();
		Thread.sleep(1000);
		page_fucntion.contracttimeline.sendKeys("123");
		Thread.sleep(1000);

		page_fucntion.briefdescription.sendKeys("testing");
		Thread.sleep(1000);

		lookup_fucntion.contractcondition.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("contractcondition"));
		Thread.sleep(1000);
		lookup_fucntion.currency.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("currency"));

		Thread.sleep(3000);

		page_fucntion.exchangerange.sendKeys(properties.getProperty("exchangerange"));
		Thread.sleep(1000);
		lookup_fucntion.includingVAT10percent.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("includingVAT10percent"));
		Thread.sleep(1000);
		lookup_fucntion.basecodition.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("basecodition"));
		Thread.sleep(1000);
		page_fucntion.contractamount.sendKeys(properties.getProperty("contractamount"));
		Thread.sleep(1000);
		lookup_fucntion.paymenttype.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("paymenttype"));
		Thread.sleep(1000);
		lookup_fucntion.wheathertopayinvoice.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("wheathertopayinvoice"));
		Thread.sleep(1000);
		lookup_fucntion.contractpriority.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("contractpriority"));
		Thread.sleep(1000);
		lookup_fucntion.paymentinternal.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("paymentinternal"));
		Thread.sleep(1000);
		lookup_fucntion.paymentterm.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("paymentterm"));
		Thread.sleep(1000);
		lookup_fucntion.paymentdate.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("paymentdate"));
		Thread.sleep(1000);
		lookup_fucntion.penaltycalculatedmethod.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("penaltycalculatedmethod"));
		Thread.sleep(1000);
		lookup_fucntion.dailyrateofliquidateddemages.sendKeys("123");
		Thread.sleep(1000);
		lookup_fucntion.penaltycalculationbase.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("penaltycalculationbase"));
		Thread.sleep(1000);
		lookup_fucntion.maximumamountofliquidateddemages.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("maximumamountofliquidateddemages"));
		Thread.sleep(1000);
		lookup_fucntion.chooseclientvendor.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("chooseclientvendor"));
		Thread.sleep(1000);
		lookup_fucntion.countrycode.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("countrycode"));
		Thread.sleep(1000);
		lookup_fucntion.clientname.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("clientname"));
		Thread.sleep(1000);
		lookup_fucntion.companynumbername.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("companynumbername"));
		Thread.sleep(1000);
		lookup_fucntion.KhorooBag.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("KhorooBag"));
		Thread.sleep(1000);
		lookup_fucntion.budgettype.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("budgettype"));
		Thread.sleep(1000);
		lookup_fucntion.VATtype.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("VATtype"));
		Thread.sleep(1000);
		page_fucntion.decisionmadelog.sendKeys("test condition");
		Thread.sleep(1000);
		page_fucntion.contractcompletiondate.click();
		Thread.sleep(1000);
		page_fucntion.today.click();
		Thread.sleep(1000);
		lookup_fucntion.hasdebate.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("hasdebate"));
		Thread.sleep(1000);
		page_fucntion.evaluationcriteria.sendKeys("test");

		Thread.sleep(1000);
		page_fucntion.contractconclusion.sendKeys("test");

		Thread.sleep(1000);
		lookup_fucntion.reason.click();
		Thread.sleep(1000);
		lookup_fucntion.selectlookupvalue(properties.getProperty("reason"));
		Thread.sleep(1000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,-6000)");
		Thread.sleep(1000);
		page_fucntion.create.click();
		System.out.println("Contract request saved successfully!");
		Thread.sleep(7000);
		{
			for (int i = 0; i < 20; i++) {
				try {
					page_fucntion.contractlist.click();
					Thread.sleep(1000);
					break;
				} catch (Exception e) {
					Thread.sleep(1000);
				}

			}
			page_fucntion.contractlistselectfirsttask.click();
			Thread.sleep(1000);
			select = page_fucntion.contractnumber.getText();
			System.out.println(select);

			Thread.sleep(3000);

			page_fucntion.logout1.click();
			Thread.sleep(2000);

			page_fucntion.logout2.click();
			Thread.sleep(1000);

		}

	}

	@When("contract draft reviewal first task should be complete with approve")
	public void contract_draft_reviewal_first_task_should_be_complete_with_approve() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);

		login_page.username.sendKeys(properties.getProperty("divisiondirector"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
		Thread.sleep(1000);
		Boolean s = true;
		while (s.equals(true)) {
			page_fucntion.inbox.click();
			Thread.sleep(1000);
			page_fucntion.contractmanagement.click();
			Thread.sleep(1000);
			page_fucntion.selectfirsttask.click();
			Thread.sleep(1000);

			String select1 = page_fucntion.contractnumber1.getText();
			System.out.println("contractnumber1 : ->" + select1);
			if

			(select1.contains(select)) {
				;

				System.out.println("Yeah... expectrecieptnumber matched");
				s = false;
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("window.scrollBy(0,1000)");
				Thread.sleep(1000);

				lookup_fucntion.ContractDraftReviewalDecision.click();
				Thread.sleep(1000);

				lookup_fucntion.selectlookupvalue("Approve");
				Thread.sleep(1000);
				JavascriptExecutor jw = (JavascriptExecutor) driver;
				jw.executeScript("window.scrollBy(0,-6000)");
				Thread.sleep(1000);
				page_fucntion.completetask.click();

				Thread.sleep(1000);
				{

					// WebElement logout = driver.findElement(By.cssSelector("div.app-header-right
					// span.k-i-logout"));

					for (int i = 0; i < 40; i++) {
						try {
							page_fucntion.logout1.click();
							Thread.sleep(2000);

							page_fucntion.logout2.click();
							Thread.sleep(1000);

							break;
						} catch (Exception e) {
							Thread.sleep(1000);
						}

					}

				}

				break;

			} else
				for (int i = 0; i < 20; i++) {
					Thread.sleep(5000);
					try {
						page_fucntion.inbox.click();
						Thread.sleep(1000);
						page_fucntion.contractmanagement.click();
						Thread.sleep(1000);
						page_fucntion.selectfirsttask.click();
						Thread.sleep(1000);

						System.out.println("Yeah... notexpectrecieptnumber matched");
						break;
					} catch (Exception e) {
						Thread.sleep(1000);
					}

				}
		}
	}
	@When("contract draft reviewal second task should be complete with approve")
	public void contract_draft_reviewal_second_task_should_be_complete_with_approve() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);

		login_page.username.sendKeys(properties.getProperty("divisiondirector1"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
		Thread.sleep(1000);
		Boolean s = true;
		while (s.equals(true)) {
			page_fucntion.inbox.click();
			Thread.sleep(1000);
			page_fucntion.contractmanagement.click();
			Thread.sleep(1000);
			page_fucntion.selectfirsttask.click();
			Thread.sleep(1000);

			String select1 = page_fucntion.contractnumber1.getText();
			System.out.println("contractnumber1 : ->" + select1);
			if

			(select1.contains(select)) {
				;

				System.out.println("Yeah... expectrecieptnumber matched");
				s = false;
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("window.scrollBy(0,1000)");
				Thread.sleep(1000);

				lookup_fucntion.ContractDraftReviewalDecision.click();
				Thread.sleep(1000);

				lookup_fucntion.selectlookupvalue("Approve");
				Thread.sleep(1000);
				JavascriptExecutor jw = (JavascriptExecutor) driver;
				jw.executeScript("window.scrollBy(0,-6000)");
				Thread.sleep(1000);
				page_fucntion.completetask.click();

				Thread.sleep(1000);
				{

					// WebElement logout = driver.findElement(By.cssSelector("div.app-header-right
					// span.k-i-logout"));

					for (int i = 0; i < 40; i++) {
						try {
							page_fucntion.logout1.click();
							Thread.sleep(2000);

							page_fucntion.logout2.click();
							Thread.sleep(1000);

							break;
						} catch (Exception e) {
							Thread.sleep(1000);
						}

					}

				}

				break;

			} else
				for (int i = 0; i < 20; i++) {
					Thread.sleep(5000);
					try {
						page_fucntion.inbox.click();
						Thread.sleep(1000);
						page_fucntion.contractmanagement.click();
						Thread.sleep(1000);
						page_fucntion.selectfirsttask.click();
						Thread.sleep(1000);

						System.out.println("Yeah... notexpectrecieptnumber matched");
						break;
					} catch (Exception e) {
						Thread.sleep(1000);
					}

				}
		}
	}
	@Then("Contract - Lawyer Allocation task should complete")
	public void Contract_Lawyer_Allocation_task_should_complete() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);

		login_page.username.sendKeys(properties.getProperty("approver"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
		Thread.sleep(1000);
		Boolean s = true;
		while (s.equals(true)) {
			page_fucntion.inbox.click();
			Thread.sleep(1000);
			page_fucntion.contractmanagement.click();
			Thread.sleep(1000);
			page_fucntion.selectfirsttask.click();
			Thread.sleep(1000);

			String select1 = page_fucntion.contractnumber1.getText();
			System.out.println("contractnumber1 : ->" + select1);
			if

			(select1.contains(select)) {
				;

				System.out.println("Yeah... expectrecieptnumber matched");
				s = false;
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("window.scrollBy(0,1000)");
				Thread.sleep(1000);

				lookup_fucntion.selectlayer.click();
				Thread.sleep(1000);

				lookup_fucntion.selectlookupvalue("jerome eldhose");
				Thread.sleep(1000);
				JavascriptExecutor jw = (JavascriptExecutor) driver;
				jw.executeScript("window.scrollBy(0,-6000)");
				Thread.sleep(1000);
				page_fucntion.completetask.click();

				Thread.sleep(1000);
				{

					// WebElement logout = driver.findElement(By.cssSelector("div.app-header-right
					// span.k-i-logout"));

					for (int i = 0; i < 40; i++) {
						try {
							page_fucntion.logout1.click();
							Thread.sleep(2000);

							page_fucntion.logout2.click();
							Thread.sleep(1000);

							break;
						} catch (Exception e) {
							Thread.sleep(1000);
						}

					}

				}

				break;

			} else
				for (int i = 0; i < 20; i++) {
					Thread.sleep(5000);
					try {
						page_fucntion.inbox.click();
						Thread.sleep(1000);
						page_fucntion.contractmanagement.click();
						Thread.sleep(1000);
						page_fucntion.selectfirsttask.click();
						Thread.sleep(1000);

						System.out.println("Yeah... notexpectrecieptnumber matched");
						break;
					} catch (Exception e) {
						Thread.sleep(1000);
					}

				}
		}
	}
	@Then("Contract Draft - Lawyer Approval task should complete")
	public void Contract_Draft_Lawyer_Approval_task_should_complete() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);

		login_page.username.sendKeys(properties.getProperty("approver"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
		Thread.sleep(1000);
		Boolean s = true;
		while (s.equals(true)) {
			page_fucntion.inbox.click();
			Thread.sleep(1000);
			page_fucntion.contractmanagement.click();
			Thread.sleep(1000);
			page_fucntion.selectfirsttask.click();
			Thread.sleep(1000);

			String select1 = page_fucntion.contractnumber1.getText();
			System.out.println("contractnumber1 : ->" + select1);
			if

			(select1.contains(select)) {
				;

				System.out.println("Yeah... expectrecieptnumber matched");
				s = false;
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("window.scrollBy(0,1000)");
				Thread.sleep(1000);

				lookup_fucntion.ContractDraftLawyerApprovalDecision.click();
				Thread.sleep(1000);

				lookup_fucntion.selectlookupvalue("Approve");
				Thread.sleep(1000);
				JavascriptExecutor jw = (JavascriptExecutor) driver;
				jw.executeScript("window.scrollBy(0,-6000)");
				Thread.sleep(1000);
				page_fucntion.completetask.click();

				Thread.sleep(1000);
				{

					// WebElement logout = driver.findElement(By.cssSelector("div.app-header-right
					// span.k-i-logout"));

					for (int i = 0; i < 40; i++) {
						try {
							page_fucntion.logout1.click();
							Thread.sleep(2000);

							page_fucntion.logout2.click();
							Thread.sleep(1000);

							break;
						} catch (Exception e) {
							Thread.sleep(1000);
						}

					}

				}

				break;

			} else
				for (int i = 0; i < 20; i++) {
					Thread.sleep(5000);
					try {
						page_fucntion.inbox.click();
						Thread.sleep(1000);
						page_fucntion.contractmanagement.click();
						Thread.sleep(1000);
						page_fucntion.selectfirsttask.click();
						Thread.sleep(1000);

						System.out.println("Yeah... notexpectrecieptnumber matched");
						break;
					} catch (Exception e) {
						Thread.sleep(1000);
					}

				}
		}
	}
	@Then("Contract Draft Authorization task should be complete")
	public void Contract_Draft_Authorization_task_should_be_complete() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);

		login_page.username.sendKeys(properties.getProperty("Authorization"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
		Thread.sleep(1000);
		Boolean s = true;
		while (s.equals(true)) {
			page_fucntion.inbox.click();
			Thread.sleep(1000);
			page_fucntion.contractmanagement.click();
			Thread.sleep(1000);
			page_fucntion.selectfirsttask.click();
			Thread.sleep(1000);

			String select1 = page_fucntion.contractnumber1.getText();
			System.out.println("contractnumber1 : ->" + select1);
			if

			(select1.contains(select)) {
				;

				System.out.println("Yeah... expectrecieptnumber matched");
				s = false;
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("window.scrollBy(0,1000)");
				Thread.sleep(1000);

				lookup_fucntion.ContractDraftAuthorizerDecision.click();
				Thread.sleep(1000);

				lookup_fucntion.selectlookupvalue("Approve");
				Thread.sleep(1000);
				JavascriptExecutor jw = (JavascriptExecutor) driver;
				jw.executeScript("window.scrollBy(0,-6000)");
				Thread.sleep(1000);
				page_fucntion.completetask.click();

				Thread.sleep(1000);
				{

					// WebElement logout = driver.findElement(By.cssSelector("div.app-header-right
					// span.k-i-logout"));

					for (int i = 0; i < 40; i++) {
						try {
							page_fucntion.logout1.click();
							Thread.sleep(2000);

							page_fucntion.logout2.click();
							Thread.sleep(1000);

							break;
						} catch (Exception e) {
							Thread.sleep(1000);
						}

					}

				}

				break;

			} else
				for (int i = 0; i < 20; i++) {
					Thread.sleep(5000);
					try {
						page_fucntion.inbox.click();
						Thread.sleep(1000);
						page_fucntion.contractmanagement.click();
						Thread.sleep(1000);
						page_fucntion.selectfirsttask.click();
						Thread.sleep(1000);

						System.out.println("Yeah... notexpectrecieptnumber matched");
						break;
					} catch (Exception e) {
						Thread.sleep(1000);
					}

				}
		}
	}
	@Then("Upload updated Brief Information Document task should complete")
	public void Upload_updated_Brief_Information_Document_task_should_complete() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);

		login_page.username.sendKeys(properties.getProperty("iniatiator"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
		Thread.sleep(1000);
		Boolean s = true;
		while (s.equals(true)) {
			page_fucntion.inbox.click();
			Thread.sleep(1000);
			page_fucntion.contractmanagement.click();
			Thread.sleep(1000);
			page_fucntion.selectfirsttask.click();
			Thread.sleep(1000);

			String select1 = page_fucntion.contractnumber1.getText();
			System.out.println("contractnumber1 : ->" + select1);
			if

			(select1.contains(select)) {
				;

				System.out.println("Yeah... expectrecieptnumber matched");
				s = false;
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("window.scrollBy(0,1000)");
				Thread.sleep(2000);

				page_fucntion.BriefInformationDocumentReupload.sendKeys("/home/gautham/Downloads/Brief information template_2024.06.05.xlsx");
				Thread.sleep(1000);
				JavascriptExecutor jw = (JavascriptExecutor) driver;
				jw.executeScript("window.scrollBy(0,-6000)");
				Thread.sleep(1000);
				page_fucntion.completetask.click();

				Thread.sleep(1000);
				{

					// WebElement logout = driver.findElement(By.cssSelector("div.app-header-right
					// span.k-i-logout"));

					for (int i = 0; i < 40; i++) {
						try {
							page_fucntion.logout1.click();
							Thread.sleep(2000);

							page_fucntion.logout2.click();
							Thread.sleep(1000);

							break;
						} catch (Exception e) {
							Thread.sleep(1000);
						}

					}

				}

				break;

			} else
				for (int i = 0; i < 20; i++) {
					Thread.sleep(5000);
					try {
						page_fucntion.inbox.click();
						Thread.sleep(1000);
						page_fucntion.contractmanagement.click();
						Thread.sleep(1000);
						page_fucntion.selectfirsttask.click();
						Thread.sleep(1000);

						System.out.println("Yeah... notexpectrecieptnumber matched");
						break;
					} catch (Exception e) {
						Thread.sleep(1000);
					}

				}
		}
	}
	@And("Upload Signed Contract task should complete")
	public void Upload_Signed_Contract_task_should_complete() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);

		login_page.username.sendKeys(properties.getProperty("iniatiator"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
		Thread.sleep(1000);
		Boolean s = true;
		while (s.equals(true)) {
			page_fucntion.inbox.click();
			Thread.sleep(1000);
			page_fucntion.contractmanagement.click();
			Thread.sleep(1000);
			page_fucntion.selectfirsttask.click();
			Thread.sleep(1000);

			String select1 = page_fucntion.contractnumber1.getText();
			System.out.println("contractnumber1 : ->" + select1);
			if

			(select1.contains(select)) {
				;

				System.out.println("Yeah... expectrecieptnumber matched");
				s = false;
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("window.scrollBy(0,1000)");
				Thread.sleep(2000);

				page_fucntion.uploadsignedcontract.sendKeys("/home/gautham/Downloads/sign.png");
				Thread.sleep(1000);
				JavascriptExecutor jw = (JavascriptExecutor) driver;
				jw.executeScript("window.scrollBy(0,-6000)");
				Thread.sleep(1000);
				page_fucntion.completetask.click();

				Thread.sleep(1000);
				{

					// WebElement logout = driver.findElement(By.cssSelector("div.app-header-right
					// span.k-i-logout"));

					for (int i = 0; i < 40; i++) {
						try {
							page_fucntion.logout1.click();
							Thread.sleep(2000);

							page_fucntion.logout2.click();
							Thread.sleep(1000);

							break;
						} catch (Exception e) {
							Thread.sleep(1000);
						}

					}

				}

				break;

			} else
				for (int i = 0; i < 20; i++) {
					Thread.sleep(5000);
					try {
						page_fucntion.inbox.click();
						Thread.sleep(1000);
						page_fucntion.contractmanagement.click();
						Thread.sleep(1000);
						page_fucntion.selectfirsttask.click();
						Thread.sleep(1000);

						System.out.println("Yeah... notexpectrecieptnumber matched");
						break;
					} catch (Exception e) {
						Thread.sleep(1000);
					}

				}
		}
	
		
	}
	
	
	@And("Contract Documents Verification task should complete")
	public void Contract_Documents_Verification_task_should_complete() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);

		login_page.username.sendKeys(properties.getProperty("CEO"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
		Thread.sleep(1000);
		Boolean s = true;
		while (s.equals(true)) {
			page_fucntion.inbox.click();
			Thread.sleep(1000);
			page_fucntion.contractmanagement.click();
			Thread.sleep(1000);
			page_fucntion.selectfirsttask.click();
			Thread.sleep(1000);

			String select1 = page_fucntion.contractnumber1.getText();
			System.out.println("contractnumber1 : ->" + select1);
			if

			(select1.contains(select)) {
				;

				System.out.println("Yeah... expectrecieptnumber matched");
				s = false;

				Thread.sleep(1000);
				page_fucntion.completetask.click();

				Thread.sleep(1000);
				{

					// WebElement logout = driver.findElement(By.cssSelector("div.app-header-right
					// span.k-i-logout"));

					for (int i = 0; i < 40; i++) {
						try {
							page_fucntion.logout1.click();
							Thread.sleep(2000);

							page_fucntion.logout2.click();
							Thread.sleep(1000);

							break;
						} catch (Exception e) {
							Thread.sleep(1000);
						}

					}

				}

				break;

			} else
				for (int i = 0; i < 20; i++) {
					Thread.sleep(5000);
					try {
						page_fucntion.inbox.click();
						Thread.sleep(1000);
						page_fucntion.contractmanagement.click();
						Thread.sleep(1000);
						page_fucntion.selectfirsttask.click();
						Thread.sleep(1000);

						System.out.println("Yeah... notexpectrecieptnumber matched");
						break;
					} catch (Exception e) {
						Thread.sleep(1000);
					}

				}
		
		}
		}
	@And("complete the contract termination")
	public void completethe_contract_termination() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);

		login_page.username.sendKeys(properties.getProperty("iniatiator"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
		Thread.sleep(1000);
		Boolean s = true;
		while (s.equals(true)) {
			page_fucntion.contractlist.click();
			Thread.sleep(3000);
			page_fucntion.contractlistselectfirsttask.click();
			Thread.sleep(1000);
		

			String select1 = page_fucntion.contractnumber.getText();
			System.out.println("contractnumber : ->" + select1);
			if

			(select1.contains(select)) {
				;

				System.out.println("Yeah... expectrecieptnumber matched");
				s = false;
				Thread.sleep(1000);
				page_fucntion.terminate.click();
				Thread.sleep(1000);
			
			page_fucntion.reasonfortermination.sendKeys("termination");
			Thread.sleep(1000);
			
				page_fucntion.save.click();
				Thread.sleep(1000);
				page_fucntion.contractlist.click();
				Thread.sleep(1000);
				page_fucntion.contractlistselectfirsttask.click();
				Thread.sleep(1000);
				String status=page_fucntion.status.getText();
				System.out.println(status);
				Thread.sleep(1000);
				{

					for (int i = 0; i < 40; i++) {
						try {
							page_fucntion.logout1.click();
							Thread.sleep(2000);

							page_fucntion.logout2.click();
							Thread.sleep(1000);

							break;
						} catch (Exception e) {
							Thread.sleep(1000);
						}

					}

				}

				break;

			} else
				for (int i = 0; i < 20; i++) {
					Thread.sleep(5000);
					try {
						page_fucntion.contractlist.click();
						Thread.sleep(1000);
						page_fucntion.contractlistselectfirsttask.click();
						Thread.sleep(1000);
					

						System.out.println("Yeah... notexpectrecieptnumber matched");
						break;
					} catch (Exception e) {
						Thread.sleep(1000);
					}

				}
		}
	}
}
