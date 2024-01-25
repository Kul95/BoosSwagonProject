package org.example.pages;

import org.example.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShippingPage extends TestBase {
    @FindBy(xpath = "//input[@id='ctl00_cpBody_txtNewRecipientName']")
    WebElement recipName;

    @FindBy(xpath = "//input[@id='ctl00_cpBody_txtNewCompanyName']")
    WebElement companyName;

    @FindBy(xpath = "//textarea[@id='ctl00_cpBody_txtNewAddress']")
    WebElement streetAddress;
    @FindBy(xpath = "//input[@id='ctl00_cpBody_txtNewLandmark']")
    WebElement landmark;

    @FindBy(xpath = "//select[@id='ctl00_cpBody_ddlNewCountry']")
    WebElement country;
    @FindBy(xpath = "//select[@id='ctl00_cpBody_ddlNewState']")
    WebElement state;
    @FindBy(xpath = "//select[@id='ctl00_cpBody_ddlNewCities']")
    WebElement city;
    @FindBy(xpath = "//input[@id='ctl00_cpBody_txtNewPincode']")
    WebElement pinCode;
    @FindBy(xpath = "//input[@id='ctl00_cpBody_txtNewMobile']")
    WebElement mobile;

    @FindBy(xpath = "//input[@id='ctl00_cpBody_imgSaveNew']")
    WebElement saveAndContinue;
public ShippingPage(){
    PageFactory.initElements(driver,this);
}
public ShippingPage shippingPage() throws InterruptedException {
 recipName.sendKeys("Admin");
 Thread.sleep(5000);
    companyName.sendKeys("RTS MAnpower");
    Thread.sleep(5000);
    streetAddress.sendKeys("NSP New Delhi");
    Thread.sleep(5000);
    landmark.sendKeys("NSP");
    Thread.sleep(5000);
    Select select=new Select(country);
    select.selectByValue("India");
    Thread.sleep(5000);
    Select select1=new Select(state);
    select1.selectByValue("Uttar Pradesh");
    Thread.sleep(5000);
    Select select2=new Select(city);
    select2.selectByIndex(2);
    Thread.sleep(5000);
    pinCode.sendKeys("208765");
    Thread.sleep(5000);
    mobile.sendKeys("9876124357");
    Thread.sleep(5000);
    saveAndContinue.click();
    Thread.sleep(5000);
    return new ShippingPage();
}
}
