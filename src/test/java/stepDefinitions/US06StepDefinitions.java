package stepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.US06Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US06StepDefinitions {
    US06Page us06Page = new US06Page();

    @Then("Kullanici bireysel butonuna tiklar")
    public void kullanici_bireysel_butonuna_tiklar() {
        while (!us06Page.bireyselButon.isDisplayed()) {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", us06Page.bireyselButon);
        }

        us06Page.bireyselButon.click();



    }
    @Then("Kullanici ad kutusuna {string} girer")
    public void kullanici_ad_kutusuna_girer(String string) {
        us06Page.bireyselAdKutusu.clear();
        us06Page.bireyselAdKutusu.sendKeys(string);


    }
    @Then("Kullanici soyad kutusuna {string} girer")
    public void kullanici_soyad_kutusuna_girer(String string) {
        us06Page.bireyselSoyadKutusu.clear();
        us06Page.bireyselSoyadKutusu.sendKeys(string);
    }
    @Then("Kullanici mail kutusuna {string} girer")
    public void kullanici_mail_kutusuna_girer(String string) {
        us06Page.bireyselEmailKutusu.clear();
        us06Page.bireyselEmailKutusu.sendKeys(string);
    }
    @Then("Kullanici telefon numarasi kutusuna {string} girer")
    public void kullanici_telefon_numarasi_kutusuna_girer(String string) {
        us06Page.bireyselTelefonNumarasiKutusu.clear();
        us06Page.bireyselTelefonNumarasiKutusu.sendKeys(string);
    }
    @Then("Kullanici Mesaj kutusuna {string} girer")
    public void kullanici_mesaj_kutusuna_girer(String string) {
        us06Page.bireyselMesajKutusu.clear();
        us06Page.bireyselMesajKutusu.sendKeys(string);
    }

    @Then("Kullanici KVKK metnini kabul eder")
    public void kullanici_kvkk_metnini_kabul_eder() {
        ReusableMethods.click(us06Page.kvkkMetniButonu);

    }

    @Then("Kullanici bilgilendirme metnini kabul eder")
    public void kullanici_bilgilendirme_metnini_kabul_eder() {
     ReusableMethods.click(us06Page.bilgilendirmeMetniButonu);
    }

    @When("FiyatSor sekmesine tiklar")
    public void fiyat_sor_sekmesine_tiklar() {
        us06Page.fiyatSorBaslik.click();

    }
    @Then("Kullanici fiyatsor ad kutusuna {string} girer")
    public void kullanici_fiyatsor_ad_kutusuna_girer(String string) {
        us06Page.fiyatSorAdKutusu.clear();
        us06Page.fiyatSorAdKutusu.sendKeys(string);
    }
    @Then("Kullanici fiyatsor soyad kutusuna {string} girer")
    public void kullanici_fiyatsor_soyad_kutusuna_girer(String string) {
        us06Page.fiyatSorSoyadKutusu.clear();
        us06Page.fiyatSorSoyadKutusu.sendKeys(string);
    }
    @Then("Kullanici fiyatsor mail kutusuna {string} girer")
    public void kullanici_fiyatsor_mail_kutusuna_girer(String string) {
        us06Page.fiyatSoremail_Kutusu.clear();
        us06Page.fiyatSoremail_Kutusu.sendKeys(string);
    }
    @Then("Kullanici fiyatsor telefon numarasi kutusuna {string} girer")
    public void kullanici_fiyatsor_telefon_numarasi_kutusuna_girer(String string) {
        us06Page.fiyatSorphone_Kutusu.clear();
        us06Page.fiyatSorphone_Kutusu.sendKeys(string);
    }

    @Then("Kullanici Sube Secimini {string} olarak yapar")
    public void kullanici_sube_secimini_yapar(String string) {
        ReusableMethods.selectWithValue(us06Page.fiyatSorSubeSecim,string);

    }
    @Then("Kullanici Sigorta Durumunu {string} olarak secer")
    public void kullanici_sigorta_durumunu_secer(String string) {
        ReusableMethods.selectWithValue(us06Page.fiyatSorSigortaDurum,string);

    }
    @Then("Kullanici fiyat sor Mesaj kutusuna {string} girer")
    public void kullanici_fiyat_sor_mesaj_kutusuna_girer(String string) {
        us06Page.fiyatSorMesaj_Kutusu.clear();
        us06Page.fiyatSorMesaj_Kutusu.sendKeys(string);
    }
    @Then("Kullanici fiyat sor KVKK metnini kabul eder")
    public void kullanici_fiyat_sor_kvkk_metnini_kabul_eder() {
        us06Page.fiyatSorKvkkBireyselKutusu.click();

    }

    @Then("Kullanici fiyat sor bilgilendirme metnini kabul eder")
    public void kullanici_fiyat_sor_bilgilendirme_metnini_kabul_eder() {
        us06Page.fiyatSorEtkDanismaKutusu.click();
    }

    @When("Kullanici YATIRIMCI basligina tiklar")
    public void kullanici_yatirimci_basligina_tiklar() {

        ReusableMethods.click(us06Page.yatirimciButon);
    }

    @Then("Kullanici yatirimci ad kutusuna {string} girer")
    public void kullanici_yatirimci_ad_kutusuna_girer(String string) {
        us06Page.yatirimciAdKutusu.clear();
        us06Page.yatirimciAdKutusu.sendKeys(string);

    }

    @Then("Kullanici yatirimci soyad kutusuna {string} girer")
    public void kullanici_yatirimci_soyad_kutusuna_girer(String string) {
        us06Page.yatirimciSoyadKutusu.clear();
        us06Page.yatirimciSoyadKutusu.sendKeys(string);    }
    @Then("Kullanici yatirimci mail kutusuna {string} girer")
    public void kullanici_yatirimci_mail_kutusuna_girer(String string) {
        us06Page.yatirimciEmailKutusu.clear();
        us06Page.yatirimciEmailKutusu.sendKeys(string);    }
    @Then("Kullanici yatirimci telefon numarasi kutusuna {string} girer")
    public void kullanici_yatirimci_telefon_numarasi_kutusuna_girer(String string) {
        us06Page.yatirimciTelefonNumarasiKutusu.clear();
        us06Page.yatirimciTelefonNumarasiKutusu.sendKeys(string);
    }
    @Then("Kullanici yatirimci Mesaj kutusuna {string} girer")
    public void kullanici_yatirimci_mesaj_kutusuna_girer(String string) {
        us06Page.yatirimciMesajKutusu.clear();
        us06Page.yatirimciMesajKutusu.sendKeys(string);    }
    @Then("Kullanici yatirimci KVKK metnini kabul eder")
    public void kullanici_yatirimci_kvkk_metnini_kabul_eder() {
        ReusableMethods.click(us06Page.yatirimciKvkkMetniButonu);
    }
    @Then("Kullanici yatirimci bilgilendirme metnini kabul eder")
    public void kullanici_yatirimci_bilgilendirme_metnini_kabul_eder() {
      ReusableMethods.click(us06Page.yatirimciBilgilendirmeMetniButonu);
    }



}
