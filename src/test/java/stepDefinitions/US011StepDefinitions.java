package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import pages.US011Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class US011StepDefinitions {

    US011Page us011Page = new US011Page();
    Select select;


    @Given("Websiteye gidilir")
    public void websiteyeGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("acibademUrl"));
        ReusableMethods.waitFor(2);
    }

    @Then("Menu butonuna tiklanir")
    public void menuButonunaTiklanir() {
        us011Page.menu.click();
        ReusableMethods.waitFor(2);
    }

    @And("Genel Hemsire Basvurusu butonuna tiklanir")
    public void genelHemsireBasvurusuButonunaTiklanir() {
        ReusableMethods.hooverByJS(us011Page.hemsireBasvurusuButonu);
    }

    @And("Acilan sayfadaki Hemsire Basvurulari alanina tiklanir")
    public void acilanSayfadakiHemsireBasvurulariAlaninaTiklanir() {
        ReusableMethods.hooverByJS(us011Page.hemsireBasvurulariAlani);
    }

    @And("Acilan sayfadaki Adiniz kutusuna isim girilir")
    public void acilanSayfadakiAdinizKutusunaIsimGirilir() {
        us011Page.adiniz.sendKeys("Ayse");
    }

    @And("Soyadiniz kutusuna soyisim girilir")
    public void soyadinizKutusunaSoyisimGirilir() {
        us011Page.soyadiniz.sendKeys("Can");
    }

    @And("Dogum Tarihiniz kutusuna dogum tarihi girilir")
    public void dogumTarihinizKutusunaDogumTarihiGirilir() {
        us011Page.dogumTarihiniz.sendKeys("12.12.1994");
        ReusableMethods.waitFor(3);
    }

    @And("Uyruk dropdown menuden uyruk secilir")
    public void uyrukDropdownMenudenUyrukSecilir() {
        us011Page.uyruk.click();
        us011Page.uyruk1.click();
        ReusableMethods.waitFor(3);
    }

    @And("E-Posta Adresiniz kutusuna e-posta adresi girilir")
    public void ePostaAdresinizKutusunaEPostaAdresiGirilir() {
        us011Page.email.sendKeys("ayseca94n@hotmail.com");
        ReusableMethods.waitFor(3);
    }

    @And("Telefon Numaraniz kutusuna telefon numarasi girilir")
    public void telefonNumaranizKutusunaTelefonNumarasiGirilir() {
        us011Page.telefonNumarasi.sendKeys("123456789");
        ReusableMethods.waitFor(3);
    }

    @And("Mesleginiz dropdown menuden meslek secilir")
    public void mesleginizDropdownMenudenMeslekSecilir() {
        select = new Select(us011Page.meslek);
        select.selectByValue("138");
        ReusableMethods.waitFor(3);
    }

    @And("Mezun Oldugunuz Okul dropdown menuden mezun olunan okul secilir")
    public void mezunOldugunuzOkulDropdownMenudenMezunOlunanOkulSecilir() {
        select = new Select(us011Page.mezunOldugunuzOkul);
        select.selectByValue("4");
        ReusableMethods.waitFor(3);
    }

    @And("Mezuniyet Yiliniz kutusuna yil girilir")
    public void mezuniyetYilinizKutusunaYilGirilir() {
        us011Page.mezunOldugunuzYil.sendKeys("2020");
        ReusableMethods.waitFor(3);
    }

    @And("Meslekte Deneyim Sureniz dropdown menuden sure secilir")
    public void meslekteDeneyimSurenizDropdownMenudenSureSecilir() {
        select = new Select(us011Page.deneyimSuresi);
        select.selectByValue("261");
        ReusableMethods.waitFor(3);
    }

    @And("Hangi Alanda Deneyimlisiniz? dropdown menuden alan secilir")
    public void hangiAlandaDeneyimlisinizDropdownMenudenAlanSecilir() {
        select = new Select(us011Page.deneyimAlani);
        select.selectByValue("Acil Servis");
        ReusableMethods.waitFor(3);
    }

    @And("Hangi Alanda Calismak Istersiniz? dropdown menuden alan secilir")
    public void hangiAlandaCalismakIstersinizDropdownMenudenAlanSecilir() {
        select = new Select(us011Page.calismakIstenenAlan);
        select.selectByValue("Acil Servis");

    }

    @And("Sertifikaniz var mi? dropdown menuden secim yapilir")
    public void sertifikanizVarMiDropdownMenudenSecimYapilir() {
        select = new Select(us011Page.sertifika);
        select.selectByValue("0");
    }

    @And("Gorev Almak Istediginiz Sehir dropdown menuden sehir secilir")
    public void gorevAlmakIstediginizSehirDropdownMenudenSehirSecilir() {

        us011Page.gorevAlmakIstediginizSehir.click();
        us011Page.gorevAlmakIstediginizSehir1.click();
        us011Page.gorevAlmakIstediginizSehir.click();
        us011Page.gorevAlmakIstediginizLokasyon.click();
        us011Page.gorevAlmakIstediginizLokasyon1.click();
        us011Page.gorevAlmakIstediginizLokasyon.click();
    }

    @And("Su Anda Calisiyor Musunuz? kismindan secim yapilir")
    public void suAndaCalisiyorMusunuzKismindanSecimYapilir() {
        us011Page.calisiyorMusunuz.click();
    }

    @And("Gonder butonuna tiklanir")
    public void gonderButonunaTiklanir() {
        us011Page.gonder.click();
        ReusableMethods.waitFor(3);
    }

    @And("Hemsire basvurusu yapabildigini dogrular")
    public void hemsireBasvurusuYapabildiginiDogrular() {
        ReusableMethods.hooverByJS(us011Page.kapatHemsire);
        System.out.println(us011Page.basariliBasvuruHemsire.getText());
        Assert.assertTrue(us011Page.basariliBasvuruHemsire.isDisplayed());
    }

    @And("Acilan sayfadaki Adiniz kutusu bos birakilir")
    public void acilanSayfadakiAdinizKutusuBosBirakilir() {
        us011Page.adiniz.sendKeys("");
    }

    @And("Lütfen adınızı giriniz. uyarisi gorulur")
    public void lütfenAdınızıGirinizUyarisiGorulur() {
        System.out.println(us011Page.adinizError.getText());
        Assert.assertTrue(us011Page.adinizError.isDisplayed());
    }

    @And("Genel Doktor Basvurusu butonuna tiklanir")
    public void genelDoktorBasvurusuButonunaTiklanir() {
        ReusableMethods.hooverByJS(us011Page.doktorBasvurusuButonu);
    }

    @And("Acilan sayfadaki Doktor Basvurulari alanina tiklanir")
    public void acilanSayfadakiDoktorBasvurulariAlaninaTiklanir() {
        ReusableMethods.hooverByJS(us011Page.doktorBasvurulariAlani);
    }

    @And("Kullanici acilan sayfadaki Adiniz kutusuna isim girer")
    public void kullaniciAcilanSayfadakiAdinizKutusunaIsimGirer() {
        us011Page.adinizDoktor.sendKeys("Ayse");
    }

    @And("Kullanici Soyadiniz kutusuna soyisim girer")
    public void kullaniciSoyadinizKutusunaSoyisimGirer() {
        us011Page.soyadinizDoktor.sendKeys("Can");
    }

    @And("Kullanici Dogum Tarihiniz kutusuna dogum tarihi girer")
    public void kullaniciDogumTarihinizKutusunaDogumTarihiGirer() {
        us011Page.dogumTarihinizDoktor.sendKeys("12.12.1994");
        ReusableMethods.waitFor(3);
    }

    @And("Kullanici Uyruk dropdown menuden uyruk secer")
    public void kullaniciUyrukDropdownMenudenUyrukSecer() {
        us011Page.uyrukDoktor.click();
        us011Page.uyrukDoktor1.click();
        ReusableMethods.waitFor(3);
    }

    @And("Kullanici E-Posta Adresiniz kutusuna e-posta adresi girer")
    public void kullaniciEPostaAdresinizKutusunaEPostaAdresiGirer() {
        us011Page.emailDoktor.sendKeys("ayseca94n@hotmail.com");
        ReusableMethods.waitFor(3);
    }

    @And("Kullanici Telefon Numaraniz kutusuna telefon numarasi girer")
    public void kullaniciTelefonNumaranizKutusunaTelefonNumarasiGirer() {
        us011Page.telefonNumarasiDoktor.sendKeys("123456789");
        ReusableMethods.waitFor(3);
    }

    @And("Kullanici Mezun Oldugunuz Universite dropdown menuden mezun oldugu universiteyi secer")
    public void kullaniciMezunOldugunuzUniversiteDropdownMenudenMezunOlduguUniversiteyiSecer() {
        select = new Select(us011Page.mezunOldugunuzUniversite);
        select.selectByValue("92270");
        ReusableMethods.waitFor(3);
    }

    @And("Kullamnici Mezun Oldugunuz Fakulte dropdown menuden mezun oldugu fakulteyi secer")
    public void kullamniciMezunOldugunuzFakulteDropdownMenudenMezunOlduguFakulteyiSecer() {
        select = new Select(us011Page.mezunOldugunuzFakulte);
        select.selectByValue("82223");
        ReusableMethods.waitFor(3);
    }

    @And("Kullanici Unvan dropdown menuden unvan secer")
    public void kullaniciUnvanDropdownMenudenUnvanSecer() {
        select = new Select(us011Page.unvan);
        select.selectByValue("85818");
        ReusableMethods.waitFor(3);
    }

    @And("Kullanici Gorev Almak Istediginiz Sehir dropdown menuden sehir secer")
    public void kullaniciGorevAlmakIstediginizSehirDropdownMenudenSehirSecer() {

        us011Page.gorevAlmakIstediginizSehirDoktor.click();
        us011Page.gorevAlmakIstediginizSehirDoktor1.click();
        us011Page.gorevAlmakIstediginizSehirDoktor.click();
        us011Page.gorevAlmakIstediginizLokasyonDoktor.click();
        us011Page.gorevAlmakIstediginizLokasyonDoktor1.click();
        us011Page.gorevAlmakIstediginizLokasyonDoktor.click();
    }

    @And("Kullanici Su Anda Calisiyor Musunuz? kismindan secim yapar")
    public void kullaniciSuAndaCalisiyorMusunuzKismindanSecimYapar() {
        us011Page.calisiyorMusunuzDoktor.click();

    }

    @And("Kullanici Özgecmisinizi Yukleyiniz kismina ozgecmis yukler")
    public void kullaniciÖzgecmisiniziYukleyinizKisminaOzgecmisYukler() {
        String dosyayolu = "C:\\Users\\gebruiker\\Desktop\\CV.bmp";
        us011Page.ozgecmis.click();
        ReusableMethods.uploadFile(dosyayolu);


    }

    @And("Kullanici Gonder butonuna tiklar")
    public void kullaniciGonderButonunaTiklar() {
        us011Page.gonderDoktor.click();
        ReusableMethods.waitFor(3);
    }

    @And("Kullanici doktor basvurusu yapabildigini dogrular")
    public void kullaniciDoktorBasvurusuYapabildiginiDogrular() {

        ReusableMethods.hooverByJS(us011Page.kapatDoktor);
        System.out.println(us011Page.basariliBasvuruDoktor.getText());
        Assert.assertTrue(us011Page.basariliBasvuruDoktor.isDisplayed());

    }

    @And("Kullanici acilan sayfadaki Adiniz kutusunu bos birakir")
    public void kullaniciAcilanSayfadakiAdinizKutusunuBosBirakir() {
        us011Page.adinizDoktor.sendKeys("");
    }

    @And("Kullanici Lütfen adınızı giriniz. uyarisini gorur")
    public void kullaniciLütfenAdınızıGirinizUyarisiniGorur() {
        System.out.println(us011Page.adinizDoktorError.getText());
        Assert.assertTrue(us011Page.adinizDoktorError.isDisplayed());
    }


}
