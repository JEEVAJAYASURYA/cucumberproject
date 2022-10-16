package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utils.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefinition",dryRun=false,tags= {"@surya"},snippets=SnippetType.CAMELCASE
,plugin= {"html:target\\Report","junit:target\\Report\\hotels.xml","json:target\\Report\\output.json","rerun:src\\test\\resources\\Rerun\\failed.txt"})

public class TestReRunnerClass extends JvmReport {
	@AfterClass
	public static void surya() {
		generateJvmReport(System.getProperty("user.dir")+"\\target\\Report\\output.json");
	}
}
