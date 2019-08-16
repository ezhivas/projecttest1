package mainobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class Buy {
        private WebDriver driver;

        public Buy (WebDriver driver) {
            this.driver = driver;

            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table[2]/tbody/tr/td[2]/p[2]/a/img")
        WebElement addcart;
        @FindBy(xpath = "/html/body/center/table/tbody/tr[1]/td/table/tbody/tr/td[3]/a")
        WebElement shopcart;
        @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td[3]/input")
        WebElement quantity;
        @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[4]/td/input[1]")
        WebElement btnupdate;
        @FindBy(xpath = "/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[5]/td/form/input[1]")
        WebElement btncheckout;
        @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[3]/td[2]/table/tbody/tr[4]/td[2]/input")
        WebElement cardnumb;
        @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[3]/td[2]/table/tbody/tr[7]/td[2]/input")
        WebElement btnmake;


        public void setAddcart() {
            addcart.click();
        }
        public void setShopcart() {
            shopcart.click();
        }
        public void setQuantity() {
            quantity.sendKeys("2");
        }
        public void setBtnupdate(){
            btnupdate.click();
        }
        public void setBtncheckout(){
            btncheckout.click();
        }
        public void setCardnumb(){
            cardnumb.sendKeys("12345678998745");
        }
        public void setBtnmake(){
            btnmake.click();
        }
    }
