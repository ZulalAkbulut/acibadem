package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US04Page;
import pages.US05Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US05StepDefinitions {
    US05Page us05Page = new US05Page();

    US04Page us04Page = new US04Page();
    @Given("Kullanivi acibadem sitesine gidilir")
    public void kullaniviAcibademSitesineGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("acibademUrl"));
    }
    @When("menu butonuna tiklanir")
    public void menuButonunaTiklanir() {

        us04Page.menu.click();
    }

    @And("Fiyat Sor butonuna tikla")
    public void fiyatSorButonunaTikla() {
        ReusableMethods.click(us04Page.Fiyat);
    }

    @And("Adiniz bölumune {string} yazilir")
    public void adinizBolumuneYazilir(String isim) {
        us04Page.adiniz.sendKeys(isim);
    }

    @And("Soyadiniz bölumune {string} yazilir")
    public void soyadinizBolumuneYazilir(String soyisim) {
        us04Page.soyadiniz.sendKeys(soyisim);
    }

    @And("E-Posta  kutusuna {string} e-posta yazilir")
    public void ePostaKutusunaEPostaYazilir(String arg0) {
        us04Page.eposta.sendKeys(arg0);
    }

    @And("Telefon Numaraniz kismina {string} telefon numarasi girer")
    public void telefonNumaranizKisminaTelefonNumarasiGirer(String arg0) {
        us04Page.telefon.sendKeys(arg0);
    }

    @And("Sube secimi butonuna tiklanir")
    public void subeSecimiButonunaTiklanir() {
        us04Page.sube.click();
    }

    @And("Sube Seciniz butonundan sube secilir")
    public void subeSecinizButonundanSubeSecilir() {
       ReusableMethods.click(us04Page.subesecimi);
    }

    @And("Sigorta Durumubutonuna tiklanir")
    public void sigortaDurumubutonunaTiklanir() {
        us04Page.sigorta.click();
    }

    @And("sigorta durumu secilir")
    public void sigortaDurumuSecilir() {
      // ReusableMethods.ddmIndex(us04Page.sigortadurumu,0);
        ReusableMethods.click(us04Page.sigortadurumu);
    }

    @And("Sigorta Bilginiz bolumune tklanir")
    public void sigortaBilginizBolumuneTklanir() {
       ReusableMethods.click(us04Page.sigortabilgi);
    }

    @And("Sigorta bilsi {string} olarak yazilir")
    public void sigortaBilsiOlarakYazilir(String sgk) {
        us04Page.sigortabilgi.sendKeys(sgk);
    }

    @And("Mesaj kutusuna mesaj yazilir")
    public void mesajKutusunaMesajYazilir() {
        us04Page.mesaj.sendKeys("Bilgi");
    }

    @And("KVKK  checkbox kutusu tiklanilanir")
    public void kvkkCheckboxKutusuTiklanilanir() {
        us04Page.kvkk.click();
    }

    @And("Guvenlik Kodu bolumu doldurulur")
    public void guvenlikKoduBolumuDoldurulur() {
//        us04Page.guvenlikkodu.click();
    }

    @And("Gönder butonuna tiklanir")
    public void gonderButonunaTiklanir() {
      //  us04Page.gonderbutonu.click();
    }

    @And("Islemin gerceklestigi dogrulanir")
    public void isleminGerceklestigiDogrulanir() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us04Page.verify.isDisplayed());

    }

    @And("Sayfa kapatilir")
    public void sayfaKapatilir() {
        Driver.closeDriver();


    }



}
