package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.PaymentMethodSectionInterface;

public class PaymentMethodSection implements Task {

    public static PaymentMethodSection section() {
        return Tasks.instrumented(PaymentMethodSection.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaymentMethodSectionInterface.PAYMENT_METHOD)
                ,Click.on(PaymentMethodSectionInterface.CONFIRM_ORDER)
        );
    }
}
