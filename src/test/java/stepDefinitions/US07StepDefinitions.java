package stepDefinitions;
import io.cucumber.java.en.Given;
import pages.US07Page;
import utilities.ConfigReader;
import utilities.Driver;


public class US07StepDefinitions {

    US07Page us07Page = new US07Page();


    @Given("Kullanici Acibadem anasayfasina gider.")
    public void kullanici_acibadem_anasayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("acibademURL"));
    }

}
