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

'Test Case (Yang berhasil login) dari fitur login dipanggil'
WebUI.callTestCase(findTestCase('Login Test Cases/Checking Login Feature With Correct Credentials'), [:], FailureHandling.STOP_ON_FAILURE)

'Klik tombol claim'
WebUI.click(findTestObject('Object Repository/Claim Page/Page_OrangeHRM/span_Claim'))

'Mengisi input'
WebUI.setText(findTestObject('Claim Page/Page_OrangeHRM/input (1)'), '2023')

'Klik pada reference id yang diinginkan dan telah muncul karena fitur auto-complete\r\n\r\n'
WebUI.click(findTestObject('Object Repository/Claim Page/Page_OrangeHRM/span_202308070000007'))

'klik tombol search'
WebUI.click(findTestObject('Object Repository/Claim Page/Page_OrangeHRM/button_Search'))

'Melakukan verifikasi apakah record dengan reference id yang dimaksud telah muncul atau tidak\r\n'
WebUI.verifyElementVisible(findTestObject('Object Repository/Claim Page/Page_OrangeHRM/div_202308070000007'))

