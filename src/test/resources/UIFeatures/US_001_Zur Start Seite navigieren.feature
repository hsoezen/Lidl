Feature: Zur Lidl-Startseite navigieren
@lidl
  Scenario: TC_001 Der User kann zur Lidl-Startseite navigieren
    When Der User open Lidl-StartSite "Lidl_Startseite" link
    And Die Startseite_Menu wird angezeigt.
    Then Der user schliesst Window.




