package com.qa.Packt;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import PomClass.Navigation;

public class NavigationPackt extends BaseClass {

	@Test
	public void navigation(){
		
		Navigation navigate = new Navigation(driver);
		navigate.packtLogo();
		navigate.browserLibrary();
		navigate.advancedSearchButton();
		navigate.searchTextField();
		navigate.cartButton();
	}
}
