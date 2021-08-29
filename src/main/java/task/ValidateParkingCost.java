package task;

import interactions.Wait;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterface.ParkingUserInterface;

public class ValidateParkingCost implements Task {


    private String time;

    public ValidateParkingCost(String time){
        this.time = time;


    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.thisSeconds(30),
                Click.on(ParkingUserInterface.BTN_OPTIONVALET),
                Wait.thisSeconds(30),
                Enter.theValue("8/24/2021").into(ParkingUserInterface.TXT_DATEIN),
                Enter.theValue(time).into(ParkingUserInterface.TXT_TIMEIN),
                Click.on(ParkingUserInterface.RBTN_TIMEZONEIN),
                Wait.thisSeconds(30),
                Enter.theValue("8/24/2021").into(ParkingUserInterface.TXT_DATEOUT),
                Enter.theValue("2:00").into(ParkingUserInterface.TXT_TIMEOUT),
                Click.on(ParkingUserInterface.RBTN_TIMEZONEOFF),
                Click.on(ParkingUserInterface.BTN_SUBMIT),
                Wait.thisSeconds(30)
        );

    }
    public static ValidateParkingCost on(String time){
        return Instrumented.instanceOf(ValidateParkingCost.class).withProperties(time);
    }

}
