package com.gcr.scripts;

import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;

import com.gcr.reuse.InternetFunctions;

public class InternetDynamicLoading extends StartBrowser {
  @Test
  public void InternetDynamicLoadingTestCase() throws Exception {
  InternetFunctions ifs = new InternetFunctions();
 String text=ifs.dynamicLoadingText();
 System.out.println("Expected text :"+text);
  }
}

