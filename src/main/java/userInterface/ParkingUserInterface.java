package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class ParkingUserInterface {
    public static final Target BTN_OPTIONVALET = Target.the("Select checkbox valet").locatedBy("//option[@value='Valet']");
    public static final Target BTN_OPTIONSHORT = Target.the("Select checkbox short").locatedBy("//option[@value='Short']");


    public static final Target TXT_DATEIN = Target.the("Select date in ").locatedBy("//input[@id='StartingDate']");
    public static final Target TXT_DATEOUT = Target.the("Select date off ").locatedBy("//input[@id='LeavingDate']");

    public static final Target TXT_TIMEIN = Target.the("Select time in").locatedBy("//input[@id='StartingTime']");
    public static final Target TXT_TIMEOUT = Target.the("Select time off").locatedBy("//input[@id='LeavingTime']");

    public static final Target RBTN_TIMEZONEIN = Target.the("Select time zone in").locatedBy("/html/body/form/table/tbody/tr[2]/td[2]/input[3]");
    public static final Target RBTN_TIMEZONEOFF = Target.the("Select time zone off").locatedBy("/html/body/form/table/tbody/tr[3]/td[2]/input[3]");

    public static final Target LBL_PRICEVALET = Target.the("price verification").locatedBy("//b[contains(text(),'$ 12.00')]");
    public static final Target LBL_PRICESHORT = Target.the("price verification").locatedBy("//b[contains(text(),'$ 24.00')]");


    public static final Target BTN_SUBMIT = Target.the("Select button submit").locatedBy("//input[@type='submit']");


}
