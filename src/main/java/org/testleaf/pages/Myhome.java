package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class Myhome extends ProjectSpecificMethods{
	
	public Clickclead clickLead() {
		driver.findElementByLinkText("Leads").click();
		return new Clickclead();
	}
	

}
