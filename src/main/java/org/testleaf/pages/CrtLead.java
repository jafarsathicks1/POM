package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class CrtLead extends ProjectSpecificMethods {
	
	public CrtLead enterCompanyName(String data) {
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
		return this;
		
	}
	
	public CrtLead enterFirstName(String data) {
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
		return this;
	}
	
	public CrtLead enterLastName(String data) {
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
		return this;
	}
	
	
	  public Viewlead submit(String data) {
	  driver.findElementByName("submitButton").click();
	  return new Viewlead();
	  
	  }
	 
	
	
	

}
