package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenericUtility.WebDriverUtility;

public class Navigation extends WebDriverUtility{

	WebDriver driver;
	public Navigation(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath = "//a[@class=\"navbar-brand\"]")
	private WebElement logo;
	
	@FindBy (xpath = "//a[text()='Browse Library']")
	private WebElement browserlib;
	
	@FindBy (xpath = "//button[text()=\"Advanced Search\"]")
	private WebElement advancedSearchBtn;
	
	@FindBy (xpath = "//input[@type=\"text\"]")
	private WebElement searchTxtField;
	
	@FindBy (xpath = "//div[@class='products-wrapper']/div//button[@class='cart-btn']")
	private WebElement addToCartBtn;
	
	@FindBy (xpath = "//button[@class='btn']")
	private WebElement searchBtn;
	
//	@FindBy (id = "Oval")
//	private WebElement profileIcon;
//	
	@FindBy (xpath = "(//div[text()='Your cart is empty!'])[2]")
	private WebElement emptyCartTxt;
	
	@FindBy (xpath = "//div[@class='btn-content']")
	private WebElement cartIcon;
	
	@FindBy (linkText = "Start FREE trial")
	private WebElement startFreeTrialBtn;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getBrowserlib() {
		return browserlib;
	}

	public WebElement getAdvancedSearchBtn() {
		return advancedSearchBtn;
	}

	public WebElement getSearchTxtField() {
		return searchTxtField;
	}

//	public WebElement getProfileIcon() {
//		return profileIcon;
//	}

	public WebElement getCartIcon() {
		return cartIcon;
	}

	public WebElement getStartFreeTrialBtn() {
		return startFreeTrialBtn;
	}
	
	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public void packtLogo() {
		
		try {
			logo.click();
			String actualTitle = driver.getTitle();
			String expectedTitle = "Packt Subscription | Advance your knowledge in tech";
			Assert.assertEquals(actualTitle, expectedTitle);
		}		
		catch (Exception e) {

			System.out.println("Error Message Logo :"+ e.getMessage());
		}
	}
	
	public void browserLibrary() {
		
		try {
			browserlib.click();
			String actualText = browserlib.getText();
			String expectedText = "Browse Library";
			
			Assert.assertEquals(actualText, expectedText);
			
			String actualTitle = driver.getTitle();
			String expectedTitle = "Search | Packt Subscription";
			
			Assert.assertEquals(actualTitle, expectedTitle);
		}
		catch (Exception e) {

			System.out.println("Error Message Browser :"+e.getMessage());
		}
	}
	
	public void advancedSearchButton() {
		
		try {
			advancedSearchBtn.click();
			String actualText = advancedSearchBtn.getText();
			String expectedText = "Advanced Search";
			
			Assert.assertEquals(actualText, expectedText);
			
			String actualTitle = driver.getTitle();
			String expectedTitle = "Advanced Search | Packt Subscription";
			Assert.assertEquals(actualTitle, expectedTitle);
		}
		catch (Exception e) {

			System.out.println("Error Message Advanced Search :"+e.getMessage());
		}
	}
	
	public void searchTextField() {
		
		try {
			searchTxtField.sendKeys("Selenium");
			searchBtn.click();
			String actualTitle = driver.getTitle();
			String expectedTitle = "Search | Packt Subscription";
			Assert.assertEquals(actualTitle, expectedTitle);
			
			String actualText = addToCartBtn.getText();
			String expectedText = "ADD TO CART";
			Assert.assertEquals(actualText, expectedText);
		}
		catch (Exception e) {

			System.out.println("Error Message Search Text Field :"+e.getMessage());
		}
	}
	
	public void cartButton() {
		
		try {
			cartIcon.click();
			String actualTitle = driver.getTitle();
			String expectedTitle = "Packt | Checkout";
			Assert.assertEquals(actualTitle, expectedTitle);
			String actualText = emptyCartTxt.getText();
			String expectedText = "Your cart is empty!";
			Assert.assertEquals(actualText, expectedText);
		}
		catch (Exception e) {

			System.out.println("Error Message Cart :"+e.getMessage());
		}
	}
}
