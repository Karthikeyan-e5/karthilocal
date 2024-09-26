@test
Feature: Download attachment Postvalidation Cases


  @PositiveFlow
  Scenario: Verify that user provide proper output payload for download attachment
    Given User builds the output payload for download attachment
    When user runs the FB with sandbox mock for download attachment output
    Then User validates the result for download attachment output

  @exportattachmentsnull
  Scenario Outline: Verify that user provide proper output payload for download attachment export attachment null
    Given User builds the input for download attachment export attachment null
    When user runs the FB with sandbox mock for download attachment export attachment null
    Then User validates the result for download attachment export attachment null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName           | errorMessage |
      | E5.SCHEMA.VAL.FAILED | exportedAttachments |    The 'exportedAttachments' must be a object          |

  @exportfiledetailnull
  Scenario Outline: Verify that user provide proper output payload for download attachment export file detail null
    Given User builds the input for download attachment export file detail null
    When user runs the FB with sandbox mock for download attachment export file detail null
    Then User validates the result for download attachment export file detail null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName           | errorMessage |
      | E5.SCHEMA.VAL.FAILED | exportedAttachments.exportedFileDetails |    The 'exportedFileDetails' must be a array          |

  @exportfileempty
  Scenario Outline: Verify that user provide proper output payload for download attachment export file empty
    Given User builds the input for download attachment export file empty
    When user runs the FB with sandbox mock for download attachment export file empty
    Then User validates the result for download attachment export file empty "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                               | errorMessage                                              |
      | E5.SCHEMA.VAL.FAILED | exportedAttachments.exportedFileDetails | The 'exportedFileDetails' must contain minimum one object |
  @exportnamenull
  Scenario Outline: Verify that user provide proper output payload for download attachment export name null
    Given User builds the input for download attachment export name null
    When user runs the FB with sandbox mock for download attachment export name null
    Then User validates the result for download attachment export name null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                               | errorMessage                                              |
      | E5.SCHEMA.VAL.FAILED | exportedAttachments.exportedFileDetails[0].exportedFileName | The 'exportedFileName' must be string |

  @attachmenttokennull
  Scenario Outline: Verify that user provide proper output payload for download attachment token null
    Given User builds the input for download attachment export token null
    When user runs the FB with sandbox mock for download attachment export token null
    Then User validates the result for download attachment export token null "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                               | errorMessage                                              |
      | E5.SCHEMA.VAL.FAILED | exportedAttachments.exportedFileDetails[0].exportedAttachmentToken | The 'exportedAttachmentToken' must be string |

  @exportnamemin
  Scenario Outline: Verify that user provide proper output payload for download attachment export name min
    Given User builds the input for download attachment export name min
    When user runs the FB with sandbox mock for download attachment export name min
    Then User validates the result for download attachment export name min "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                               | errorMessage                                              |
      | E5.SCHEMA.VAL.FAILED | exportedAttachments.exportedFileDetails[0].exportedFileName | The 'exportedFileName' should not be empty|

  @attachmenttokenmin
  Scenario Outline: Verify that user provide proper output payload for download attachment token min
    Given User builds the input for download attachment export token min
    When user runs the FB with sandbox mock for download attachment export token min
    Then User validates the result for download attachment export token min "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                               | errorMessage                                              |
      | E5.SCHEMA.VAL.FAILED | exportedAttachments.exportedFileDetails[0].exportedAttachmentToken | The 'exportedAttachmentToken' should not be empty |