Feature: Test the login function of Test Project website

  Scenario Outline: Test the login function with multiple data sets
    
    Background: User checking login function

    Given Starting to open browser

  Scenario Outline: Test the login function with multiple data sets
    Given enter the url
    When enter the <username> and <password>
    And click on login
    Then user navigated into home page

    Examples: 
      | username  | password |
      | Rakesh    |    12345 |
      | Roopa     |    12345 |
      | Chaitanya |    12345 |

  Scenario Outline: Test the login function with multiple data sets
    Given enter the url
    When enter the <username> and <password>
    And click on login
    Then user navigated into home page

    Examples: 
      | username | password |
      | ASR1     |    12345 |
      | ASR2     |    12345 |
      | ASR3     |    12345 |
