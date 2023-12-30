@03
Feature: Kullanici lokasyona uygun doktor secer.

  Scenario: :TC01
  Given Kullanici Anasayfaya gider.
When Kullanici Doktorlar sekmesine gider.
When Kullanici Doktorlar sekmesini gorur.
Then Kullanici sayfayi asagiya kaydirir.

  Scenario:TC02
  Given Kullanici Lokasyon butonuna tiklar.
  When Kullanici istedigi Lokasyonu secer.
  Then Kullanici sayfayi asagiya kaydirir.

  Scenario:TC03
  Given Kullanici Tibbi Birim butonuna tiklar.
  And Kullanici Tibbi Birim secer.
  And Kullanici sayfayi asagiya kaydirir.

  Scenario:TC04
  Given Kullanici Unvan butonuna tiklar.
  And Kullanici Unvan secer.
  And Kullanici sayfayi asagiya kaydirir.

  Scenario:TC05
  Given Kullanici istedigi doktoru secer.