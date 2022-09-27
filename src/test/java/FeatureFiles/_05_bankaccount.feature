Feature: Bank Account (Add, Edit, Delete) Functionality Test
  @SmokeTest
  Scenario Outline: Add Bank Account
    And User create Bank Account "<bankName>" and "<iban>" and "<integrationCode>"
    Then Success add message should be displayed displayed
    Examples:
      | bankName   | iban    | integrationCode |
      | ToffeeBank | SP98 71 | 199             |
  @SmokeTest
  Scenario Outline: Add same data Bank Account
    And User create same Bank Account "<bankName>" and "<iban>" and "<integrationCode>"
    Then Unsuccessful message should display
   Examples:
      | bankName   | iban    | integrationCode |
      | ToffeeBank | SP98 71 | 199             |
  @Regression
  Scenario Outline: Edit Bank Account
    And User edit Bank Account "<existingBankName>" and change it to "<newBankName>"
   Then Success edit message should be displayed
    Examples:
      | existingBankName | newBankName |
      | ToffeeBank       | PeanutBank  |
  @SmokeTest
  Scenario Outline: Delete Bank Account
    And User delete Bank Account "<createdBankName>"
    Then Success delete message should be displayed
    Examples:
      | createdBankName |
      | PeanutBank      |
  @SmokeTest
  Scenario Outline: Accessing deleted Bank Account
    And User should search deleted Bank data "<createdBankName>"
    Then User should see no data message should be displayed
    Examples:
      | createdBankName |
      | PeanutBank      |
