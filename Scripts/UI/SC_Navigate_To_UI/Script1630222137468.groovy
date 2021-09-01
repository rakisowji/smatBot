import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.Keys as Keys

try {
    System.setProperty('webdriver.chrome.driver', DriverFactory.getChromeDriverPath())

    ChromeOptions options = new ChromeOptions()

    Map chromePrefs = new HashMap()

    chromePrefs.put('profile.default_content_setting_values.notifications', 2)

    chromePrefs.put('profile.default_content_setting_values.media_stream_mic', 1)

    options.setExperimentalOption('prefs', chromePrefs)

    DesiredCapabilities cap = DesiredCapabilities.chrome()

    cap.setCapability(ChromeOptions.CAPABILITY, options)

    WebDriver chromedriver = new ChromeDriver(cap)

    DriverFactory.changeWebDriver(chromedriver)

    GlobalVariable.chromeDriverObjectMap.put('Window1', chromedriver)
	
    WebUI.maximizeWindow()
	
	WebUI.navigateToUrl(GlobalVariable.baseUrl)
}
catch (Exception e) {
    if (e != null) {
        e.printStackTrace()
    }
}