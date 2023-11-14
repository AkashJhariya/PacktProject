package PomClass;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenericUtility.WebDriverUtility;

public class Positioning extends WebDriverUtility{
	
	WebDriver driver;

	public Positioning(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy (xpath = "//a[@class=\"navbar-brand\"]")
	private WebElement logo;
	
	@FindBy (xpath = "//a[text()='Browse Library']")
	private WebElement browserlib;
	
	@FindBy (xpath = "//button[text()=\"Advanced Search\"]")
	private WebElement advancedSearchBtn;
	
	@FindBy (xpath = "//input[@type=\"text\"]")
	private WebElement searchTxtField;
	
	@FindBy (id = "library-dropdown")
	private WebElement myLibDropDown;
	
	@FindBy (id = "recent-dropdown")
	private WebElement recentDropDown;

		
	public WebElement getBrowserlib() {
		return browserlib;
	}


	public WebElement getLogo() {
		return logo;
	}


	public WebElement getAdvancedSearchBtn() {
		return advancedSearchBtn;
	}


	public WebElement getSearchTxtField() {
		return searchTxtField;
	}


	public WebElement getMyLibDropDown() {
		return myLibDropDown;
	}


	public WebElement getRecentDropDown() {
		return recentDropDown;
	}


	public void packtLogo() {
		
		try{
			logo.click();
			
			String backgroundColor = logo.getCssValue("color");
			 String hexcolor = Color.fromString(backgroundColor).asHex();
			System.out.println(hexcolor);
			String expectedColor = "#454a55";
			Assert.assertEquals(hexcolor, expectedColor);
			
			Point loc = logo.getLocation();
			int x = loc.getX();
			int y = loc.getY();
			System.out.println("x cordinate :"+x+ " y cordinate :"+y);
			int actual_x_cordinate = 55;
			int actual_y_cordinate = 16;
			Assert.assertEquals(x, actual_x_cordinate);
			Assert.assertEquals(y, actual_y_cordinate);
			
		}
		catch(Exception e) {
			
			System.out.println("Error Message Logo :"+ e.getMessage());
		}
	}
	
	public void browserLibrary() {
		
		try {
			mouseHover(driver, browserlib);
			
			String backgroundColor = browserlib.getCssValue("color");
			 String hexcolor = Color.fromString(backgroundColor).asHex();
			System.out.println(hexcolor);
			String expectedColor = "#ec6611";
			Assert.assertEquals(hexcolor, expectedColor);
			
			Point loc = browserlib.getLocation();
			int x = loc.getX();
			int y = loc.getY();
			System.out.println("x cordinate :"+x+ " y cordinate :"+y);
			int actual_x_cordinate = 187;
			int actual_y_cordinate = 22;
			Assert.assertEquals(x, actual_x_cordinate);
			Assert.assertEquals(y, actual_y_cordinate);
			
			String actualText = browserlib.getText();
			String expectedText = "Browse Library";
			
			Assert.assertEquals(actualText, expectedText);
		}
		catch(Exception e) {
			
			System.out.println("Error Message Browser Library :"+ e.getMessage());
		}
	}
	
	
	public void advancedSearchButton() {
		
		try {
			mouseHover(driver, advancedSearchBtn);

			String backgroundColor = advancedSearchBtn.getCssValue("color");
			 String hexcolor = Color.fromString(backgroundColor).asHex();
			System.out.println(hexcolor);
			String expectedColor = "#fffbf9";
			Assert.assertEquals(hexcolor, expectedColor);
			
			Point loc = advancedSearchBtn.getLocation();
			int x = loc.getX();
			int y = loc.getY();
			System.out.println("x cordinate :"+x+ " y cordinate :"+y);
			
			int actual_x_cordinate = 325;
			int actual_y_cordinate = 15;
			Assert.assertEquals(x, actual_x_cordinate);
			Assert.assertEquals(y, actual_y_cordinate);
			
			String actualText = advancedSearchBtn.getText();
			String expectedText = "Advanced Search";
			
			Assert.assertEquals(actualText, expectedText);
		}
		
		catch(Exception e) {
			
			System.out.println("Error Message Advanced Search Button :"+ e.getMessage());
		}
	}
	
	public void searchTextField() {
		
		try {
			
			searchTxtField.click();

			String backgroundColor = searchTxtField.getCssValue("background-color");
			 String hexcolor = Color.fromString(backgroundColor).asHex();
			System.out.println(hexcolor);
			String expectedColor = "#f5f6fa";
			Assert.assertEquals(hexcolor, expectedColor);
			
			Point loc = searchTxtField.getLocation();
			int x = loc.getX();
			int y = loc.getY();
			System.out.println("x cordinate :"+x+ " y cordinate :"+y);
			
			int actual_x_cordinate = 525;
			int actual_y_cordinate = 15;
			Assert.assertEquals(x, actual_x_cordinate);
			Assert.assertEquals(y, actual_y_cordinate);
			
		}
		catch(Exception e) {
			
			System.out.println("Error Message Search Text Field :"+ e.getMessage());
		}
	}
	
	public void myLibraryDropDown() {
		
		try {
			mouseHover(driver, myLibDropDown);

			String backgroundColor = myLibDropDown.getCssValue("color");
			 String hexcolor = Color.fromString(backgroundColor).asHex();
			System.out.println(hexcolor);
			String expectedColor = "#ec6611";
			Assert.assertEquals(hexcolor, expectedColor);
			
			Point loc = myLibDropDown.getLocation();
			int x = loc.getX();
			int y = loc.getY();
			System.out.println("x cordinate :"+x+ " y cordinate :"+y);
			
			String actual_x_cordinate = "93.92";
			String actual_y_cordinate = "27";
			Assert.assertEquals(x, actual_x_cordinate);
			Assert.assertEquals(y, actual_y_cordinate);
			
			String actualText = myLibDropDown.getText();
			String expectedText = "Browse Library";
			
			Assert.assertEquals(actualText, expectedText);
		}
		
		catch(Exception e) {
			
			System.out.println("Error Message My Library DropDown :" + e.getMessage());
		}
	}
	
	
	public void recentDropDown() {
		
	try {
		mouseHover(driver, recentDropDown);
		
		String backgroundColor = recentDropDown.getCssValue("color");
		 String hexcolor = Color.fromString(backgroundColor).asHex();
		System.out.println(hexcolor);
		String expectedColor = "#ec6611";
		Assert.assertEquals(hexcolor, expectedColor);
		
		Point loc = recentDropDown.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		System.out.println("x cordinate :"+x+ " y cordinate :"+y);
		
		String actual_x_cordinate = "180";
		String actual_y_cordinate = "40";
		Assert.assertEquals(x, actual_x_cordinate);
		Assert.assertEquals(y, actual_y_cordinate);
		
		String actualText = recentDropDown.getText();
		String expectedText = "Browse Library";
		
		Assert.assertEquals(actualText, expectedText);
	}
	catch(Exception e) {
		
		System.out.println("Error Message Recent DropDown :"+ e.getMessage());
	}
	}
}
