package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.TablaDatosFeature;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.*;

import java.util.List;

public class MyStepdefs {
    @Before
    public void inicair(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Isaak wants to visit YourLogo website$")
    public void isaakWantsToVisitYourLogoWebsite() {
        OnStage.theActorCalled("Isaak").wasAbleTo(OpenPage.page());
    }

    @And("^he log in to the YourLogo website$")
    public void heLogInToTheYourLogoWebsite(List<TablaDatosFeature> tablaDatosFeatureList) {
        OnStage.theActorCalled("Isaak").wasAbleTo(LoginPage.page(tablaDatosFeatureList.get(0)));
    }

    @When("^he goes to a shopping section on the website to find an item and add it to the shopping cart to proceed with payment$")
    public void heGoesToAShoppingSectionOnTheWebsiteToFindAnItemAndAddItToTheShoppingCartToProceedWithPayment() {
        OnStage.theActorInTheSpotlight().attemptsTo(ShoppingSection.section());
    }

    @And("^he modifies the quantity of the item to buy and clicks on the Proceed to checkout button$")
    public void heModifiesTheQuantityOfTheItemToBuyAndClicksOnTheProceedToCheckoutButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(ShoppingCartSummary.section());
    }

    @And("^he clicks the Add a new address button to then fill out the form with the new data and clicks the Save button$")
    public void heClicksTheAddANewAddressButtonToThenFillOutTheFormWithTheNewDataAndClicksTheSaveButton(List<TablaDatosFeature> tablaDatosFeatureList) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddressesSection.section(tablaDatosFeatureList.get(0)));
    }

    @And("^he selects the new address in the DDL and clicks the Proceed to checkout button$")
    public void heSelectsTheNewAddressInTheDDLAndClicksTheProceedToCheckoutButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddressesSectionProceedCheck.section());
    }

    @And("^he agrees to the terms of service by clicking the checkbox and then clicking the Proceed to checkout button$")
    public void heAgreesToTheTermsOfServiceByClickingTheCheckboxAndThenClickingTheProceedToCheckoutButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(ShippingSection.section());
    }

    @And("^he selects a payment method and clicks the I confirm my order button$")
    public void heSelectsAPaymentMethodAndClicksTheIConfirmMyOrderButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(PaymentMethodSection.section());
    }

    @Then("^he validates the order confirmation$")
    public void heValidatesTheOrderConfirmation(List<TablaDatosFeature> tablaDatosFeatureList) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(tablaDatosFeatureList.get(0))));
    }
}
