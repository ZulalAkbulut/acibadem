package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.US04Page;

public class US04StepDefinitions {

    US04Page us04Page = new US04Page();

    @Given("acibadem sitesine gidilir")
    public void acibademSitesineGidilir() {
    }

    @When("medikal teknolojiler butonuna tiklanir")
    public void medikalTeknolojilerButonunaTiklanir() {
    }

    @And("Lokasyon Seciniz butonunu tiklanir")
    public void lokasyonSecinizButonunuTiklanir() {
    }

    @And("Lokasyon secilir {string}")
    public void lokasyonSecilir(String arg0, String arg1) {
    }

    @And("Tibbi Birim Seciniz butonuna tiklanir")
    public void tibbiBirimSecinizButonunaTiklanir() {
    }

    @And("Tibbi birim secilir {string}")
    public void tibbiBirimSecilir(String arg0, String arg1) {
    }

    @And("Cihaz Turu seciniz tiklanir")
    public void cihazTuruSecinizTiklanir() {
    }

    @And("Cihaz turu secilir {string}")
    public void cihazTuruSecilir(String arg0, String arg1) {
    }

    @Then("Sayfada cihazin goruldugu dogrulanir")
    public void sayfadaCihazinGorulduguDogrulanir() {
    }

    @And("sayfa kapatilir")
    public void sayfaKapatilir() {
    }

}
