import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

'Test Case (Yang berhasil login) dari fitur login dipanggil'
WebUI.callTestCase(findTestCase('Login Test Cases/Checking Login Feature With Correct Credentials'), [:], FailureHandling.STOP_ON_FAILURE)

'Klik profile \r\n'
WebUI.click(findTestObject('Object Repository/Logout/Page_OrangeHRM/p_Paul Collings'))

'Klik logout\r\n'
WebUI.click(findTestObject('Object Repository/Logout/Page_OrangeHRM/a_Logout'))

'Cookies dihapus'
WebUI.deleteAllCookies()

'Mengakses URL'
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index')

'Mengambil URL'
WebUI.getUrl()

'Memverifikasi URL untuk memastikan cookies telah terhapus atau tidak, jika URL Dashboard bisa diakses maka test case otomatis gagal'
WebUI.verifyMatch(WebUI.getUrl(), 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login', true)

