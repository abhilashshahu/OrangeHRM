package com.orangeHrm.Page;

import org.openqa.selenium.By;

public class ObjectRepository {

	public static final By userName = By.xpath("//input[@name='username']");
	public static final By passWord = By.xpath("//input[@name='password']");
	public static final By submit = By.xpath("//button[@type='submit']");
	public static final By myInfo = By.xpath("//span[text()='My Info']");
	public static final By textFromMyInfoPage = By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6");
	public static final By firstName = By.xpath("//input[@name='firstName']");
	public static final By middleName = By.xpath("//input[@name='middleName']");
	public static final By lastName = By.xpath("//input[@name='lastName']");
	public static final By inputField = By
			.xpath("//label[text()='Nickname']/parent::div/parent::div//input[@class='oxd-input oxd-input--active']");
	public static final By EmployeeId = By.xpath(
			"//label[text()='Employee Id']/parent::div/parent::div//input[@class='oxd-input oxd-input--active']");
	public static final By OtherId = By
			.xpath("//label[text()='Other Id']/parent::div/parent::div//input[@class='oxd-input oxd-input--active']");
	
	public static final By DriversLicenseNumber = By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]");
	public static final By LicenseExpiryDate = By.xpath(
			"//label[text()='License Expiry Date']/parent::div/parent::div//input[@class='oxd-input oxd-input--active']");
	public static final By SSNNumber = By
			.xpath("//label[text()='SSN Number']/parent::div/parent::div//input[@class='oxd-input oxd-input--active']");
	public static final By SINNumber = By
			.xpath("//label[text()='SIN Number']/parent::div/parent::div//input[@class='oxd-input oxd-input--active']");
	public static final By DateofBirth = By.xpath(
			"//label[text()='Date of Birth']/parent::div/parent::div//input[@class='oxd-input oxd-input--active']");
	public static final By MilitaryService = By.xpath(
			"//label[text()='Military Service']/parent::div/parent::div//input[@class='oxd-input oxd-input--active']");
	public static final By nationality = By.xpath("(//div[@class='oxd-select-text--after']/i)[1]");
	public static final By maritalStatus = By.xpath("(//div[@class='oxd-select-text--after']/i)[2]");
	public static final By nationality_InputBox = By.xpath("(//div[@class='oxd-select-text-input'])[1]");
	public static final By maritailStatusDropDown = By.xpath("(//div[@class='oxd-select-text-input'])[2]");
	public static final By bloodType = By.xpath("(//div[@class='oxd-select-text-input'])[3]");
	public static final By bloodType_Dropdoen = By.xpath("(//div[@class='oxd-select-text--after']/i)[3]");
	public static final By genderRadioButton = By.xpath("(//div[@class='oxd-radio-wrapper'])[1]");
	public static final By smokerChekBox = By.xpath("//div[@class='oxd-checkbox-wrapper']/label/span/i");
	public static final By submitFromPersonalDetails = By.xpath("(//button[@type='submit'])[1]");
	public static final By submitFromCustomFields = By.xpath("(//button[@type='submit'])[2]");
	public static final By fileUpload = By.xpath("//input[@class='oxd-file-input']");
	public static final By uploadFileButton = By
			.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--text']");
	public static final By uploadFileSubmitButton = By.xpath("(//button[@type='submit'])[3]");
	public static final By contactDetails = By.xpath("//a[@href=\"/web/index.php/pim/contactDetails/empNumber/7\"]");
	public static final By Street1 = By
			.xpath("(//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/div)[2]");
	public static final By Street2 = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input");
	public static final By city = By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
	public static final By state = By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]");
	public static final By zipcode = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input");
	public static final By countryDropDown = By.xpath("//div[@class='oxd-select-text--after']");
	public static final By personalDetails = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[1]/a");
}
