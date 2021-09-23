package comcastorgtest;

import org.testng.annotations.Test;

public class OrgTest {
	
	@Test(groups="SmokeTest")
	
	public void createOrgTest() {
		String BROWSER = System.getProperty("chrome");
		String ENV = System.getProperty("url");
		System.out.println("BROWSER=====>"+BROWSER+"ENV=====>"+ENV);
		System.out.println("execute createorgTest");
	}
	@Test(groups="regressionTeat")
	public void OrgWithContactTest() {
		
		System.out.println("execute createorgWithContactTest");
	}
	@Test(groups="regressionTest")
	public void deleteOrgTest() {
		
		System.out.println("execute deleteOrgTest");
	}
	
	

}






