@test
Feature: Smartcare CreateBatch Delegation With mock

  @CreateBatchPositiveFlow
  Scenario: Verify Postive folw runs successfully in delegation with mock input and output payload for create batch
    Given User build the mock function block input payload for create batch
    And User build the function block output payload for create batch
    When User runs the for positive flow with input and output payload for create batch
    Then User validate the output for positive flow for create batch

  @CreateBatchPreValidationFail
  Scenario Outline: Verify Schema validation error should thrown when prevalidation fails for create batch
    Given User build the invalid mock function block input payload for create batch
    And User build the valid function block output payload for create batch
    When User runs the Prevalidation fail senario with invalid input payload for create batch
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when client id null
    Examples:
      | errorCode            | fieldName                                              | errorMessage                            |
      | E5.SCHEMA.VAL.FAILED | createBatchCriteria.createBatchInputPayload.clientId | The 'clientId' values must be a integer |

  @CreateBatchPostValidationFail
  Scenario Outline: Verify Schema validation error should thrown when postvalidation fails for create batch
    Given User build the valid mock function block input payload for create batch
    And User build the invalid function block output payload for create batch
    When User runs the Post validation fail senario with invalid input payload for create batch
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when encompass id null
    Examples:
      | errorCode            | fieldName                                              | errorMessage                            |
      | E5.SCHEMA.VAL.FAILED | createBatchOutputPayload.encompassId | The 'encompassId' value must be a string |
    

  @UnknownErrorCodeSmartcareCreateBatch
  Scenario Outline: Verify Smartcare Create Batch Files that schema validation error should be thrown when unknown fb error occurred and output payload is empty
    Given User build the mock Smartcare Create Batch Files function block payload
    And User build the Smartcare Create Batch Files not listed function block error and output payload is empty
    When User runs the Smartcare Create Batch Files FB with not listed error code and output payload is empty
    Then User validate the Smartcare Create Batch Files fb output as "<expectedError>" when error code and output payload is empty
    Examples:
      | expectedError                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
      | does not have a value in the enumeration [BE_001, BE_002, BE_003, BE_004, BE_005, BE_006, BE_007, BE_008, BE_009, BE_010, BE_011, BE_012, BE_013, BE_014, BE_015, BE_016, BE_017, BE_018, BE_019, BE_020, BE_021, BE_022, BE_023, BE_024, BE_025, BE_026, BE_027, BE_028, BE_029, BE_030, BE_031, BE_032, BE_033, BE_034, BE_035, SE_001, SE_002, SE_003, SE_004] |

  @MultipleErrorCodeValidationSmartcareCreateBatch
  Scenario: Verify that Smartcare Create Batch files schema validation should not fail when multiple known fb error occur and output payload is empty
    Given User build the mock Smartcare Create Batch files FB payload
    And User build the Smartcare Create Batch files multiple listed function block error and output payload is empty
    When User runs the Smartcare Create Batch files FB with multiple error code and output payload is empty
    Then User validate the output for Smartcare Create Batch files when multiple listed error and output payload is empty

  @KnownErrorCodeValidationSmartcareCreateBatch
  Scenario: Verify that Smartcare Create Batch files schema validation should not fail when e known fb error occur and output payload is empty
    Given User build the mock Smartcare Create Batch files FB payload for known single error
    And User build the Smartcare Create Batch files multiple listed function block error and output payload is empty for known single error
    When User runs the Smartcare Create Batch files FB with multiple error code and output payload is empty for known single error
    Then User validate the output for Smartcare Create Batch files when multiple listed error and output payload is empty for known single error

  @UnknownMultipleErrorCodeValidationSmartcareCreateBatch
  Scenario Outline: Verify that Smartcare Create Batch files schema validation error should be thrown when multiple unknown fb error occurred and payload is empty
    Given User build the mock Smartcare Create Batch files function block input
    And User build the Smartcare Create Batch files multiple not listed function block error and output payload is empty
    When User runs the Smartcare Create Batch files FB with multiple not listed error code and output payload is empty
    Then User validate the Smartcare Create Batch files fb output as "<expectedError>" when multiple not listed error code and output payload is empty
    Examples:
      | expectedError                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
      | does not have a value in the enumeration [BE_001, BE_002, BE_003, BE_004, BE_005, BE_006, BE_007, BE_008, BE_009, BE_010, BE_011, BE_012, BE_013, BE_014, BE_015, BE_016, BE_017, BE_018, BE_019, BE_020, BE_021, BE_022, BE_023, BE_024, BE_025, BE_026, BE_027, BE_028, BE_029, BE_030, BE_031, BE_032, BE_033, BE_034, BE_035, SE_001, SE_002, SE_003, SE_004] |

  @CombinationOfListedAndNotListedErrorSmartcareCreateBatch
  Scenario Outline: Verify that Smartcare Create Batch files schema validation error should be thrown when combination of known and unknown fb error occurred and  payload is Empty
    Given User build the mock Smartcare Create Batch files fb input
    And User build the Smartcare Create Batch files multiple listed and not listed function block error and output payload is Empty
    When User runs the Smartcare Create Batch files FB with listed and not listed multiple error code and output payload is Empty
    Then User validate the Smartcare Create Batch files fb output as "<expectedError>" when listed and not listed multiple listed error code and output payload is Empty
    Examples:
      | expectedError                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
      | does not have a value in the enumeration [BE_001, BE_002, BE_003, BE_004, BE_005, BE_006, BE_007, BE_008, BE_009, BE_010, BE_011, BE_012, BE_013, BE_014, BE_015, BE_016, BE_017, BE_018, BE_019, BE_020, BE_021, BE_022, BE_023, BE_024, BE_025, BE_026, BE_027, BE_028, BE_029, BE_030, BE_031, BE_032, BE_033, BE_034, BE_035, SE_001, SE_002, SE_003, SE_004] |