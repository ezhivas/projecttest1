import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyFirstTest1 {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://www.sharelane.com/");


        WebElement element = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[20]/td/p/a/b"));
        element.click();

        Thread.sleep(3000);


        WebElement element1 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a"));
        element1.click();

        Thread.sleep(3000);

        WebElement element2 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
        element2.sendKeys("99999");

        Thread.sleep(3000);

        WebElement element3 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        element3.click();

        Thread.sleep(2000);

        WebElement element4 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input"));
        element4.sendKeys("Sergey");

        Thread.sleep(2000);

        WebElement element5 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
        element5.sendKeys("Knizhenko");

        Thread.sleep(2000);

        WebElement element6 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        element6.sendKeys("seo1004@rambler.ru");

        Thread.sleep(2000);

        WebElement element7 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input"));
        element7.sendKeys("password");

        Thread.sleep(2000);

        WebElement element8 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input"));
        element8.sendKeys("password");

        Thread.sleep(2000);

        WebElement element9 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input"));
        element9.click();

        Thread.sleep(10000);


        driver.close();
        driver.quit();

    }
}
