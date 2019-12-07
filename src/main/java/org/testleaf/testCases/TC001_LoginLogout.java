package org.testleaf.testCases;

import org.testleaf.base.ProjectSpecificMethods;
import org.testleaf.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_LoginLogout extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		excelFileName = "TC001";
	}
	
	@Test(dataProvider = "fetchData")
	public void loginLogout(String uname, String pwd,String cname,String fname,String lname) {
	
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()		
		.clickCrmSfa()
		.clickLead()
		.clickClead()
		.enterCompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname);
		
		
		
		
		
		
	}

}
