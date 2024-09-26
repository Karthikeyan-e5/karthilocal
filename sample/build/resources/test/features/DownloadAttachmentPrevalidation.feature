@test
Feature: Download attachment Prevalidation Cases


  @PositiveFlow
  Scenario: Verify that user provide proper input payload for download attachment
    Given User builds the input for download attachment
    When user runs the FB with sandbox mock for download attachment
    Then User validates the result for download attachment

  @clinicalinputgridfilternull
  Scenario Outline: Verify that user provide proper input payload for download attachment clinical input grid filter null
    Given User builds the input for download attachment clinical input grid filter null
    When user runs the FB with sandbox mock for download attachment clinical input grid filter null
    Then User validates the result for download attachment clinical input grid filter null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName | errorMessage |
      | E5.SCHEMA.VAL.FAILED |    downloadAttachmentsCriteria.clinicalInputGridFilter       | The 'clinicalInputGridFilter' is must be an object             |

  @clinicalinputpanelfilternull
  Scenario Outline: Verify that user provide proper input payload for download attachment clinical input panel filter null
    Given User builds the input for download attachment clinical input panel filter null
    When user runs the FB with sandbox mock for download attachment clinical input panel filter null
    Then User validates the result for download attachment clinical input panel filter null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName | errorMessage |
      | E5.SCHEMA.VAL.FAILED |    downloadAttachmentsCriteria.clinicalInputPanelFilter       |   The 'clinicalInputPanelFilter' is must be an object           |

  @recordinputfilternull
  Scenario Outline: Verify that user provide proper input payload for download attachment record input filter null
    Given User builds the input for download attachment record input filter null
    When user runs the FB with sandbox mock for download attachment crecord input filter null
    Then User validates the result for download attachment record input filter null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                      | errorMessage                                 |
      | E5.SCHEMA.VAL.FAILED | downloadAttachmentsBehaviors.recordInputFilter | The 'recordInputFilter' is must be an object |

  @criterianull
  Scenario Outline: Verify that user provide proper input payload for download attachment criteria null
    Given User builds the input for download attachment criteria null
    When user runs the FB with sandbox mock for download attachment criteria null
    Then User validates the result for download attachment record criteria null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName | errorMessage |
      | E5.SCHEMA.VAL.FAILED |   downloadAttachmentsCriteria        |  The 'downloadAttachmentsCriteria' value must be an object            |

  @behaviornull
  Scenario Outline: Verify that user provide proper input payload for download attachment behavior null
    Given User builds the input for download attachment behavior null
    When user runs the FB with sandbox mock for download attachment behavior null
    Then User validates the result for download attachment behavior null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName | errorMessage |
      | E5.SCHEMA.VAL.FAILED |  downloadAttachmentsBehaviors         |  The 'downloadAttachmentsBehaviors' is must be a object            |

  @soedatenull
  Scenario Outline: Verify that user provide proper input payload for download attachment soe date null
    Given User builds the input for download attachment soe date null
    When user runs the FB with sandbox mock for download attachment soe date null
    Then User validates the result for download attachment soe date null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName | errorMessage |
      | E5.SCHEMA.VAL.FAILED |   downloadAttachmentsCriteria.clinicalInputGridFilter.soeDate        |    The 'soeDate' is must be a object          |

  @soedateinvalid
  Scenario Outline: Verify that user provide proper input payload for download attachment soe date invalid
    Given User builds the input for download attachment soe date invalid
    When user runs the FB with sandbox mock for download attachment soe date invalid
    Then User validates the result for download attachment soe date invalid "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName | errorMessage |
      | E5.SCHEMA.VAL.FAILED |   downloadAttachmentsCriteria.clinicalInputGridFilter.soeDate.values[0].value       |    The 'soeDate' should be in mm/dd/yyyy format          |

  @clinicalinputnull
  Scenario Outline: Verify that user provide proper input payload for download attachment clinical input null
    Given User builds the input for download attachment clinical input null
    When user runs the FB with sandbox mock for download attachment clinical input null
    Then User validates the result for download attachment clinical input null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName | errorMessage |
      | E5.SCHEMA.VAL.FAILED |   downloadAttachmentsCriteria.clinicalInputPanelFilter.clinicalInput     |    The 'clinicalInput' is must be an object         |

  @filenamedetailarray
  Scenario Outline: Verify that user provide proper input payload for download attachment episode status min
    Given User builds the input for download attachment episode status min
    When user runs the FB with sandbox mock for download attachment episode status min
    Then User validates the result for download attachment episode status min "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                    | errorMessage                                   |
      | E5.SCHEMA.VAL.FAILED | downloadAttachmentsBehaviors.fileNameDetails |The 'fileNameDetails' must be a array |

  @commonfilternull
  Scenario Outline: Verify that user provide proper input payload for download attachment common filter null
    Given User builds the input for download attachment common filter null
    When user runs the FB with sandbox mock for download attachment common filter null
    Then User validates the result for download attachment common filter null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                                                        | errorMessage                                   |
      | E5.SCHEMA.VAL.FAILED | downloadAttachmentsCriteria.clinicalInputPanelFilter.commonFilter | The 'commonFilter' is must be an object |

  @episodestsnull
  Scenario Outline: Verify that user provide proper input payload for download attachment episode status null
    Given User builds the input for download attachment episode status null
    When user runs the FB with sandbox mock for download attachment episode status null
    Then User validates the result for download attachment episode status null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                                                        | errorMessage        |
      | E5.SCHEMA.VAL.FAILED | downloadAttachmentsCriteria.clinicalInputPanelFilter.clinicalInput.episodeStatus | The 'episodeStatus' must be a array|

  @servicelinenull
  Scenario Outline: Verify that user provide proper input payload for download attachment service line null
    Given User builds the input for download attachment service line null
    When user runs the FB with sandbox mock for download attachment service line null
    Then User validates the result for download attachment service line null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                                                      | errorMessage       |
      | E5.SCHEMA.VAL.FAILED | downloadAttachmentsCriteria.clinicalInputPanelFilter.commonFilter.serviceLines | The 'serviceLines' must be a array|

  @searchnull
  Scenario Outline: Verify that user provide proper input payload for download attachment search null
    Given User builds the input for download attachment search null
    When user runs the FB with sandbox mock for download attachment search null
    Then User validates the result for download attachment search null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                                                        | errorMessage                                   |
      | E5.SCHEMA.VAL.FAILED | downloadAttachmentsCriteria.clinicalInputPanelFilter.search | The 'search' must be object |

  @panelfilterfromdate
  Scenario Outline: Verify that user provide proper input payload for download attachment panel filter from date
    Given User builds the input for download attachment panel filter from date
    When user runs the FB with sandbox mock for download attachment panel filter from date
    Then User validates the result for download attachment panel filter from date "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                                                        | errorMessage                                   |
      | E5.SCHEMA.VAL.FAILED | downloadAttachmentsCriteria.viewPatientAttachmentsPanelFilter.additionalSearchFilters.importedOnDates.from | The 'from' should be in mm/dd/yyyy format |

  @panelfiltertodate
  Scenario Outline: Verify that user provide proper input payload for download attachment panel filter to date
    Given User builds the input for download attachment panel filter to date
    When user runs the FB with sandbox mock for download attachment panel filter to date
    Then User validates the result for download attachment panel filter to date "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                                                        | errorMessage                                   |
      | E5.SCHEMA.VAL.FAILED | downloadAttachmentsCriteria.viewPatientAttachmentsPanelFilter.additionalSearchFilters.importedOnDates.to | The 'to' should be in mm/dd/yyyy format |

  @visitfromdate
  Scenario Outline: Verify that user provide proper input payload for download attachment visit from date
    Given User builds the input for download attachment visit from date
    When user runs the FB with sandbox mock for download attachment panel visit from date
    Then User validates the result for download attachment visit from date "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                                                        | errorMessage                                   |
      | E5.SCHEMA.VAL.FAILED | downloadAttachmentsCriteria.viewPatientAttachmentsPanelFilter.searchForExistingAttachments.visitOrEffectiveDate.from | The 'from' should be in mm/dd/yyyy format |

  @visittodate
  Scenario Outline: Verify that user provide proper input payload for download attachment visit to date
    Given User builds the input for download attachment visit to date
    When user runs the FB with sandbox mock for download attachment panel visit to date
    Then User validates the result for download attachment visit to date "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                                                        | errorMessage                                   |
      | E5.SCHEMA.VAL.FAILED |downloadAttachmentsCriteria.viewPatientAttachmentsPanelFilter.searchForExistingAttachments.visitOrEffectiveDate.to | The 'to' should be in mm/dd/yyyy format |

  @importeddateinvalid
  Scenario Outline: Verify that user provide proper input payload for download attachment imported date invalid
    Given User builds the input for download attachment imported date invalid
    When user runs the FB with sandbox mock for download attachment panel imported date invalid
    Then User validates the result for download attachment imported date invalid "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                                                        | errorMessage                                   |
      | E5.SCHEMA.VAL.FAILED |downloadAttachmentsCriteria.viewPatientAttachmentsGridFilter.importedOn.values[0].value | The 'importedOn' should be in mm/dd/yyyy hr:min:sec AM/PM |

  @recordinputnull
  Scenario Outline: Verify that user provide proper input payload for download attachment record input null
    Given User builds the input for download attachment record input null
    When user runs the FB with sandbox mock for download attachment panel record input null
    Then User validates the result for download attachment record input null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                                                        | errorMessage                                   |
      | E5.SCHEMA.VAL.FAILED |downloadAttachmentsBehaviors.recordInputFilter | The 'recordInputFilter' is must be an object |

  @reqfilemin
  Scenario Outline: Verify that user provide proper input payload for download attachment record input min
    Given User builds the input for download attachment record input min
    When user runs the FB with sandbox mock for download attachment panel record input min
    Then User validates the result for download attachment record input min "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                      | errorMessage                                                                |
      | E5.SCHEMA.VAL.FAILED | downloadAttachmentsBehaviors.recordInputFilter.attachmentType | The 'attachmentType' must be one of: PATIENT_ATTACHMENT, EPISODE_ATTACHMENT |
  @mrcheck
  Scenario Outline: Verify that user provide proper input payload for download attachment mrn null
    Given User builds the input for download attachment mrn null
    When user runs the FB with sandbox mock for download attachment mrn null
    Then User validates the result for download attachment mrn null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                                             | errorMessage                      |
      | E5.SCHEMA.VAL.FAILED | downloadAttachmentsCriteria.clinicalInputPanelFilter.search.episodeId | The 'episodeId' should allow only numbers|

  @mrcheck1
  Scenario Outline: Verify that user provide proper input payload for download attachment mrn null
    Given User builds the input for download attachment mrn null
    When user runs the FB with sandbox mock for download attachment mrn null
    Then User validates the result for download attachment mrno null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                                             | errorMessage                   |
      | E5.SCHEMA.VAL.FAILED | downloadAttachmentsCriteria.clinicalInputPanelFilter.search.mrNo | The 'mrNo' should be null |

  @soedatenullvalue
  Scenario Outline: Verify that user provide proper input payload for download attachment soe date null value
    Given User builds the input for download attachment soe date null value
    When user runs the FB with sandbox mock for download attachment soe date null value
    Then User validates the result for download attachment soe date null value "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                                             | errorMessage                   |
      | E5.SCHEMA.VAL.FAILED | downloadAttachmentsCriteria.clinicalInputGridFilter.soeDate.values | The 'values' should not be empty |
  @filenameno
  Scenario Outline: Verify that user provide proper input payload for download attachment file name no
    Given User builds the input for download attachment file name no
    When user runs the FB with sandbox mock for download attachment file name no
    Then User validates the result for download attachment file name no "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                                             | errorMessage                   |
      | E5.SCHEMA.VAL.FAILED | downloadAttachmentsBehaviors.fileNameDetails|The 'fileNameDetails' list should be empty |
  @filename
  Scenario Outline: Verify that user provide proper input payload for download attachment file name
    Given User builds the input for download attachment file name
    When user runs the FB with sandbox mock for download attachment file name
    Then User validates the result for download attachment file name "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                                             | errorMessage                   |
      | E5.SCHEMA.VAL.FAILED | downloadAttachmentsBehaviors.fileNameDetails|The 'fileNameDetails' list should not be empty |

