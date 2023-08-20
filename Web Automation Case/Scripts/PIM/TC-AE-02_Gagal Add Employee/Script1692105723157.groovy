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
WebUI.setText(findTestObject('PIM/PIM-Add Employee Gagall/input_Username_username'), 'Admin')

'Memasukkan password'
WebUI.setEncryptedText(findTestObject('PIM/PIM-Add Employee Gagall/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

'Menekan tombol login'
WebUI.click(findTestObject('PIM/PIM-Add Employee Gagall/button_Login'))

'Menekan menu PIM'
WebUI.click(findTestObject('PIM/PIM-Add Employee Gagall/a_PIM'))

'Menekan tombol add'
WebUI.click(findTestObject('PIM/PIM-Add Employee Gagall/button_Add'))

'Memasukkan nama depan employe'
WebUI.setText(findTestObject('PIM/PIM-Add Employee Gagall/input_Employee Full Name_firstName'), 'Amalia')

'menekan tombol save'
WebUI.click(findTestObject('PIM/PIM-Add Employee Gagall/button_Save'))

'Memastikan element required tampil'
WebUI.verifyElementVisible(findTestObject('PIM/PIM-Add Employee Gagall/span_Required'))

