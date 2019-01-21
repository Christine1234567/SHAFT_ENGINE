package com.shaft.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.shaft.browser.BrowserFactory;
import com.shaft.io.ReportManager;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
    }

    @Override
    public void onTestSuccess(ITestResult result) {
    }

    @Override
    public void onTestFailure(ITestResult result) {
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
	// This is to confirm that no browser sessions were leaked from the previous
	// test class
	ReportManager.setDiscreetLogging(true);
	BrowserFactory.closeAllDrivers();
	ReportManager.setDiscreetLogging(false);
    }

    @Override
    public void onFinish(ITestContext context) {
    }

}
