package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US011Page {
    public US011Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='menu']")
    public WebElement menu;

    @FindBy(xpath = "//*[text()='GENEL HEMŞİRE BAŞVURUSU']")
    public WebElement hemsireBasvurusuButonu;

    @FindBy(xpath = "//*[.='Hemşire Başvuruları']")
    public WebElement hemsireBasvurulariAlani;

    @FindBy(xpath = "//*[@id='CvNurseApply_Firstname']")
    public WebElement adiniz;

    @FindBy(xpath = "//*[@id='CvNurseApply_Firstname-error']")
    public WebElement adinizError;

    @FindBy(xpath = "//*[@id='CvNurseApply_Lastname']")
    public WebElement soyadiniz;

    @FindBy(xpath = "//*[@id='CvNurseApply_Birthday']")
    public WebElement dogumTarihiniz;

    @FindBy(xpath = "//*[@id='CvNurseApply_CitizenOf']")
    public WebElement uyruk;

    @FindBy(xpath = "//*[.='T.C.']")
    public WebElement uyruk1;

    @FindBy(xpath = "//*[@id='CvNurseApply_Email']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='CvNurseApply_Phone']")
    public WebElement telefonNumarasi;

    @FindBy(xpath = "//*[@id='CvNurseApply_Job']")
    public WebElement meslek;

    @FindBy(xpath = "//*[@id='CvNurseApply_Education']")
    public WebElement mezunOldugunuzOkul;

    @FindBy(xpath = "//*[@id='CvNurseApply_GraduationYear']")
    public WebElement mezunOldugunuzYil;

    @FindBy(xpath = "//*[@id='CvNurseApply_Experience']")
    public WebElement deneyimSuresi;

    @FindBy(xpath = "//*[@id='CvNurseApply_SectionOfExperience']")
    public WebElement deneyimAlani;

    @FindBy(xpath = "//*[@id='CvNurseApply_SectionOfStudy']")
    public WebElement calismakIstenenAlan;

    @FindBy(xpath = "//*[@id='CvNurseApply_Certificate']")
    public WebElement sertifika;

    @FindBy(xpath = "//*[text()='Görev Almak İstediğiniz Şehir']")
    public WebElement gorevAlmakIstediginizSehir;

    @FindBy(xpath = "(//*[@name='cityName'])[4]")
    public WebElement gorevAlmakIstediginizSehir1;

    @FindBy(xpath = "//*[text()='Görev Almak İstediğiniz Lokasyon']")
    public WebElement gorevAlmakIstediginizLokasyon;

    @FindBy(xpath = "(//*[@name='locationName'])[1]")
    public WebElement gorevAlmakIstediginizLokasyon1;

    @FindBy(xpath = "//*[@class='btn-check r2']")
    public WebElement calisiyorMusunuz;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement gonder;

    @FindBy(xpath = "(//*[@class='btn btn-primary'])[2]")
    public WebElement kapatHemsire;

    @FindBy(xpath = "//*[.='Başvurunuz ve özgeçmişiniz başarıyla sisteme kaydedilmiştir.']")
    public WebElement basariliBasvuruHemsire;

    @FindBy(xpath = "//*[text()='GENEL DOKTOR BAŞVURUSU']")
    public WebElement doktorBasvurusuButonu;

    @FindBy(xpath = "//*[.='Doktor Başvuruları']")
    public WebElement doktorBasvurulariAlani;

    @FindBy(xpath = "//*[@id='CvDoctorApply_Firstname']")
    public WebElement adinizDoktor;

    @FindBy(xpath = "//*[@id='CvDoctorApply_Firstname-error']")
    public WebElement adinizDoktorError;

    @FindBy(xpath = "//*[@id='CvDoctorApply_Lastname']")
    public WebElement soyadinizDoktor;

    @FindBy(xpath = "//*[@id='CvDoctorApply_Birthday']")
    public WebElement dogumTarihinizDoktor;

    @FindBy(xpath = "//*[@id='CvDoctorApply_CitizenOf']")
    public WebElement uyrukDoktor;

    @FindBy(xpath = "//*[.='T.C.']")
    public WebElement uyrukDoktor1;

    @FindBy(xpath = "//*[@id='CvDoctorApply_Email']")
    public WebElement emailDoktor;

    @FindBy(xpath = "//*[@id='CvDoctorApply_Phone']")
    public WebElement telefonNumarasiDoktor;

    @FindBy(xpath = "//*[@id='universitySelection']")
    public WebElement mezunOldugunuzUniversite;

    @FindBy(xpath = "//*[@id='facultySelection']")
    public WebElement mezunOldugunuzFakulte;

    @FindBy(xpath = "//*[@id='CvDoctorApply_Title']")
    public WebElement unvan;

    @FindBy(xpath = "//*[text()='Görev Almak İstediğiniz Şehir']")
    public WebElement gorevAlmakIstediginizSehirDoktor;

    @FindBy(xpath = "(//*[@class='form-check-input'])[5]")
    public WebElement gorevAlmakIstediginizSehirDoktor1;

    @FindBy(xpath = "//*[text()='Görev Almak İstediğiniz Lokasyon']")
    public WebElement gorevAlmakIstediginizLokasyonDoktor;

    @FindBy(xpath = "(//*[@id='s2'])[2]")
    public WebElement gorevAlmakIstediginizLokasyonDoktor1;

    @FindBy(xpath = "//*[@class='btn-check r2']")
    public WebElement calisiyorMusunuzDoktor;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement gonderDoktor;

    @FindBy(xpath = "(//*[@type='button'])[1]")
    public WebElement ozgecmis;

    @FindBy(xpath = "//*[.='Kapat']")
    public WebElement kapatDoktor;

    @FindBy(xpath = "//*[.='Başvurunuz ve özgeçmişiniz başarıyla sisteme kaydedilmiştir.']")
    public WebElement basariliBasvuruDoktor;


}