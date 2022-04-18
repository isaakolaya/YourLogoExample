package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.ShoppingCartSummaryInterface;

public class ShoppingCartSummary implements Task {
    public static ShoppingCartSummary section() {
        return Tasks.instrumented(ShoppingCartSummary.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(ShoppingCartSummaryInterface.ICON_PLUS)
                ,Click.on(ShoppingCartSummaryInterface.PROCEED_CHECKOUT)
        );
    }
}
