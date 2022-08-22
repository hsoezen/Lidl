Feature: Als a User möchte ich Konto erstellen.

  Scenario: TC_001 Der User kann mit gueltigen Daten ein Konto registirieren.

    When Der User oeffnet Lidl-StartSite "Lidl_Startseite" link
    And Der User klickt auf Zustimmen-Button.
    And Der User klickt auf Mein Konto-Button.
    And Der User klickt auf Registirieren_button.
    And Der User gibt eine gueltige "Email_adresse_Registirierung" Email-Adresse in das Email-Textfeld ein.
    And Der User gibt gleiche "Email_adresse_Registirierung" Email-Adresse" in das Email-Bestaetigung-Textfeld ein.
    And Der User erstellt ein "Registirierung_Passwort" passwort gemaess der Anleitung.
    And Der User klickt auf Registirierung-Weiter-Button.
    And Der User klickt auf EmailSenden-Button.
    And Der User gibt den "verification_Code" in das Email-Verifikationtextfeld.
    And Der User klickt auf Weiter-Button.
    Then Der User sieht die Registirierunsgmeldung.
