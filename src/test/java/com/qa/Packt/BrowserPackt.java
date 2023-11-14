package com.qa.Packt;

import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Report;

import GenericUtility.BaseClass;
import PomClass.Browser;

public class BrowserPackt extends BaseClass{

	
	@Test
	public void browser() throws InterruptedException {
		
		
		Browser brows =new Browser(driver);
		brows.browser();
		brows.bookFilter();
		brows.resetAllButton();
		brows.publishedYearFilter();
		brows.yearFilter();
		brows.searchTextFieldPython();
		brows.searcTextFieldSecure();
		brows.searchTextFieldTableau();
		brows.searchTextFieldPaint();
	}
}
