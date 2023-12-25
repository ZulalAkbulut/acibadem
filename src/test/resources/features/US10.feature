Feature: US10 Tibbi Danisma bolumunden mesaj gonderebilmeli
@1
  Scenario: Kullanıcı öneri, şikayet ve bilgi almak için tibbi danisma formunu doldurabilmeli.
    Given Kullanici "https://www.acibadem.com.tr/" webadresine gider
    When İLETİŞİM sekmesine tiklar
    And İLETİŞİM FORMLARI sayfasinda oldugu dogrular
    And TIBBİ DANIŞMA basligina tiklar
    And Adiniz kutusuna "Ali" ismini girer
    And Soyadiniz kutusuna "Yilmaz" soyisimini girer
    And E-Posta Adresiniz kutusuna "aliyilmaz@gmail.com" e-posta adresini girer
    And Telefon Numaraniz kutusuna "32223345" telefon numarasini girer
    And Tibbi Birim Seciniz dropdawn menuden bir birim secer
    And Konu Seciniz dropdawn menuden bir konu secer
    And Mesajiniz text alanina mesaj yazilir
    And Kisisel Verilerin Korunmasi Kanunu kapsaminda olusturulan checkbox kutusunun tiklanilabilir oldugunu dogrular
    And Ticari Elektronik Ileti gonderilebilmesinin onayini iceren checkbox kutusunun tiklanabilir oldugunu dogrular
    And 5 haneli guvenlik kodu girilir
    And Gonder butonuna tiklanir
    Then Islemin basariyle gerceklestigi dogrulanir

    Scenario: Kullanıcı öneri, şikayet ve bilgi almak için tibbi danisma formunda Adiniz kismini bos birakarak islem yapamaz
      Given Kullanici "https://www.acibadem.com.tr/" webadresine gider
      When İLETİŞİM sekmesine tiklar
      And İLETİŞİM FORMLARI sayfasinda oldugu dogrular
      And TIBBİ DANIŞMA basligina tiklar
      And Adiniz kutusunu bos birakir
      And Soyadiniz kutusuna "Yilmaz" soyisimini girer
      And E-Posta Adresiniz kutusuna "aliyilmaz@gmail.com" e-posta adresini girer
      And Telefon Numaraniz kutusuna "32223345" telefon numarasini girer
      And Tibbi Birim Seciniz dropdawn menuden bir birim secer
      And Konu Seciniz dropdawn menuden bir konu secer
      And Mesajiniz text alanina mesaj yazilir
      And Kisisel Verilerin Korunmasi Kanunu kapsaminda olusturulan checkbox kutusunun tiklanilabilir oldugunu dogrular
      And Ticari Elektronik Ileti gonderilebilmesinin onayini iceren checkbox kutusunun tiklanabilir oldugunu dogrular
      And 5 haneli guvenlik kodu girilir
      And Gonder butonuna tiklanir
      Then Lutfen adinizi giriniz uyarisi gorulur

    Scenario: Kullanıcı öneri, şikayet ve bilgi almak için tibbi danisma formunda Soyadiniz kismini bos birakarak islem yapamaz
      Given Kullanici "https://www.acibadem.com.tr/" webadresine gider
      When İLETİŞİM sekmesine tiklar
      And İLETİŞİM FORMLARI sayfasinda oldugu dogrular
      And TIBBİ DANIŞMA basligina tiklar
      And Adiniz kutusuna "Ali" ismini girer
      And Soyadiniz kutusunu bos birakir
      And E-Posta Adresiniz kutusuna "aliyilmaz@gmail.com" e-posta adresini girer
      And Telefon Numaraniz kutusuna "32223345" telefon numarasini girer
      And Tibbi Birim Seciniz dropdawn menuden bir birim secer
      And Konu Seciniz dropdawn menuden bir konu secer
      And Mesajiniz text alanina mesaj yazilir
      And Kisisel Verilerin Korunmasi Kanunu kapsaminda olusturulan checkbox kutusunun tiklanilabilir oldugunu dogrular
      And Ticari Elektronik Ileti gonderilebilmesinin onayini iceren checkbox kutusunun tiklanabilir oldugunu dogrular
      And 5 haneli guvenlik kodu girilir
      And Gonder butonuna tiklanir
      Then Lutfen soyadinizi giriniz uyarisi gorulur

    Scenario: Kullanıcı öneri, şikayet ve bilgi almak için tibbi danisma formunda E-Posta Adresiniz kismini bos birakarak islem yapamaz
      Given Kullanici "https://www.acibadem.com.tr/" webadresine gider
      When İLETİŞİM sekmesine tiklar
      And İLETİŞİM FORMLARI sayfasinda oldugu dogrular
      And TIBBİ DANIŞMA basligina tiklar
      And Adiniz kutusuna "Ali" ismini girer
      And Soyadiniz kutusuna "Yilmaz" soyisimini girer
      And E-Posta Adresiniz kutusunu bos birakir
      And Telefon Numaraniz kutusuna "32223345" telefon numarasini girer
      And Tibbi Birim Seciniz dropdawn menuden bir birim secer
      And Konu Seciniz dropdawn menuden bir konu secer
      And Mesajiniz text alanina mesaj yazilir
      And Kisisel Verilerin Korunmasi Kanunu kapsaminda olusturulan checkbox kutusunun tiklanilabilir oldugunu dogrular
      And Ticari Elektronik Ileti gonderilebilmesinin onayini iceren checkbox kutusunun tiklanabilir oldugunu dogrular
      And 5 haneli guvenlik kodu girilir
      And Gonder butonuna tiklanir
      Then Lutfen e-mail adresinizi giriniz uyarisi gorulur

    Scenario: Kullanıcı öneri, şikayet ve bilgi almak için tibbi danisma formunda Telefon Numaraniz kismini bos birakarak islem yapamaz
      Given Kullanici "https://www.acibadem.com.tr/" webadresine gider
      When İLETİŞİM sekmesine tiklar
      And İLETİŞİM FORMLARI sayfasinda oldugu dogrular
      And TIBBİ DANIŞMA basligina tiklar
      And Adiniz kutusuna "Ali" ismini girer
      And Soyadiniz kutusuna "Yilmaz" soyisimini girer
      And E-Posta Adresiniz kutusuna "aliyilmaz@gmail.com" e-posta adresini girer
      And Telefon Numaraniz kutusunu bos birakir
      And Tibbi Birim Seciniz dropdawn menuden bir birim secer
      And Konu Seciniz dropdawn menuden bir konu secer
      And Mesajiniz text alanina mesaj yazilir
      And Kisisel Verilerin Korunmasi Kanunu kapsaminda olusturulan checkbox kutusunun tiklanilabilir oldugunu dogrular
      And Ticari Elektronik Ileti gonderilebilmesinin onayini iceren checkbox kutusunun tiklanabilir oldugunu dogrular
      And 5 haneli guvenlik kodu girilir
      And Gonder butonuna tiklanir
      Then Lutfen telefon numaranizi giriniz uyarisi gorulur

    Scenario: Kullanıcı öneri, şikayet ve bilgi almak için tibbi danisma formunda Tibbi Birim Seciniz kismini bos birakarak islem yapamaz
      Given Kullanici "https://www.acibadem.com.tr/" webadresine gider
      When İLETİŞİM sekmesine tiklar
      And İLETİŞİM FORMLARI sayfasinda oldugu dogrular
      And TIBBİ DANIŞMA basligina tiklar
      And Adiniz kutusuna "Ali" ismini girer
      And Soyadiniz kutusuna "Yilmaz" soyisimini girer
      And E-Posta Adresiniz kutusuna "aliyilmaz@gmail.com" e-posta adresini girer
      And Telefon Numaraniz kutusuna "32223345" telefon numarasini girer
      And Tibbi Birim Seciniz dropdawn menuyu bos birakir
      And Konu Seciniz dropdawn menuden bir konu secer
      And Mesajiniz text alanina mesaj yazilir
      And Kisisel Verilerin Korunmasi Kanunu kapsaminda olusturulan checkbox kutusunun tiklanilabilir oldugunu dogrular
      And Ticari Elektronik Ileti gonderilebilmesinin onayini iceren checkbox kutusunun tiklanabilir oldugunu dogrular
      And 5 haneli guvenlik kodu girilir
      And Gonder butonuna tiklanir
      Then Lutfen tibbi birim seciniz uyarisi gorulur

   Scenario: Kullanıcı öneri, şikayet ve bilgi almak için tibbi danisma formunda Konu Seciniz kismini bos birakarak islem yapamaz
     Given Kullanici "https://www.acibadem.com.tr/" webadresine gider
     When İLETİŞİM sekmesine tiklar
     And İLETİŞİM FORMLARI sayfasinda oldugu dogrular
     And TIBBİ DANIŞMA basligina tiklar
     And Adiniz kutusuna "Ali" ismini girer
     And Soyadiniz kutusuna "Yilmaz" soyisimini girer
     And E-Posta Adresiniz kutusuna "aliyilmaz@gmail.com" e-posta adresini girer
     And Telefon Numaraniz kutusuna "32223345" telefon numarasini girer
     And Tibbi Birim Seciniz dropdawn menuden bir birim secer
     And Konu Seciniz dropdawn menuyu bos birakir
     And Mesajiniz text alanina mesaj yazilir
     And Kisisel Verilerin Korunmasi Kanunu kapsaminda olusturulan checkbox kutusunun tiklanilabilir oldugunu dogrular
     And Ticari Elektronik Ileti gonderilebilmesinin onayini iceren checkbox kutusunun tiklanabilir oldugunu dogrular
     And 5 haneli guvenlik kodu girilir
     And Gonder butonuna tiklanir
     Then Lutfen Konu Seciniz uyarisi gorulur

   Scenario: Kullanıcı öneri, şikayet ve bilgi almak için tibbi danisma formunda Mesajiniz kismini bos birakarak islem yapamaz
     Given Kullanici "https://www.acibadem.com.tr/" webadresine gider
     When İLETİŞİM sekmesine tiklar
     And İLETİŞİM FORMLARI sayfasinda oldugu dogrular
     And TIBBİ DANIŞMA basligina tiklar
     And Adiniz kutusuna "Ali" ismini girer
     And Soyadiniz kutusuna "Yilmaz" soyisimini girer
     And E-Posta Adresiniz kutusuna "aliyilmaz@gmail.com" e-posta adresini girer
     And Telefon Numaraniz kutusuna "32223345" telefon numarasini girer
     And Tibbi Birim Seciniz dropdawn menuden bir birim secer
     And Konu Seciniz dropdawn menuden bir konu secer
     And Mesajiniz text alanini bos birakir
     And Kisisel Verilerin Korunmasi Kanunu kapsaminda olusturulan checkbox kutusunun tiklanilabilir oldugunu dogrular
     And Ticari Elektronik Ileti gonderilebilmesinin onayini iceren checkbox kutusunun tiklanabilir oldugunu dogrular
     And 5 haneli guvenlik kodu girilir
     And Gonder butonuna tiklanir
     Then Lutfen mesajinizi giriniz uyarisi gorulur

  Scenario: Kullanıcı öneri, şikayet ve bilgi almak için tibbi danisma formunda E-Posta Adresiniz kisminda gecersiz bir email adresiyle islem yapamaz
    Given Kullanici "https://www.acibadem.com.tr/" webadresine gider
    When İLETİŞİM sekmesine tiklar
    And İLETİŞİM FORMLARI sayfasinda oldugu dogrular
    And TIBBİ DANIŞMA basligina tiklar
    And Adiniz kutusuna "Ali" ismini girer
    And Soyadiniz kutusuna "Yilmaz" soyisimini girer
    And E-Posta Adresiniz kutusuna  patterne uymayan bir email girer
    And Telefon Numaraniz kutusuna "32223345" telefon numarasini girer
    And Tibbi Birim Seciniz dropdawn menuden bir birim secer
    And Konu Seciniz dropdawn menuden bir konu secer
    And Mesajiniz text alanina mesaj yazilir
    And Kisisel Verilerin Korunmasi Kanunu kapsaminda olusturulan checkbox kutusunun tiklanilabilir oldugunu dogrular
    And Ticari Elektronik Ileti gonderilebilmesinin onayini iceren checkbox kutusunun tiklanabilir oldugunu dogrular
    And 5 haneli guvenlik kodu girilir
    And Gonder butonuna tiklanir
    Then Lutfen gecerli bir e-mail adresi giriniz uyarisi gorulur



