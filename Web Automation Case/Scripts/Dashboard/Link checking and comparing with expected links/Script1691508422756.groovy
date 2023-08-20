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

'Melakukan click pada komponen Leave Request to Approve'
WebUI.click(findTestObject('Dashboard/Page_OrangeHRM/p_(13) Leave Requests to Approve'))

'Mengambil URL untuk disimpan\r\n'
WebUI.getUrl()

'Melakukan verifikasi dan pencocokan url, antara URL yang diharapkan(Expected URL) dengan URL yang sebenarnya(Actual URL),jika berbeda maka test case akan gagal'
WebUI.verifyMatch(WebUI.getUrl(), 'https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList', true)

WebUI.closeBrowser()

