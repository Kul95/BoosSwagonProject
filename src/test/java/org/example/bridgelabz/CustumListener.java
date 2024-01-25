package org.example.bridgelabz;

import org.example.pages.LoginPage;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.apache.log4j.Logger;

public class CustumListener implements ITestListener {
    Logger logger = Logger.getLogger(LoginPage.class);
    @Override
    public void onTestStart(ITestResult result) {
        logger.info("Test start "+result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("Test Success "+result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
        logger.info("Test fail "+result.getName());
    }
}
