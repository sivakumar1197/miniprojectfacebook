package com.runnerfacebook;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.ReaderManager.ReaderManager;

import Baseclass.Base;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//Featurefiles//FaceBook.feature", glue = "com.Stepdefinitions", monochrome = true, dryRun = false, plugin = {
		"json:target/Reports/cucumber.json" })
//@CucumberOptions(features = "src//test//java//com//Featurefiles//FaceBook.feature", glue = "com.Stepdefinitions", monochrome = true, dryRun = false, plugin = {
//		"html:Report/Html_report", "pretty", "json:Reports/Cucumber.json",
//		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html" })
public class Test_runnner {

	public static WebDriver driver;

	public static Logger log = Logger.getLogger(Test_runnner.class);

	@BeforeClass
	public static void set_up() throws Exception {

		PropertyConfigurator.configure("log4j.properties");

		String getdrivername = ReaderManager.Instant_ReaderManager().InstantReaderMaster().getdrivername();

		log.info("Driver launched");
		driver = Base.LaunchBrowser(getdrivername);

	}

	@AfterClass
	public static void teardown() {
		driver.close();
	}

}
