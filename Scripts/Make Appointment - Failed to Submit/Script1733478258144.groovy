import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//open browser
WebUI.callTestCase(findTestCase('Login - Valid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

//click
WebUI.click(findTestObject('Page_CURA Healthcare Service/Make appointment/dropdown_Facility'))

//click
WebUI.click(findTestObject('Page_CURA Healthcare Service/Make appointment/TickBox_Apply for hospital readmission'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_CURA Healthcare Service/Make appointment/TickBox_HealthcareProgram_Medicare'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_CURA Healthcare Service/Make appointment/textarea_Comment'), 'Failed to Submit')

WebUI.click(findTestObject('Page_CURA Healthcare Service/Make appointment/button_Book Appointment'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/Make appointment/Datepicker_December 2024'), 5)

WebUI.delay(2)

