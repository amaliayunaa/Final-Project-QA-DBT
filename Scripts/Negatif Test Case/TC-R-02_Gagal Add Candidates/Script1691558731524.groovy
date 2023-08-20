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

'Membuka browser Google Chrome'
WebUI.openBrowser('')

'Membuka halaman website'
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

'Memasukkan username'
WebUI.setText(findTestObject('Object Repository/Requirement/Requirement-Add Candidates Gagal/input_Username_username'), 
    'Admin')

'Memasukkan password'
WebUI.setEncryptedText(findTestObject('Object Repository/Requirement/Requirement-Add Candidates Gagal/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

'Menekan tombol Login'
WebUI.click(findTestObject('Object Repository/Requirement/Requirement-Add Candidates Gagal/button_Login'))

'Menekan menu requirement'
WebUI.click(findTestObject('Object Repository/Requirement/Requirement-Add Candidates Gagal/a_Recruitment'))

'Menekan tombol add'
WebUI.click(findTestObject('Object Repository/Requirement/Requirement-Add Candidates Gagal/button_Add'))

'Memasukkan nama depan'
WebUI.setText(findTestObject('Object Repository/Requirement/Requirement-Add Candidates Gagal/input_Full Name_firstName'), 
    'Yuna')

'Memasukkan nama tengah'
WebUI.setText(findTestObject('Object Repository/Requirement/Requirement-Add Candidates Gagal/input_Full Name_middleName'), 
    'Amalia')

'Memasukkan nama belakang'
WebUI.setText(findTestObject('Object Repository/Requirement/Requirement-Add Candidates Gagal/input_Full Name_lastName'), 
    'Puspita')

'menekan tombol select dan memilih data'
WebUI.click(findTestObject('Object Repository/Requirement/Requirement-Add Candidates Gagal/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

'Menekan tombol save'
WebUI.click(findTestObject('Object Repository/Requirement/Requirement-Add Candidates Gagal/button_Save'))

'Memastikan apakah element span required ada '
WebUI.verifyElementPresent(findTestObject('Object Repository/Requirement/Requirement-Add Candidates Gagal/span_Required'), 
    0)

'Memastikan element required tampil'
WebUI.verifyElementVisible(findTestObject('Object Repository/Requirement/Requirement-Add Candidates Gagal/div_EmailRequired'))

