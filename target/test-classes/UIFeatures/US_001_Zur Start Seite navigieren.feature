Feature: Zur Lidl-Startseite navigieren

  @lidl
  Scenario: TC_001 Der User kann zur Lidl-Startseite navigieren
    When Der User oeffnet Lidl-StartSite "Lidl_Startseite" link
    And Die Startseite_Menu wird angezeigt.
    Then Der user schliesst Window.

  Scenario: TC_011 Der User kann Anmelde-Button ohne auf dem zu klicken sehen.

    When Der User oeffnet Lidl-StartSite "Lidl_Startseite" link
    And Der User klickt auf Zustimmen-Button.
    And Der User bewegt den Mausepfeil über die "Mein Konto" Option.
    And Der User sieht, dass der Anmelde-Menu angezeigt wird.

    Scenario: TC_002 Der User meldet ohne auf den Anmelde-Button zu klicken an.
      When Der User oeffnet Lidl-StartSite "Lidl_Startseite" link
      And Der User klickt auf Zustimmen-Button.
      And Der User bewegt den Mausepfeil über die "Mein Konto" Option.
      And Der User klick auf den Anmelde-Button.
      And Der User gibt eine gueltige "Email_Adresse" in das Email-Handynummer-Textfeld ein.
      And Der User klickt auf Weiter-Button.
      And Der User gibt ein gueltiges "Passwort" in das Paswort-Textfeld ein.
      And Der User klickt auf Weiter(Passwort)-Button.

      Scenario: TC_003 Der User kann bei Lidl Onlineshop abmelden.
        When Der User oeffnet Lidl-StartSite "Lidl_Startseite" link
        And Der User klickt auf Zustimmen-Button.
        And Der User bewegt den Mausepfeil über die "Mein Konto" Option.
        And Der User klick auf den Anmelde-Button.
        And Der User gibt eine gueltige "Email_Adresse" in das Email-Handynummer-Textfeld ein.
        And Der User klickt auf Weiter-Button.
        And Der User gibt ein gueltiges "Passwort" in das Paswort-Textfeld ein.
        And Der User klickt auf Weiter(Passwort)-Button.
        #And Der User bewegt den Mausepfeil über die "Mein Konto" Option.
        And Der User klickt auf Abmelde_Button.
        Then Der User sieht die grüne Haken auf Mein Konto nict mehr.






