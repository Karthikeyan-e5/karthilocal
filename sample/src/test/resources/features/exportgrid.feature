@test
Feature: export grid


  @exportgrid
  Scenario: Verify that user provide proper input payload for export grid
    Given User builds the input for export grid
    When user runs the FB with sandbox mock for export grid
    Then User validates the result for export grid

  @StageFilterIsNull
  Scenario Outline: Verify that error message is displayed when Stage filter field is null
    Given User builds the input file for Export Grid From Workflow fb when Stage filter is null
    When user runs fb using input file of add denails reason fb when Stage filter is null
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Stage filter is null
    Examples:
      | errorCode            | fieldName                                                                                    | errorMessage                 |
      | E5.SCHEMA.VAL.FAILED | exportGridFromWorkflowConsoleCriteria.workflowConsolePanelFilter.workflowConsoleStages.value | The 'value' must be a string |

