package com.gcr.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;


import com.gcr.reuse.TizajFunctions;

public class TizajAlert extends StartBrowser {
  @Test
  public void TizagAlertTestCase() throws Exception {
	  TizajFunctions tfs = new TizajFunctions();
	  String aMsg=tfs.handleAlertAndGetText();
	  String expMsg= "Are you sure you want to give us the deed to your house?";
	  Assert.assertEquals(aMsg, expMsg);
	   }
}
    