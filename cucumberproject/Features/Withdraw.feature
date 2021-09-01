Feature: Withdraw

  @Withdraw
  Scenario Outline: To verify the withdrew functinality
    Given I have  "<initial>" amount in a Account
    When I withdraw "<some>" amount in  exit account
    Then I  expect "<updated>"  amount will have in the account

    Examples: 
      | initial | some | updated |
      |    2000 |  500 |    1500 |
      |     800 |  100 |     700 |
