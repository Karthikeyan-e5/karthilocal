package stepdefinition;

import Payload.ExportGridStep;
import com.e5.platform.core.event.PayloadError;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import e5.hchb.functionblock.generated.ExportGridFromWorkflowConsoleFB;
import e5.hchb.model.exportgridfromworkflowconsolefb.*;
import e5.model.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExportGrid extends ExportGridStep {
    FunctionBlockInput<Object> fbInput;
    List<PayloadError> errors;

    @Given("User builds the input for export grid")
    public void user_builds_the_input_for_export_grid() {
         fbInput = FunctionBlockInput.builder()
                .payload(Positive())
                 .fbName("")
                .genericType(ExportGridFromWorkflowConsoleFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB with sandbox mock for export grid")
    public void user_runs_the_fb_with_sandbox_mock_for_export_grid() {
        errors = FunctionBlockSandbox.forFB(ExportGridFromWorkflowConsoleFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);

    }
    @Then("User validates the result for export grid")
    public void user_validates_the_result_for_export_grid() {
        Assert.assertEquals(new ArrayList<PayloadError>(), errors);
    }
    @Given("User builds the input file for Export Grid From Workflow fb when Stage filter is null")
    public void user_builds_the_input_file_for_export_grid_from_workflow_fb_when_stage_filter_is_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(stagenull())
                .genericType(ExportGridFromWorkflowConsoleFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of add denails reason fb when Stage filter is null")
    public void user_runs_fb_using_input_file_of_add_denails_reason_fb_when_stage_filter_is_null() {
        errors = FunctionBlockSandbox.forFB(ExportGridFromWorkflowConsoleFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when Stage filter is null")
    public void user_validate_the_output_as_and_when_stage_filter_is_null(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }


}
