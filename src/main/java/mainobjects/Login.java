package mainobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
        private WebDriver driver;

        public Login (WebDriver driver) {
            this.driver = driver;

            PageFactory.initElements(driver, this);

    }
        @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[1]/p/input")
        private WebElement  email;
        @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[2]/p/input")
        private WebElement  password;
        @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[3]/input")
        private WebElement btnlog;

        public void setEmail(){
            email.sendKeys("marina_holmes@465.39.sharelane.com");
        }
        public void setPassword(){
            password.sendKeys("1111");
        }
        public void Login(){
            btnlog.click();
        }


}
