package com.gcr.scripts;


import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.reuse.AutomationFunctions;


public class AutomationContactus extends StartBrowser {
  @Test
  public void AutomationContactUsTestcase () throws Exception {
	     AutomationFunctions asf = new AutomationFunctions();
	     asf.ContactUs();
	     Thread.sleep(2000);
	     
	   }
}
    