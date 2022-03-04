package com.gcr.or;

import org.openqa.selenium.By;

public class HomePage {
	
	public static By lnkMyAccount = By.xpath("(//a[@title='My Account '])[2]");
	public static By lnkAccount = By.xpath("(//li[@class='customer-login'])[2]");
	public static By lnkLogout = By.linkText("Logout");
	public static By txtSearch = By.name("q");
	public static By btnSearch=By.xpath("(//span[@class='icon-search search-submit'])[5]");

}
