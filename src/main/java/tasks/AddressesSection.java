package tasks;

import model.TablaDatosFeature;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.AddressesSectionInterface;
import util.PersonalMethods;

public class AddressesSection implements Task {
    private TablaDatosFeature tablaDatosFeature;

    public AddressesSection(TablaDatosFeature tablaDatosFeature) {
        this.tablaDatosFeature = tablaDatosFeature;
    }

    public static AddressesSection section(TablaDatosFeature tablaDatosFeature) {
        return Tasks.instrumented(AddressesSection.class, tablaDatosFeature);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AddressesSectionInterface.ADD_ADDRESS)
                ,Enter.theValue(tablaDatosFeature.getName()).into(AddressesSectionInterface.ENTER_NAME)
                ,Enter.theValue(tablaDatosFeature.getLastName()).into(AddressesSectionInterface.ENTER_LASTNAME)
                ,Enter.theValue(tablaDatosFeature.getAddress()).into(AddressesSectionInterface.ENTER_ADDRESS)
                ,Enter.theValue(tablaDatosFeature.getCity()).into(AddressesSectionInterface.ENTER_CITY)
                ,Click.on(AddressesSectionInterface.ENTER_STATE)
                ,Enter.theValue(tablaDatosFeature.getPostalCode()).into(AddressesSectionInterface.ENTER_POSTAL_CODE)
                ,Enter.theValue(tablaDatosFeature.getHomePhone()).into(AddressesSectionInterface.ENTER_HOME_PHONE)
                ,Enter.theValue(tablaDatosFeature.getMobilePhone()).into(AddressesSectionInterface.ENTER_MOBILE_PHONE)
                ,Enter.theValue(tablaDatosFeature.getAddressTitle()).into(AddressesSectionInterface.ENTER_ADDRESS_TITTLE)
                ,Click.on(AddressesSectionInterface.SUBMIT_ADDRESS)
        );
    }
}
