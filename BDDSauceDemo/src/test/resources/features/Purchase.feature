@Purchase
  Feature: Purchase
    As a user i want purchase one item from list product

  Scenario: user purchase selected product on cart
    Given User open the website sauce demo
    When User input "standard_user" as a userName "secret_sauce" as a password
    Then User already on home page
    When User sort filter list product by "Name (Z to A)"
    And User click item "Sauce Labs Onesie" into cart
    And User click item "Test.allTheThings() T-Shirt (Red)" into cart
    And User navigate to cart page
    Then User already on cart page
    When User remove item that last time was added to cart
    And User click checkout button
    When User input "izzuddin" as a firstname, "faruqi" as a lastName, and "12422" as a postalCode
    And User click continue button
    Then User already on checkout overview page
    And User verify item total, tax price and total price
    And User click finish button
    And User directly go to checkout complete page
    And User back to home page




