package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.ShoppingSectionInterface;
import util.PersonalMethods;

public class ShoppingSection implements Task {

    private PersonalMethods personalMethods;

    public static ShoppingSection section() {
        return Tasks.instrumented(ShoppingSection.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        //Con Iframe
        actor.attemptsTo(
                Click.on(ShoppingSectionInterface.WOMEN_SECTION_BUTTON)
                ,Click.on(ShoppingSectionInterface.SELECT_IMG)
                ,Click.on("//span[contains(text(),'Quick view')]")
        );
        personalMethods.switchIframe("//iframe[@class='fancybox-iframe']");
        actor.attemptsTo(Click.on("//button[@name='Submit']"));
        personalMethods.defaultIframe();
        actor.attemptsTo(Click.on("//span[contains(text(),'Proceed to checkout')]"));
    }
}
