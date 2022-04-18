package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ShoppingCartSummaryInterface extends PageObject {
    public static final Target ICON_PLUS = Target.the("Icon Plus").
            located(By.className("icon-plus"));
    public static final Target PROCEED_CHECKOUT = Target.the("Icon Plus").
            located(By.xpath("(//span[contains(text(), 'Proceed to checkout')])[2]"));
}
