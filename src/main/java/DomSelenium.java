import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomSelenium {
    WebDriver driver;
    public DomSelenium(){
        System.setProperty("webriver.chrome.driver","/Users/t.gro/Desktop/לימודים/second project 1/java second/chromedriver");
        this.driver=new ChromeDriver();
    }

    public WebElement getElement(String selector){
        WebElement element=this.driver.findElement(By.cssSelector(selector));
        return  element;

    }
}
