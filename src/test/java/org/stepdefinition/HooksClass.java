package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utils.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
@Before(order =1)
public void beforeExe1() {
	System.out.println("Before Hooks Executed1");
	launchChrome();
    
}
@Before(order =2)
public void beforeExe2() {
	
	System.out.println("Before Hooks Executed2");
    launchUrl("https://in.hotels.com");
    
}
@Before(order =3)
public void beforeExe3() {
	System.out.println("Before Hooks Executed3");
    winMax();
}
@After(order=3)
public void afterExe1(Scenario s) throws IOException {
	System.out.println("After Hooks Executed3");

	String s1 = s.getName();
	String name = s1.replace(" ", "_");
	screenShot(name);
	
/*if (s.isFailed()) {
	TakesScreenshot t = (TakesScreenshot)driver;
	byte[] surya = t.getScreenshotAs(OutputType.BYTES);
	s.embed(surya, "image/png");*/
	
}//
@After(order=2)
public void afterExe2() {
	System.out.println("After Hooks Executed2");

}

@After(order=1)
public void afterExe3() {
	System.out.println("After Hooks Executed1");
	closeUrl();
}

}