#Export-katalon-studio test-case (github) (jira)
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://demoqa.com/")
assertEquals("DEMOQA", selenium.getTitle());
selenium.click("//div[@class='home-body']//div")
selenium.click("xpath=//img[@alt='Selenium Online Training']")
selenium.selectWindow("win_ser_1")
/* selenium.() */
/* selenium.() */
selenium.open("https://demoqa.com/text-box")
selenium.click("id=userName")
selenium.type("id=userName", ("Victor alonso garcia").toString())
selenium.click("id=userEmail")
selenium.type("id=userEmail", ("victoralonsogarcia8@gmail.com").toString())
selenium.click("id=currentAddress")
selenium.type("id=currentAddress", ("street b").toString())
selenium.click("id=permanentAddress")
selenium.type("id=permanentAddress", ("street b").toString())
selenium.click("id=submit")
selenium.click("xpath=//div[@id='app']/header/a/img")
selenium.open("https://demoqa.com/")
selenium.click("xpath=//div[@id='app']/div/div/div[2]/div/div[2]/div/div[3]")
selenium.click("xpath=//div[@id='app']/div/div/div[2]/div/div/div/div[3]")
selenium.click("xpath=//div[@id='app']/div/div/div[2]/div[2]")
selenium.click("id=item-0")
selenium.click("id=permanentAddress")
selenium.click("xpath=//div[@id='app']/div/div/div/div")
selenium.click("xpath=//div[@id='app']/div/div/div/div")
selenium.click("id=userName")
selenium.click("xpath=//div[@id='app']/div/div/div[2]/div[3]")
selenium.click("id=currentAddress")
selenium.click("id=item-1")
selenium.click("xpath=//li[@id='item-2']/span")
selenium.click("xpath=//div[@id='app']/div/div/div[2]/div[2]/div/div[2]/label")
selenium.click("id=item-4")
selenium.click("id=doubleClickBtn")
selenium.click("id=doubleClickBtn")
selenium.doubleClick("id=doubleClickBtn")
selenium.click("xpath=//div[@id='app']/div/div/div[2]/div[2]/div")
selenium.click("id=vF5PB")
selenium.click("xpath=//li[@id='item-3']/span")
selenium.click("css=#edit-record-1 > svg > path")
selenium.click("id=firstName")
selenium.click("id=userEmail")
selenium.click("id=department")
selenium.click("id=submit")
selenium.click("xpath=//div[@id='app']/div/div/div[2]/div[2]/div/div[3]/div[2]/div/div[2]/span[2]/select")
selenium.select("xpath=//div[@id='app']/div/div/div[2]/div[2]/div/div[3]/div[2]/div/div[2]/span[2]/select", "label=20 rows")
selenium.click("xpath=//div[@id='app']/div/div/div[2]/div[3]")
