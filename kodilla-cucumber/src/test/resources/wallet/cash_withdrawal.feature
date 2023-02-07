Feature: Cash Withdrawal

  Scenario Outline: Withdrawal from a wallet in credit
    Given I have deposited $<money_to_wallet> in my wallet
    When I request $<money_from_wallet>
    Then $<money_dispensed> should be dispensed
    Examples:
      | money_to_wallet | money_from_wallet | money_dispensed |
      | 300             | 300               | 300             |
      | 200             | 0                 | 0               |
      | 200             | 50                | 50              |
      | 200             | 200               | 200             |
      | 200             | 300               | 200             |
      | 200             | 1000              | 200             |