Feature: Saucedemo User Login

  Scenario: User Login
    Given the user visits the saucedemo URL
    When user enters valid credentials(username: "standard_user" , password: "secret_sauce")
    And user clicks on the Login button
    Then user should be redirected to home page
