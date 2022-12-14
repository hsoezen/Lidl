Feature: Als ein User kann ich Online als Gast bestellen
  Scenario: TC_001 Der User kann das erste Produkt von Staubsaugerkategorie in den Warenkorb legen.

    When Der User oeffnet Lidl-StartSite "Lidl_Startseite" link
    And Der User klickt auf Zustimmen-Button.
    And Der User klickt auf "Garten & Balkon" Unterkategorie.
    And Der User klickt auf "Grills & Grill-Zubehör" UnterUnterkategorie.
    And Der User waehlt "Holzkohlegrills" aus UnterUnterkategorie aus.
    And Der User waehlt "GRILLMEISTER Holzkohlegrill »AG 34 C1«, elektrisch, mit aktiver Belüftung" produkt
    And Der User waehlt eine Farbe, wenn Auswahlmöglichkeit gibt.
    And Der User waehlt Stueckzahl aus der Stueck-Dropdownmenu als 2 aus.
    And Der User klickt auf In Den Warenkorb-Button.
    Then Der User sieht ausgewaehltes Produkt im Warenkorb.

  Scenario: TC_002 Der User kann das erste Produkt von Staubsaugerkategorie in den Warenkorb legen.

    When Der User oeffnet Lidl-StartSite "Lidl_Startseite" link
    And Der User klickt auf Zustimmen-Button.
    And Der User klickt auf "Werkstatt & Werkzeuge" Unterkategorie.
    And Der User klickt auf "Elektrowerkzeuge & Elektromaschinen" UnterUnterkategorie.
    And Der User waehlt "Bohrmaschinenzubehör" aus UnterUnterkategorie aus.
    And Der User gibt "35" als Mindestpreis und "400" als Hoechtspreis in Preisfiltertextfeld ein.
    Then Alle Produktpreise sollen in gewuenschte Spanne sein.

  Scenario: TC_003 Der User kann das erste Produkt von Staubsaugerkategorie in den Warenkorb legen.

    When Der User oeffnet Lidl-StartSite "Lidl_Startseite" link
    And Der User klickt auf Zustimmen-Button.
    And Der User klickt auf "Werkstatt & Werkzeuge" Unterkategorie.
    And Der User klickt auf "Elektrowerkzeuge & Elektromaschinen" UnterUnterkategorie.
    And Der User waehlt "Bohrmaschinenzubehör" aus UnterUnterkategorie aus.
    And Der User waehlt Marke "PARKSIDE" aus der Markenliste aus.
    Then Der User sieht, dass alle Marken "PARKSIDE" sind.
