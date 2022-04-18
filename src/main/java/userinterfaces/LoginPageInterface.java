package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPageInterface extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Login button").
            located(By.xpath("//a[contains(text(), 'Sign in')]"));
    public static final Target ENTER_EMAIL = Target.the("Email").
            located(By.cssSelector("#email"));
    public static final Target ENTER_PASSL = Target.the("password").
            located(By.cssSelector("#passwd"));
    public static final Target SIGNIN_BUTTON = Target.the("Login button").
            located(By.cssSelector("#SubmitLogin"));
}
