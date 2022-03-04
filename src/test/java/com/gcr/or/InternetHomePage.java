package com.gcr.or;

import org.openqa.selenium.By;

public class InternetHomePage {
	
	public static By lnkDropdown = By.linkText("Dropdown");
	public static By txtDropdown= By.xpath("//h3[normalize-space()='Dropdown List']");
	public static By ddDropdown = By.id("dropdown");
	//dynamic loading
	public static By lnkDynamicLoading = By.linkText("Dynamic Loading");
	public static By LnkExample1 = By.partialLinkText("Example 1:");
	public static By btnStart = By.xpath("//button[normalize-space()='Start']");
	public static By textMsg = By.xpath("//h4[normalize-space()='hello world!']");
	//HOVER
	public static By lnkHovers = By.linkText("Hovers");
	public static By imgUser1=By.xpath("//div[@class='example']//div[1]//img[1]");
	public static By lnkProfile = By.linkText("View profile");
	public static By lnkElement = By.linkText("Elemental Selenium");
	public static By txtEmail = By.id("email");

}
