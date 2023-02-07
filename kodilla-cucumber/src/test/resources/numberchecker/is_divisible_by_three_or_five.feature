Feature:  Is divisible by three of five?

  Scenario Outline: Number is divisible by three or and five
    Given number is equals to <number>
    When I ask if number is divisible by three or and five
    Then It should be told <result>
    Examples:
      | number | result     |
      | 3      | "Fizz"     |
      | 5      | "Buzz"     |
      | 15     | "FizzBuzz" |
      | 1      | "None"     |
      | 2      | "None"     |
      | 4      | "None"     |
      | 6      | "Fizz"     |
      | 10     | "Buzz"     |
      | 14     | "None"     |
      | 16     | "None"     |
      | 18     | "Fizz"     |
      | 20     | "Buzz"     |