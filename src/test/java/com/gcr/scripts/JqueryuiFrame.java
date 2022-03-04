package com.gcr.scripts;


import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.reuse.JqueryuiFunctions;


public class JqueryuiFrame extends StartBrowser {
  @Test

  public void JqueryFrameTestCase() throws Exception {
	JqueryuiFunctions jfs = new JqueryuiFunctions();
	jfs.entertextInTags("selenium"); 
  }
}
    