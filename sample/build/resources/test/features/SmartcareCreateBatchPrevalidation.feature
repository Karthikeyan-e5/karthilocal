@test
Feature: Smartcare Create Batch Prevalidation Cases


  @PositiveFlow
  Scenario: Verify that user provide proper input payload for smartcare create batch
    Given User builds the input for smartcare create batch
    When user runs the FB with sandbox mock for smartcare create batch
    Then User validates the result for smartcare create batch

  @Clientvaluezero
  Scenario Outline: Verify that user provide client value zero for smartcare create batch
    Given User builds the input for smartcare create batch for clientvalue zero
      | clientId | facilityCode | firstName | lastName | episodeId | recordDate               |
      | -1       | qqq          | karthi    | ram      | 111       | 2023-01-06T00:00:00.000Z |
    When user runs the FB with sandbox mock for smartcare create batch for clientvalue zero
    Then User validates the result for smartcare create batch for clientvalue zero "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                            | errorMessage                                    |
      | E5.SCHEMA.VAL.FAILED | createBatchCriteria.createBatchInputPayload.clientId | The 'clientId' must have minimum value of 0 |


  @clientidmustbeint
  Scenario Outline: Verify that user provide proper input payload for smartcare create batch client id must be string
    Given User builds the input for smartcare create batch client id must be string
    When user runs the FB with sandbox mock for smartcare create batch client id must be string
    Then User validates the result for smartcare create batch for client id must be string "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                            | errorMessage                                    |
      | E5.SCHEMA.VAL.FAILED | createBatchCriteria.createBatchInputPayload.clientId | The 'clientId' values must be a integer |

  @facilitycodemustbestring
  Scenario Outline: Verify that user provide client value zero for smartcare create batch for facility code must be string
    Given User builds the input for smartcare create batch for clientvalue zero
      | clientId | facilityCode | firstName | lastName | episodeId | recordDate               |
      | 1        |              | karthi    | ram      | 12        | 2023-01-06T00:00:00.000Z |
    When user runs the FB with sandbox mock for smartcare create batch facility code must be string
    Then User validates the result for smartcare create batch facility code must be string "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                            | errorMessage                                    |
      | E5.SCHEMA.VAL.FAILED | createBatchCriteria.createBatchInputPayload.facilityCode | The 'facilityCode' values must be a string |

  @facilitycodemin
  Scenario Outline: Verify that user provide proper input payload for smartcare create batch facility code min char
    Given User builds the input for smartcare create batch facility code min char
    When user runs the FB with sandbox mock for smartcare create batch facility code min char
    Then User validates the result for smartcare create batch for facility code min char "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                                | errorMessage                                            |
      | E5.SCHEMA.VAL.FAILED | createBatchCriteria.createBatchInputPayload.facilityCode | The 'facilityCode' must have at least 3 characters long |

  @firstnamemustbestr
  Scenario Outline: Verify that user provide client value zero for smartcare create batch for first name must be string
    Given User builds the input for smartcare create batch for clientvalue zero
      | clientId | facilityCode | firstName | lastName | episodeId | recordDate               |
      | 1        | qww          |           | ram      | 12        | 2023-01-06T00:00:00.000Z |
    When user runs the FB with sandbox mock for smartcare create batch first name must be string
    Then User validates the result for smartcare create batch first name must be string "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                            | errorMessage                                    |
      | E5.SCHEMA.VAL.FAILED | createBatchCriteria.createBatchInputPayload.firstName | The 'firstName' values must be a string |

  @firstnamemin
  Scenario Outline: Verify that user provide proper input payload for smartcare create batch first name min char
    Given User builds the input for smartcare create batch first name min char
    When user runs the FB with sandbox mock for smartcare create batch first name min char
    Then User validates the result for smartcare create batch for first name min char "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName | errorMessage                                       |
      | E5.SCHEMA.VAL.FAILED | createBatchCriteria.createBatchInputPayload.firstName          | The 'firstName' must have at least 1 character long |

  @lastnamemustbestr
  Scenario Outline: Verify that user provide client value zero for smartcare create batch for last name must be string
    Given User builds the input for smartcare create batch for clientvalue zero
      | clientId | facilityCode | firstName | lastName | episodeId | recordDate               |
      | 1        | qww          | karthi    |          | 12        | 2023-01-06T00:00:00.000Z |
    When user runs the FB with sandbox mock for smartcare create batch last name must be string
    Then User validates the result for smartcare create batch last name must be string "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                            | errorMessage                           |
      | E5.SCHEMA.VAL.FAILED | createBatchCriteria.createBatchInputPayload.lastName | The 'lastName' values must be a string |

  @lastnamemin
  Scenario Outline: Verify that user provide proper input payload for smartcare create batch last name min char
    Given User builds the input for smartcare create batch last name min char
    When user runs the FB with sandbox mock for smartcare create batch last name min char
    Then User validates the result for smartcare create batch for last name min char "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                            | errorMessage                                       |
      | E5.SCHEMA.VAL.FAILED | createBatchCriteria.createBatchInputPayload.lastName | The 'lastName' must have at least 1 character long |


  @episodeIdmin
  Scenario Outline: Verify that user provide proper input payload for smartcare create batch patient id min char
    Given User builds the input for smartcare create batch patient id min char
    When user runs the FB with sandbox mock for smartcare create batch patient id min char
    Then User validates the result for smartcare create batch for patient id min char "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                             | errorMessage                                 |
      | E5.SCHEMA.VAL.FAILED | createBatchCriteria.createBatchInputPayload.episodeId | The 'episodeId' must have minimum value of 0 |

  @recorddatenull
  Scenario Outline: Verify that user provide client value zero for smartcare create batch for record date null
    Given User builds the input for smartcare create batch for clientvalue zero
      | clientId | facilityCode | firstName | lastName | episodeId | recordDate |
      | 1        | qww          | karthi    | ram      | 1         |            |
    When user runs the FB with sandbox mock for smartcare create batch record date null
    Then User validates the result for smartcare create batch record date null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                              | errorMessage                             |
      | E5.SCHEMA.VAL.FAILED | createBatchCriteria.createBatchInputPayload.recordDate | The 'recordDate' values must be a string |

  @recorddateinvalid
  Scenario Outline: Verify that user provide client value zero for smartcare create batch for record date invalid
    Given User builds the input for smartcare create batch for clientvalue zero
      | clientId | facilityCode | firstName | lastName | episodeId | recordDate               |
      | 1        | qww          | karthi    | ram      | 1         | 23-01-2006T00:00:00.000Z |
    When user runs the FB with sandbox mock for smartcare create batch record date invalid
    Then User validates the result for smartcare create batch record date invalid "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                              | errorMessage |
      | E5.SCHEMA.VAL.FAILED | createBatchCriteria.createBatchInputPayload.recordDate | The 'recordDate' should be in 'yyyy-mm-ddTHH:MM:SS.000Z' format             |

  @recorddatemin
  Scenario Outline: Verify that user provide proper input payload for smartcare create batch record date min char
    Given User builds the input for smartcare create batch record date min char
    When user runs the FB with sandbox mock for smartcare create batch record date min char
    Then User validates the result for smartcare create batch for record date min char "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                              | errorMessage                                         |
      | E5.SCHEMA.VAL.FAILED | createBatchCriteria.createBatchInputPayload.recordDate | The 'recordDate' must have at least 1 character long |

  @createbatchinput
  Scenario Outline: Verify that user provide proper input payload for smartcare create batch input null
    Given User builds the input for smartcare create batch input null
    When user runs the FB with sandbox mock for smartcare create batch input null
    Then User validates the result for smartcare create batch input null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                            | errorMessage                                    |
      | E5.SCHEMA.VAL.FAILED | createBatchCriteria.createBatchInputPayload | The 'createBatchInputPayload' values must be a object |

  @criteriainput
  Scenario Outline: Verify that user provide proper input payload for smartcare create batch criteria null
    Given User builds the input for smartcare create batch criteria null
    When user runs the FB with sandbox mock for smartcare create batch criteria null
    Then User validates the result for smartcare create batch criteria null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName           | errorMessage                              |
      | E5.SCHEMA.VAL.FAILED | createBatchCriteria | The createBatchCriteria must be an object |

  @facilitycodemorethan3
  Scenario Outline: Verify that user provide client value zero for smartcare create batch for facility code must be string
    Given User builds the input for smartcare create batch for clientvalue zero
      | clientId | facilityCode | firstName | lastName | episodeId | recordDate               |
      | 1        | qw11         | karthi    | ram      | 12        | 2023-01-06T00:00:00.000Z |
    When user runs the FB with sandbox mock for smartcare create batch facility code must be more than three char
    Then User validates the result for smartcare create batch facility must be more than three char "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                            | errorMessage                                    |
      | E5.SCHEMA.VAL.FAILED | createBatchCriteria.createBatchInputPayload.facilityCode | The 'facilityCode' must have at most 3 characters long |

  @episodeIdmustbeint
  Scenario Outline: Verify that user provide proper input payload for smartcare create batch patient id must be int
    Given User builds the input for smartcare create batch patient id must be int
    When user runs the FB with sandbox mock for smartcare create batch patient id must be int
    Then User validates the result for smartcare create batch for patient id must be int "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                             | errorMessage                                 |
      | E5.SCHEMA.VAL.FAILED | createBatchCriteria.createBatchInputPayload.episodeId | The 'episodeId' values must be a integer |