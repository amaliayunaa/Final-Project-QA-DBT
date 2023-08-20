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

'Buka Browser'
WebUI.openBrowser('')

'Buka Link URL'
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

'Masukkan Username : test'
WebUI.setText(findTestObject('Object Repository/Login Test Case/Page_OrangeHRM/input_Username_username'), 'test')

'Masukkan Password : test'
WebUI.setEncryptedText(findTestObject('Object Repository/Login Test Case/Page_OrangeHRM/input_Password_password'), 'P9ET2sDE0SE=')

'Klik Button Login'
WebUI.click(findTestObject('Object Repository/Login Test Case/Page_OrangeHRM/button_Login'))

'Melakukan Verifikasi Setelah Klik Button Share, Akan Menampilkan "Invalid credentials"'
WebUI.verifyElementVisible(findTestObject('Login Test Case/Page_OrangeHRM/div_Invalid credentials'), FailureHandling.STOP_ON_FAILURE)

'Menutup Browser'
WebUI.closeBrowser()

