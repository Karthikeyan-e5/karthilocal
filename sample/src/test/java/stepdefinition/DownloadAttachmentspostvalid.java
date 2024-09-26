package stepdefinition;

import Payload.DownloadAttachmentspostvalidation;
import com.e5.platform.core.event.PayloadError;
import com.e5.platform.core.executionblock.functionblock.domain.FBStatus;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOutput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import e5.hchb.functionblock.generated.DownloadAttachmentsFB;
import e5.hchb.model.downloadattachmentsfb.DownloadAttachmentsFBOutputPayload;
import e5.selectdataapi.functionblock.generated.SmartcareCreateBatchFB;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import java.time.Clock;
import java.util.ArrayList;
import java.util.List;

public class DownloadAttachmentspostvalid extends DownloadAttachmentspostvalidation {
    FunctionBlockOutput<Object> fbOutput;
    List<PayloadError> errors;
    @Given("User builds the output payload for download attachment")
    public void user_builds_the_output_payload_for_download_attachment() {
        fbOutput=FunctionBlockOutput.builder()
                .payload(positiveFlow())
                .blockName("download")
                .payloadType(DownloadAttachmentsFBOutputPayload.class.getName())
                .status(FBStatus.E5_FB_SUCCESS).build();
        System.out.println(fbOutput);
    }
    @When("user runs the FB with sandbox mock for download attachment output")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_output() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println("The errors is" + errors);
    }
    @Then("User validates the result for download attachment output")
    public void user_validates_the_result_for_download_attachment_output() {
        Assert.assertEquals(new ArrayList<PayloadError>(),errors);
    }
    @Given("User builds the input for download attachment export attachment null")
    public void user_builds_the_input_for_download_attachment_export_attachment_null() {
        fbOutput=FunctionBlockOutput.builder()
                .payload(exportattachmentnull())
                .blockName("download")
                .payloadType(DownloadAttachmentsFBOutputPayload.class.getName())
                .status(FBStatus.E5_FB_SUCCESS).build();
        System.out.println(fbOutput);
    }
    @When("user runs the FB with sandbox mock for download attachment export attachment null")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_export_attachment_null() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println("The errors is" + errors);
    }
    @Then("User validates the result for download attachment export attachment null {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_export_attachment_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment export file detail null")
    public void user_builds_the_input_for_download_attachment_export_file_detail_null() {
        fbOutput=FunctionBlockOutput.builder()
                .payload(exportfilenull())
                .blockName("download")
                .payloadType(DownloadAttachmentsFBOutputPayload.class.getName())
                .status(FBStatus.E5_FB_SUCCESS).build();
        System.out.println(fbOutput);
    }
    @When("user runs the FB with sandbox mock for download attachment export file detail null")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_export_file_detail_null() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println("The errors is" + errors);
    }
    @Then("User validates the result for download attachment export file detail null {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_export_file_detail_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment export file empty")
    public void user_builds_the_input_for_download_attachment_export_file_empty() {
        fbOutput=FunctionBlockOutput.builder()
                .payload(exportfileempty())
                .blockName("download")
                .payloadType(DownloadAttachmentsFBOutputPayload.class.getName())
                .status(FBStatus.E5_FB_SUCCESS).build();
        System.out.println(fbOutput);
    }
    @When("user runs the FB with sandbox mock for download attachment export file empty")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_export_file_empty() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println("The errors is" + errors);
    }
    @Then("User validates the result for download attachment export file empty {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_export_file_empty_and(String expectedErrorCode, String expectedFieldName , String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment export name null")
    public void user_builds_the_input_for_download_attachment_export_name_null() {
        fbOutput=FunctionBlockOutput.builder()
                .payload(exportnamenull())
                .blockName("download")
                .payloadType(DownloadAttachmentsFBOutputPayload.class.getName())
                .status(FBStatus.E5_FB_SUCCESS).build();
        System.out.println(fbOutput);
    }
    @When("user runs the FB with sandbox mock for download attachment export name null")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_export_name_null() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println("The errors is" + errors);
    }
    @Then("User validates the result for download attachment export name null {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_export_name_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment export token null")
    public void user_builds_the_input_for_download_attachment_export_token_null() {
        fbOutput=FunctionBlockOutput.builder()
                .payload(attachmenttokennull())
                .blockName("download")
                .payloadType(DownloadAttachmentsFBOutputPayload.class.getName())
                .status(FBStatus.E5_FB_SUCCESS).build();
        System.out.println(fbOutput);
    }
    @When("user runs the FB with sandbox mock for download attachment export token null")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_export_token_null() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println("The errors is" + errors);
    }
    @Then("User validates the result for download attachment export token null {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_export_token_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment export name min")
    public void user_builds_the_input_for_download_attachment_export_name_min() {
        fbOutput=FunctionBlockOutput.builder()
                .payload(attachmenttokenmin())
                .blockName("download")
                .payloadType(DownloadAttachmentsFBOutputPayload.class.getName())
                .status(FBStatus.E5_FB_SUCCESS).build();
        System.out.println(fbOutput);
    }
    @When("user runs the FB with sandbox mock for download attachment export name min")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_export_name_min() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println("The errors is" + errors);
    }
    @Then("User validates the result for download attachment export name min {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_export_name_min_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(1).getErrorCode();
        String actualFieldName = errors.get(1).getFieldName();
        String actualErrorMessage = errors.get(1).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment export token min")
    public void user_builds_the_input_for_download_attachment_export_token_min() {
        fbOutput=FunctionBlockOutput.builder()
                .payload(attachmenttokenmin())
                .blockName("download")
                .payloadType(DownloadAttachmentsFBOutputPayload.class.getName())
                .status(FBStatus.E5_FB_SUCCESS).build();
        System.out.println(fbOutput);
    }
    @When("user runs the FB with sandbox mock for download attachment export token min")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_export_token_min() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println("The errors is" + errors);
    }
    @Then("User validates the result for download attachment export token min {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_export_token_min_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }



}
