package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressesSectionInterface extends PageObject {
    public static final Target ADD_ADDRESS = Target.the("Add a new address").
            located(By.xpath("//span[contains(text(),'Add a new address')]"));
    public static final Target ENTER_NAME = Target.the("Enter name").
            located(By.id("firstname"));
    public static final Target ENTER_LASTNAME = Target.the("Enter lastName").
            located(By.id("lastname"));
    public static final Target ENTER_ADDRESS = Target.the("Enter address").
            located(By.id("address1"));
    public static final Target ENTER_CITY = Target.the("Enter city").
            located(By.id("city"));
    public static final Target ENTER_STATE = Target.the("Enter state").
            located(By.xpath("//option[@value='5'][contains(text(),'California')]"));
    public static final Target ENTER_POSTAL_CODE = Target.the("Enter postalCode").
            located(By.id("postcode"));
    public static final Target ENTER_HOME_PHONE = Target.the("Enter homePhone").
            located(By.id("phone"));
    public static final Target ENTER_MOBILE_PHONE= Target.the("Enter mobilePhone").
            located(By.id("phone_mobile"));
    public static final Target ENTER_ADDRESS_TITTLE = Target.the("Enter addressTitle").
            located(By.name("alias"));
    public static final Target SUBMIT_ADDRESS = Target.the("Enter submit Address").
            located(By.id("submitAddress"));
}
