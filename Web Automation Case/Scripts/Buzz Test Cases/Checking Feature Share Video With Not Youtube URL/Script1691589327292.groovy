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
WebUI.setText(findTestObject('Share Video Buzz Test Case/Page_OrangeHRM/input_Username_username'), 'Admin')

'Masukkan Password : admin123'
WebUI.setEncryptedText(findTestObject('Share Video Buzz Test Case/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

'Klik Button Login'
WebUI.click(findTestObject('Share Video Buzz Test Case/Page_OrangeHRM/button_Login'))

'Klik Button Buzz'
WebUI.click(findTestObject('Share Video Buzz Test Case/Page_OrangeHRM/a_Buzz'))

'Melakukan Verifikasi Apabila Klik Button Buzz, Web akan Redirect Ke Link yang kita ekspektasi'
WebUI.verifyEqual(WebUI.getUrl(), 'https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz')

'Klik Button Share Video'
WebUI.click(findTestObject('Share Video Buzz Test Case/Page_OrangeHRM/button_Share Video'))

'Ketik "What\'s Up People??" pada input Text'
WebUI.setText(findTestObject('Share Video Buzz Test Case/Page_OrangeHRM/textarea__oxd-buzz-post-input'), 'What\'s Up People??')

'Ketik "not_url" pada input Video URL'
WebUI.setText(findTestObject('Share Video Buzz Test Case/Page_OrangeHRM/textarea_Video URL_oxd-textarea oxd-textare_fe83e5'), 
    'not_url')

'Klik Button Share'
WebUI.click(findTestObject('Share Video Buzz Test Case/Page_OrangeHRM/button_Share'))

'Melakukan Verifikasi Setelah Klik Button Share, Akan Menampilkan "This URL is not a valid URL of a video or it is not supported by the system"'
WebUI.verifyElementVisible(findTestObject('Share Video Buzz Test Case/Page_OrangeHRM/span_This URL is not a valid URL of a video or it is not supported by the system'))

'Menutup Browser'
WebUI.closeBrowser()

