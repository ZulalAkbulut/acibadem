package stepDefinitions;

import io.cucumber.java.en.*;
import pages.US01Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US01StepDefinitions {

    US01Page us01Page = new US01Page();

    @Given("Kullanici acibadem anasayfaya gider")
    public void kullanici_acibadem_anasayfaya_gider() {Driver.getDriver().get(ConfigReader.getProperty("acibademUrl"));

    }


    @Then("Kullanici uye girisi yapar")
    public void kullaniciUyeGirisiYapar() {
        us01Page.acibademOnlineButonu.click();
    }
}
