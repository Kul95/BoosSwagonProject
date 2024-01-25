package org.example.dataDriven;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.base.TestBase;
import org.example.pages.LoginPage;
import org.example.pages.SignupPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataDrivenTest extends TestBase {
    LoginPage loginPage;
    SignupPage signupPage;
    // Logger log=Logger.getLogger(String.valueOf(LoginPage.class));

    public DataDrivenTest() {
        super();
    }

    @BeforeMethod
    public void setup() throws InterruptedException {
        initialization();
        signupPage=new SignupPage();
        Thread.sleep(2000);
        loginPage = signupPage.login();
    }

    @Test(dataProvider = "Excel")
    public void loginTest(String mobileNumber, String password) throws InterruptedException {
        loginPage.setLoginBtn(mobileNumber, password);
        // log.info("Login successful with mobileNumber: " + mobileNumber);
    }

    @DataProvider(name = "Excel")
    public Object[][] testDataGenerator() throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\SeleniumProjects\\OnlineBookSwagonStore\\testData\\TestData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet loginSheet = workbook.getSheet("Login");
        int numbeOfData = loginSheet.getPhysicalNumberOfRows();

        Object[][] testData = new Object[numbeOfData][2];

        for (int i = 0; i < numbeOfData; i++) {
            XSSFRow row = loginSheet.getRow(i);
            XSSFCell mobileNumber = row.getCell(0);
            XSSFCell password = row.getCell(1);
            double mobile = mobileNumber.getNumericCellValue();
            String mobileNumberString = String.valueOf((long) mobile);
            String passwordValue = password.getStringCellValue();
            testData[i][0] = mobileNumberString;
            testData[i][1] = passwordValue;
        }
        return testData;
    }
}
