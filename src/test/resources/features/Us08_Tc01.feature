Feature:US08_Uluslararası_hastalar_kayıt_olabilmeli


  Scenario:
    Given Kullanici acibadem sitesine gider
    Then Kullanici menu butonunu tiklar
    Then Kullanici acilan menuyu asagi kaydirir
    Then Kullanici 1 saniye bekler
    Then Kullanici FOR INTERNATIONAL PATIENTS butonu tiklar
    And Kullanici 2 saniye bekler
  @hmt
    Scenario:
    Given Kullanici acilan sayfada istenen bilgileri girer
    Then Kullanici 1 saniye bekler
    Then Kullanici acilan cookies kapatir
    Then Kullanici 1 saniye bekler
    Then Kullanici "Name" kutusuna isim girer
    Then Kullanici 1 saniye bekler
    Then Kullanici "Surname" kutusuna soyisim girer
    Then Kullanici 1 saniye bekler
    Then Kullanici "Email" kutusuna mail adresi girer
    Then Kullanici 1 saniye bekler
    Then Kullanici "Phone Number" kutusuna telefon numarasi girer
    Then Kullanici 1 saniye bekler
    Then Kullanci Country menusunden ulke secer
    Then Kullanici Treatment Units menusunden bolum secer
    Then Kullanici Message kutusuna mesaji girer
    Then Kullanici Checkbox u isaretler
    Then Kayit yapildigini dogrula
