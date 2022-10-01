Feature: Grade Levels (Add, Edit, Delete) Functionality Test


  @SmokeTest
  Scenario Outline: Add Grade Levels
    And User create Grade Levels "<Name>" and "<ShortName>" and "<Order>"
    Then Success add message should be displayed displayed


    Examples:
      | Name   | ShortName | Order |
      | Grade1 | GO        | 299   |


  @SmokeTest
  Scenario Outline: Add same data Grade Levels
    And User create same Grade Levels "<Name>" and "<ShortName>" and "<Order>"
    Then Unsuccessful message should display

    Examples:
      | Name   | ShortName | Order |
      | Grade1 | GO        | 299   |


  @Regression
  Scenario Outline: Edit Grade Levels
    And User edit Grade Levels "<existingName>" and change it to "<newName>"
    Then Success edit message should be displayed

    Examples:
      | existingName | newName   |
      | Grade1       | GradeABCD |


  @SmokeTest
  Scenario Outline: Delete Grade Levels
    And User delete Bank Account "<createdName>"
    Then Success delete message should be displayed

    Examples:
      | createdName |
      | GradeABCD   |




