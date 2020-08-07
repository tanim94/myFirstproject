package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class homePage {
ChromeDriver dr;
String expectedTitle="Sign in - Google Accounts";
String expectedURL=("https://accounts.google.com/signin/v2/challenge/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward&TL=AM3QAYaYPZkZptrhvH6HKoJlbdKWo4WA_b6TVzamOAu2UzG90-BFgpWwSgLZEaY9");
 
	
public void OpenBrowser() {
	try {
	System.setProperty("webdriver.chrome.driver"," /Users/npchowdhury/Downloads/chromedriver");
	dr=new ChromeDriver();
	dr.get("https://accounts.google.com/signin");
	Reporter.log("Chrome Browser Succesfuly Open");
	
		
	}
	catch (Exception e) {
	Assert.fail("Chrome Browser failed to open");
	}
	}
public void VerifyTitle() {
 String actualTitle=dr.getTitle();
 Assert.assertEquals(actualTitle,expectedTitle);
 Reporter.log("Title Matched");
 System.out.println(dr.getTitle());
}


public void VerifyURL() {

try
{

String actualURL=dr.getCurrentUrl();
Assert.assertEquals(actualURL, expectedURL);

Reporter.log("URL Matched");
//System.outprintln(dr.getCurrentUrl());

}

catch (Exception e){
	
	
}
}
public void signIn () {
	WebElement google=dr.findElementByXPath("//input[@id=identifierID");
	google.sendKeys("naimul@gmail.com");
	dr.findElementByXPath("//[@id=\"identifiernext\"]/div/button/div[2])).click()");
}

	
}









