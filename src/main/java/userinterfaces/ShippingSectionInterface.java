package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShippingSectionInterface extends PageObject {
    public static final Target INPUT_CHECK = Target.the("Accept terms").
            located(By.name("cgv"));
    public static final Target PROCEED_CHECKOUT = Target.the("PROCEED TO CHECKOUT").
            located(By.xpath("(//span[contains(text(), 'Proceed to checkout')])[2]"));
}
