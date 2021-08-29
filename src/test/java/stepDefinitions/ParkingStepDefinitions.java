package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import task.ValidateParkingCost;
import userInterface.ParkingUserInterface;

import java.io.IOException;

public class ParkingStepDefinitions {
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^I am on the PARKING COST CALCULATOR page with the url (.*)$")
    public void iAmOnThePARKINGCOSTCALCULATORPageWithTheUrlHttpsWwwShinoDeParkcalc(String url)
    {
        OnStage.theActorCalled("Admin").can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on(url)));
    }


    @When("^I add the time to be calculated (.*) in the box$")
    public void iAddTheTimeToBeCalculatedInTheBox(String time) {
        OnStage.theActorInTheSpotlight().attemptsTo(ValidateParkingCost.on(time));


    }

    @Then("^I will be able to see the expected price (.*)$")
    public void iWillBeAbleToSeeTheExpectedPrice$Buscados(String price) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.
                seeThat(WebElementQuestion.the(ParkingUserInterface.LBL_PRICEVALET.
                        of(price)), WebElementStateMatchers.containsText(price)));
    }


}
