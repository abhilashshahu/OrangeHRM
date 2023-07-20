package com.OrangeHrm.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHrm.Page.OpenBrowser;
import com.orangeHrm.Page.ReusableComponents2;

public class OrangeHrmCase extends ReusableComponents2 {
	OpenBrowser lp;

	@BeforeMethod
	public void browsersetup() {
		lp = new OpenBrowser();
		lp.intialization("chrome");
	}

	@Test
	public void logintest()  {
		login("Admin", "admin123");
		
		
		clickOnMyInfo();
		
		
		enterTextInFirstNameInputField("Abhishek");
		enterTextInMiddletNameInputField("Shirish");
		enterTextInLasttNameInputField("Gund");
		enterTextInNickNameInputField("abhi");	
		enterTextInEmployeeIdInputField("1234567890");
		enterTextInOtherIdInputField("abc");
		enterTextInLicenseExpiryDateInputField("2022-09-09");
		enterTextInDriversLicenseNumberInputField("B045681789");
		enterTextInSSNNumberInputField("SSN12378");
		enterTextInSINNumberInputField("SIN12378");
		nationalityDropdown("Indian");
		maritalDropdown("Single");
		enterTextInDateofBirthInputField("1980-10-14");
		//clickOnGenderRadioButton();
		enterTextInMilitaryServiceInputField("No");
		clickOnSmokerChekBox();
		clickOnsubmitFromPersonalDetails();
		bloodTypeDropdown("B+");
		clickOnSubmitFromCustomFields();
		uploadImage();
		clickOnSubmitFromFileUpload();
		clickOnContactdetails();
		enterStreetOneDetails("Modi Road");
		enterStreet2Details("Third lane");
		enterCityDetails("Navi  Mumbai");
		enterStateDetails("Maharashtra");
		enterZipcodeDetails("12345");
		countryDropdownFromContactDetailsPage("India");
	}
	@AfterMethod
	public void closebrowser() {
		lp.teardown();
	}

}
