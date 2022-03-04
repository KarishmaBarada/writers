package com.gcr.reuse;

import org.openqa.selenium.WebDriver;

import com.gcr.config.StartBrowser;
import com.gcr.or.Jqueryuipage;

import com.gcr.wdcmds.ActionDriver;

public class JqueryuiFunctions {
	
	public ActionDriver aDriver;
	public WebDriver driver;
	
	public JqueryuiFunctions()
	{
		aDriver = new ActionDriver();
		driver = StartBrowser.driver;
	}
	public void entertextInTags(String testdata) throws Exception
	{
		StartBrowser.childTest=StartBrowser.parentTest.createNode("switch to frame and enter test");
		aDriver.navigateToApplication("https://jqueryui.com/");
		aDriver.click(Jqueryuipage.lnkAutoComplete,"autocomplete link");
		aDriver.SwitchToFrame(Jqueryuipage.iframe);
		/*aDriver.SwitchToFrame(Jqueryuipage.iframe); */
		aDriver.type(Jqueryuipage.txtTags,testdata,"tags textbox");
		
	} 
	
	
}