package stepdefinition;
import Payload.SmartcareCreateBatchPrevalidation;
import com.e5.platform.core.event.PayloadError;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import e5.selectdataapi.functionblock.generated.SmartcareCreateBatchFB;
import e5.selectdataapi.model.smartcarecreatebatchfb.SmartcareCreateBatchFBInputPayload;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class SmartcareCreateBatchStepDefinition extends SmartcareCreateBatchPrevalidation {
    FunctionBlockInput<Object> fbInput;
    List<PayloadError> errors;
    @Given("User builds the input for smartcare create batch")
    public void user_builds_the_input_for_smartcare_create_batch() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveFlow())
                .fbName("SmartcareCreateBatch")
                .genericType(SmartcareCreateBatchFBInputPayload.class.getName()).build();
        System.out.println(fbInput);

    }
    @When("user runs the FB with sandbox mock for smartcare create batch")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);

    }
    @Then("User validates the result for smartcare create batch")
    public void user_validates_the_result_for_smartcare_create_batch() {
        Assert.assertEquals(new ArrayList<PayloadError>(), errors);

    }
    @Given("User builds the input for smartcare create batch for clientvalue zero")
    public void user_builds_the_input_for_smartcare_create_batch_for_clientvalue_zero(DataTable dataTable) {
        List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
        System.out.println(Integer.parseInt(data.get(0).get("clientId")));
        fbInput = FunctionBlockInput.builder()
                .payload(scenariopayload(Integer.parseInt(data.get(0).get("clientId")),data.get(0).get("facilityCode"),data.get(0).get("firstName"),data.get(0).get("lastName"),
                        Integer.parseInt(data.get(0).get("episodeId")),data.get(0).get("recordDate")))
                .fbName("SmartcareCreateBatch")
                .genericType(SmartcareCreateBatchFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }

    @When("user runs the FB with sandbox mock for smartcare create batch for clientvalue zero")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_for_clientvalue_zero() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }

    @Then("User validates the result for smartcare create batch for clientvalue zero {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_for_clientvalue_zero_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for smartcare create batch client id must be string")
    public void user_builds_the_input_for_smartcare_create_batch_client_id_must_be_string() {
        fbInput = FunctionBlockInput.builder()
                .payload(clientIdInt())
                .fbName("SmartcareCreateBatch")
                .genericType(SmartcareCreateBatchFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for smartcare create batch client id must be string")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_client_id_must_be_string() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch for client id must be string {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_for_client_id_must_be_string_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @When("user runs the FB with sandbox mock for smartcare create batch facility code must be string")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_facility_code_must_be_string() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch facility code must be string {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_facility_code_must_be_string_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for smartcare create batch facility code min char")
    public void user_builds_the_input_for_smartcare_create_batch_facility_code_min_char() {
        fbInput = FunctionBlockInput.builder()
                .payload(facilityCodemimchar())
                .fbName("SmartcareCreateBatch")
                .genericType(SmartcareCreateBatchFBInputPayload.class.getName()).build();
        System.out.println(fbInput);

    }
    @When("user runs the FB with sandbox mock for smartcare create batch facility code min char")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_facility_code_min_char() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch for facility code min char {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_for_facility_code_min_char_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @When("user runs the FB with sandbox mock for smartcare create batch first name must be string")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_first_name_must_be_string() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch first name must be string {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_first_name_must_be_string_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for smartcare create batch first name min char")
    public void user_builds_the_input_for_smartcare_create_batch_first_name_min_char() {
        fbInput = FunctionBlockInput.builder()
                .payload(firstnamemimchar())
                .fbName("SmartcareCreateBatch")
                .genericType(SmartcareCreateBatchFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for smartcare create batch first name min char")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_first_name_min_char() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch for first name min char {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_for_first_name_min_char_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @When("user runs the FB with sandbox mock for smartcare create batch last name must be string")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_last_name_must_be_string() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch last name must be string {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_last_name_must_be_string_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for smartcare create batch last name min char")
    public void user_builds_the_input_for_smartcare_create_batch_last_name_min_char() {
        fbInput = FunctionBlockInput.builder()
                .payload(lastnamemimchar())
                .fbName("SmartcareCreateBatch")
                .genericType(SmartcareCreateBatchFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for smartcare create batch last name min char")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_last_name_min_char() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch for last name min char {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_for_last_name_min_char_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User builds the input for smartcare create batch patient id min char")
    public void user_builds_the_input_for_smartcare_create_batch_patient_id_min_char() {
        fbInput = FunctionBlockInput.builder()
                .payload(episodeIdmin())
                .fbName("SmartcareCreateBatch")
                .genericType(SmartcareCreateBatchFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for smartcare create batch patient id min char")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_patient_id_min_char() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch for patient id min char {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_for_patient_id_min_char_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);

    }
    @When("user runs the FB with sandbox mock for smartcare create batch record date null")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_record_date_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch record date null {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_record_date_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @When("user runs the FB with sandbox mock for smartcare create batch record date invalid")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_record_date_invalid() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch record date invalid {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_record_date_invalid_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for smartcare create batch record date min char")
    public void user_builds_the_input_for_smartcare_create_batch_record_date_min_char() {
        fbInput = FunctionBlockInput.builder()
                .payload(recorddatemin())
                .fbName("SmartcareCreateBatch")
                .genericType(SmartcareCreateBatchFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for smartcare create batch record date min char")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_record_date_min_char() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch for record date min char {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_for_record_date_min_char_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for smartcare create batch input null")
    public void user_builds_the_input_for_smartcare_create_batch_input_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(createbatchnull())
                .fbName("SmartcareCreateBatch")
                .genericType(SmartcareCreateBatchFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for smartcare create batch input null")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_input_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch input null {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_input_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for smartcare create batch criteria null")
    public void user_builds_the_input_for_smartcare_create_batch_criteria_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(criterianull())
                .fbName("SmartcareCreateBatch")
                .genericType(SmartcareCreateBatchFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for smartcare create batch criteria null")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_criteria_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch criteria null {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_criteria_null_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @When("user runs the FB with sandbox mock for smartcare create batch facility code must be more than three char")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_facility_code_must_be_more_than_three_char() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch facility must be more than three char {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_facility_must_be_more_than_three_char_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input for smartcare create batch patient id must be int")
    public void user_builds_the_input_for_smartcare_create_batch_patient_id_must_be_int() {
        fbInput = FunctionBlockInput.builder()
                .payload(episodeIdnull())
                .fbName("SmartcareCreateBatch")
                .genericType(SmartcareCreateBatchFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for smartcare create batch patient id must be int")
    public void user_runs_the_fb_with_sandbox_mock_for_smartcare_create_batch_patient_id_must_be_int() {
        errors = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result for smartcare create batch for patient id must be int {string},{string} and {string}")
    public void user_validates_the_result_for_smartcare_create_batch_for_patient_id_must_be_int_and(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}
