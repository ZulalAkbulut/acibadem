@Us05
Feature: Kullanıcı menü butonundaki fiyat sor butonunu aktif olarak kullanabilmeli.

  Scenario:
    Given Kullanivi acibadem sitesine gidilir
    When menu butonuna tiklanir
    And  Fiyat Sor butonuna tikla
    And Adiniz bölumune "Esra" yazilir
    And Soyadiniz bölumune "Altuntas" yazilir
    And E-Posta  kutusuna "altuntasesra14@gmail.com" e-posta yazilir
    And Telefon Numaraniz kismina "532545545" telefon numarasi girer
    And Sube secimi butonuna tiklanir
    And Sube Seciniz butonundan sube secilir
    And Sigorta Durumubutonuna tiklanir
    And sigorta durumu secilir
    And Sigorta Bilginiz bolumune tklanir
    And Sigorta bilsi "SGK" olarak yazilir
    And Mesaj kutusuna mesaj yazilir
    And KVKK  checkbox kutusu tiklanilanir
    And Guvenlik Kodu bolumu doldurulur
    And Gönder butonuna tiklanir
    And Islemin gerceklestigi dogrulanir
    And Sayfa kapatilir