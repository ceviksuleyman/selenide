@amazon
Feature: Selenide Demo

  Scenario: navigation's test
    Given navigate to "https://www.amazon.com"
    When new tab navigate to "https://www.youtube.com/"