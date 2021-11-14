Feature: Managing inventory

  Scenario: Adding a product actually adds it to the inventory
    Given there are 4 sweaters in the inventory
    When one sweater is received
    Then there are 5 sweaters in the inventory