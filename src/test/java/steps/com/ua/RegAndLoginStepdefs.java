package steps.com.ua;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.StringUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegAndLoginStepdefs {

    WebDriver driver;
    public String logg;
    public String pasg;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver/chromedriver.exe");
        driver = new ChromeDriver();


    }


    @Given("Navigate to sharelane.com")
    public void navigateToSharelaneCom() {
        driver.get("http://www.sharelane.com/cgi-bin/main.py");
        driver.manage().window().maximize();

    }


    @When("You`ve been navigated to it click Sign-up")
    public void youVeBeenNavigatedToItClickSignUp() {
        WebElement element = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a"));
        element.click();

    }

    @And("Enter Zip code")
    public void enterZipCode() {
        WebElement zipcode = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
        zipcode.sendKeys("12345");

    }

    @Then("Click Continue")
    public void clickContinue() {
        WebElement btnContinue = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        btnContinue.click();

    }



    @And("Enter first name")
    public void enterFirstName() {
        WebElement firstname = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input"));
        firstname.sendKeys("Sergey");
    }

    @And("Enter last name")
    public void enterLastName() {
        WebElement lastname = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
        lastname.sendKeys("Vasil");
    }

    @And("Enter email")
    public void enterEmail() {
        WebElement email = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        email.sendKeys("asas@sadas.com");
    }

    @And("Enter password")
    public void enterPassword() {
        WebElement password = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input"));
        password.sendKeys("12345");
    }

    @And("Enter confirmation password")
    public void enterConfirmationPassword() {
        WebElement confirmpass = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input"));
        confirmpass.sendKeys("12345");
    }

    @Then("Click Register")
    public void clickRegister() {
        WebElement btnregister = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input"));
        btnregister.click();
    }

    @When("You`ve been registered, click underlined here")
    public void youVeBeenRegisteredClickUnderlinedHere () throws Exception {
        WebElement beenreg = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td/span"));
        Assert.assertEquals("Account is created!", beenreg.getText());
        Thread.sleep(1000);

        WebElement log = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b"));
        WebElement pas = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]"));

        logg = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        pasg = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]")).getText();


        WebElement here = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td/p/a"));
        here.click();

    }

    @Then("Enter emailpassword")
    public void enterEmailpassword() throws Exception{
        WebElement gemail = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[1]/p/input"));
        WebElement gpassw = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[2]/p/input"));


        gemail.sendKeys(logg);
        gpassw.sendKeys(pasg);

        Thread.sleep(1000);


    }



    @And("Click Login")
    public void clickLogin() {
        WebElement btnlogin = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[3]/input"));
        btnlogin.click();
    }

    @Then("You`ve been signed in")
    public void youVeBeenSignedIn() throws Exception {
       Thread.sleep(1000);  //без этой задержки почему-то не хочет проходить тест положительно

        WebElement hello = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[1]/td/table/tbody/tr/td[2]/span"));

        Assert.assertNotEquals("Oops, error. Email and/or password don't match our records", hello.getText());


    }

    @After
    public void theEnd(){

        driver.close();


    }

}





















