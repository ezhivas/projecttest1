package mainobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;


public class MainPage {
    private WebDriver driver;





    public MainPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a")
    private WebElement btnSignup;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[1]/td/table/tbody/tr/td[3]/a")
    private WebElement shoppingCart;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[2]/td/form/input[2]")
    private WebElement btnSearch;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[2]/td/form/input[1]")
    private WebElement poleSearch ;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[3]/input")
    private WebElement btnLogin;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[1]/p/input")
    private WebElement poleLogin;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[2]/p/input")
    private WebElement polePassword;




    public void clickshoppingCart(){
        shoppingCart.click();
    }

    public void clickbtnLogin(){
        btnLogin.click();
    }

    public void clickbtnsignup(){
        btnSignup.click();
    }

    public void setPoleLogin(){
        poleLogin.sendKeys("qwqwqwq");
    }

    public void setPolePassword(){
        polePassword.sendKeys("qwqwqwq");
    }

    public void setPoleSearch(){
        poleSearch.sendKeys("qwqwqwq");
    }

}

