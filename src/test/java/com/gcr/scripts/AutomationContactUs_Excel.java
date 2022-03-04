package com.gcr.scripts;


import org.testng.annotations.Test;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.gcr.config.StartBrowser;
import com.gcr.reuse.AutomationFunctions;


public class AutomationContactUs_Excel extends StartBrowser {
  @Test
  public void AutomationContactUs_ExcelTestcase () throws Exception {
	     AutomationFunctions asf = new AutomationFunctions();
	     Fillo f = new Fillo();
		  Connection con = f.getConnection("TestData/ContactUs.xlsx");
		  String query = "select * from contactus";
		  Recordset rs = con.executeQuery(query);
		  while (rs.next()) {
	      asf.ContactUs(rs.getField("Subject"), rs.getField("Email"), rs.getField("Orders"), rs.getField("Message"));
		  }
	     Thread.sleep(2000);
	     
	   }
}
    