Feature: Ordering product and find him in basket


  Scenario:   Add product to basket
    Given I open the main page
    When I send 'ноутбук' in search field
    And I Click on find button
    And I  choose  'Acer Aspire' model
   And I  click button Buy
    Then I going in basket and see chosen  product


   Scenario Outline: Buy product for cash

      Given I open the main page
      When  I send 'playstation 4' in search field
     And I Click on find button
      And I choose 'геймпад'
      And I  click button Buy
      And I   click  checkout
      And I  send <Name> in field name
      And I send <Surname> in field surname
      And I send <phone number> in field phone
      Then I see that order button is available

      Examples:
        |Name     |Surname     |phone number|
        | 'Dmitri'| 'Ivanovich'|  '0664345120'|


  Scenario Outline:   Buy product buy on credit

    Given I open the main page
    When  I send 'playstation 4' in search field
    And I Click on find button
    And I choose 'геймпад'
    And I  click button Buy
    And I   click  credit
    And I  send <Name> in field name
    And I send <Surname> in field surname
    And I send <phone number> in field phone
    Then I see that order button is available

    Examples:
      |Name     |Surname     |phone number|
      | 'Dmitri'| 'Ivanovich'|'0664345120'|


