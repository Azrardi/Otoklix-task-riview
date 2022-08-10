import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Checkout/TC-19/Page_Swag Labs/input_standard_userlocked_out_'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Checkout/TC-19/Page_Swag Labs/input_standard_userlocked_out__1'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Product List/TC-05/Page_Swag Labs/input_standard_userlocked_out__3'))

WebUI.click(findTestObject('Page_Swag Labs/a_1'))

WebUI.click(findTestObject('Page_Swag Labs/button_Checkout'))

WebUI.setText(findTestObject('Checkout/TC-19/Page_Swag Labs/input_Checkout Your Informatio'), 'M Azzumardi')

WebUI.setText(findTestObject('Checkout/TC-19/Page_Swag Labs/input_Checkout Your Informatio_6'), 'Azra')

WebUI.setText(findTestObject('Checkout/TC-19/Page_Swag Labs/input_Checkout Your Informatio_13'), '1234fd')

WebUI.click(findTestObject('Page_Swag Labs/input_Cancel_continue'))

WebUI.click(findTestObject('Page_Swag Labs/button_Finish'))

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/h2_THANK YOU FOR YOUR ORDER'), 0)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

