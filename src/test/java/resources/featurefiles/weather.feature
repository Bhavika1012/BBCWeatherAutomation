@test
Feature: Check BBC weather for London
  Scenario: Verify that today's highest temperature is greater than lowest temperature

    Given I am on the BBC website page
    When I enter city name in "London" in search bar
    Then I should see weather results for "London"
    And highest temperature is greater than lowest temperature
