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

'Melakukan verifikasi komponen "Time at Work" telah muncul atau tidak\r\n\r\n'
WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/Page_OrangeHRM/div_Time at WorkPunched InPunched In Jan 16_188e10'))

'Melakukan verifikasi komponen "My Actions" telah muncul atau tidak\r\n\r\n'
WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/Page_OrangeHRM/div_My Actions (9) Leave Requests to Approv_28128f'))

'Melakukan verifikasi komponen "Latest Post" telah muncul atau tidak\r\n\r\n'
WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/Page_OrangeHRM/div_Buzz Latest Postschtestuaskbnasd D Rams_29acd4'))

'Melakukan verifikasi komponen "Quick Launch" telah muncul atau tidak\r\n\r\n'
WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/Page_OrangeHRM/div_Quick LaunchAssign LeaveLeave ListTimes_7de346'))

'Melakukan verifikasi komponen "Employees on Leave Today" telah muncul atau tidak\r\n\r\n'
WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/Page_OrangeHRM/div_Employees on Leave TodayNo Employees ar_bed810'))

'Melakukan verifikasi komponen "Employee Distribution by Sub Unit" telah muncul atau tidak\r\n\r\n'
WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/Page_OrangeHRM/div_Employee Distribution by Sub UnitEngine_525aaf'))

'Melakukan verifikasi komponen "Employee Distribution by Location" telah muncul atau tidak\r\n\r\n'
WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/Page_OrangeHRM/div_Employee Distribution by LocationNew Yo_066f30'))

WebUI.closeBrowser()

