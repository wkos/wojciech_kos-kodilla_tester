Feature: Display balance

  Scenario Outline: User checks the balance of their wallet
    Given there is $<balance> in my wallet
    When I check the balance of my wallet
    Then I should see that the balance is $<answer_balance>
    Examples:
      | balance | answer_balance |
      | 0       | 0              |
      | 100     | 100            |
      | 300     | 300            |
      | 100000  | 100000         |