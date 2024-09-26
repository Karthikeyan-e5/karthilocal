@test
Feature: Upload EOB Delegation With mock

  @UploaadEOBPositiveFlow
  Scenario: Verify Postive folw runs successfully in delegation with mock input and output payload
    Given User build the mock function block input payload
    And User build the function block output payload
    When User runs the for positive flow with input and output payload
    Then User validate the output for positive flow

  @UploadEOBFilesPreValidationFail
  Scenario Outline: Verify Schema validation error should thrown when prevalidation fails while uploading EOB files
    Given User build the invalid mock function block input payload
    And User build the valid function block output payload
    When User runs the Prevalidation fail senario with invalid input payload
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when file location is null
    Examples:
      | errorCode            | fieldName     | errorMessage                              |
      | E5.SCHEMA.VAL.FAILED | fileLocationEOB | The 'fileLocation' value must be a string |

  @UploadEOBFilesPostconditionFail
  Scenario Outline: Verify Schema validation error should thrown when postvalidation fails while uploading EOB files
    Given User build the valid mock function block input payloads
    And User build the  function block when EOB uploaded time is null
    When User runs the postvalidation fail senario with invalid input payload
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when EOB uploaded time  is null
    Examples:
      | errorCode            | fieldName       | errorMessage                                 |
      | E5.SCHEMA.VAL.FAILED | eobUploadedTime | The 'eobUploadedTime' value must be a string |

  @ErrorCodeValidationWhenPayloadIsEmpty
  Scenario: Verify that upload EOB files schema validation should not fail when listed fb error occurred
    Given User build the mock Upload EOB files  function block input payload
    And User build the Upload EOB files listed function block error and output payload is empty
    When User runs the Upload EOB files FB with error code and output payload is empty
    Then User validate the output for Upload EOB files when error code and output payload is empty

  @UnknownErrorCodeValidationWhenPayloadIsEmpty
  Scenario Outline: Verify Upload EOB Files that schema validation error should be thrown when unknown fb error occurred and output payload is empty
    Given User build the mock Upload EOB Files function block payload
    And User build the Upload EOB Files not listed function block error and output payload is empty
    When User runs the Upload EOB Files FB with not listed error code and output payload is empty
    Then User validate the Upload EOB Files fb output as "<expectedError>" when error code and output payload is empty
    Examples:
      | expectedError                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
      | does not have a value in the enumeration [BE_001, BE_002, BE_003, BE_004, SE_001, SE_002, SE_003, BE_005, BE_006, BE_007, SE_005, SE_006, SE_007, SE_008, SE_009, SE_010, BE_008, SE_011, SE_012, SE_013, BE_009, SE_014, BE_010, BE_011, BE_012, BE_013, BE_014, SE_015, BE_015, SE_016, BE_016, SE_017, BE_017, SE_018, BE_018, SE_019, BE_019, SE_020, BE_020, SE_022, SE_023, BE_022, BE_023, BE_024, SE_024, SE_025, BE_025, SE_026, SE_027, SE_028, BE_028, BE_029, SE_030, BE_030, SE_031, SE_032, SE_033, BE_031, SE_034, BE_033, BE_034, SE_035, SE_029] |

  @MultipleErrorCodeValidationWhenPayloadIsEmpty
  Scenario: Verify that Upload EOB files schema validation should not fail when multiple known fb error occur and output payload is empty
    Given User build the mock Upload EOB files FB payload
    And User build the Upload EOB files multiple listed function block error and output payload is empty
    When User runs the Upload EOB files FB with multiple error code and output payload is empty
    Then User validate the output for Upload EOB files when multiple listed error and output payload is empty

  @UnknownMultipleErrorCodeValidationWhenPayloadIsEmpty
  Scenario Outline: Verify that Upload EOB files schema validation error should be thrown when multiple unknown fb error occurred and payload is empty
    Given User build the mock Upload EOB files function block input
    And User build the Upload EOB files multiple not listed function block error and output payload is empty
    When User runs the Upload EOB files FB with multiple not listed error code and output payload is empty
    Then User validate the Upload EOB files fb output as "<expectedError>" when multiple not listed error code and output payload is empty
    Examples:
      | expectedError                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
      | does not have a value in the enumeration [BE_001, BE_002, BE_003, BE_004, SE_001, SE_002, SE_003, BE_005, BE_006, BE_007, SE_005, SE_006, SE_007, SE_008, SE_009, SE_010, BE_008, SE_011, SE_012, SE_013, BE_009, SE_014, BE_010, BE_011, BE_012, BE_013, BE_014, SE_015, BE_015, SE_016, BE_016, SE_017, BE_017, SE_018, BE_018, SE_019, BE_019, SE_020, BE_020, SE_022, SE_023, BE_022, BE_023, BE_024, SE_024, SE_025, BE_025, SE_026, SE_027, SE_028, BE_028, BE_029, SE_030, BE_030, SE_031, SE_032, SE_033, BE_031, SE_034, BE_033, BE_034, SE_035, SE_029] |

  @CombinationOfListedAndNotListedErrorWhenPayloadIsEmpty
  Scenario Outline: Verify that Upload EOB files schema validation error should be thrown when combination of known and unknown fb error occurred and  payload is Empty
    Given User build the mock Upload EOB files fb input
    And User build the Upload EOB files multiple listed and not listed function block error and output payload is Empty
    When User runs the Upload EOB files FB with listed and not listed multiple error code and output payload is Empty
    Then User validate the Upload EOB files fb output as "<expectedError>" when listed and not listed multiple listed error code and output payload is Empty
    Examples:
      | expectedError                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
      | does not have a value in the enumeration [BE_001, BE_002, BE_003, BE_004, SE_001, SE_002, SE_003, BE_005, BE_006, BE_007, SE_005, SE_006, SE_007, SE_008, SE_009, SE_010, BE_008, SE_011, SE_012, SE_013, BE_009, SE_014, BE_010, BE_011, BE_012, BE_013, BE_014, SE_015, BE_015, SE_016, BE_016, SE_017, BE_017, SE_018, BE_018, SE_019, BE_019, SE_020, BE_020, SE_022, SE_023, BE_022, BE_023, BE_024, SE_024, SE_025, BE_025, SE_026, SE_027, SE_028, BE_028, BE_029, SE_030, BE_030, SE_031, SE_032, SE_033, BE_031, SE_034, BE_033, BE_034, SE_035, SE_029] |