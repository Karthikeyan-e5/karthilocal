package stepdefinition;

import Payload.SmartcareCreateBatchDelegationPayload;
import com.e5.platform.core.domains.FunctionBlockSandboxResponse;
import com.e5.platform.core.event.PayloadError;
import com.e5.platform.core.executionblock.functionblock.domain.FBStatus;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOutput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import e5.selectdataapi.functionblock.generated.SmartcareCreateBatchFB;
import e5.selectdataapi.model.smartcarecreatebatchfb.SmartcareCreateBatchFBInputPayload;
import e5.selectdataapi.model.smartcarecreatebatchfb.SmartcareCreateBatchFBOutputPayload;
import e5.wellsky.functionblock.generated.UploadEOBFilesFB;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;


public class SmartcareCreateBatchDelegation extends SmartcareCreateBatchDelegationPayload {
    FunctionBlockInput<Object> fbInput;
    List<PayloadError> errors;
    FunctionBlockOutput<Object> fbOutput;

    FunctionBlockSandbox sandbox;
    FunctionBlockSandboxResponse functionBlockSandboxResponse;
    FunctionBlockOutput functionBlockOutput;
    @Given("User build the mock function block input payload for create batch")
    public void user_build_the_mock_function_block_input_payload_for_create_batch() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveFlow())
                .genericType(SmartcareCreateBatchFBInputPayload.class.getName()).build();
        System.out.println(fbInput);

    }
    @Given("User build the function block output payload for create batch")
    public void user_build_the_function_block_output_payload_for_create_batch() {

        fbOutput = FunctionBlockOutput.builder()
                .payload(outputpositiveFlow())
                .status(FBStatus.E5_FB_SUCCESS)
//                .errors(new ArrayList<>())
                .blockName("SmartcareCreateBatchFB")
                .payloadType(SmartcareCreateBatchFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }
    @When("User runs the for positive flow with input and output payload for create batch")
    public void user_runs_the_for_positive_flow_with_input_and_output_payload_for_create_batch() {
        sandbox = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        System.out.println("Error is "+functionBlockOutput.getErrors());
    }
    @Then("User validate the output for positive flow for create batch")
    public void user_validate_the_output_for_positive_flow_for_create_batch() {
        Assert.assertEquals(fbOutput, functionBlockOutput);
    }
    @Given("User build the invalid mock function block input payload for create batch")
    public void user_build_the_invalid_mock_function_block_input_payload_for_create_batch() {
        fbInput = FunctionBlockInput.builder()
                .payload(invalidpositiveFlow())
                .genericType(SmartcareCreateBatchFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the valid function block output payload for create batch")
    public void user_build_the_valid_function_block_output_payload_for_create_batch() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(outputpositiveFlow())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(new ArrayList<>())
                .blockName("SmartcareCreateBatchFB")
                .payloadType(SmartcareCreateBatchFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }
    @When("User runs the Prevalidation fail senario with invalid input payload for create batch")
    public void user_runs_the_prevalidation_fail_senario_with_invalid_input_payload_for_create_batch() {
        sandbox = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the output as {string},{string} and {string} when client id null")
    public void user_validate_the_output_as_and_when_client_id_null(String errorCode, String fieldName, String errorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(actualErrorCode, errorCode);
        Assert.assertEquals(actualFieldName, fieldName);
        Assert.assertEquals(actualErrorMessage, errorMessage);
    }
    @Given("User build the valid mock function block input payload for create batch")
    public void user_build_the_valid_mock_function_block_input_payload_for_create_batch() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveFlow())
                .genericType(SmartcareCreateBatchFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the invalid function block output payload for create batch")
    public void user_build_the_invalid_function_block_output_payload_for_create_batch() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(invalidoutput())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(new ArrayList<>())
                .blockName("SmartcareCreateBatchFB")
                .payloadType(SmartcareCreateBatchFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }
    @When("User runs the Post validation fail senario with invalid input payload for create batch")
    public void user_runs_the_post_validation_fail_senario_with_invalid_input_payload_for_create_batch() {
        sandbox = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the output as {string},{string} and {string} when encompass id null")
    public void user_validate_the_output_as_and_when_encompass_id_null(String errorCode, String fieldName, String errorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(actualErrorCode, errorCode);
        Assert.assertEquals(actualFieldName, fieldName);
        Assert.assertEquals(actualErrorMessage, errorMessage);
    }
    @Given("User build the mock Smartcare Create Batch Files function block payload")
    public void user_build_the_mock_smartcare_create_batch_files_function_block_payload() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveFlow())
                .genericType(SmartcareCreateBatchFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the Smartcare Create Batch Files not listed function block error and output payload is empty")
    public void user_build_the_smartcare_create_batch_files_not_listed_function_block_error_and_output_payload_is_empty() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(outputpositiveFlow())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(UnknownError())
                .blockName("SmartcareCreateBatchFB")
                .payloadType(SmartcareCreateBatchFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }
    @When("User runs the Smartcare Create Batch Files FB with not listed error code and output payload is empty")
    public void user_runs_the_smartcare_create_batch_files_fb_with_not_listed_error_code_and_output_payload_is_empty() {
        sandbox = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the Smartcare Create Batch Files fb output as {string} when error code and output payload is empty")
    public void user_validate_the_smartcare_create_batch_files_fb_output_as_when_error_code_and_output_payload_is_empty(String expectedError) {
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
    @Given("User build the mock Smartcare Create Batch files FB payload")
    public void user_build_the_mock_smartcare_create_batch_files_fb_payload() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveFlow())
                .genericType(SmartcareCreateBatchFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the Smartcare Create Batch files multiple listed function block error and output payload is empty")
    public void user_build_the_smartcare_create_batch_files_multiple_listed_function_block_error_and_output_payload_is_empty() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(empty())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(MultipleError())
                .blockName("SmartcareCreateBatchFB")
                .payloadType(SmartcareCreateBatchFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }
    @When("User runs the Smartcare Create Batch files FB with multiple error code and output payload is empty")
    public void user_runs_the_smartcare_create_batch_files_fb_with_multiple_error_code_and_output_payload_is_empty() {
        sandbox = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the output for Smartcare Create Batch files when multiple listed error and output payload is empty")
    public void user_validate_the_output_for_smartcare_create_batch_files_when_multiple_listed_error_and_output_payload_is_empty() {
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
    @Given("User build the mock Smartcare Create Batch files function block input")
    public void user_build_the_mock_smartcare_create_batch_files_function_block_input() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveFlow())
                .genericType(SmartcareCreateBatchFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the Smartcare Create Batch files multiple not listed function block error and output payload is empty")
    public void user_build_the_smartcare_create_batch_files_multiple_not_listed_function_block_error_and_output_payload_is_empty() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(empty())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(MultipleunknownError())
                .blockName("SmartcareCreateBatchFB")
                .payloadType(SmartcareCreateBatchFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }
    @When("User runs the Smartcare Create Batch files FB with multiple not listed error code and output payload is empty")
    public void user_runs_the_smartcare_create_batch_files_fb_with_multiple_not_listed_error_code_and_output_payload_is_empty() {
        sandbox = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the Smartcare Create Batch files fb output as {string} when multiple not listed error code and output payload is empty")
    public void user_validate_the_smartcare_create_batch_files_fb_output_as_when_multiple_not_listed_error_code_and_output_payload_is_empty(String expectedError) {
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
    @Given("User build the mock Smartcare Create Batch files fb input")
    public void user_build_the_mock_smartcare_create_batch_files_fb_input() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveFlow())
                .genericType(SmartcareCreateBatchFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the Smartcare Create Batch files multiple listed and not listed function block error and output payload is Empty")
    public void user_build_the_smartcare_create_batch_files_multiple_listed_and_not_listed_function_block_error_and_output_payload_is_empty() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(empty())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(MultipleknownunknownError())
                .blockName("SmartcareCreateBatchFB")
                .payloadType(SmartcareCreateBatchFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }
    @When("User runs the Smartcare Create Batch files FB with listed and not listed multiple error code and output payload is Empty")
    public void user_runs_the_smartcare_create_batch_files_fb_with_listed_and_not_listed_multiple_error_code_and_output_payload_is_empty() {
        sandbox = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the Smartcare Create Batch files fb output as {string} when listed and not listed multiple listed error code and output payload is Empty")
    public void user_validate_the_smartcare_create_batch_files_fb_output_as_when_listed_and_not_listed_multiple_listed_error_code_and_output_payload_is_empty(String expectedError) {
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
    @Given("User build the mock Smartcare Create Batch files FB payload for known single error")
    public void user_build_the_mock_smartcare_create_batch_files_fb_payload_for_known_single_error() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveFlow())
                .genericType(SmartcareCreateBatchFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the Smartcare Create Batch files multiple listed function block error and output payload is empty for known single error")
    public void user_build_the_smartcare_create_batch_files_multiple_listed_function_block_error_and_output_payload_is_empty_for_known_single_error() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(empty())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(singleknownError())
                .blockName("SmartcareCreateBatchFB")
                .payloadType(SmartcareCreateBatchFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }
    @When("User runs the Smartcare Create Batch files FB with multiple error code and output payload is empty for known single error")
    public void user_runs_the_smartcare_create_batch_files_fb_with_multiple_error_code_and_output_payload_is_empty_for_known_single_error() {
        sandbox = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the output for Smartcare Create Batch files when multiple listed error and output payload is empty for known single error")
    public void user_validate_the_output_for_smartcare_create_batch_files_when_multiple_listed_error_and_output_payload_is_empty_for_known_single_error() {
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



}
