Feature:Delete Functionality

  @SmokeTest
  Scenario Outline: Delete Nationality Positive
    Given User delete nation "<name>"
    Then Success message should be displayed
    Examples:
      | name |
      | UKY1 |
      | RUY2 |
#      | WER3 |
#      | POR4 |

  @Regression
  Scenario Outline: Delete Nationality Negative
    When User search deleted "<name>" in search input
    Then There is no data should be displayed
    Examples:
      | name |
      | UKY1 |
      | RUY2 |
      | WER3 |
      | POR4 |


