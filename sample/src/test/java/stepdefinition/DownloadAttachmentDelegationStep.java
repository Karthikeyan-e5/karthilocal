package stepdefinition;

import Payload.DownloadAttachmentsDelegation;
import com.e5.platform.core.domains.FunctionBlockSandboxResponse;
import com.e5.platform.core.event.PayloadError;
import com.e5.platform.core.executionblock.functionblock.domain.FBStatus;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOutput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import e5.hchb.functionblock.generated.DownloadAttachmentsFB;
import e5.hchb.model.downloadattachmentsfb.DownloadAttachmentsFBInputPayload;
import e5.hchb.model.downloadattachmentsfb.DownloadAttachmentsFBOutputPayload;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class DownloadAttachmentDelegationStep extends DownloadAttachmentsDelegation {
    FunctionBlockInput<Object> fbInput;
    List<PayloadError> errors;
    FunctionBlockOutput<Object> fbOutput;

    FunctionBlockSandbox sandbox;
    FunctionBlockSandboxResponse functionBlockSandboxResponse;
    FunctionBlockOutput functionBlockOutput;
    @Given("User build the mock function block input payload for Download attachments")
    public void user_build_the_mock_function_block_input_payload_for_download_attachments() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveFlow())
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the function block output payload for Download attachments")
    public void user_build_the_function_block_output_payload_for_download_attachments() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(outputpositiveFlow())
                .status(FBStatus.E5_FB_SUCCESS)
               .errors(new ArrayList<>())
                .blockName("DownloadAttachmentsFB")
                .payloadType(DownloadAttachmentsFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }
    @When("User runs the for positive flow with input and output payload for Download attachments")
    public void user_runs_the_for_positive_flow_with_input_and_output_payload_for_download_attachments() {
        sandbox = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        System.out.println("Error is "+functionBlockOutput.getErrors());
    }
    @Then("User validate the output for positive flow for Download attachments")
    public void user_validate_the_output_for_positive_flow_for_download_attachments() {
        Assert.assertEquals(fbOutput, functionBlockOutput);
    }
    @Given("User build the invalid mock function block input payload for Download attachments")
    public void user_build_the_invalid_mock_function_block_input_payload_for_download_attachments() {
        fbInput = FunctionBlockInput.builder()
                .payload(invalidInput())
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the valid function block output payload for Download attachments")
    public void user_build_the_valid_function_block_output_payload_for_download_attachments() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(outputpositiveFlow())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(new ArrayList<>())
                .blockName("DownloadAttachmentsFB")
                .payloadType(DownloadAttachmentsFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }
    @When("User runs the Prevalidation fail senario with invalid input payload for Download attachments")
    public void user_runs_the_prevalidation_fail_senario_with_invalid_input_payload_for_download_attachments() {
        sandbox = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the output as {string},{string} and {string} when episode id null")
    public void user_validate_the_output_as_and_when_episode_id_null(String errorCode, String fieldName, String errorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(actualErrorCode, errorCode);
        Assert.assertEquals(actualFieldName, fieldName);
        Assert.assertEquals(actualErrorMessage, errorMessage);
    }
    @Given("User build the valid mock function block input payload for Download attachments")
    public void user_build_the_valid_mock_function_block_input_payload_for_download_attachments() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveFlow())
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the invalid function block output payload for Download attachments")
    public void user_build_the_invalid_function_block_output_payload_for_download_attachments() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(invalidOutput())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(new ArrayList<>())
                .blockName("DownloadAttachmentsFB")
                .payloadType(DownloadAttachmentsFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }
    @When("User runs the Post validation fail senario with invalid output payload for Download attachments")
    public void user_runs_the_post_validation_fail_senario_with_invalid_output_payload_for_download_attachments() {
        sandbox = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the output as {string},{string} and {string} when export file details null")
    public void user_validate_the_output_as_and_when_export_file_details_null(String errorCode, String fieldName, String errorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(actualErrorCode, errorCode);
        Assert.assertEquals(actualFieldName, fieldName);
        Assert.assertEquals(actualErrorMessage, errorMessage);
    }
    @Given("User build the mock DownloadAttachments Files function block payload")
    public void user_build_the_mock_download_attachments_files_function_block_payload() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveFlow())
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the DownloadAttachments Files not listed function block error and output payload is empty")
    public void user_build_the_download_attachments_files_not_listed_function_block_error_and_output_payload_is_empty() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(empty())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(unknownError())
                .blockName("DownloadAttachmentsFB")
                .payloadType(DownloadAttachmentsFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }
    @When("User runs the DownloadAttachments Files FB with not listed error code and output payload is empty")
    public void user_runs_the_download_attachments_files_fb_with_not_listed_error_code_and_output_payload_is_empty() {
        sandbox = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the DownloadAttachments Files fb output as {string} when error code and output payload is empty")
    public void user_validate_the_download_attachments_files_fb_output_as_when_error_code_and_output_payload_is_empty(String expectedError) {
        List<PayloadError> listOfErrors= functionBlockOutput.getErrors();
        System.out.println();
        for (PayloadError errors:listOfErrors
        ) {
            if (errors.getErrorCode().equals("E5.SCHEMA.VAL.FAILED")){
                Assert.assertEquals(expectedError,errors.getErrorMessage());
                break;
            }
            System.out.println(">>>>>>>"+errors);
        }
    }
    @Given("User build the mock DownloadAttachments files FB payload")
    public void user_build_the_mock_download_attachments_files_fb_payload() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveFlow())
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the DownloadAttachments files multiple listed function block error and output payload is empty")
    public void user_build_the_download_attachments_files_multiple_listed_function_block_error_and_output_payload_is_empty() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(empty())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(MultipleError())
                .blockName("DownloadAttachmentsFB")
                .payloadType(DownloadAttachmentsFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }
    @When("User runs the DownloadAttachments files FB with multiple error code and output payload is empty")
    public void user_runs_the_download_attachments_files_fb_with_multiple_error_code_and_output_payload_is_empty() {
        sandbox = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the output for DownloadAttachments files when multiple listed error and output payload is empty")
    public void user_validate_the_output_for_download_attachments_files_when_multiple_listed_error_and_output_payload_is_empty() {
        List<PayloadError> listOfErrors= functionBlockOutput.getErrors();
        System.out.println();
        for (PayloadError errors:listOfErrors
        ) {
            if (errors.getErrorCode().equals("E5.SCHEMA.VAL.FAILED")){
                throw new RuntimeException("Failed");
            }
            System.out.println(">>>>>>>"+errors);
        }
    }
    @Given("User build the mock DownloadAttachments files FB payload for known single error")
    public void user_build_the_mock_download_attachments_files_fb_payload_for_known_single_error() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveFlow())
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the DownloadAttachments files multiple listed function block error and output payload is empty for known single error")
    public void user_build_the_download_attachments_files_multiple_listed_function_block_error_and_output_payload_is_empty_for_known_single_error() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(empty())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(knownError())
                .blockName("DownloadAttachmentsFB")
                .payloadType(DownloadAttachmentsFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }
    @When("User runs the DownloadAttachments files FB with multiple error code and output payload is empty for known single error")
    public void user_runs_the_download_attachments_files_fb_with_multiple_error_code_and_output_payload_is_empty_for_known_single_error() {
        sandbox = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the output for DownloadAttachments files when multiple listed error and output payload is empty for known single error")
    public void user_validate_the_output_for_download_attachments_files_when_multiple_listed_error_and_output_payload_is_empty_for_known_single_error() {
        List<PayloadError> listOfErrors= functionBlockOutput.getErrors();
        System.out.println();
        for (PayloadError errors:listOfErrors
        ) {
            if (errors.getErrorCode().equals("E5.SCHEMA.VAL.FAILED")){
                throw new RuntimeException("Failed");
            }
            System.out.println(">>>>>>>"+errors);
        }
    }
    @Given("User build the mock DownloadAttachments files function block input")
    public void user_build_the_mock_download_attachments_files_function_block_input() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveFlow())
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the DownloadAttachments files multiple not listed function block error and output payload is empty")
    public void user_build_the_download_attachments_files_multiple_not_listed_function_block_error_and_output_payload_is_empty() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(empty())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(unknownmultipleError())
                .blockName("DownloadAttachmentsFB")
                .payloadType(DownloadAttachmentsFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }
    @When("User runs the DownloadAttachments files FB with multiple not listed error code and output payload is empty")
    public void user_runs_the_download_attachments_files_fb_with_multiple_not_listed_error_code_and_output_payload_is_empty() {
        sandbox = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the DownloadAttachments files fb output as {string} when multiple not listed error code and output payload is empty")
    public void user_validate_the_download_attachments_files_fb_output_as_when_multiple_not_listed_error_code_and_output_payload_is_empty(String expectedError) {
        List<PayloadError> listOfErrors= functionBlockOutput.getErrors();
        System.out.println();
        for (PayloadError errors:listOfErrors
        ) {
            if (errors.getErrorCode().equals("E5.SCHEMA.VAL.FAILED")){
                Assert.assertEquals(expectedError,errors.getErrorMessage());
                break;
            }
            System.out.println(">>>>>>>"+errors);
        }
    }
    @Given("User build the mock DownloadAttachments files fb input")
    public void user_build_the_mock_download_attachments_files_fb_input() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveFlow())
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the DownloadAttachments files multiple listed and not listed function block error and output payload is Empty")
    public void user_build_the_download_attachments_files_multiple_listed_and_not_listed_function_block_error_and_output_payload_is_empty() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(empty())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(knownunknownError())
                .blockName("DownloadAttachmentsFB")
                .payloadType(DownloadAttachmentsFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }
    @When("User runs the DownloadAttachments files FB with listed and not listed multiple error code and output payload is Empty")
    public void user_runs_the_download_attachments_files_fb_with_listed_and_not_listed_multiple_error_code_and_output_payload_is_empty() {
        sandbox = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the DownloadAttachments files fb output as {string} when listed and not listed multiple listed error code and output payload is Empty")
    public void user_validate_the_download_attachments_files_fb_output_as_when_listed_and_not_listed_multiple_listed_error_code_and_output_payload_is_empty(String expectedError) {
        List<PayloadError> listOfErrors= functionBlockOutput.getErrors();
        System.out.println();
        for (PayloadError errors:listOfErrors
        ) {
            if (errors.getErrorCode().equals("E5.SCHEMA.VAL.FAILED")){
                Assert.assertEquals(expectedError,errors.getErrorMessage());
                break;
            }
            System.out.println(">>>>>>>"+errors);
        }
    }





}
