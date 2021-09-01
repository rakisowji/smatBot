import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

try {
    WebUI.delay(10)
	
    WebUI.verifyElementVisible(findTestObject('choose_lang'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('refresh_chat'), 5, FailureHandling.STOP_ON_FAILURE)

    WebUI.enhancedClick(findTestObject('button_English'), FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    if (e != null) {
        e.printStackTrace()
    }
}