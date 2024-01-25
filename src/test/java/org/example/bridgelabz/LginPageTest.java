package org.example.bridgelabz;

import org.apache.log4j.Logger;
import org.example.base.TestBase;
import org.example.pages.LoginPage;
import org.example.pages.SignupPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustumListener.class)
public class LginPageTest extends TestBase {
    Logger logger=Logger.getLogger(LoginPage.class);
    LoginPage loginPage;
    SignupPage signupPage;

    public LginPageTest() {
        super();
    }
    @BeforeMethod
    public void setup() throws InterruptedException {
        logger.info("Start execution");
        initialization();
        signupPage=new SignupPage();
        Thread.sleep(2000);
        loginPage=signupPage.login();
        Thread.sleep(2000);

    }

    @Test
    public void setLoginPage() throws InterruptedException {
        loginPage.setLoginBtn(props.getProperty("mobile"),props.getProperty("password"));
        logger.info("log test successfully");
    }
}
