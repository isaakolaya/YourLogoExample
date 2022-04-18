package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.ShippingSectionInterface;

public class ShippingSection implements Task {
    public static ShippingSection section() {
        return Tasks.instrumented(ShippingSection.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShippingSectionInterface.INPUT_CHECK)
                ,Click.on(ShippingSectionInterface.PROCEED_CHECKOUT)
        );
    }
}
