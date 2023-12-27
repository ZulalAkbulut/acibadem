package stepDefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US10Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US10StepDefinitions {
    US10Page page=new US10Page();
    Faker faker=new Faker();
    String name;
    String surname;
    String message;

    @Given("Kullanici {string} webadresine gider")
    public void kullaniciWebadresineGider(String url) {
        Driver.getDriver().get(url);
        ReusableMethods.waitFor(3);
    }
    @When("İLETİŞİM sekmesine tiklar")
    public void iletişimSekmesineTiklar() {
        page=new US10Page();
        page.iletisimLink.click();
        ReusableMethods.waitFor(3);
    }
    @And("İLETİŞİM FORMLARI sayfasinda oldugu dogrular")
    public void iletişimFORMLARISayfasindaOlduguDogrular() {
        Assert.assertTrue(page.iletisimSayfasiBasligi.isDisplayed());
        ReusableMethods.waitFor(3);
    }
    @And("TIBBİ DANIŞMA basligina tiklar")
    public void tıbbiDANIŞMABasliginaTiklar() {
        page.tibbiDanismaBaslik.click();
        ReusableMethods.waitFor(3);
    }
    @And("Adiniz kutusuna {string} ismini girer")
    public void adinizKutusunaIsminiGirer(String str) {
        name = faker.name().firstName();
        if (str.equals("bir isim")) {
            page.adinizKutusu.sendKeys(name);
        } else {
            page.adinizKutusu.sendKeys(str);
        }
    }
    @And("Soyadiniz kutusuna {string} soyisimini girer")
    public void soyadinizKutusunaSoyisiminiGirer(String str) {
        surname = faker.name().lastName();
        if (str.equals("bir soyisim")) {
            page.soyadinizKutusu.sendKeys(surname);
        } else {
            page.soyadinizKutusu.sendKeys(str);
        }
    }
    @And("E-Posta Adresiniz kutusuna {string} e-posta adresini girer")
    public void ePostaAdresinizKutusunaEPostaAdresiniGirer(String email) {
        page.email_Kutusu.sendKeys(email);
        ReusableMethods.waitFor(3);
    }

    @And("Telefon Numaraniz kutusuna {string} telefon numarasini girer")
    public void telefonNumaranizKutusunaTelefonNumarasiniGirer(String phoneNumber) {
        page.phone_Kutusu.sendKeys(phoneNumber);
        ReusableMethods.waitFor(3);
    }
    @And("Tibbi Birim Seciniz dropdawn menuden bir birim secer")
    public void tibbiBirimSecinizDropdawnMenudenBirBirimSecer() {
       ReusableMethods.ddmIndex(page.tibbiBirimDDM,3);
        ReusableMethods.waitFor(3);
        }

    @And("Konu Seciniz dropdawn menuden bir konu secer")
    public void konuSecinizDropdawnMenudenBirKonuSecer() {
       ReusableMethods.ddmIndex(page.konuDDM,3);
        ReusableMethods.waitFor(3);
    }
    @And("Mesajiniz text alanina mesaj yazilir")
    public void mesajinizTextAlaninaMesajYazilir() {
        message=faker.lorem().sentence();
        page.mesaj_Kutusu.sendKeys(message);
        ReusableMethods.waitFor(3);
    }
    @And("Kisisel Verilerin Korunmasi Kanunu kapsaminda olusturulan checkbox kutusunun tiklanilabilir oldugunu dogrular")
    public void kisiselVerilerinKorunmasiKanunuKapsamindaOlusturulanCheckboxKutusununTiklanilabilirOldugunuDogrular() {
        Assert.assertTrue(page.KvkkBireyselKutusu.isEnabled());
        ReusableMethods.click(page.KvkkBireyselKutusu);
        ReusableMethods.waitFor(3);
    }

    @And("Ticari Elektronik Ileti gonderilebilmesinin onayini iceren checkbox kutusunun tiklanabilir oldugunu dogrular")
    public void ticariElektronikIletiGonderilebilmesininOnayiniIcerenCheckboxKutusununTiklanabilirOldugunuDogrular() {
        Assert.assertTrue(page.etkDanismaKutusu.isEnabled());
       ReusableMethods.click(page.etkDanismaKutusu);
        ReusableMethods.waitFor(3);
    }

    @And("{int} haneli guvenlik kodu girilir")
    public void haneliGuvenlikKoduGirilir(int kod) {
        //guvenlik kodu bir captcha
        ReusableMethods.waitFor(5);
        ReusableMethods.click(page.guvenlikKoduKonteyner);
        ReusableMethods.waitFor(5);
    }
    @And("Gonder butonuna tiklanir")
    public void gonderButonunaTiklanir() {
         ReusableMethods.click(page.gonderButton);
         ReusableMethods.waitFor(5);
    }
    @And("Islemin basariyle gerceklestigi dogrulanir")
    public void ısleminBasariyleGerceklestigiDogrulanir() {

        Assert.assertTrue(page.tesekkurlerYazisi.isDisplayed());
    }
    @And("Adiniz kutusunu bos birakir")
    public void adinizKutusunuBosBirakir() {
        page.adinizKutusu.sendKeys("");
        ReusableMethods.waitFor(3);
    }
    @Then("Lutfen adinizi giriniz uyarisi gorulur")
    public void lutfenAdiniziGirinizUyarisiGorulur() {
        //Assert.assertTrue(page.firstnameError.isDisplayed());
        Assert.assertTrue(page.firstnameErrorGenel.isDisplayed());
    }
    @And("Soyadiniz kutusunu bos birakir")
    public void soyadinizKutusunuBosBirakir() {
        page.soyadinizKutusu.sendKeys("");
        ReusableMethods.waitFor(3);
    }
    @Then("Lutfen soyadinizi giriniz uyarisi gorulur")
    public void lutfenSoyadiniziGirinizUyarisiGorulur() {
       // Assert.assertTrue(page.lastnameError.isDisplayed());
        Assert.assertTrue(page.lastnameErrorGenel.isDisplayed());
    }
    @And("E-Posta Adresiniz kutusunu bos birakir")
    public void ePostaAdresinizKutusunuBosBirakir() {
        page.email_Kutusu.sendKeys("");
        ReusableMethods.waitFor(3);
    }
    @Then("Lutfen e-mail adresinizi giriniz uyarisi gorulur")
    public void lutfenEMailAdresiniziGirinizUyarisiGorulur() {
        //Assert.assertTrue(page.emailError.isDisplayed());
        Assert.assertTrue(page.emailErrorGenel.isDisplayed());
    }
    @And("Telefon Numaraniz kutusunu bos birakir")
    public void telefonNumaranizKutusunuBosBirakir() {
        page.phone_Kutusu.sendKeys("");
        ReusableMethods.waitFor(3);
    }
    @Then("Lutfen telefon numaranizi giriniz uyarisi gorulur")
    public void lutfenTelefonNumaraniziGirinizUyarisiGorulur() {
        //Assert.assertTrue(page.phoneError.isDisplayed());
        Assert.assertTrue(page.phoneErrorGenel.isDisplayed());
    }
    @And("Tibbi Birim Seciniz dropdawn menuyu bos birakir")
    public void tibbiBirimSecinizDropdawnMenuyuBosBirakir() {
        //bos birakilir
    }

    @Then("Lutfen tibbi birim seciniz uyarisi gorulur")
    public void lutfenTibbiBirimSecinizUyarisiGorulur() {
        //Assert.assertTrue(page.tibbiBirimError.isDisplayed()); //gonder butonuna elle tiklaninca cikan uyari
        Assert.assertTrue(page.tibbiBirimErrorGenel.isDisplayed());

    }
    @And("Konu Seciniz dropdawn menuyu bos birakir")
    public void konuSecinizDropdawnMenuyuBosBirakir() {
        //bos birakilir
    }

    @Then("Lutfen Konu Seciniz uyarisi gorulur")
    public void lutfenKonuSecinizUyarisiGorulur() {
       // Assert.assertTrue(page.konuSecimiError.isDisplayed());
        Assert.assertTrue(page.konuSecimiErrorGenel.isDisplayed());
    }

    @And("Mesajiniz text alanini bos birakir")
    public void mesajinizTextAlaniniBosBirakir() {
        page.mesaj_Kutusu.sendKeys("");
        ReusableMethods.waitFor(3);
    }
    @Then("Lutfen mesajinizi giriniz uyarisi gorulur")
    public void lutfenMesajiniziGirinizUyarisiGorulur() {
       // Assert.assertTrue(page.messageError.isDisplayed());
        Assert.assertTrue(page.messageErrorGenel.isDisplayed());
    }
    @And("E-Posta Adresiniz kutusuna  patterne uymayan bir email girer")
    public void ePostaAdresinizKutusunaPatterneUymayanBirEmailGirer() {
        page.email_Kutusu.sendKeys("aaa.@aaaa");
    }

    @Then("Lutfen gecerli bir e-mail adresi giriniz uyarisi gorulur")
    public void lutfenGecerliBirEMailAdresiGirinizUyarisiGorulur() {
        //Assert.assertTrue(page.emailError.isDisplayed());
        Assert.assertTrue(page.emailErrorGenel.isDisplayed());
    }



}
