Feature: file uploads

  @file_upload
  Scenario: TC01 file upload
    Given I navigate to "https://the-internet.herokuapp.com/upload"
    And I wait for 3 seconds
    And I try to upload the file on this path "\IdeaProjects\com.SelenideBasic\build\reports\tests\my_screenshot20.41.48.png"
    And I wait for 3 seconds
    Then I verify the file is uploaded
    And I capture the screenshot of the page
    And I hold the browser open