package com.gcr.reuse;

import org.openqa.selenium.WebDriver;

import com.gcr.config.StartBrowser;
import com.gcr.or.InternetHomePage;
import com.gcr.wdcmds.ActionDriver;

public class InternetFunctions {
	
	public ActionDriver aDriver;
	public WebDriver driver;
	
	public InternetFunctions()
	{
		aDriver = new ActionDriver();
		driver = StartBrowser.driver;
	}
	
	public void selectDDValueFromDDList() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("select value from internet herokuapp dropdown");
		aDriver.navigateToApplication("http://the-internet.herokuapp.com/");
		aDriver.click(InternetHomePage.lnkDropdown,"Dropdown link");
		aDriver.selectByVisibleText(InternetHomePage.ddDropdown,"Option2","Internet Dropdown");
		
		
	}
	public String dynamicLoadingText() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Get Dynamic Loading text");
		aDriver.navigateToApplication("http://the-internet.herokuapp.com/");
		aDriver.click(InternetHomePage.lnkDynamicLoading,"Dynamic Loading link");
		aDriver.click(InternetHomePage.LnkExample1,"Example1 link");
		aDriver.click(InternetHomePage.btnStart,"Start button");
		aDriver.explicitWait(InternetHomePage.textMsg, 10, "Message");
		String text = aDriver.getText(InternetHomePage.textMsg,"TextMessage");
		return text;
	
		
		
	}
	public void hovers() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Mouse Hover example");
		aDriver.navigateToApplication("https://the-internet.herokuapp.com/");
		aDriver.click(InternetHomePage.lnkHovers, "hovers link");
		aDriver.mouseHover(InternetHomePage.imgUser1, "Image User 1");
		aDriver.click(InternetHomePage.lnkProfile, "Profilelink");
	}
	public void windowsExample(String email) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Switch window example");
		aDriver.navigateToApplication("https://the-internet.herokuapp.com/");
		aDriver.click(InternetHomePage.lnkHovers, "hovers link");
		aDriver.click(InternetHomePage.lnkElement, "Elemental Selenium Link");
		aDriver.switchToChildWindow();
		aDriver.type(InternetHomePage.txtEmail, email, "Email text box");
	}
	
}


