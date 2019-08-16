import org.junit.After;
import org.junit.Before;
import mainobjects.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;


public class MySecondTest {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void mySecondTest() throws Exception {
        MainPage mainPage = new MainPage(driver);
        Registration registration = new Registration(driver);
        Login login = new Login(driver);
        Search search = new Search(driver);
        Buy buy = new Buy(driver);



        driver.manage().window().maximize();
        driver.get("http://www.sharelane.com/cgi-bin/main.py");

        Thread.sleep(300);

        mainPage.clickbtnsignup();

        Thread.sleep(300);

        registration.sendzipcode();
        registration.sendbtncont();

        Thread.sleep(1000);

        registration.sendfirstname();
        registration.sendsecondname();
        registration.sendemail();
        registration.sendpassword();
        registration.sendconfpassword();

        registration.sendbtnreg();


        Thread.sleep(1500);


        driver.get("http://www.sharelane.com/cgi-bin/main.py");
        Thread.sleep(1000);

        login.setEmail();
        login.setPassword();
        login.Login();

        Thread.sleep(3000);

        //driver.get("http://www.sharelane.com/cgi-bin/main.py");
        //Thread.sleep(1000);

        search.setSearchstring();
        search.sendbtnsearch();
        Thread.sleep(2000);

        buy.setAddcart();
        buy.setShopcart();
        buy.setQuantity();
        Thread.sleep(1000);
        buy.setBtnupdate();
        Thread.sleep(3000);
        buy.setBtncheckout();
        Thread.sleep(3000);
        buy.setCardnumb();
        Thread.sleep(3000);
        buy.setBtnmake();

        Thread.sleep(1500);







                driver.close();
    }

        @After
                public void tearDown() throws Exception{
            driver.quit();
        }




    }



