package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressesSectionProceedCheckInterface extends PageObject {
    public static final Target ADDRESS_DELIVERY = Target.the("Add the new address").
            located(By.cssSelector("#id_address_delivery > option:nth-child(4)"));
    public static final Target PROCEED_CHECKOUT = Target.the("PROCEED TO CHECKOUT").
            located(By.xpath("(//span[contains(text(), 'Proceed to checkout')])[2]"));
}
