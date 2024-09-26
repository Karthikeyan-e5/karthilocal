@test
Feature: Smartcare Create Batch Postvalidation Cases


  @PositiveFlow
  Scenario: Verify that user provide proper output payload for smartcare create batch
    Given User builds the output for smartcare create batch
    When user runs the fboutput with sandbox mock for smartcare create batch
    Then User validates the result for smartcare create batch output

  @batchidnull
  Scenario Outline: Verify that user provide create batch output payload
    Given User builds the input for smartcare create batch output payload
      | batchId | documentTypeId | batchStatusId | encompassId | recommendFileType | batchName | uploadedDate                      | version      |
      |         | D_255          | 111           | ram         | QW12@             | tette     | 2024-08-06T04:03:55.6416775-07:00 | AAAAAAABQFI= |
    When user runs the FB with sandbox mock for smartcare create batch output payload batch it min
    Then User validates the result for smartcare create batch output payload batch it min "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                            | errorMessage                                    |
      | E5.SCHEMA.VAL.FAILED | createBatchOutputPayload.batchId | The 'batchId' value must be a string  |


  @batchidmin
  Scenario Outline: Verify that user provide proper input payload for smartcare create batch min
    Given User builds the input for smartcare create batch min
    When user runs the FB with sandbox mock for smartcare create batch min
    Then User validates the result for smartcare create batch min "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                        | errorMessage                                      |
      | E5.SCHEMA.VAL.FAILED | createBatchOutputPayload.batchId | The 'batchId' must have at least 1 character long |

  @encompassidnull
  Scenario Outline: Verify that user provide create batch output payload for encompass id null
    Given User builds the input for smartcare create batch output payload
      | batchId | documentTypeId | batchStatusId | encompassId | recommendFileType | batchName | uploadedDate                      | version      |
      | qwe     | D_255          | 111           |             | QW12@             | tette     | 2024-08-06T04:03:55.6416775-07:00 | AAAAAAABQFI= |
    When user runs the FB with sandbox mock for smartcare create batch output payload for encompass id null
    Then User validates the result for smartcare create batch output payload for encompass id null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                            | errorMessage                                    |
      | E5.SCHEMA.VAL.FAILED | createBatchOutputPayload.encompassId | The 'encompassId' value must be a string |

  @encompassmin
  Scenario Outline: Verify that user provide proper input payload for smartcare create batch encompass id min
    Given User builds the input for smartcare create batch encompass id min
    When user runs the FB with sandbox mock for smartcare create batch encompass id min
    Then User validates the result for smartcare create batch encompass id minl "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                        | errorMessage                                      |
      | E5.SCHEMA.VAL.FAILED | createBatchOutputPayload.encompassId | The 'encompassId' must have atleast 1 character long |

  @uploaddate
  Scenario Outline: Verify that user provide create batch output payload for upload date
    Given User builds the input for smartcare create batch output payload
      | batchId | documentTypeId | batchStatusId | encompassId | recommendFileType | batchName | uploadedDate                        | version      |
      | qwe     | D_255          | 111           | ram         | QW12@             | tette     | 2024-08-06T04:03:55.6416775-07ee:00 | AAAAAAABQFI= |
    When user runs the FB with sandbox mock for smartcare create batch output payload for upload date
    Then User validates the result for smartcare create batch output payload for upload date "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                            | errorMessage                                    |
      | E5.SCHEMA.VAL.FAILED | createBatchOutputPayload.uploadedDate| The 'uploadedDate' value must be in the format of 'yyyy-MM-ddTHH:mm:ss.SSSSSSS(+/-)HH:mm' |

  @batchstatusidnull
  Scenario Outline: Verify that user provide proper input payload for smartcare create batch status id null
    Given User builds the input for smartcare create batch status id null
    When user runs the FB with sandbox mock for smartcare create batch status id null
    Then User validates the result for smartcare create batch status id null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                              | errorMessage                                |
      | E5.SCHEMA.VAL.FAILED | createBatchOutputPayload.batchStatusId | The 'batchStatusId' value must be a integer |

  @batchstsidmin
  Scenario Outline: Verify that user provide create batch output payload for batch status id mim
    Given User builds the input for smartcare create batch output payload
      | batchId | documentTypeId | batchStatusId | encompassId | recommendFileType | batchName | uploadedDate                      | version      |
      | qwe     | D_255          | -1            | ram         | QW12@             | tette     | 2024-08-06T04:03:55.6416775-07:00 | AAAAAAABQFI= |
    When user runs the FB with sandbox mock for smartcare create batch output payload for batch status id mim
    Then User validates the result for smartcare create batch output payload batch for batch status id mim "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                            | errorMessage                                    |
      | E5.SCHEMA.VAL.FAILED | createBatchOutputPayload.batchStatusId | The 'batchStatusId' must be have minimum 1  |