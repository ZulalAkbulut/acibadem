@tuba
Feature: US011_Acibadem Hemsire Ve Doktor Basvurusu Yapabilme Testi

  Scenario: TC_01 Hemsire Olarak Basvuru Yapabilme
    Given Websiteye gidilir
    Then Menu butonuna tiklanir
    And Genel Hemsire Basvurusu butonuna tiklanir
    And Acilan sayfadaki Hemsire Basvurulari alanina tiklanir
    And Acilan sayfadaki Adiniz kutusuna isim girilir
    And Soyadiniz kutusuna soyisim girilir
    And Dogum Tarihiniz kutusuna dogum tarihi girilir
    And Uyruk dropdown menuden uyruk secilir
    And E-Posta Adresiniz kutusuna e-posta adresi girilir
    And Telefon Numaraniz kutusuna telefon numarasi girilir
    And Mesleginiz dropdown menuden meslek secilir
    And Mezun Oldugunuz Okul dropdown menuden mezun olunan okul secilir
    And Mezuniyet Yiliniz kutusuna yil girilir
    And Meslekte Deneyim Sureniz dropdown menuden sure secilir
    And Hangi Alanda Deneyimlisiniz? dropdown menuden alan secilir
    And Hangi Alanda Calismak Istersiniz? dropdown menuden alan secilir
    And Sertifikaniz var mi? dropdown menuden secim yapilir
    And Gorev Almak Istediginiz Sehir dropdown menuden sehir secilir
    And Su Anda Calisiyor Musunuz? kismindan secim yapilir
    And Gonder butonuna tiklanir
    And Hemsire basvurusu yapabildigini dogrular

  Scenario: TC_02 Hemsire Olarak Basvuru Yapabilme Negatif Test
    Given Websiteye gidilir
    Then Menu butonuna tiklanir
    And Genel Hemsire Basvurusu butonuna tiklanir
    And Acilan sayfadaki Hemsire Basvurulari alanina tiklanir
    And Acilan sayfadaki Adiniz kutusu bos birakilir
    And Soyadiniz kutusuna soyisim girilir
    And Dogum Tarihiniz kutusuna dogum tarihi girilir
    And Uyruk dropdown menuden uyruk secilir
    And E-Posta Adresiniz kutusuna e-posta adresi girilir
    And Telefon Numaraniz kutusuna telefon numarasi girilir
    And Mesleginiz dropdown menuden meslek secilir
    And Mezun Oldugunuz Okul dropdown menuden mezun olunan okul secilir
    And Mezuniyet Yiliniz kutusuna yil girilir
    And Meslekte Deneyim Sureniz dropdown menuden sure secilir
    And Hangi Alanda Deneyimlisiniz? dropdown menuden alan secilir
    And Hangi Alanda Calismak Istersiniz? dropdown menuden alan secilir
    And Sertifikaniz var mi? dropdown menuden secim yapilir
    And Gorev Almak Istediginiz Sehir dropdown menuden sehir secilir
    And Su Anda Calisiyor Musunuz? kismindan secim yapilir
    And Gonder butonuna tiklanir
    And Lütfen adınızı giriniz. uyarisi gorulur

  Scenario: TC_03 Doktor Olarak Basvuru Yapabilme
    Given Websiteye gidilir
    Then Menu butonuna tiklanir
    And Genel Doktor Basvurusu butonuna tiklanir
    And Acilan sayfadaki Doktor Basvurulari alanina tiklanir
    And Kullanici acilan sayfadaki Adiniz kutusuna isim girer
    And Kullanici Soyadiniz kutusuna soyisim girer
    And Kullanici Dogum Tarihiniz kutusuna dogum tarihi girer
    And Kullanici Uyruk dropdown menuden uyruk secer
    And Kullanici E-Posta Adresiniz kutusuna e-posta adresi girer
    And Kullanici Telefon Numaraniz kutusuna telefon numarasi girer
    And Kullanici Mezun Oldugunuz Universite dropdown menuden mezun oldugu universiteyi secer
    And Kullamnici Mezun Oldugunuz Fakulte dropdown menuden mezun oldugu fakulteyi secer
    And Kullanici Unvan dropdown menuden unvan secer
    And Kullanici Gorev Almak Istediginiz Sehir dropdown menuden sehir secer
    And Kullanici Su Anda Calisiyor Musunuz? kismindan secim yapar
    And Kullanici Özgecmisinizi Yukleyiniz kismina ozgecmis yukler
    And Kullanici Gonder butonuna tiklar
    And Kullanici doktor basvurusu yapabildigini dogrular

  Scenario: TC_04 Doktor Olarak Basvuru Yapabilme Negatif Testi
    Given Websiteye gidilir
    Then Menu butonuna tiklanir
    And Genel Doktor Basvurusu butonuna tiklanir
    And Acilan sayfadaki Doktor Basvurulari alanina tiklanir
    And Kullanici acilan sayfadaki Adiniz kutusunu bos birakir
    And Kullanici Soyadiniz kutusuna soyisim girer
    And Kullanici Dogum Tarihiniz kutusuna dogum tarihi girer
    And Kullanici Uyruk dropdown menuden uyruk secer
    And Kullanici E-Posta Adresiniz kutusuna e-posta adresi girer
    And Kullanici Telefon Numaraniz kutusuna telefon numarasi girer
    And Kullanici Mezun Oldugunuz Universite dropdown menuden mezun oldugu universiteyi secer
    And Kullamnici Mezun Oldugunuz Fakulte dropdown menuden mezun oldugu fakulteyi secer
    And Kullanici Unvan dropdown menuden unvan secer
    And Kullanici Gorev Almak Istediginiz Sehir dropdown menuden sehir secer
    And Kullanici Su Anda Calisiyor Musunuz? kismindan secim yapar
    And Kullanici Özgecmisinizi Yukleyiniz kismina ozgecmis yukler
    And Kullanici Gonder butonuna tiklar
    And Kullanici Lütfen adınızı giriniz. uyarisini gorur

