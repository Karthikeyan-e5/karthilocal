@test
Feature: Sample test


@test1
Scenario: Verify that user provide proper input payload with mock output  using primary payer
    Given User builds the input
    When user builds the mock response
    Then user runs the FB with sandbox mock
    And User validates the result

@test2
Scenario: Verify that user provide proper input payload & Get the output payload
    Given user builds the input value
    When  user runs the FB
    Then  user gets the Fboutput
    And   User validates the resul using Fboutput value

    @triggeranexport
    Scenario: Verify that user provide proper input payload & Get the output payload for trigger an export
        Given user builds the input value for trigger an export
        When  user runs the FB for trigger
        Then  user gets the Fboutput for trigger
        And   User validates the result using trigger

    @Downloadpaymentfile
    Scenario: Verify that user provide proper input payload & Get the output payload for download payment
        Given user builds the input value for download payment
        When  user runs the FB for download payment
        Then  user gets the Fboutput for download payment
        And   User validates the result download payment

    @Getallpayment
    Scenario: Verify that user provide proper input payload & Get the output payload for get all payment
        Given user builds the input value for get all payment
        When  user runs the FB for download get all payment
        Then  user gets the Fboutput for get all payment
        And   User validates the result get all payment


#        //UPLOAD EOB
    @Upload835
    Scenario: Verify that user provide proper input payload & Get the output payload for upload eight
        Given user builds the input value for upload eight
        When  user runs the FB for download for upload eight
        Then  user gets the Fboutput for upload eight
        And   User validates the result for upload eight
#UPLOAD 835
    @Upload
    Scenario: Verify that user provide proper input payload & Get the output payload for upload
        Given user builds the input value for upload
        When  user runs the FB for download for upload
        Then  user gets the Fboutput for upload
        And   User validates the result for upload

#ExtractNoe
    @Extractnoe
    Scenario: Verify that user provide proper input payload & Get the output payload for extractnoe
        Given user builds the input value for extractnoe
        When  user runs the FB for download for extractnoe
        Then  user gets the Fboutput for extractnoe
        And   User validates the result for extractnoe

        #AddNoe
    @Addnoe
    Scenario: Verify that user provide proper input payload & Get the output payload for Addnoe
        Given user builds the input value for Addnoe
        When  user runs the FB for download for Addnoe
        Then  user gets the Fboutput for Addnoe
        And   User validates the result for Addnoe

           #submit
    @submitnoe
    Scenario: Verify that user provide proper input payload & Get the output payload for Submitnoe
        Given user builds the input value for Submitnoe
        When  user runs the FB for download for Submitnoe
        Then  user gets the Fboutput for Submitnoe
        And   User validates the result for Submitnoe


    @Notr
    Scenario: Verify that user provide proper input payload & Get the output payload for notr
        Given user builds the input value for notr
        When  user runs the FB for download for notr
        Then  user gets the Fboutput for notr
        And   User validates the result for notr

    @DownloadFile
    Scenario: Verify that user provide proper input payload & Get the output payload for downloadfile
        Given user builds the input value for downloadfile
        When  user runs the FB for download for downloadfile
        Then  user gets the Fboutput for downloadfile
        And   User validates the result for downloadfile

    @MoveFile
    Scenario: Verify that user provide proper input payload & Get the output payload for Movefile
        Given user builds the input value for Movefile
        When  user runs the FB for download for Movefile
        Then  user gets the Fboutput for Movefile
        And   User validates the result for Movefile

    @Noa
    Scenario: Verify that user provide proper input payload & Get the output payload for noa
        Given user builds the input value for noa
        When  user runs the FB for download for noa
        Then  user gets the Fboutput for noa
        And   User validates the result for noa

    @Denials
    Scenario: Verify that user provide proper input payload & Get the output payload for Denials
        Given user builds the input value for denials
        When  user runs the FB for download for denials
        Then  user gets the Fboutput for denials
        And   User validates the result for denials