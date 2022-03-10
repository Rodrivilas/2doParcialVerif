package control;

import org.openqa.selenium.Alert;
import singleton.Session;

public class WarningPopUp {

    public void aceptarWarning(){
        Alert alert = Session.getInstance().getDriver().switchTo().alert();
        alert.accept();
    }

}