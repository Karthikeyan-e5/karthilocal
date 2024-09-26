package stepdefinition;

import Payload.DownloadAttachmentsPrevalidation;
import com.e5.platform.core.event.PayloadError;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import e5.hchb.functionblock.generated.DownloadAttachmentsFB;
import e5.hchb.model.downloadattachmentsfb.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;

public class DownloadAttachmentsprevalid extends DownloadAttachmentsPrevalidation {
    FunctionBlockInput<Object> fbInput;
    List<PayloadError> errors;
    @Given("User builds the input for download attachment")
    public void user_builds_the_input_for_download_attachment() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveFlow())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment")
    public void user_validates_the_result_for_download_attachment() {
        Assert.assertEquals(new ArrayList<PayloadError>(), errors);
    }
    @Given("User builds the input for download attachment clinical input grid filter null")
    public void user_builds_the_input_for_download_attachment_clinical_input_grid_filter_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(clinicalinputgridfilternull())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment clinical input grid filter null")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_clinical_input_grid_filter_null() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment clinical input grid filter null {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_clinical_input_grid_filter_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment clinical input panel filter null")
    public void user_builds_the_input_for_download_attachment_clinical_input_panel_filter_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(clinicalinputpanalfilternull())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment clinical input panel filter null")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_clinical_input_panel_filter_null() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment clinical input panel filter null {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_clinical_input_panel_filter_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment record input filter null")
    public void user_builds_the_input_for_download_attachment_record_input_filter_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(recordinputfilternull())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment crecord input filter null")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_crecord_input_filter_null() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment record input filter null {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_record_input_filter_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment criteria null")
    public void user_builds_the_input_for_download_attachment_criteria_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(criterianull())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment criteria null")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_criteria_null() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment record criteria null {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_record_criteria_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment behavior null")
    public void user_builds_the_input_for_download_attachment_behavior_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(behaviornull())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment behavior null")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_behavior_null() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment behavior null {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_behavior_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment soe date null")
    public void user_builds_the_input_for_download_attachment_soe_date_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(soedatenull())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment soe date null")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_soe_date_null() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment soe date null {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_soe_date_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment soe date invalid")
    public void user_builds_the_input_for_download_attachment_soe_date_invalid() {
        fbInput = FunctionBlockInput.builder()
                .payload(invalidsoedate())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment soe date invalid")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_soe_date_invalid() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment soe date invalid {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_soe_date_invalid_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment clinical input null")
    public void user_builds_the_input_for_download_attachment_clinical_input_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(clinicalinputnull())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment clinical input null")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_clinical_input_null() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment clinical input null {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_clinical_input_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment episode status min")
    public void user_builds_the_input_for_download_attachment_episode_status_min() {
        fbInput = FunctionBlockInput.builder()
                .payload(episodestsmin())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment episode status min")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_episode_status_min() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment episode status min {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_episode_status_min_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment common filter null")
    public void user_builds_the_input_for_download_attachment_common_filter_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(commonfilternull())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment common filter null")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_common_filter_null() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment common filter null {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_common_filter_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment episode status null")
    public void user_builds_the_input_for_download_attachment_episode_status_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(episodestsnull())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment episode status null")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_episode_status_null() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment episode status null {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_episode_status_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment service line null")
    public void user_builds_the_input_for_download_attachment_service_line_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(servicelinenull())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment service line null")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_service_line_null() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment service line null {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_service_line_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment search null")
    public void user_builds_the_input_for_download_attachment_search_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(searchnull())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment search null")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_search_null() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment search null {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_search_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment panel filter from date")
    public void user_builds_the_input_for_download_attachment_panel_filter_from_date() {
        fbInput = FunctionBlockInput.builder()
                .payload(panelfilterfromdate())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment panel filter from date")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_panel_filter_from_date() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment panel filter from date {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_panel_filter_from_date_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment panel filter to date")
    public void user_builds_the_input_for_download_attachment_panel_filter_to_date() {
        fbInput = FunctionBlockInput.builder()
                .payload(panelfiltertodate())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment panel filter to date")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_panel_filter_to_date() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment panel filter to date {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_panel_filter_to_date_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment visit from date")
    public void user_builds_the_input_for_download_attachment_visit_from_date() {
        fbInput = FunctionBlockInput.builder()
                .payload(visitfromdate())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment panel visit from date")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_panel_visit_from_date() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment visit from date {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_visit_from_date_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment visit to date")
    public void user_builds_the_input_for_download_attachment_visit_to_date() {
        fbInput = FunctionBlockInput.builder()
                .payload(visittodate())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment panel visit to date")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_panel_visit_to_date() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment visit to date {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_visit_to_date_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment imported date invalid")
    public void user_builds_the_input_for_download_attachment_imported_date_invalid() {
        fbInput = FunctionBlockInput.builder()
                .payload(invalidimportdate())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment panel imported date invalid")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_panel_imported_date_invalid() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment imported date invalid {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_imported_date_invalid_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment record input null")
    public void user_builds_the_input_for_download_attachment_record_input_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(requiredfieldnull())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment panel record input null")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_panel_record_input_null() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment record input null {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_record_input_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User builds the input for download attachment record input min")
    public void user_builds_the_input_for_download_attachment_record_input_min() {
        fbInput = FunctionBlockInput.builder()
                .payload(reqfieldmin())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment panel record input min")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_panel_record_input_min() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment record input min {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_record_input_min_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment mrn null")
    public void user_builds_the_input_for_download_attachment_mrn_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(mrepi())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment mrn null")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_mrn_null() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment mrn null {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_mrn_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Then("User validates the result for download attachment mrno null {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_mrno_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(2).getErrorCode();
        String actualFieldName = errors.get(2).getFieldName();
        String actualErrorMessage = errors.get(2).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment soe date null value")
    public void user_builds_the_input_for_download_attachment_soe_date_null_value() {
        fbInput = FunctionBlockInput.builder()
                .payload(soedatenullvalue())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment soe date null value")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_soe_date_null_value() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment soe date null value {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_soe_date_null_value_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment file name no")
    public void user_builds_the_input_for_download_attachment_file_name_no() {
        fbInput = FunctionBlockInput.builder()
                .payload(filenamenull())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment file name no")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_file_name_no() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment file name no {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_file_name_no_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for download attachment file name")
    public void user_builds_the_input_for_download_attachment_file_name() {
        fbInput = FunctionBlockInput.builder()
                .payload(filename())
                .fbName("DownloadAttachment")
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for download attachment file name")
    public void user_runs_the_fb_with_sandbox_mock_for_download_attachment_file_name() {
        errors = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for download attachment file name {string},{string} and {string}")
    public void user_validates_the_result_for_download_attachment_file_name_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }


}
