Feature:Add Functionality

  @SmokeTest
  Scenario Outline: Add Nationality Positive
    Given User add nation "<name>"
    Then Success message should be displayed
    Examples:
      | name |
      | xr15 |
      | UK23 |
#      | FR22 |
#      | MR24 |

  @Regression
  Scenario: Add Nationality Negative
    When User add same nation name
      | Tr15 |
      | UK23 |
      | FR22 |
      | MR24 |
    Then Exist message should be displayed
