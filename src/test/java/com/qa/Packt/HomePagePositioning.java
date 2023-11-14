package com.qa.Packt;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import PomClass.Positioning;

public class HomePagePositioning extends BaseClass {

	@Test
	public void positioning() {
		
		Positioning position = new Positioning(driver);
		
		position.packtLogo();
		position.browserLibrary();
		position.advancedSearchButton();
		position.searchTextField();
		position.myLibraryDropDown();
		position.recentDropDown();
	}
}
