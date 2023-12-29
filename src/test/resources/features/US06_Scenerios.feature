@US_06
Feature: US_06-Kullanıcı iletişim sayfasındaki iletim formlarını doldurabilmeli.
  @BireyselDestek
  Scenario: Kullanici Bireysel secenegi ile destek birimiyle iletisim kurar
    Given Kullanici acibadem sitesine gider
    When İLETİŞİM sekmesine tiklar
    Then Kullanici bireysel butonuna tiklar
    Then Kullanici ad kutusuna "isim" girer
    Then Kullanici soyad kutusuna "soyisim" girer
    Then Kullanici mail kutusuna "mail adresi" girer
    Then Kullanici telefon numarasi kutusuna "telefon numarasi" girer
    Then Kullanici Mesaj kutusuna "mesaj" girer
    Then Kullanici KVKK metnini kabul eder
    Then Kullanici bilgilendirme metnini kabul eder
  @FiyatSorDestek
  Scenario: Kullanici Fiyat Sor secenegi ile destek birimiyle iletisim kurar
      Given Kullanici acibadem sitesine gider
      When İLETİŞİM sekmesine tiklar
      When FiyatSor sekmesine tiklar
      Then Kullanici fiyatsor ad kutusuna "isim" girer
      Then Kullanici fiyatsor soyad kutusuna "soyisim" girer
      Then Kullanici fiyatsor mail kutusuna "mailadresi@gmail.com" girer
      Then Kullanici fiyatsor telefon numarasi kutusuna "5055259191" girer
      Then Kullanici Sube Secimini "Adana Hastanesi" olarak yapar
      Then Kullanici Sigorta Durumunu "Var" olarak secer
      Then Kullanici fiyat sor Mesaj kutusuna "mesaj" girer
      Then Kullanici fiyat sor KVKK metnini kabul eder
      Then Kullanici fiyat sor bilgilendirme metnini kabul eder
  @TibbiDanismaDestek
  Scenario: Kullanici Tibbi danisma secenegi ile destek birimiyle iletisim kurar
        Given Kullanici acibadem sitesine gider
        When İLETİŞİM sekmesine tiklar
        And TIBBİ DANIŞMA basligina tiklar
        And Adiniz kutusuna "Ad" ismini girer
        And Soyadiniz kutusuna "Soyad" soyisimini girer
        And E-Posta Adresiniz kutusunu bos birakir
        And Telefon Numaraniz kutusuna "51223345" telefon numarasini girer
        And Tibbi Birim Seciniz dropdawn menuden bir birim secer
        And Konu Seciniz dropdawn menuden bir konu secer
        And Mesajiniz text alanina mesaj yazilir
        And Kisisel Verilerin Korunmasi Kanunu kapsaminda olusturulan checkbox kutusunun tiklanilabilir oldugunu dogrular
        And Ticari Elektronik Ileti gonderilebilmesinin onayini iceren checkbox kutusunun tiklanabilir oldugunu dogrular
  @YatirimciDestek
  Scenario: Kullanici Yatirimci secenegi ile destek birimiyle iletisim kurar
          Given Kullanici acibadem sitesine gider
          When İLETİŞİM sekmesine tiklar
          When Kullanici YATIRIMCI basligina tiklar
          Then Kullanici yatirimci ad kutusuna "isim" girer
          Then Kullanici yatirimci soyad kutusuna "soyisim" girer
          Then Kullanici yatirimci mail kutusuna "mailadresi@gmail.com" girer
          Then Kullanici yatirimci telefon numarasi kutusuna "54324245" girer
          Then Kullanici yatirimci Mesaj kutusuna "mesaj" girer
          Then Kullanici yatirimci KVKK metnini kabul eder
          Then Kullanici yatirimci bilgilendirme metnini kabul eder