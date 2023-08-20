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

'Klik tombol claim '
WebUI.click(findTestObject('Object Repository/Claim Page/Page_OrangeHRM/span_Claim'))

'klik tombol employee claim'
WebUI.click(findTestObject('Object Repository/Claim Page/Page_OrangeHRM/a_Employee Claims'))

'Mengisi input'
WebUI.setText(findTestObject('Object Repository/Claim Page/Page_OrangeHRM/input'), 'odi')

'Klik pada nama yang diinginkan dan telah muncul karena fitur auto-complete\r\n\r\n'
WebUI.click(findTestObject('Object Repository/Claim Page/Page_OrangeHRM/span_Odis  Adalwin'))

'Test data yang digunakan adalah seorang pegawai bernama Odis Adalwin\r\n'
WebUI.setText(findTestObject('Object Repository/Claim Page/Page_OrangeHRM/input'), 'Odis  Adalwin')

'klik tombol search\r\n'
WebUI.click(findTestObject('Object Repository/Claim Page/Page_OrangeHRM/button_Search'))

'Mengecek apakah nama yang telah diketikkan sebelumnya, muncul atau tidak pada bagian records'
WebUI.verifyElementVisible(findTestObject('Object Repository/Claim Page/Page_OrangeHRM/div_Odis Adalwin'))

WebUI.closeBrowser()

