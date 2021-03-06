package com.hrms.testbase;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.hrms.utils.CommonMethods;

public class Listener implements ITestListener {
	
	public void onTestStart(ITestResult result) {
	   System.out.println("Test started "+result.getName()); 
	  }
	
	public void onTestSuccess(ITestResult result) {
	   System.out.println("Test passed "+result.getName());
	  }
	
	public void onTestFailure(ITestResult result) {
	    System.out.println("Test Failed "+result.getName());
	    CommonMethods.takeScreenshot(result.getName());
	  }

}

