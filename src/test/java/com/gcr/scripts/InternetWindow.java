package com.gcr.scripts;

import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;

import com.gcr.reuse.InternetFunctions;

public class InternetWindow extends StartBrowser {
  @Test
  public void InternetDropdownTestcase() throws Exception {
	  InternetFunctions ifs = new InternetFunctions();
	  ifs.windowsExample("myemail@yahoo.com");
	  Thread.sleep(2000);
  }
}
