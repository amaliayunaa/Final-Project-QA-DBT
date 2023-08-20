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

'Masukkan Username : Admin'
WebUI.setText(findTestObject('Object Repository/Directory Test Case/Page_OrangeHRM/input_Username_username'), 'Admin')

'Masukkan Password : admin123'
WebUI.setEncryptedText(findTestObject('Object Repository/Directory Test Case/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

'Klik Button Login'
WebUI.click(findTestObject('Object Repository/Directory Test Case/Page_OrangeHRM/button_Login'))

'Klik Button Directory'
WebUI.click(findTestObject('Object Repository/Directory Test Case/Page_OrangeHRM/a_Directory'))

'Melakukan Verifikasi Apabila Klik Button Directory, Web akan Redirect Ke Link yang kita ekspektasi'
WebUI.verifyEqual(WebUI.getUrl(), 'https://opensource-demo.orangehrmlive.com/web/index.php/directory/viewDirectory')

'Masukkan "Odis" ke dalam input text box'
WebUI.setText(findTestObject('Object Repository/Directory Test Case/Page_OrangeHRM/input'), 'Odis')

'Kemudian Pilih Pilihan Odis Adalwin'
WebUI.click(findTestObject('Directory Test Case/Page_OrangeHRM/span_Odis  Adalwin'))

'Klik Select pada Job Title'
WebUI.click(findTestObject('Directory Test Case/Page_OrangeHRM/div_Job Title-- Select --'))

'Kemudian Pilih Pilihan Chief Technical Officer'
WebUI.click(findTestObject('Directory Test Case/Page_OrangeHRM/span_Chief Technical Officer'))

'Klik Select pada Location'
WebUI.click(findTestObject('Directory Test Case/Page_OrangeHRM/div_Location-- Select --'))

'Kemudian Pilih Pilihan HQ - CA, USA'
WebUI.click(findTestObject('Directory Test Case/Page_OrangeHRM/span_HQ - CA, USA'))

'Klik Button Search'
WebUI.click(findTestObject('Object Repository/Directory Test Case/Page_OrangeHRM/button_Search'))

'Klik Nama Odis Adalwin yang muncul di Result'
WebUI.click(findTestObject('Object Repository/Directory Test Case/Page_OrangeHRM/p_Odis  Adalwin'))

'Menutup Browser'
WebUI.closeBrowser()

