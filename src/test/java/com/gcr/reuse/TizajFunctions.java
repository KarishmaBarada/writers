package com.gcr.reuse;

import org.openqa.selenium.WebDriver;

import com.gcr.config.StartBrowser;

import com.gcr.or.Tizajpage;
import com.gcr.wdcmds.ActionDriver;

public class TizajFunctions {
	
	public ActionDriver aDriver;
	public WebDriver driver;
	
	public TizajFunctions()
	{
		aDriver = new ActionDriver();
		driver = StartBrowser.driver;
	}
	public String handleAlertAndGetText() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("handle Tizag Aler tand Get alert text");
		aDriver.navigateToApplication("http://www.tizag.com/javascriptT/javascriptalert.php");
		aDriver.click(Tizajpage.btnAlert, "Confirmation alert button");
		String aMsg=aDriver.getAlertText("Confirmation Alert");
		aDriver.handleAlert("Confirmation ALert");
		return aMsg;
	}
	
}