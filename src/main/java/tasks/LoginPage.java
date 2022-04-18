package tasks;

import model.TablaDatosFeature;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LoginPageInterface;

public class LoginPage implements Task {
    private TablaDatosFeature tablaDatosFeature;

    public LoginPage(TablaDatosFeature tablaDatosFeature) {
        this.tablaDatosFeature = tablaDatosFeature;
    }

    public static LoginPage page(TablaDatosFeature tablaDatosFeature) {
        return Tasks.instrumented(LoginPage.class, tablaDatosFeature);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginPageInterface.LOGIN_BUTTON)
                ,Enter.theValue(tablaDatosFeature.getEmail()).into(LoginPageInterface.ENTER_EMAIL)
                ,Enter.theValue(tablaDatosFeature.getPassword()).into(LoginPageInterface.ENTER_PASSL)
                ,Click.on(LoginPageInterface.SIGNIN_BUTTON)
        );

    }
}
