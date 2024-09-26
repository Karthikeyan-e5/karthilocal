package stepdefinition;

import Payload.SmartcareCreateBatchPostvalidation;
import com.e5.platform.core.event.PayloadError;
import com.e5.platform.core.executionblock.functionblock.domain.FBStatus;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOutput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;

import e5.selectdataapi.functionblock.generated.SmartcareCreateBatchFB;
import e5.selectdataapi.model.smartcarecreatebatchfb.CreateBatchOutputPayload;
import e5.selectdataapi.model.smartcarecreatebatchfb.SmartcareCreateBatchFBInputPayload;
import e5.selectdataapi.model.smartcarecreatebatchfb.SmartcareCreateBatchFBOutputPayload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static e5.selectdataapi.model.smartcarecreatebatchfb.CreateBatchOutputPayload.*;

public class SmartcareCreateBatchStepDefnitionPostvalidation extends SmartcareCreateBatchPostvalidation {
    FunctionBlockOutput<Object> fbOutput;
    List<PayloadError> errors;


    @Given("User builds the output for smartcare create batch")
    public void user_builds_the_output_for_smartcare_create_batch() {
    fbOutput=FunctionBlockOutput.builder()
            .payload(positiveFlow())
            .blockName("CreateBatch")
            .payloadType(SmartcareCreateBatchFBOutputPayload.class.getName())
            .status(FBStatus.E5_FB_SUCCESS).build();
    }
    @When("user runs the fboutput with sandbox mock for smartcare create batch")
    public void user_runs_the_fboutput_with_sandbox_mock_for_smartcare_create_batch() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println("The errors is" + errors);
    }
    @Then("User validates the result for smartcare create batch output")
    public void user_validates_the_result_for_smartcare_create_batch_output() {
        Assert.assertEquals(new ArrayList<PayloadError>(),errors);
    }
    @Given("User builds the input for smartcare create batch output payload")
    public void user_builds_the_input_for_smartcare_create_batch_output_payload(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);

        fbOutput=FunctionBlockOutput.builder()
                .payload(scenariopayload(data.get(0).get("batchId"), (data.get(0).get("documentTypeId")),Integer.parseInt(data.get(0).get("batchStatusId")),data.get(0).get("encompassId"),
                        data.get(0).get("recommendFileType"),data.get(0).get("batchName"),data.get(0).get("uploadedDate"),data.get(0).get("version")))
                .blockName("CreateBatch")
                .payloadType(SmartcareCreateBatchFBOutputPayload.class.getName())
                .status(FBStatus.E5_FB_SUCCESS).build();
        System.out.println(fbOutput);
    }
    @When("user runs the FB with sandbox mock for smartcare create batch output payload batch it min")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_output_payload_batch_it_min() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch output payload batch it min {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_output_payload_batch_it_min_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for smartcare create batch min")
    public void user_builds_the_input_for_smartcare_create_batch_min() {
        fbOutput=FunctionBlockOutput.builder()
                .payload(batchidmin())
                .blockName("CreateBatch")
                .payloadType(SmartcareCreateBatchFBOutputPayload.class.getName())
                .status(FBStatus.E5_FB_SUCCESS).build();
    }
    @When("user runs the FB with sandbox mock for smartcare create batch min")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_min() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch min {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_min_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @When("user runs the FB with sandbox mock for smartcare create batch output payload for encompass id null")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_output_payload_for_encompass_id_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch output payload for encompass id null {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_output_payload_for_encompass_id_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for smartcare create batch encompass id min")
    public void user_builds_the_input_for_smartcare_create_batch_encompass_id_min() {
        fbOutput=FunctionBlockOutput.builder()
                .payload(encompass())
                .blockName("CreateBatch")
                .payloadType(SmartcareCreateBatchFBOutputPayload.class.getName())
                .status(FBStatus.E5_FB_SUCCESS).build();
    }
    @When("user runs the FB with sandbox mock for smartcare create batch encompass id min")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_encompass_id_min() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println("error is " + errors);
    }

    @Then("User validates the result for smartcare create batch encompass id minl {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_encompass_id_minl_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @When("user runs the FB with sandbox mock for smartcare create batch output payload for upload date")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_output_payload_for_upload_date() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch output payload for upload date {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_output_payload_for_upload_date_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for smartcare create batch status id null")
    public void user_builds_the_input_for_smartcare_create_batch_status_id_null() {
        fbOutput=FunctionBlockOutput.builder()
                .payload(batchstsid())
                .blockName("CreateBatch")
                .payloadType(SmartcareCreateBatchFBOutputPayload.class.getName())
                .status(FBStatus.E5_FB_SUCCESS).build();
    }
    @When("user runs the FB with sandbox mock for smartcare create batch status id null")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_status_id_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch status id null {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_status_id_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @When("user runs the FB with sandbox mock for smartcare create batch output payload for batch status id mim")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_output_payload_for_batch_status_id_mim() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch output payload batch for batch status id mim {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_output_payload_batch_for_batch_status_id_mim_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

}
