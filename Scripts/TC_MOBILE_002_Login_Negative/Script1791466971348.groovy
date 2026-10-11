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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.apache.commons.lang.RandomStringUtils

String apk = new File(
    RunConfiguration.getProjectDir(),
    'Data/APK/APK-sauce-labs-stg.2.7.1.apk'
).absolutePath

def invalidPassword = RandomStringUtils.randomAlphanumeric(10) + '@#'

Mobile.startApplication(
    apk,
    false,
    FailureHandling.STOP_ON_FAILURE
)

Mobile.setText(
    findTestObject('Login-Page/username-field'),
    GlobalVariable.username,
    5
)

Mobile.setText(
    findTestObject('Login-Page/password-field'),
    invalidPassword,
    5
)

Mobile.hideKeyboard()

Mobile.tap(
    findTestObject('Login-Page/button-login'),
    2
)

Mobile.verifyElementVisible(
    findTestObject('Login-Page/alert-login'),
    10
)

Mobile.closeApplication()

