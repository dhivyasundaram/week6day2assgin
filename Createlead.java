package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead extends Baseclass {

	@Test(dataProvider="fetchvalues")
		public void runcreatelead(String Cname,String fname,String lname,String phnno)   {
			
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cname);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phnno);
			driver.findElement(By.name("submitButton")).click();
			
	}
	@DataProvider(name="fetchvalues")
	public String[] [] testdata() {
		String [] [] values= new String [2][4];
		values[0][0]="TestLeaf";
		values[0][1]="Dhivya";
		values[0][2]="S";
		values[0][3]="96";
				
		values[1][0]="TestLeaf";
		values[1][1]="Ramya";
		values[1][2]="S";
		values[1][3]="968";
		
		return values;
	}
}









