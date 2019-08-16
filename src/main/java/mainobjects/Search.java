package mainobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {

    private WebDriver driver;

        public Search (WebDriver driver) {
            this.driver = driver;

            PageFactory.initElements(driver,this);

        }
        @FindBy(xpath = "/html/body/center/table/tbody/tr[2]/td/form/input[1]")
        private WebElement searchstring;
        @FindBy(xpath = "/html/body/center/table/tbody/tr[2]/td/form/input[2]")
        private WebElement btnsearch;

        public void setSearchstring (){
            searchstring.sendKeys("War and Peace");

        }
        public void sendbtnsearch(){
            btnsearch.click();
        }

}
