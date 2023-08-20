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
WebUI.setText(findTestObject('Object Repository/Share Video Buzz Test Case/Page_OrangeHRM/input_Username_username'), 'Admin')

'Masukkan Password : admin123'
WebUI.setEncryptedText(findTestObject('Object Repository/Share Video Buzz Test Case/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

'Klik Button Login'
WebUI.click(findTestObject('Object Repository/Share Video Buzz Test Case/Page_OrangeHRM/button_Login'))

'Klik Button Buzz'
WebUI.click(findTestObject('Object Repository/Share Video Buzz Test Case/Page_OrangeHRM/a_Buzz'))

'Melakukan Verifikasi Apabila Klik Button Buzz, Web akan Redirect Ke Link yang kita ekspektasi'
WebUI.verifyEqual(WebUI.getUrl(), 'https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz')

'Klik Button Share Video'
WebUI.click(findTestObject('Object Repository/Share Video Buzz Test Case/Page_OrangeHRM/button_Share Video'))

'Ketik "Hi" Pada input Text'
WebUI.setText(findTestObject('Object Repository/Share Video Buzz Test Case/Page_OrangeHRM/textarea__oxd-buzz-post-input'), 
    'Hi')

'Ketik "https://youtu.be/CtcsvswG7_o" pada input Video URL'
WebUI.setText(findTestObject('Object Repository/Share Video Buzz Test Case/Page_OrangeHRM/textarea_Video URL_oxd-textarea oxd-textare_fe83e5'), 
    'https://youtu.be/CtcsvswG7_o')

'Klik Button Share'
WebUI.click(findTestObject('Object Repository/Share Video Buzz Test Case/Page_OrangeHRM/button_Share'))

'Menutup Browser'
WebUI.closeBrowser()

