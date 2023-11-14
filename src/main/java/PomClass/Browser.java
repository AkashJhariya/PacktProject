package PomClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GenericUtility.WebDriverUtility;

public class Browser extends WebDriverUtility {

	WebDriver driver;

	public Browser(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath = "//a[text()='Browse Library']")
	private WebElement browser;

	@FindBy (xpath = "//div[text()='Book']")
	private WebElement book;

	@FindBy (xpath = "//button[text()='Reset All']")
	private WebElement resetAll;

	@FindBy (xpath = "//div[text()='Published Year']")
	private WebElement publishedYear;

	@FindBy (xpath = "//div[text()='2021']")
	private WebElement year2021;

	@FindBy (xpath = "(//input[@placeholder='Search titles …'])[2]")
	private WebElement searchTxtField;

	@FindBy (xpath = "//div[@class='d-flex flex-column']")
	private List<WebElement> suggestion;

	public WebElement getBrowser() {
		return browser;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getResetAll() {
		return resetAll;
	}

	public WebElement getPublishedYear() {
		return publishedYear;
	}

	public WebElement getYear2021() {
		return year2021;
	}

	public WebElement getSearchTxtField() {
		return searchTxtField;
	}

	public List<WebElement> getSuggestion() {
		return suggestion;
	}


	public void browser() {

		try {
			
			browser.click();
		}
		catch(Exception e) {

			System.out.println("Error Message Browser :"+ e.getMessage());
		}
	}

	public void bookFilter() {

		try {
			book.click();
		}
		catch(Exception e) {

			System.out.println("Error Message Book :"+ e.getMessage());
		}
	}

	public void resetAllButton() {

		try {

			resetAll.click();
		}
		catch (Exception e) {

			System.out.println("Error Message Reset All :"+ e.getMessage());
		}
	}

	public void publishedYearFilter() {

		try {

			publishedYear.click();
		}
		catch (Exception e) {

			System.out.println("Error Message Published Year :"+ e.getMessage());
		}
	}

	public void yearFilter() {

		try {

			year2021.click();
		}
		catch (Exception e) {

			System.out.println("Error Message Year :"+ e.getMessage());
		}
	}

	public void searchTextFieldPython() throws InterruptedException {

		try {
			waitUntilPageLoad(driver);
			searchTxtField.sendKeys("Python");
			for(WebElement suggest: suggestion) {

				String pythonText = suggest.getText();
				System.out.println(pythonText);
			}
			Thread.sleep(2000);
			searchTxtField.click();
			searchTxtField.clear();
		}
		catch (Exception e) {

			System.out.println("Error Message Python :"+e.getMessage());
		}
	}

	public void searcTextFieldSecure() throws InterruptedException {

		try {

			waitUntilPageLoad(driver);
			searchTxtField.sendKeys("secure");
			for(WebElement suggest: suggestion) {

				String secureText = suggest.getText();
				System.out.println(secureText);

			}
			Thread.sleep(2000);
			searchTxtField.click();
			searchTxtField.clear();
		}
		catch (Exception e) {

			System.out.println("Error Message Secure :"+e.getMessage());
		}
	}

	public void searchTextFieldTableau() throws InterruptedException {


		try {
			waitUntilPageLoad(driver);
			searchTxtField.sendKeys("tableau");
			for(WebElement suggest: suggestion) {

				String tableauText = suggest.getText();
				System.out.println(tableauText);

			}
			Thread.sleep(2000);
			searchTxtField.click();
			searchTxtField.clear();
		}
		catch (Exception e) {

			System.out.println("Error Message Tableau :"+e.getMessage());
		}
	}

	public void searchTextFieldPaint() throws InterruptedException {

		try {

			waitUntilPageLoad(driver);
			searchTxtField.sendKeys("Paint");
			for(WebElement suggest: suggestion) {

				String paintText = suggest.getText();
				System.out.println(paintText);
			}
			Thread.sleep(2000);
		}	
		catch (Exception e) {

			System.out.println("Error Message Paint :"+e.getMessage());
		}

	}
}
