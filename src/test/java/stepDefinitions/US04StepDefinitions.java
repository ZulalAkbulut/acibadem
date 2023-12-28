package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.US04Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US04StepDefinitions {

    US04Page us04Page = new US04Page();

    @Given("acibadem sitesine gidilir")
    public void acibademSitesineGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("acibademUrl"));


    }

    @When("medikal teknolojiler butonuna tiklanir")
    public void medikalTeknolojilerButonunaTiklanir() {
        //  ReusableMethods.scrollHome("scroll(0,400);");
        //  ReusableMethods.waitFor(3);
        us04Page.MedikalButton.click();
        ReusableMethods.waitFor(3);

        //  ReusableMethods.scrollEnd(us04Page.MedikalButton);
        //  ReusableMethods.scroll(us04Page.lokasyon);
        ReusableMethods.scroll(us04Page.lokasyonclick);


    }


    @And("Lokasyon Seciniz butonunu tikla")
    public void lokasyonSecinizButonunuTikla() {
        us04Page.lokasyonclick.click();
        //  ReusableMethods.scroll(us04Page.lokasyonclick);
        ReusableMethods.waitFor(4);
        //  ReusableMethods.click(us04Page.lokasyonclick);

    }

    @And("Lokasyon  Bakirköy Hastanesi secilir")
    public void lokasyonBakirkoyHastanesiSecilir() {

        // ReusableMethods.scroll(us04Page.lokasyon);
        us04Page.lokasyon.click();
        // ReusableMethods.ddmIndex(us04Page.lokasyonclick,6);

        ReusableMethods.waitFor(2);
        ReusableMethods.scroll(us04Page.birimclick);

    }


    @And("Tibbi Birim Seciniz butonuna tiklanir")
    public void tibbiBirimSecinizButonunaTiklanir() {

        us04Page.birimclick.click();

        ReusableMethods.waitFor(2);
    }

    @And("Tibbi birim secilir Kardiyoloji")
    public void tibbiBirimSecilirKardiyoloji() {

        us04Page.birim.click();

        ReusableMethods.waitFor(2);


        ReusableMethods.scroll(us04Page.cihauturuclick);

    }


    @And("Cihaz Turu seciniz tiklanir")
    public void cihazTuruSecinizTiklanir() {
        us04Page.cihauturuclick.click();
        ReusableMethods.waitFor(2);
    }

    @And("Cihaz turu secilir Tanı")
    public void cihazTuruSecilirTanı() {


        us04Page.cihauturu.click();
        // ReusableMethods.scrollIntoViewJS(us04Page.cihauturu);
        ReusableMethods.waitFor(2);


    }

    @Then("Sayfada cihazin goruldugu dogrulanir")
    public void sayfadaCihazinGorulduguDogrulanir() {
        ReusableMethods.scrollIntoViewJS(us04Page.dogrulama);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us04Page.dogrulama.isDisplayed());

    }


    @And("sayfa kapatilir")
    public void sayfaKapatilir() {
        Driver.closeDriver();
    }


    @And("Lokasyon olarak Maslak secilir")
    public void lokasyonOlarakMaslakSecilir() {
        ReusableMethods.click(us04Page.lokasyonMaslak);
    }


    @Then("Maslak locasyonundaki tum cihazlarin goruntulendigini dogrular")
    public void maslakLocasyonundakiTumCihazlarinGoruntulendiginiDogrular() {
        List<WebElement> tumCihazlar = us04Page.locasyondakiTumCihaz;
        for (int i = 0; i < tumCihazlar.size(); i++) {
            // System.out.println("tumCihazlar.get(i) = " + tumCihazlar.get(i));


        }

        
    }

    @And("Tibbi Birim Seciniz")
    public void tibbiBirimSeciniz() {
        us04Page.birimclick.click();
    }

    @And("Tibbi birim olarak Nöroloji secilir")
    public void tibbiBirimOlarakNorolojiSecilir() {
        ReusableMethods.ddmIndex(us04Page.birimclick,20);
    }

    @Then("Tum cihazlarin gorundugunu dogrular")
    public void tumCihazlarinGorundugunuDogrular() {
        ReusableMethods.scroll(us04Page.norolojiTumCihaz);

    }
}