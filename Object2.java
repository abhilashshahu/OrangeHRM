package com.orangeHrm.Page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ReusableComponents2 extends OpenBrowser {

	public void logInfo(String message) {
		System.out.println("INFO: " + message);
	}

	public void login(String username, String password) {
		try {logInfo("login" + " execuation started");
			driver.findElement(ObjectRepository.userName).sendKeys(username);
			driver.findElement(ObjectRepository.passWord).sendKeys(password);
			driver.findElement(ObjectRepository.submit).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnOkFromAlertPopup() {
		try {
			logInfo("clickOnOkFromAlertPopup" + " execuation started");
			Thread.sleep(2000);
			Alert al = driver.switchTo().alert();
			al.accept();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnMyInfo() {
		try {
			logInfo("clickOnMyInfo" + " execuation started");
			driver.findElement(ObjectRepository.myInfo).click();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterTextInNickNameInputField(String value) {
		try {
			logInfo("enterTextInNickNameInputField" + " execuation started");
			WebElement inputField = driver.findElement(ObjectRepository.inputField);
			Actions act = new Actions(driver);
			act.click(inputField);
			Thread.sleep(2000);
			for (int i = 0; i <= 25; i++) {
				act.sendKeys(Keys.BACK_SPACE);
			}
			//inputField.clear();
			Thread.sleep(2000);
			act.sendKeys(inputField, value).build().perform();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterTextInEmployeeIdInputField(String value) {
		try {
			logInfo("enterTextInEmployeeIdInputField" + " execuation started");
			WebElement inputField = driver.findElement(ObjectRepository.EmployeeId);
			Actions act = new Actions(driver);
			act.click(inputField);
			Thread.sleep(2000);
			for (int i = 0; i <= 25; i++) {
				act.sendKeys(Keys.BACK_SPACE);
			}
			//inputField.clear();
			Thread.sleep(2000);
			act.sendKeys(inputField, value).build().perform();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterTextInOtherIdInputField(String value) {
		try {
			logInfo("enterTextInOtherIdInputField" + " execuation started");
			WebElement inputField = driver.findElement(ObjectRepository.OtherId);
			Actions act = new Actions(driver);
			act.click(inputField);
			Thread.sleep(2000);
			for (int i = 0; i <= 25; i++) {
				act.sendKeys(Keys.BACK_SPACE);
			}
			// inputField.clear();
			Thread.sleep(2000);
			act.sendKeys(inputField, value).build().perform();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterTextInDriversLicenseNumberInputField(String value) {
		try {
			logInfo("enterTextInDriversLicenseNumberInputField" + " execuation started");
			Thread.sleep(2000);
			WebElement inputField = driver.findElement(ObjectRepository.DriversLicenseNumber);
			Actions act = new Actions(driver);
			act.click(inputField);
			Thread.sleep(2000);
			for (int i = 0; i <= 25; i++) {
				act.sendKeys(Keys.BACK_SPACE);
			}
			// inputField.clear();
			Thread.sleep(2000);
			act.sendKeys(inputField, value).build().perform();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterTextInLicenseExpiryDateInputField(String value) {
		try {
			logInfo("enterTextInLicenseExpiryDateInputField" + " execuation started");
			WebElement inputField = driver.findElement(ObjectRepository.LicenseExpiryDate);
			Actions act = new Actions(driver);
			act.click(inputField);
			Thread.sleep(2000);
			for (int i = 0; i <= 15; i++) {
				act.sendKeys(Keys.BACK_SPACE);
			}
			// inputField.clear();
			Thread.sleep(2000);
			act.sendKeys(inputField, value).build().perform();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterTextInSSNNumberInputField(String value) {
		try {
			logInfo("enterTextInSSNNumberInputField" + " execuation started");
			WebElement inputField = driver.findElement(ObjectRepository.SSNNumber);
			Actions act = new Actions(driver);
			act.click(inputField);
			Thread.sleep(2000);
			for (int i = 0; i <= 15; i++) {
				act.sendKeys(Keys.BACK_SPACE);
			}
			// inputField.clear();
			Thread.sleep(2000);
			act.sendKeys(inputField, value).build().perform();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterTextInSINNumberInputField(String value) {
		try {
			logInfo("enterTextInSINNumberInputField" + " execuation started");
			WebElement inputField = driver.findElement(ObjectRepository.SINNumber);
			Actions act = new Actions(driver);
			act.click(inputField);
			Thread.sleep(2000);
			for (int i = 0; i <= 15; i++) {
				act.sendKeys(Keys.BACK_SPACE);
			}
			// inputField.clear();
			Thread.sleep(2000);
			act.sendKeys(inputField, value).build().perform();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterTextInDateofBirthInputField(String value) {
		try {
			logInfo("enterTextInDateofBirthInputField" + " execuation started");
			WebElement inputField = driver.findElement(ObjectRepository.DateofBirth);
			Actions act = new Actions(driver);
			act.click(inputField);

//			String textFormFild=inputField.getText();
//			char ch[]=textFormFild.toCharArray();
//		int length	=ch.length;
			for (int i = 0; i <= 25; i++) {
				act.sendKeys(Keys.BACK_SPACE);
			}

			Thread.sleep(2000);
			inputField.clear();
			Thread.sleep(2000);
			act.sendKeys(inputField, value).build().perform();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterTextInMilitaryServiceInputField(String value) {
		try {
			logInfo("enterTextInMilitaryServiceInputField" + " execuation started");
			WebElement inputField = driver.findElement(ObjectRepository.MilitaryService);
			Actions act = new Actions(driver);
			act.click(inputField);
			Thread.sleep(2000);
			for (int i = 0; i <= 15; i++) {
				act.sendKeys(Keys.BACK_SPACE);
			}
			// inputField.clear();
			Thread.sleep(2000);
			act.sendKeys(inputField, value).build().perform();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterTextInFirstNameInputField(String value) {
		try {
			logInfo("enterTextInFirstNameInputField" + " execuation started");
			WebElement inputField = driver.findElement(ObjectRepository.firstName);
			Actions act = new Actions(driver);
			act.click(inputField);
			Thread.sleep(2000);
			for (int i = 0; i <= 25; i++) {
				act.sendKeys(Keys.BACK_SPACE);
			}
			// inputField.clear();
			Thread.sleep(2000);
			act.sendKeys(inputField, value).build().perform();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterTextInMiddletNameInputField(String value) {
		try {
			logInfo("enterTextInMiddletNameInputField" + " execuation started");
			WebElement inputField = driver.findElement(ObjectRepository.middleName);
			Actions act = new Actions(driver);
			act.click(inputField);
			Thread.sleep(2000);
			for (int i = 0; i <= 25; i++) {
				act.sendKeys(Keys.BACK_SPACE);
			}
			// inputField.clear();
			Thread.sleep(2000);
			act.sendKeys(inputField, value).build().perform();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterTextInLasttNameInputField(String value) {
		try {
			logInfo("enterTextInLasttNameInputField" + " execuation started");
			WebElement inputField = driver.findElement(ObjectRepository.lastName);
			Actions act = new Actions(driver);
			act.click(inputField);
			Thread.sleep(2000);
			for (int i = 0; i <= 25; i++) {
				act.sendKeys(Keys.BACK_SPACE);
			}
			// inputField.clear();
			Thread.sleep(2000);
			act.sendKeys(inputField, value).build().perform();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void nationalityDropdown(String value) {
		try {
			
			logInfo("nationalityDropdown" + " execuation started");
			Actions act = new Actions(driver);
			driver.findElement(ObjectRepository.nationality).click();

			for (int i = 0; i <= 100; i++) {
				String nationalityText = driver.findElement(ObjectRepository.nationality_InputBox).getText();
				if (!nationalityText.equalsIgnoreCase(value)) {
					act.sendKeys(Keys.ARROW_DOWN).build().perform();
				} else {
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void maritalDropdown(String value) {
		try {
			logInfo("maritalDropdown" + " execuation started");
			Actions act = new Actions(driver);
			driver.findElement(ObjectRepository.maritalStatus).click();
			// WebElement inputField =
			// driver.findElement(ObjectRepository.optionFromDropdown);
//			By input=By.xpath(ObjectRepository.optionFromDropdown.toString().replace("By.xpath: ", "").replace("<replace>", value));
//			driver.findElement(input).click();

			for (int i = 0; i <= 100; i++) {
				String nationalityText = driver.findElement(ObjectRepository.maritailStatusDropDown).getText();
				if (!nationalityText.equalsIgnoreCase(value)) {
					act.sendKeys(Keys.ARROW_DOWN).build().perform();
				} else {
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void bloodTypeDropdown(String value) {
		try {
			logInfo("bloodTypeDropdown" + " execuation started");
			Actions act = new Actions(driver);
			driver.findElement(ObjectRepository.bloodType_Dropdoen).click();

			for (int i = 0; i <= 100; i++) {
				String nationalityText = driver.findElement(ObjectRepository.bloodType).getText();
				if (!nationalityText.equalsIgnoreCase(value)) {
					act.sendKeys(Keys.ARROW_DOWN).build().perform();
				} else {
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnGenderRadioButton() {
		try {
			logInfo("clickOnGenderRadioButton" + " execuation started");

			driver.findElement(ObjectRepository.genderRadioButton).click();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnSmokerChekBox() {
		try {
			logInfo("clickOnSmokerChekBox" + " execuation started");
			driver.findElement(ObjectRepository.smokerChekBox).click();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnsubmitFromPersonalDetails() {
		try {
			logInfo("clickOnsubmitFromPersonalDetails" + " execuation started");
			driver.findElement(ObjectRepository.submitFromPersonalDetails).click();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnSubmitFromCustomFields() {
		try {
			logInfo("clickOnSubmitFromCustomFields" + " execuation started");
			driver.findElement(ObjectRepository.submitFromCustomFields).click();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void uploadImage() {
		try {
			logInfo("uploadImage" + " execuation started");
			Thread.sleep(2000);
			driver.findElement(ObjectRepository.uploadFileButton).click();
			Thread.sleep(2000);
			Actions action_UploadImage = new Actions(driver);
			WebElement uploadImage = driver.findElement(ObjectRepository.fileUpload);
			uploadImage.sendKeys("C:\\Users\\Admin\\Pictures\\Saved Pictures\\Abhishek New resume short.pdf");
			// action_UploadImage.sendKeys(uploadImage, "C:\\Users\\Admin\\Pictures\\Saved
			// Pictures\\one.png");
			action_UploadImage.build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnSubmitFromFileUpload() {
		try {
			logInfo("clickOnSubmitFromFileUpload" + " execuation started");

			driver.findElement(ObjectRepository.uploadFileSubmitButton).click();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnContactdetails() {
		try {			
			logInfo("clickOnContactdetails" + " execuation started");
			Thread.sleep(5000);
		//	driver.findElement(By.xpath("//a[@href=\"/web/index.php/pim/contactDetails/empNumber/7\"]"))
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//a[@href=\"/web/index.php/pim/contactDetails/empNumber/7\"]")));
			act.build().perform();
			Thread.sleep(5000);
			driver.findElement(ObjectRepository.contactDetails).click();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnPersonalDetails() {
		try {
			Thread.sleep(5000);
			logInfo("clickOnContactdetails" + " execuation started");
			driver.findElement(ObjectRepository.personalDetails).click();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void enterStreetOneDetails(String value) {
		try {
			logInfo("enterStreetOneDetails" + " execuation started");
			Thread.sleep(2000);
			driver.findElement(ObjectRepository.Street1).click();
			Thread.sleep(10000);
			Actions act = new Actions(driver);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			act.sendKeys(Keys.DELETE).build().perform();
			Thread.sleep(10000);
			WebElement street1 = driver.findElement(ObjectRepository.Street1);
			act.sendKeys(street1, value).build().perform();
			Thread.sleep(2000);
			// driver.findElement(ObjectRepository.Street1).sendKeys(value);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterStreet2Details(String value) {
		try {
			logInfo("enterStreet2Details" + " execuation started");
			Thread.sleep(2000);
			driver.findElement(ObjectRepository.Street2).click();
			Thread.sleep(10000);
			Actions act = new Actions(driver);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			act.sendKeys(Keys.DELETE).build().perform();
			Thread.sleep(10000);
			WebElement street2 = driver.findElement(ObjectRepository.Street2);
			act.sendKeys(street2, value).build().perform();
			//driver.findElement(ObjectRepository.Street2).sendKeys(value);
			Thread.sleep(2000);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterCityDetails(String value) {
		try {
			logInfo("enterCityDetails" + " execuation started");
			Thread.sleep(2000);
			driver.findElement(ObjectRepository.city).click();
			Thread.sleep(10000);
			Actions act = new Actions(driver);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			act.sendKeys(Keys.DELETE).build().perform();
			Thread.sleep(10000);
			WebElement city = driver.findElement(ObjectRepository.city);
			act.sendKeys(city, value).build().perform();
			//driver.findElement(ObjectRepository.city).sendKeys(value);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterStateDetails(String value) {
		try {
			logInfo("enterStateDetails" + " execuation started");
			Thread.sleep(2000);
			driver.findElement(ObjectRepository.state).click();
			Thread.sleep(10000);
			Actions act = new Actions(driver);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			act.sendKeys(Keys.DELETE).build().perform();
			Thread.sleep(10000);
			WebElement state = driver.findElement(ObjectRepository.state);
			act.sendKeys(state, value).build().perform();
			//driver.findElement(ObjectRepository.state).sendKeys(value);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterZipcodeDetails(String value) {
		try {
			logInfo("enterZipcodeDetails" + " execuation started");
			Thread.sleep(2000);
			driver.findElement(ObjectRepository.zipcode).click();
			Thread.sleep(10000);
			Actions act = new Actions(driver);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			act.sendKeys(Keys.DELETE).build().perform();
			Thread.sleep(10000);
			WebElement zipcode = driver.findElement(ObjectRepository.zipcode);
			act.sendKeys(zipcode, value).build().perform();
			//driver.findElement(ObjectRepository.zipcode).sendKeys(value);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void countryDropdownFromContactDetailsPage(String value) {
		try {
			logInfo("countryDropdownFromContactDetailsPage" + " execuation started");
			Actions act = new Actions(driver);
			driver.findElement(ObjectRepository.countryDropDown).click();

			for (int i = 0; i <= 100; i++) {
				String nationalityText = driver.findElement(ObjectRepository.nationality_InputBox).getText();
				if (!nationalityText.equalsIgnoreCase(value)) {
					act.sendKeys(Keys.ARROW_DOWN).build().perform();
				} else {
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
