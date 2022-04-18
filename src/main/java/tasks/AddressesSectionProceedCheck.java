package tasks;

import model.TablaDatosFeature;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.AddressesSectionProceedCheckInterface;
import util.PersonalMethods;

public class AddressesSectionProceedCheck implements Task {
    private PersonalMethods personalMethods;

    public static AddressesSectionProceedCheck section() {
        return Tasks.instrumented(AddressesSectionProceedCheck.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        personalMethods.clickJS("document.querySelector('#id_address_delivery > option:nth-child(2)')");
        actor.attemptsTo(
                //Click.on(AddressesSectionProceedCheckInterface.ADDRESS_DELIVERY)
                Click.on(AddressesSectionProceedCheckInterface.PROCEED_CHECKOUT)
        );
    }
}
