package com.qa.Packt;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import PomClass.Title;

public class TitlePackt extends BaseClass{

	@Test
	public void title() {
		
		Title title = new Title(driver);
		title.readNowButton();
		title.mainCausalityText();
		title.mainChapter1Text();
		title.mainChapter2Text();
		title.mainChapter3Text();
	}
}
