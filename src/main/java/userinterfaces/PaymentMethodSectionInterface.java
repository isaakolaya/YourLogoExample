package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentMethodSectionInterface {
    public static final Target PAYMENT_METHOD = Target.the("PAYMENT METHOD").
            located(By.className("bankwire"));
    public static final Target CONFIRM_ORDER = Target.the("CONFIRM ORDER").
            located(By.xpath("//span[contains(text(), 'I confirm my order')]"));
    public static final Target NAME_QUESTION = Target.the("extract Question")
            .located(org.openqa.selenium.By.xpath("//strong[contains(text(), 'Your order on My Store is complete.')]"));
}
