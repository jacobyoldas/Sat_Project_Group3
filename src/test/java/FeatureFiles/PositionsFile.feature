Feature: Positions Feature Function

  Scenario Outline: Create Positions
    When User click plus icon and add "<Name>" and "<ShortName>" and save
    Then User should see success message

    Examples:
      | Name      | ShortName |
      | Position1 | POS1      |


  Scenario Outline: Search Positions
    When User should be able to search "<Name>"
    Then User should see positions name

    Examples:
      | Name      |
      | Position1 |

  Scenario Outline: Search Invalid Positions
    When User should be able to search "<invalidName>"and click search button
    Then User should see on display no data message

    Examples:
      | invalidName      |
      | invalidPosition  |
      | invalidPosition2 |


  Scenario Outline: Update the Positions
    And  User edit "<existingName>" and "<newName>"
    Then User should see updated success message

    Examples:
      | existingName | newName         |
      | Position1    | updatedPosition |

  Scenario Outline: Delete the Positions
    And User delete the positions "<newName>"
    Then User should see success message

    Examples:
      | newName         |
      | updatedPosition |

