package util;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PersonalMethods extends PageObject {
    private WebDriver driver;
    public void switchIframe(String iframeS){
        //driver.switchTo().frame(iframeS); //switching the frame by ID
        WebElement element = getDriver().findElement(By.xpath(iframeS));
        getDriver().switchTo().frame(element);
    }
    public void defaultIframe(){
        getDriver().switchTo().defaultContent();
    }

    public void clickJS(String jsPath){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript(jsPath + ".click()");
    }

    public void dropDown(String DDLName, String DDLElement){
        // Create the object of the Select class
        Select se = new Select(driver.findElement(By.name(DDLName)));

        // Select the option using the visible text
        se.selectByVisibleText(DDLElement);

        //WebElement selectElement = driver.findElement(By.id(DDLName));
        //Select selectObject = new Select(selectElement);
        //selectObject.selectByVisibleText(DDLElement);
    }
}
