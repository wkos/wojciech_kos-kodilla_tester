Feature: Prevent users from taking out more money than their wallet contains

  Scenario Outline: User tries to take out more money than their balance
    Given there is $<cash_in_wallet> in my wallet
    When I withdraw $<cash_to_withdraw>
    Then nothing should be dispensed
    And I should be told that I don't have enough money in my wallet
    Examples:
      | cash_in_wallet | cash_to_withdraw |
      | 0              | 100              |
      | 100            | 101              |
      | 350            | 100000           |