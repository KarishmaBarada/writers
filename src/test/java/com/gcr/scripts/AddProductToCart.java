package com.gcr.scripts;

import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.reuse.CommonFunctions;

public class AddProductToCart extends StartBrowser{
  @Test
  public void AddProductToCartTestCase() throws Exception {
	  CommonFunctions cfs = new CommonFunctions();
	  cfs.openApplication();
	  cfs.addToCart();
	  Thread.sleep(5000);
  }
}
