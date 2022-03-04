package com.gcr.scripts;

import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.reuse.CommonFunctions;

public class Search extends StartBrowser{
  @Test
  public void SearchTestCase() throws Exception {
	  CommonFunctions cfs = new CommonFunctions();
	  cfs.login();
	  Thread.sleep(2000);
	  cfs.search("chairs");
	  cfs.logout();
	  Thread.sleep(2000);
  }
}
