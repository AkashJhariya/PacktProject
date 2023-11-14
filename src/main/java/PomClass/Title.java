package PomClass;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenericUtility.WebDriverUtility;

public class Title extends WebDriverUtility{

	WebDriver driver;
	
	public Title(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Read now']")
	private WebElement readNowBtn;
	
	@FindBy (xpath = "(//div[text()='Part 1: Causality – an Introduction'])[2]")
	private WebElement mainCausalityTxt;
	
	@FindBy (xpath = "(//a[text()='Part 1: Causality – an Introduction'])[2]")
	private WebElement subCausalityTxt;
	
	@FindBy (xpath = "(//div[text()='Chapter 1: Causality – Hey, We Have Machine Learning, So Why Even Bother?'])[2]")
	private WebElement mainChapter1Txt;
	
	@FindBy (xpath = "(//a[text()='Chapter 1: Causality – Hey, We Have Machine Learning, So Why Even Bother?'])[2]")
	private WebElement subChapter1Txt;
	
	@FindBy (xpath = "(//div[text()='Chapter 2: Judea Pearl and the Ladder of Causation'])[2]")
	private WebElement mainChapter2Txt;
	
	@FindBy (xpath = "(//a[text()='Chapter 2: Judea Pearl and the Ladder of Causation'])[2]")
	private WebElement subChapter2Txt;
	
	@FindBy (xpath = "//h1[text()='Judea Pearl and the Ladder of Causation']")
	private WebElement chapter2PageTxt;
	
	@FindBy (xpath = "(//div[text()='Chapter 3: Regression, Observations, and Interventions'])[2]")
	private WebElement mainChapter3Txt;
	
	@FindBy (xpath = "(//a[text()='Chapter 3: Regression, Observations, and Interventions'])[2]")
	private WebElement subChapter3Txt;
	
	public WebElement getMainCausalityTxt() {
		return mainCausalityTxt;
	}

	public WebElement getSubCausalityTxt() {
		return subCausalityTxt;
	}


	public WebElement getMainChapter1Txt() {
		return mainChapter1Txt;
	}

	public WebElement getSubChapter1Txt() {
		return subChapter1Txt;
	}

	public WebElement getMainChapter2Txt() {
		return mainChapter2Txt;
	}

	public WebElement getSubChapter2Txt() {
		return subChapter2Txt;
	}

	public WebElement getChapter2PageTxt() {
		return chapter2PageTxt;
	}

	public WebElement getMainChapter3Txt() {
		return mainChapter3Txt;
	}

	public WebElement getSubChapter3Txt() {
		return subChapter3Txt;
	}

	public void readNowButton() {
		try {
			Point location = readNowBtn.getLocation();
			int x = location.getX();
			int y = location.getY();
			slider(driver, x, y);
		}
		catch (Exception e) {

			System.out.println("Error Message Read Now :"+e.getMessage());
		}
	}
	
	public void mainCausalityText() {
		
	try {
		String actualTitle = mainCausalityTxt.getText();
		String subText = subCausalityTxt.getText();
		Assert.assertEquals(actualTitle, subText);
	}
	catch (Exception e) {

		System.out.println("Error Message Causality :"+e.getMessage());
	}
	}
	
	public void mainChapter1Text() {
		
		try {
			String mainText = mainChapter1Txt.getText();
			String subText = subChapter1Txt.getText();
			Assert.assertEquals(mainText, subText);
		}
		catch (Exception e) {

			System.out.println("Error Message Chap 1 :"+e.getMessage());
		}
	}
	
	public void mainChapter2Text() {
		
		try {
			String mainText = mainChapter2Txt.getText();
			String subText = subChapter2Txt.getText();
			Assert.assertEquals(mainText, subText);
		}
		catch (Exception e) {

			System.out.println("Error Message Chap 2 :"+e.getMessage());
		}
	}
	
	public void mainChapter3Text() {
		
		try {
			String mainText = mainChapter3Txt.getText();
			String subText = subChapter3Txt.getText();
			Assert.assertEquals(mainText, subText);
		}
		catch (Exception e) {

			System.out.println("Error Message Chap 3 :"+ e.getMessage());
		}
	}
}
