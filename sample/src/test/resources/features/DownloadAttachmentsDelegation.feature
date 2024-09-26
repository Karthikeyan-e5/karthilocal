@test
Feature: Download Attachments Delegation With mock

  @DownloadAttachmentsPositiveFlow
  Scenario: Verify Postive folw runs successfully in delegation with mock input and output payload for Download attachments
    Given User build the mock function block input payload for Download attachments
    And User build the function block output payload for Download attachments
    When User runs the for positive flow with input and output payload for Download attachments
    Then User validate the output for positive flow for Download attachments

  @DownloadAttachmentsPreValidationFail
  Scenario Outline: Verify Schema validation error should thrown when prevalidation fails for Download attachments
    Given User build the invalid mock function block input payload for Download attachments
    And User build the valid function block output payload for Download attachments
    When User runs the Prevalidation fail senario with invalid input payload for Download attachments
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when episode id null
    Examples:
      | errorCode            | fieldName                                                             | errorMessage                     |
      | E5.SCHEMA.VAL.FAILED | downloadAttachmentsCriteria.clinicalInputPanelFilter.search.episodeId | The 'episodeId' should be string |


  @DownloadAttachmentsPostValidationFail
  Scenario Outline: Verify Schema validation error should thrown when postvalidation fails for Download attachments
    Given User build the valid mock function block input payload for Download attachments
    And User build the invalid function block output payload for Download attachments
    When User runs the Post validation fail senario with invalid output payload for Download attachments
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when export file details null
    Examples:
      | errorCode            | fieldName | errorMessage                              |
      | E5.SCHEMA.VAL.FAILED | exportedAttachments.exportedFileDetails          | The 'exportedFileDetails' must be a array |


  @UnknownErrorCodeSmartcareDownloadAttachments
  Scenario Outline: Verify DownloadAttachments Files that schema validation error should be thrown when unknown fb error occurred and output payload is empty
    Given User build the mock DownloadAttachments Files function block payload
    And User build the DownloadAttachments Files not listed function block error and output payload is empty
    When User runs the DownloadAttachments Files FB with not listed error code and output payload is empty
    Then User validate the DownloadAttachments Files fb output as "<expectedError>" when error code and output payload is empty
    Examples:
      | expectedError |
      |does not have a value in the enumeration [BE_000, BE_001, BE_002, BE_003, BE_004, BE_005, BE_006, BE_007, BE_008, BE_009, BE_010, BE_011, BE_012, BE_013, BE_014, BE_015, BE_016, BE_017, BE_018, BE_019, BE_020, BE_021, BE_022, BE_023, BE_024, BE_025, BE_026, BE_027, BE_028, BE_029, BE_030, BE_031, SE_002, SE_003, SE_004, SE_005, SE_006, SE_007, SE_008, SE_009, SE_010, SE_011, SE_012, SE_013, SE_014, SE_015, SE_016, SE_017, SE_018, SE_019, SE_020, SE_021, SE_022, SE_023, SE_024, SE_025, SE_026, SE_027, SE_028, SE_029, SE_030, SE_031, SE_032, SE_033, SE_034, SE_035, SE_036, SE_037, SE_038, SE_039, SE_040, SE_041, SE_042, SE_043, SE_044, SE_045, SE_046, SE_047, SE_048, SE_049, SE_050, SE_051, SE_052, SE_053, SE_054, SE_060, SE_061, SE_062, SE_063, SE_064, SE_065, SE_066, SE_067, SE_068, SE_069, SE_070, SE_071, SE_072]               |

  @MultipleErrorCodeValidationSmartcareDownloadAttachments
  Scenario: Verify that DownloadAttachments files schema validation should not fail when multiple known fb error occur and output payload is empty
    Given User build the mock DownloadAttachments files FB payload
    And User build the DownloadAttachments files multiple listed function block error and output payload is empty
    When User runs the DownloadAttachments files FB with multiple error code and output payload is empty
    Then User validate the output for DownloadAttachments files when multiple listed error and output payload is empty

  @KnownErrorCodeValidationSmartcareDownloadAttachments
  Scenario: Verify that DownloadAttachments files schema validation should not fail when e known fb error occur and output payload is empty
    Given User build the mock DownloadAttachments files FB payload for known single error
    And User build the DownloadAttachments files multiple listed function block error and output payload is empty for known single error
    When User runs the DownloadAttachments files FB with multiple error code and output payload is empty for known single error
    Then User validate the output for DownloadAttachments files when multiple listed error and output payload is empty for known single error

  @UnknownMultipleErrorCodeValidationSmartcareDownloadAttachments
  Scenario Outline: Verify that DownloadAttachments files schema validation error should be thrown when multiple unknown fb error occurred and payload is empty
    Given User build the mock DownloadAttachments files function block input
    And User build the DownloadAttachments files multiple not listed function block error and output payload is empty
    When User runs the DownloadAttachments files FB with multiple not listed error code and output payload is empty
    Then User validate the DownloadAttachments files fb output as "<expectedError>" when multiple not listed error code and output payload is empty
    Examples:
      | expectedError                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
      | does not have a value in the enumeration [BE_000, BE_001, BE_002, BE_003, BE_004, BE_005, BE_006, BE_007, BE_008, BE_009, BE_010, BE_011, BE_012, BE_013, BE_014, BE_015, BE_016, BE_017, BE_018, BE_019, BE_020, BE_021, BE_022, BE_023, BE_024, BE_025, BE_026, BE_027, BE_028, BE_029, BE_030, BE_031, SE_002, SE_003, SE_004, SE_005, SE_006, SE_007, SE_008, SE_009, SE_010, SE_011, SE_012, SE_013, SE_014, SE_015, SE_016, SE_017, SE_018, SE_019, SE_020, SE_021, SE_022, SE_023, SE_024, SE_025, SE_026, SE_027, SE_028, SE_029, SE_030, SE_031, SE_032, SE_033, SE_034, SE_035, SE_036, SE_037, SE_038, SE_039, SE_040, SE_041, SE_042, SE_043, SE_044, SE_045, SE_046, SE_047, SE_048, SE_049, SE_050, SE_051, SE_052, SE_053, SE_054, SE_060, SE_061, SE_062, SE_063, SE_064, SE_065, SE_066, SE_067, SE_068, SE_069, SE_070, SE_071, SE_072]               |

  @CombinationOfListedAndNotListedErrorSmartcareDownloadAttachments
  Scenario Outline: Verify that DownloadAttachments files schema validation error should be thrown when combination of known and unknown fb error occurred and  payload is Empty
    Given User build the mock DownloadAttachments files fb input
    And User build the DownloadAttachments files multiple listed and not listed function block error and output payload is Empty
    When User runs the DownloadAttachments files FB with listed and not listed multiple error code and output payload is Empty
    Then User validate the DownloadAttachments files fb output as "<expectedError>" when listed and not listed multiple listed error code and output payload is Empty
    Examples:
      | expectedError                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
      | does not have a value in the enumeration [BE_000, BE_001, BE_002, BE_003, BE_004, BE_005, BE_006, BE_007, BE_008, BE_009, BE_010, BE_011, BE_012, BE_013, BE_014, BE_015, BE_016, BE_017, BE_018, BE_019, BE_020, BE_021, BE_022, BE_023, BE_024, BE_025, BE_026, BE_027, BE_028, BE_029, BE_030, BE_031, SE_002, SE_003, SE_004, SE_005, SE_006, SE_007, SE_008, SE_009, SE_010, SE_011, SE_012, SE_013, SE_014, SE_015, SE_016, SE_017, SE_018, SE_019, SE_020, SE_021, SE_022, SE_023, SE_024, SE_025, SE_026, SE_027, SE_028, SE_029, SE_030, SE_031, SE_032, SE_033, SE_034, SE_035, SE_036, SE_037, SE_038, SE_039, SE_040, SE_041, SE_042, SE_043, SE_044, SE_045, SE_046, SE_047, SE_048, SE_049, SE_050, SE_051, SE_052, SE_053, SE_054, SE_060, SE_061, SE_062, SE_063, SE_064, SE_065, SE_066, SE_067, SE_068, SE_069, SE_070, SE_071, SE_072]               |