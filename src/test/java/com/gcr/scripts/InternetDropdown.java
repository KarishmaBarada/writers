package com.gcr.scripts;

import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;

import com.gcr.reuse.InternetFunctions;

public class InternetDropdown extends StartBrowser {
  @Test
  public void InternetDropdownTestcase() throws Exception {
	  InternetFunctions ifs = new InternetFunctions();
	  ifs.selectDDValueFromDDList();
	  Thread.sleep(2000);
  }
}
