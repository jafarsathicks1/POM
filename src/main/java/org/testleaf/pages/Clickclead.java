package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class Clickclead extends ProjectSpecificMethods {
	
	public CrtLead clickClead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CrtLead();
	}
	
}
