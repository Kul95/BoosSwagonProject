package org.example.bridgelabz;

import org.example.base.TestBase;
import org.example.pages.LoginPage;
import org.example.pages.MyAccount;
import org.example.pages.SignupPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountTest extends TestBase {
    MyAccount myAccount;
    LoginPage loginPage;
    SignupPage signupPage;
    public MyAccountTest(){
        super();
    }
    @BeforeMethod
    public void setup() throws InterruptedException {
        initialization();
        signupPage=new SignupPage();
        loginPage= signupPage.login();
        //loginPage=new LoginPage();
        myAccount=loginPage.setLoginBtn(props.getProperty("mobile"),props.getProperty("password"));

    }
    @Test(priority = 1)
    public void sMyAccount() throws InterruptedException {
        myAccount.setMyAccount();
    }
}
