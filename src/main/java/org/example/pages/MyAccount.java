package org.example.pages;

import org.example.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount extends TestBase {
    @FindBy(xpath = "//a[@href='accountsetting.aspx']")
    WebElement personalSetting;

    @FindBy(xpath = "//a[@href='orders.aspx']")
    WebElement myOrders;

    @FindBy(xpath = "//a[@href='wishlist.aspx']")
    WebElement wishlist;

    @FindBy(xpath = "//a[@href='mygiftcert.aspx']")
    WebElement giftCertificat;

    @FindBy(xpath = "//a[@href='myaddress.aspx']")
    WebElement myAddress;

    @FindBy(xpath = "//a[@href='changepassword.aspx']")
    WebElement changePassword1;

    @FindBy(xpath = "//a[@href='https://www.bookswagon.com/']")
    WebElement homeLogo;

    public MyAccount() {
        PageFactory.initElements(driver, this);
    }

    public HomePage setMyAccount() throws InterruptedException {
//        personalSetting.click();
//        Thread.sleep(5000);
//        driver.navigate().back();
//        Thread.sleep(5000);
//        myOrders.click();
//        Thread.sleep(5000);
//        driver.navigate().back();
//        Thread.sleep(5000);
//        wishlist.click();
//        Thread.sleep(5000);
//        driver.navigate().back();
//        Thread.sleep(5000);
//        giftCertificat.click();
//        Thread.sleep(5000);
//        driver.navigate().back();
//        Thread.sleep(5000);
//        myAddress.click();
//        Thread.sleep(5000);
//        driver.navigate().back();
//        Thread.sleep(5000);
//        changePassword1.click();
//        Thread.sleep(5000);
//        driver.navigate().back();
        Thread.sleep(5000);
        homeLogo.click();
//        Thread.sleep(5000);
//        driver.navigate().back();
//        Thread.sleep(5000);
        return new HomePage();
    }
}
