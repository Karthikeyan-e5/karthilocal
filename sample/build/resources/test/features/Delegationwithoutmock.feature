@test1
Feature: Sample test1


  @ExportGridFromWorkflowConsole
  Scenario: Verify that user provide proper input payload & Get the output payload for export grid from console
    Given user builds the input value for export grid from console
    When  user runs the FB for export grid from console
    Then  user gets the Fboutput for export grid from console
    And   User validates the result using export grid from console

  @EditLockFb
  Scenario: Verify that user provide proper input payload & Get the output payload for edit lock
    Given user builds the input value for edit lock
    When  user runs the FB for edit lock
    Then  user gets the Fboutput for edit lock
    And   User validates the result using for edit lock

  @Downloadattachments
  Scenario: Verify that user provide proper input payload & Get the output payload for download attachments
    Given user builds the input value for download attachments
    When  user runs the FB for download attachments
    Then  user gets the Fboutput for download attachments
    And   User validates the result using for download attachments