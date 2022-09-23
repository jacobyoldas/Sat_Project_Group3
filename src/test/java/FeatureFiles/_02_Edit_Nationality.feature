Feature:Edit Functionality

  @SmokeTest
  Scenario: Edit Nationality Positive
    Given User edit nation name
      | Tr15 | UK23 |
#      | FR22 | MR24 |
    Then Success message should be displayed

