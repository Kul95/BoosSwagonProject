package org.example.bridgelabz;

import org.example.base.TestBase;
import org.example.pages.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShippingPageTest extends TestBase {
    SignupPage signupPage;
    LoginPage loginPage;
    MyAccount myAccount;
    HomePage homePage;
    ShippingPage shippingPage;

    public ShippingPageTest() {
        super();
    }

    @BeforeMethod
    public void setShippingPage() throws InterruptedException {
        initialization();
        signupPage=new SignupPage();
        // loginPage=new LoginPage();
        loginPage=signupPage.login();
        myAccount=loginPage.setLoginBtn(props.getProperty("mobile"),props.getProperty("password"));
        homePage=myAccount.setMyAccount();
        shippingPage=homePage.homePage1();

    }

    @Test
    public void setShippingPage1() throws InterruptedException {
        shippingPage.shippingPage();
    }
}
