package org.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
public static void generateJvmReport(String jsonpath) {
	// TODO Auto-generated method stub
File f = new File(System.getProperty("user.dir")+"\\target\\Report\\JvmReport");
Configuration con = new Configuration(f, "hotels.com");

List<String> li = new ArrayList<String>();
li.add(jsonpath);

ReportBuilder r = new ReportBuilder(li,con);
r.generateReports();
}
}
