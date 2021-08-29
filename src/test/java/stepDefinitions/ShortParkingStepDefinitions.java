package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import task.ValidateParkingCost;
import task.ValidateShortParkingCost;
import userInterface.ParkingUserInterface;

import java.io.IOException;

public class ShortParkingStepDefinitions {
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^I add the time, to be calculated (.*) in the box$")
    public void iAddTheTimeToBeCalculatedInTheBox(String time) {
        OnStage.theActorInTheSpotlight().attemptsTo(ValidateShortParkingCost.on(time));

    }


    @Then("^I will be able, to see the expected price (.*)$")
    public void iWillBeAbleToSeeTheExpectedPrice$(String price) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.
                seeThat(WebElementQuestion.the(ParkingUserInterface.LBL_PRICESHORT.
                        of(price)), WebElementStateMatchers.containsText(price)));

    }

}
