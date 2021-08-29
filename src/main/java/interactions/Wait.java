package interactions;

import driver.SeleniumWebDriver;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.concurrent.TimeUnit;

public class Wait implements Interaction {
    private int seconds;

    public Wait(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public static Performable thisSeconds(int seconds) {
        return Instrumented.instanceOf(Wait.class).withProperties(seconds);
    }
}
