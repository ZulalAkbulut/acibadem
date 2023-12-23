package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US01Page {
    public US01Page() {
        PageFactory.initElements(Driver.getDriver(),this);}

}
