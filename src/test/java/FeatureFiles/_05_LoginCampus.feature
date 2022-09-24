#Feature: Login Luma Functionality
#
#  @Regression
#  Scenario: Login with valid username and password as positive test
#    Given User is on login page
#    When User enter valid username and password
#      | richfield.edu | Richfield2020! |
#    Then User should login successfully
#
#  @Regression
#  Scenario Outline: Login with invalid username or password as negative test
#    Given User is on login page
#    When User enter invalid "<username>" or invalid "<password>"
#    Then User should NOT login and receive error message
#
#    Examples:
#      | username          | password       |
#      | richfield.edu     | #1234hello     |
#      | apple23@gmail.com | Richfield2020! |
#      | bee232@gmail.com  | chelsea65      |