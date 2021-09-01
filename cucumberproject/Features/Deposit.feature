Feature: Deposit

  @deposit
  Scenario Outline: To verify the deposit functinality
    Given I have  "<initial>" amount in my Account
    When I deposit "<some>" amount in my exit account
    Then I  expect "<updated>"  amount will have in my account

    Examples: 
      | initial | some | updated |
      |    2000 |  500 |    2400 |
      |     100 |  800 |     900 |
