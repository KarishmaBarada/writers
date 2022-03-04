package com.gcr.reuse;

import org.openqa.selenium.WebDriver;

import com.gcr.config.StartBrowser;
import com.gcr.or.AutomationPage;

import com.gcr.wdcmds.ActionDriver;

public class AutomationFunctions {
	
	public ActionDriver aDriver;
	public WebDriver driver;
	
	public AutomationFunctions()
	{
		aDriver = new ActionDriver();
		driver = StartBrowser.driver;
	}
	public void ContactUs() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Contact Us");
		aDriver.navigateToApplication("http://automationpractice.com/");
		aDriver.click(AutomationPage.lnkContactUs,"Contact Us Link");
		aDriver.selectByVisibleText(AutomationPage.ddSubject, "Customer service", "Subject Dropdown");
		aDriver.type(AutomationPage.txtEmail,"sample@gmail.com", "Email ID");
		aDriver.type(AutomationPage.txtPwd, "123456", "Order ref Number");
		aDriver.type(AutomationPage.taMsg, "this is to inform issue with order", "Message Text Area");
		
	}
	
	public void ContactUs(String subject, String email, String ord, String msg) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Contact Us");
		aDriver.navigateToApplication("http://automationpractice.com/");
		aDriver.click(AutomationPage.lnkContactUs,"Contact Us Link");
		aDriver.selectByVisibleText(AutomationPage.ddSubject,subject, "Subject Dropdown");
		aDriver.type(AutomationPage.txtEmail,email, "Email ID");
		aDriver.type(AutomationPage.txtPwd, ord, "Order ref Number");
		aDriver.type(AutomationPage.taMsg,ord, "Message Text Area");
		
	}
	
}