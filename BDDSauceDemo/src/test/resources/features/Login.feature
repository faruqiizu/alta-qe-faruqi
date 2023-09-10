@Login
  Feature: Login
    As a user i want to login sauce demo website

  Scenario: Normal login
    Given User open the website sauce demo
    When User input "standard_user" as a userName "secret_sauce" as a password
    Then User already on home page


@Invalid
  Scenario Outline: Invalid Login
    Given User open the website sauce demo
    When User input "<userName>" as a userName "<password>" as a password
    Then Verify see error "<errorText>" on login page
Examples:
  | userName      | password     | errorText                                                                 |
  |               |              | Epic sadface: Username is required                                        |
  |               | secret_sauce | Epic sadface: Username is required                                        |
  | standard_user |              | Epic sadface: Password is required                                        |
  | Faruqi        | 123          | Epic sadface: Username and password do not match any user in this service |

#  ctrl+backspace hapus 1 line di Examples atas