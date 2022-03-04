package com.gcr.or;

import org.openqa.selenium.By;

public class AutomationPage {
	
	public static By lnkContactUs = By.linkText("Contact Us");
	public static By ddSubject = By.id("id_contact");
	public static By txtEmail = By.xpath("//input[@id='email']");
	public static By txtPwd = By.xpath("//input[@name='id_order']");
	public static By taMsg = By.xpath("//textarea[@id='message']");

}
