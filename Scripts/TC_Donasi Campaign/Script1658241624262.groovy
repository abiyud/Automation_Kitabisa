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

WebUI.openBrowser(url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Home/ImgBanner'))

WebUI.click(findTestObject('Campaign/BtnDonasiSekarang'))

WebUI.setText(findTestObject('Campaign/InptAmount'), amount)

WebUI.click(findTestObject('Campaign/BtnLanjutkanPembayaran'))

WebUI.click(findTestObject('Payment/BtnPembayaran', [('name') : pembayaran]))

WebUI.setText(findTestObject('Contribute/InptNamaLengkap'), fullname)

WebUI.setText(findTestObject('Contribute/InptEmail'), email)

WebUI.click(findTestObject('Campaign/BtnLanjutkanPembayaran'))

WebUI.waitForElementPresent(findTestObject('Helper/TxtHelper', [('name') : text]), 5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Summary/BtnBack'))

WebUI.click(findTestObject('Campaign/BtnBack'))

WebUI.closeBrowser()

