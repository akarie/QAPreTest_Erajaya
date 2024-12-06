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
WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

//click
WebUI.click(findTestObject('Page_CURA Healthcare Service/bars_CURA Healthcare'))

//click
WebUI.click(findTestObject('Page_CURA Healthcare Service/Text_Login on Bars'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_CURA Healthcare Service/Login/input_Username'), 'Arie')

WebUI.setText(findTestObject('Page_CURA Healthcare Service/Login/input_Password'), '12345678')

WebUI.click(findTestObject('Page_CURA Healthcare Service/Login/button_Login'))

WebUI.delay(2)

WebUI.verifyTextPresent('Login failed! Please ensure the username and password are valid.', false)

WebUI.delay(2)

