Feature: Als a User soll ich mich bei meinem Konto anmelden

  Background:
    When Der User oeffnet Lidl-StartSite "Lidl_Startseite" link
    And Der User klickt auf Zustimmen-Button.
    And Der User klickt auf Mein Konto-Button.

  Scenario: TC_001 Der User kann sich mit gueltigen Daten anmelden.
    And Der User gibt eine gueltige "Email_Adresse" in das Email-Handynummer-Textfeld ein.
    And Der User klickt auf Weiter-Button.
    And Der User gibt ein gueltiges "Passwort" in das Paswort-Textfeld ein.
    And Der User klickt auf Weiter(Passwort)-Button.
    Then Der User sieht "erfolgreiche_Login_Meldung" Erfolg-Meldung.

  Scenario: TC_002 Der User darf sich nicht mit ungueltiger Email_Adresse anmelden.

    And Der User gibt eine ungueltige "ungueltige_Email_Adresse" in das Email-Handynummer-Textfeld.
    And Der User klickt auf Weiter-Button.
    Then Der User sieht "fehler_EmailOderPhone" EmailFehler-Meldung.

  Scenario: TC_003 Der User darf sich nicht mit ungueltigem Passwort anmelden.

    And Der User gibt eine gueltige "Email_Adresse" in das Email-Handynummer-Textfeld ein.
    And Der User klickt auf Weiter-Button.
    And Der User gibt ein ungueltiges "ungueltiges_Passwort" in das Paswort-Textfeld ein.
    And Der User klickt auf Weiter(Passwort)-Button.
    Then Der User sieht "falsches_Passwort_fehler" PaswortFehler-Meldung.

  Scenario: TC_004 Wenn der User das ungueltiges Passwort drei Mal eingibt, erhaelt eine Sicherheit-Meldung.

    And Der User gibt eine gueltige "Email_Adresse" in das Email-Handynummer-Textfeld ein.
    And Der User klickt auf Weiter-Button.
    And Der User gibt ungueltiges "ungueltiges_Passwort" drei Mal in das Paswort-Textfeld  ein.
    Then Der User sieht eine "sicherheit_meldung" Sicherheitsmeldung.

  Scenario: TC_005 Wenn der User auf Eye-Icon klickt, sieht er sein Passwort.
    And Der User gibt eine gueltige "Email_Adresse" in das Email-Handynummer-Textfeld ein.
    And Der User klickt auf Weiter-Button.
    And Der User gibt ein gueltiges "Passwort" in das Paswort-Textfeld ein.
    And Der User klickt auf EYE-ICON.
    Then Der User sieht sein Passwort.

  Scenario: TC_005 Wenn der User auf Eye-Icon klickt, waehrend sein Passord angezeigt ist, sieht er sein Passwort.
    And Der User gibt eine gueltige "Email_Adresse" in das Email-Handynummer-Textfeld ein.
    And Der User klickt auf Weiter-Button.
    And Der User gibt ein gueltiges "Passwort" in das Paswort-Textfeld ein.
    And Der User klickt auf EYE-ICON.
    And Der User sieht sein Passwort.
    And Der User klickt auf EYE-ICON.
    Then Der User sieht sein Passwort als Sterne.

  Scenario: TC_006 Wenn der User auf Dieses Geraet  Merken-Kontrollkaestchen klickt, wird das Kontrollkaestchen abgehakt.
    And Der User gibt eine gueltige "Email_Adresse" in das Email-Handynummer-Textfeld ein.
    And Der User klickt auf Weiter-Button.
    And Der User klickt auf das Kontrollkaestchen.
    Then Der User sieht, dass Kontrollkaestchen abgehakt ist.

    Scenario: TC_007 Der User kann per SMS ein neues Passwort erstellen.
      And Der User gibt eine gueltige "Email_Adresse" in das Email-Handynummer-Textfeld ein.
      And Der User klickt auf Weiter-Button.
      And Der User klickt auf PasswortVergessen_Button.
      And Der User klict auf SMS erhalten-Button.
      And Der User gibt seine Telefonnummer "Telefon_Nummer" in das Telefonnummertextfeld ein.
      And Der User klickt auf Weiter-Button.
      And Der User gibt die Verifikationnummer in das Textfeld ein.
      Then Der User klickt auf Weiter-Button.

  Scenario: TC_008 Der User soll mit falsche Telefonnumer keine VerifikationCode erhalten.
    And Der User gibt eine gueltige "Email_Adresse" in das Email-Handynummer-Textfeld ein.
    And Der User klickt auf Weiter-Button.
    And Der User klickt auf PasswortVergessen_Button.
    And Der User klict auf SMS erhalten-Button.
    And Der User gibt eine ungueltige Telefonnummer "ungueltige_Telefonnummer" in das Telefonnummertextfeld ein.
    And Der User klickt auf Weiter-Button.
    Then Der User sieht ungueltige Handynummer-Meldung "ungueltige_Handynummer_Meldung".

  Scenario: TC_009 Der User kann per Email ein neues Passwort erstellen.
    And Der User gibt eine gueltige "Email_Adresse" in das Email-Handynummer-Textfeld ein.
    And Der User klickt auf Weiter-Button.
    And Der User klickt auf PasswortVergessen_Button.
    And Der User klict auf Email erhalten-Button.
    And Der User gibt "Verifikation_Email_Code" in das Email Verifikation Textfeld ein.
    Then Der User klickt auf Weiter-Button.

  Scenario: TC_010 Der User kann mit ungueltige EmailverifikationCode nicht bestaetigen.
    And Der User gibt eine gueltige "Email_Adresse" in das Email-Handynummer-Textfeld ein.
    And Der User klickt auf Weiter-Button.
    And Der User klickt auf PasswortVergessen_Button.
    And Der User klict auf Email erhalten-Button.
    And Der User gibt eine ungueltige Code "ungueltige_Email_BestaetigungsCode" in das Emailbestaetigungstextfeld ein.
    And Der User klickt auf Weiter-Button.
    Then Der User sieht ungueltige EmailCode-Meldung "ungueltige_EmailCode_Meldung".










