package stepdefinition;

import com.e5.platform.core.domains.FunctionBlockSandboxResponse;
import com.e5.platform.core.event.PayloadError;
import com.e5.platform.core.executionblock.functionblock.domain.FBStatus;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOutput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import e5.model.UploadEOBFilesFBInputPayload;
import e5.model.UploadEOBFilesFBOutputPayload;
import e5.wellsky.functionblock.generated.UploadEOBFilesFB;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class UploadEOBDelegation extends Payload.UploadEOBDelegation {
    FunctionBlockInput<Object> fbInput;
    List<PayloadError> errors;
    FunctionBlockOutput<UploadEOBFilesFBOutputPayload> fbOutput;
    UploadEOBFilesFBOutputPayload uploadEOBOutPut;
    FunctionBlockSandbox sandbox;
    FunctionBlockSandboxResponse functionBlockSandboxResponse;
    FunctionBlockOutput functionBlockOutput;


    @Given("User build the mock function block input payload")
    public void user_build_the_mock_function_block_input_payload() {
            fbInput = FunctionBlockInput.builder()
                    .payload(Positive())
                    .genericType(UploadEOBFilesFBInputPayload.class.getName()).build();
            System.out.println(fbInput);
    }

    @Given("User build the function block output payload")
    public void user_build_the_function_block_output_payload() {
         uploadEOBOutPut = UploadEOBFilesFBOutputPayload.builder().eobUploadedTime("6:00PM").build();
        fbOutput = FunctionBlockOutput.<UploadEOBFilesFBOutputPayload>builder()
                .payload(uploadEOBOutPut)
                .status(FBStatus.E5_FB_SUCCESS)

                .errors(new ArrayList<>())
                .blockName("UploadEOBFilesFB")
                .payloadType(UploadEOBFilesFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }

    @When("User runs the for positive flow with input and output payload")
    public void user_runs_the_for_positive_flow_with_input_and_output_payload() {
        sandbox = FunctionBlockSandbox.forFB(UploadEOBFilesFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        System.out.println("Error is "+functionBlockOutput.getErrors());
    }

    @Then("User validate the output for positive flow")
    public void user_validate_the_output_for_positive_flow() {
        Assert.assertEquals(fbOutput, functionBlockOutput);
    }

    @Given("User build the invalid mock function block input payload")
    public void user_build_the_invalid_mock_function_block_input_payload() {
        fbInput = FunctionBlockInput.builder()
                .payload(FileLocationNull()).genericType(UploadEOBFilesFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the valid function block output payload")
    public void user_build_the_valid_function_block_output_payload() {
        uploadEOBOutPut = UploadEOBFilesFBOutputPayload.builder().eobUploadedTime("6:00PM").build();
        fbOutput = FunctionBlockOutput.<UploadEOBFilesFBOutputPayload>builder()
                .payload(uploadEOBOutPut)
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(new ArrayList<>())
                .blockName("UploadEOBFilesFB")
                .payloadType(UploadEOBFilesFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }

    @When("User runs the Prevalidation fail senario with invalid input payload")
    public void user_runs_the_prevalidation_fail_senario_with_invalid_input_payload() {
        sandbox = FunctionBlockSandbox.forFB(UploadEOBFilesFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        errors =functionBlockOutput.getErrors();
        System.out.println("Error is "+functionBlockOutput.getErrors());
    }
    @Then("User validate the output as {string},{string} and {string} when file location is null")
    public void user_validate_the_output_as_and_when_file_location_is_null(String errorCode, String fieldName, String errorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

      Assert.assertEquals(actualErrorCode, errorCode);
      Assert.assertEquals(actualFieldName, fieldName);
      Assert.assertEquals(actualErrorMessage, errorMessage);
    }

    @Given("User build the valid mock function block input payloads")
    public void user_build_the_valid_mock_function_block_input_payloads() {
        fbInput = FunctionBlockInput.builder()
                .payload(Positive()).genericType(UploadEOBFilesFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }

    @Given("User build the  function block when EOB uploaded time is null")
    public void user_build_the_function_block_when_eob_uploaded_time_is_null() {
        uploadEOBOutPut = UploadEOBFilesFBOutputPayload.builder().build();
        fbOutput = FunctionBlockOutput.<UploadEOBFilesFBOutputPayload>builder()
                .payload(uploadEOBOutPut)
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(new ArrayList<>())
                .blockName("UploadEOBFilesFB")
                .payloadType(UploadEOBFilesFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }

    @When("User runs the postvalidation fail senario with invalid input payload")
    public void user_runs_the_postvalidation_fail_senario_with_invalid_input_payload() {
        sandbox = FunctionBlockSandbox.forFB(UploadEOBFilesFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        errors =functionBlockOutput.getErrors();
        System.out.println("Error is "+functionBlockOutput.getErrors());
    }

    @Then("User validate the output as {string},{string} and {string} when EOB uploaded time  is null")
    public void user_validate_the_output_as_and_when_eob_uploaded_time_is_null(String errorCode, String fieldName, String errorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(actualErrorCode, errorCode);
        Assert.assertEquals(actualFieldName, fieldName);
        Assert.assertEquals(actualErrorMessage, errorMessage);
    }

    @Given("User build the mock Upload EOB files  function block input payload")
    public void user_build_the_mock_upload_eob_files_function_block_input_payload() {
        fbInput = FunctionBlockInput.builder()
                .payload(Positive())
                .genericType(UploadEOBFilesFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the Upload EOB files listed function block error and output payload is empty")
    public void user_build_the_upload_eob_files_listed_function_block_error_and_output_payload_is_empty() {
        uploadEOBOutPut = UploadEOBFilesFBOutputPayload.builder().eobUploadedTime("").build();
        fbOutput = FunctionBlockOutput.<UploadEOBFilesFBOutputPayload>builder()
                .payload(uploadEOBOutPut)
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(listedError())
                .blockName("UploadEOBFilesFB")
                .payloadType(UploadEOBFilesFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);

    }
    @When("User runs the Upload EOB files FB with error code and output payload is empty")
    public void user_runs_the_upload_eob_files_fb_with_error_code_and_output_payload_is_empty() {
        sandbox = FunctionBlockSandbox.forFB(UploadEOBFilesFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        errors =functionBlockOutput.getErrors();
        System.out.println("Error is "+functionBlockOutput.getErrors());
    }
    @Then("User validate the output for Upload EOB files when error code and output payload is empty")
    public void user_validate_the_output_for_upload_eob_files_when_error_code_and_output_payload_is_empty() {
        List<PayloadError> error= functionBlockOutput.getErrors();
        String errSrc=error.get(0).getErrSrc();
        String errorCode=error.get(0).getErrorCode();
        String errorMessage=error.get(0).getErrorMessage();
        String fieldName=error.get(0).getFieldName();

        Object payload = functionBlockOutput.getPayload();
        FBStatus status =functionBlockOutput.getStatus();
        String  payloadType =functionBlockOutput.getPayloadType();
        String blockName = functionBlockOutput.getBlockName();

        Assert.assertEquals("Delegation", errSrc);
        Assert.assertEquals("E5_FB_UPLOADEOBFILES_BE_002", errorCode);
        Assert.assertEquals("Error message", errorMessage);
        Assert.assertEquals(null, fieldName);
        Assert.assertEquals(uploadEOBOutPut,payload);
        Assert.assertEquals(FBStatus.E5_FB_DELEGATION_ERROR, status);
        Assert.assertEquals(UploadEOBFilesFBOutputPayload.class.getName(), payloadType);
        Assert.assertEquals("UploadEOBFilesFB", blockName);
    }

    @Given("User build the mock Upload EOB Files function block payload")
    public void user_build_the_mock_upload_eob_files_function_block_payload() {
        fbInput = FunctionBlockInput.builder()
                .payload(Positive())
                .genericType(UploadEOBFilesFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the Upload EOB Files not listed function block error and output payload is empty")
    public void user_build_the_upload_eob_files_not_listed_function_block_error_and_output_payload_is_empty() {
        uploadEOBOutPut = UploadEOBFilesFBOutputPayload.builder().eobUploadedTime("").build();
        fbOutput = FunctionBlockOutput.<UploadEOBFilesFBOutputPayload>builder()
                .payload(uploadEOBOutPut)
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(UnKnownError())
                .blockName("UploadEOBFilesFB")
                .payloadType(UploadEOBFilesFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }
    @When("User runs the Upload EOB Files FB with not listed error code and output payload is empty")
    public void user_runs_the_upload_eob_files_fb_with_not_listed_error_code_and_output_payload_is_empty() {
        sandbox = FunctionBlockSandbox.forFB(UploadEOBFilesFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        errors =functionBlockOutput.getErrors();
        System.out.println("Error is "+functionBlockOutput.getErrors());
    }
    @Then("User validate the Upload EOB Files fb output as {string} when error code and output payload is empty")
    public void user_validate_the_upload_eob_files_fb_output_as_when_error_code_and_output_payload_is_empty(String expectedError) {
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

    @Given("User build the mock Upload EOB files FB payload")
    public void user_build_the_mock_upload_eob_files_fb_payload() {
        fbInput = FunctionBlockInput.builder()
                .payload(Positive())
                .genericType(UploadEOBFilesFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }

    @Given("User build the Upload EOB files multiple listed function block error and output payload is empty")
    public void user_build_the_upload_eob_files_multiple_listed_function_block_error_and_output_payload_is_empty() {
        uploadEOBOutPut = UploadEOBFilesFBOutputPayload.builder().eobUploadedTime("").build();
        fbOutput = FunctionBlockOutput.<UploadEOBFilesFBOutputPayload>builder()
                .payload(uploadEOBOutPut)
                .status(FBStatus.E5_FB_DELEGATION_ERROR)
                .errors(MultipleErrors())
                .blockName("UploadEOBFilesFB")
                .payloadType(UploadEOBFilesFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }
    @When("User runs the Upload EOB files FB with multiple error code and output payload is empty")
    public void user_runs_the_upload_eob_files_fb_with_multiple_error_code_and_output_payload_is_empty() {
        sandbox = FunctionBlockSandbox.forFB(UploadEOBFilesFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        errors =functionBlockOutput.getErrors();
        System.out.println("Error is "+functionBlockOutput.getErrors());
    }
    @Then("User validate the output for Upload EOB files when multiple listed error and output payload is empty")
    public void user_validate_the_output_for_upload_eob_files_when_multiple_listed_error_and_output_payload_is_empty() {
        List<PayloadError> error= functionBlockOutput.getErrors();
        for (PayloadError errors:error
        ) {
            if (errors.getErrorCode().equals("E5.SCHEMA.VAL.FAILED")){
                throw new RuntimeException("Failed");
            }
            System.out.println(">>>>>>>"+errors);
        }
    }

    @Given("User build the mock Upload EOB files function block input")
    public void user_build_the_mock_upload_eob_files_function_block_input() {
        fbInput = FunctionBlockInput.builder()
                .payload(Positive())
                .genericType(UploadEOBFilesFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the Upload EOB files multiple not listed function block error and output payload is empty")
    public void user_build_the_upload_eob_files_multiple_not_listed_function_block_error_and_output_payload_is_empty() {
        uploadEOBOutPut = UploadEOBFilesFBOutputPayload.builder().eobUploadedTime("").build();
        fbOutput = FunctionBlockOutput.<UploadEOBFilesFBOutputPayload>builder()
                .payload(uploadEOBOutPut)
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(UnknownMultipleErrors())
                .blockName("UploadEOBFilesFB")
                .payloadType(UploadEOBFilesFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }
    @When("User runs the Upload EOB files FB with multiple not listed error code and output payload is empty")
    public void user_runs_the_upload_eob_files_fb_with_multiple_not_listed_error_code_and_output_payload_is_empty() {
        sandbox = FunctionBlockSandbox.forFB(UploadEOBFilesFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        errors =functionBlockOutput.getErrors();
        System.out.println("Error is "+functionBlockOutput.getErrors());
    }
    @Then("User validate the Upload EOB files fb output as {string} when multiple not listed error code and output payload is empty")
    public void user_validate_the_upload_eob_files_fb_output_as_when_multiple_not_listed_error_code_and_output_payload_is_empty(String expectedError) {
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

    @Given("User build the mock Upload EOB files fb input")
    public void user_build_the_mock_upload_eob_files_fb_input() {
        fbInput = FunctionBlockInput.builder()
                .payload(Positive())
                .genericType(UploadEOBFilesFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the Upload EOB files multiple listed and not listed function block error and output payload is Empty")
    public void user_build_the_upload_eob_files_multiple_listed_and_not_listed_function_block_error_and_output_payload_is_empty() {
        uploadEOBOutPut = UploadEOBFilesFBOutputPayload.builder().eobUploadedTime("").build();
        fbOutput = FunctionBlockOutput.<UploadEOBFilesFBOutputPayload>builder()
                .payload(uploadEOBOutPut)
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(CombinationofListedandUnknownErrors())
                .blockName("UploadEOBFilesFB")
                .payloadType(UploadEOBFilesFBOutputPayload.class.getName()).build();
        System.out.println("output is =" + fbOutput);
    }
    @When("User runs the Upload EOB files FB with listed and not listed multiple error code and output payload is Empty")
    public void user_runs_the_upload_eob_files_fb_with_listed_and_not_listed_multiple_error_code_and_output_payload_is_empty() {
        sandbox = FunctionBlockSandbox.forFB(UploadEOBFilesFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput= functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println(functionBlockOutput);
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        errors =functionBlockOutput.getErrors();
        System.out.println("Error is "+functionBlockOutput.getErrors());
    }
    @Then("User validate the Upload EOB files fb output as {string} when listed and not listed multiple listed error code and output payload is Empty")
    public void user_validate_the_upload_eob_files_fb_output_as_when_listed_and_not_listed_multiple_listed_error_code_and_output_payload_is_empty(String expectedError) {
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

