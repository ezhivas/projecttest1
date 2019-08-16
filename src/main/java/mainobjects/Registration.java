package mainobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {

        private WebDriver driver;

        public Registration (WebDriver driver) {
            this.driver = driver;

                PageFactory.initElements(driver, this);

        }
        @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input" )
        private WebElement zipCode;

        @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input" )
        private WebElement btnCont;

        @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input" )
        private WebElement firstName;

        @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input" )
        private WebElement secondName;

        @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input" )
        private WebElement emale;

        @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input" )
        private WebElement passWord;

        @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input" )
        private WebElement confPassword;

        @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input")
        private  WebElement btnreg;


        public void sendbtnreg() {
                btnreg.click();
        }



        public void sendbtncont() {
                btnCont.click();
        }

        public void sendzipcode() {

                zipCode.sendKeys("12345");

        }
        public void sendemail(){
                emale.sendKeys("seo1004@rambler.ru");
        }

        public void sendfirstname() {

                firstName.sendKeys("Sergey");
        }


        public void sendsecondname() {
                secondName.sendKeys("Vasilets");
        }

        public void sendpassword() {
                passWord.sendKeys("password");
        }

        public void sendconfpassword(){
                confPassword.sendKeys("password");
        }


}
