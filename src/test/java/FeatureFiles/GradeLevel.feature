Feature: Grade Levels (Add, Edit, Delete) Functionality Test


  @SmokeTest
  Scenario Outline: Add Grade Levels
    And User create Grade Levels "<Name>" and "<ShortName>" and "<Order>"
    Then Success add message should be displayed

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
    And User edit Grade Levels "<newName>" "<newShortName>" "<newOrder>"
    Then Success edit message should be displayed

    Examples:
      | newName   | newShortName | newOrder |
      | Grade1234 | Goo          | 300      |


  @SmokeTest
  Scenario: Delete Grade Levels
    And User delete Grade Levels createdName
    Then Success delete message should be displayed




