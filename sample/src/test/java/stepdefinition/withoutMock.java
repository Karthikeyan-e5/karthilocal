package stepdefinition;

import com.e5.platform.core.domains.FunctionBlockSandboxResponse;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOption;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOutput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
//import e5.hchb.functionblock.generated.ExportGridFromWorkflowConsoleFB;
//import e5.hchb.model.exportgridfromworkflowconsolefb.*;

//import e5.hchb.functionblock.generated.LockOasisAssessmentsFB;
//import e5.hchb.model.lockoasisassessmentsfb.*;
//import e5.hchb.model.lockoasisassessmentsfb.WorkflowConsoleEvents;
//import e5.hchb.model.lockoasisassessmentsfb.WorkflowConsolePanelFilter;


import e5.hchb.functionblock.generated.DownloadAttachmentsFB;
import e5.hchb.model.downloadattachmentsfb.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.*;

public class withoutMock {
    FunctionBlockInput<Object> fbInput;
    FunctionBlockSandboxResponse<Object> functionBlockResponse;

    FunctionBlockOutput<Object> functionBlockOutput;




//    @Given("user builds the input value for export grid from console")
//    public void user_builds_the_input_value_for_export_grid_from_console() {
//        Set<String> filter = new HashSet<>();
//        filter.add("EDIT/LOCK OASIS");
////        filter.add("Followup");
////        filter.add("Resumption");
//        ExportGridFromWorkflowConsoleFBInputPayload inputPayload = ExportGridFromWorkflowConsoleFBInputPayload.builder()
//                .exportGridFromWorkflowConsoleCriteria(ExportGridFromWorkflowConsoleCriteria.builder()
//
//                        .workflowConsoleType(ExportGridFromWorkflowConsoleCriteria.WorkflowConsoleType.PATIENT_RELATED_TASKS)
//
//                        .workflowConsolePanelFilter(WorkflowConsolePanelFilter.builder()
//                                .workflowConsoleStages(WorkflowConsoleStages.builder()
//                                        .status(WorkflowConsoleStages.Status.ACTIVE)
////                                        .searchBy("Stage")
//                                        .value(filter).build())
//                                .build())
//                        .build())
//                .exportGridFromWorkflowConsoleBehaviors(ExportGridFromWorkflowConsoleBehaviors.builder()
//                        .exportType(ExportGridFromWorkflowConsoleBehaviors.ExportType.E_5_STORAGE).build())
//                .build();
//        fbInput = FunctionBlockInput.builder()
//                .payload(inputPayload)
//                .fbName("ExportGridFromWorkflowConsole")
//                .options(FunctionBlockOption.builder().maximumAttempts(1).build())
//                .genericType(ExportGridFromWorkflowConsoleFBInputPayload.class.getName()).build();
//        System.out.println(fbInput);
//    }
//    @When("user runs the FB for export grid from console")
//    public void user_runs_the_fb_for_export_grid_from_console() {
//        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(ExportGridFromWorkflowConsoleFB.class);
//         functionBlockResponse = sandbox.startExecution(fbInput);
//    }
//    @Then("user gets the Fboutput for export grid from console")
//    public void user_gets_the_fboutput_for_export_grid_from_console() {
//         functionBlockOutput = functionBlockResponse.getFunctionBlockOutput();
//    }
//    @Then("User validates the result using export grid from console")
//    public void user_validates_the_result_using_export_grid_from_console() {
//        System.out.println(functionBlockOutput);
//        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
//    }
//    @Given("user builds the input value for edit lock")
//    public void user_builds_the_input_value_for_edit_lock() {
//        Set<String> StageValue = new HashSet<String>(Arrays.asList("Edit/Lock OASIS"));
//        Set<String> EventValue = new HashSet<String>(Arrays.asList("RESUMPTION OF CARE"));
//        List<ErrorHandlingConfig> popups = new ArrayList<>();
//        popups.add(ErrorHandlingConfig.builder().popupName(ErrorHandlingConfig.PopupName.MEDICARE_OR_MEDICAID_PAYMENT_ANSWERS)
//                .action(ErrorHandlingConfig.Action.OK)
//                .proceedToLock(Boolean.FALSE)
//                .build());
//        popups.add(ErrorHandlingConfig.builder()
//                .popupName(ErrorHandlingConfig.PopupName.MEDICARE_OR_MEDICAID_PAYMENT_ANSWERS)
//                .action(ErrorHandlingConfig.Action.OK)
//
//                .proceedToLock(Boolean.FALSE)
//
//                .build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.BLANK_SSN_IN_M_0064)
//                .action(ErrorHandlingConfig.Action.OK)
//                .proceedToLock(Boolean.FALSE)
//
//                .build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.DIAGNOSIS_DM)
//                .action(ErrorHandlingConfig.Action.OK)
//                .proceedToLock(Boolean.FALSE)
//
//                .build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.DIAGNOSIS_NOA)
//                .action(ErrorHandlingConfig.Action.OK)
//                .proceedToLock(Boolean.FALSE)
//
//                .build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.DIAGNOSIS_PVD_PAD)
//                .action(ErrorHandlingConfig.Action.OK)
//                .proceedToLock(Boolean.FALSE)
//
//                .build());
//
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.INVALID_DATE_DIFFERENCE)
//                .action(ErrorHandlingConfig.Action.OK)
//                .proceedToLock(Boolean.FALSE)
//
//                .build());
//
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.INVALID_PRIMARY_DIAGNOSIS_SEVERITY_RATING)
//                .action(ErrorHandlingConfig.Action.OK)
//                .proceedToLock(Boolean.FALSE)
//
//                .build());
//
//
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.OASIS_VALIDATION_ERRORS)
//                .action(ErrorHandlingConfig.Action.DO_NOT_LOCK_WITH_ERRORS)
//                        .proceedToLock(Boolean.FALSE)
//
//                .build());
//
//
//
//        LockOasisAssessmentsFBInputPayload inputPayload = LockOasisAssessmentsFBInputPayload.builder()
//
//                .lockOasisAssessmentsCriteria(LockOasisAssessmentsCriteria.builder()
//                        .workflowConsoleType(LockOasisAssessmentsCriteria.WorkflowConsoleType.PATIENT_RELATED_TASKS)
//                        .workflowConsolePanelFilter(WorkflowConsolePanelFilter.builder()
//                                .workflowConsoleEvents(WorkflowConsoleEvents.builder()
//                                        .value(EventValue)
//                                        .status(WorkflowConsoleEvents.Status.ACTIVE)
////                                        .searchBy("SOC/RECERT")
//                                        .build())
//                                .workflowConsoleStages(WorkflowConsoleStages.builder()
//                                        .value(StageValue)
//                                        .status(WorkflowConsoleStages.Status.ACTIVE)
////                                        .searchBy("Edit/Lock OASIS")
//                                        .build()).build())
//                        .workflowConsoleGridFilter(WorkflowConsoleGridFilter.builder()
////                                .workflowConsoleArrived(WorkflowConsoleArrived.builder()
////                                        .value("07/23/2024 06:42 PM").build())
////                                .workflowConsolePatientName(WorkflowConsolePatientName.builder()
////                                        .value("M0200005863001").build())
//                                .workflowConsoleMrNo(WorkflowConsoleMrNo.builder()
//                                        .value("M0500005586901").build())
////                                .workflowConsoleTask(WorkflowConsoleTask.builder()
////                                        .value("EDIT/LOCK OASIS ASSESSMENT")
////                                        .build())
//                                .build()).build())
//
//                .lockOasisAssessmentsBehaviors(LockOasisAssessmentsBehaviors.builder()
//                        .errorHandlingConfig(popups).build()).build();
//        fbInput = FunctionBlockInput.builder()
//                .payload(inputPayload)
//                .fbName("Editlock")
//                .options(FunctionBlockOption.builder().maximumAttempts(1).build())
//                .genericType(LockOasisAssessmentsFBInputPayload.class.getName()).build();
//        System.out.println(fbInput);
//    }
//    @When("user runs the FB for edit lock")
//    public void user_runs_the_fb_for_edit_lock() {
//        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(LockOasisAssessmentsFB.class);
//        functionBlockResponse = sandbox.startExecution(fbInput);
//    }
//    @Then("user gets the Fboutput for edit lock")
//    public void user_gets_the_fboutput_for_edit_lock() {
//        functionBlockOutput = functionBlockResponse.getFunctionBlockOutput();
//    }
//    @Then("User validates the result using for edit lock")
//    public void user_validates_the_result_using_for_edit_lock() {
//        System.out.println(functionBlockOutput);
//        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
//    }
    @Given("user builds the input value for download attachments")
    public void user_builds_the_input_value_for_download_attachments() {




            List<Episodestatus> episode=new ArrayList<>();
            episode.add(Episodestatus.ALL);




            List<Value__1> value3 = new ArrayList<>();
            value3.add(Value__1.builder().operator(Value__1.Operator.EQUALS).value("EPISODE").build());


            List<Value__2> value4 = new ArrayList<>();
            value4.add(Value__2.builder().operator(Value__2.Operator.EQUALS).value("DOCUMENTATION").build());


            List<Value__3> value5 = new ArrayList<>();
            value5.add(Value__3.builder().operator(Value__3.Operator.EQUALS).value("PDF-2.PDF").build());


            List<Value__4> value6 = new ArrayList<>();
            value6.add(Value__4.builder().operator(Value__4.Operator.EQUALS).value("09/17/2024 11:25:05 PM").build());


            List<FileNameDetail> value7 = new ArrayList<>();
            value7.add(FileNameDetail.builder().existingFilename("PDF-2.PDF").requiredFilename("karthi.PDF").build());

        DownloadAttachmentsFBInputPayload inputpayload = DownloadAttachmentsFBInputPayload.builder()
                .downloadAttachmentsCriteria(DownloadAttachmentsCriteria.builder()
                        .clinicalInputGridFilter(ClinicalInputGridFilter.builder()
                                .soeDate(null).build())
                        .clinicalInputPanelFilter(ClinicalInputPanelFilter.builder()
                                .clinicalInput(ClinicalInput.builder()
                                        .episodeStatus(episode)
                                        .build())
                                .commonFilter(CommonFilter.builder()
                                        .patientStatus(CommonFilter.PatientStatus.ACTIVE)
                                        .serviceLines(null).build())
                                .search(Search.builder().episodeId("133802")
                                        .build()).build())
                        .viewPatientAttachmentsGridFilter(ViewPatientAttachmentsGridFilter.builder()
                                .attachmentLocation(null)
                                .attachmentType(null)
                                .fileNames(null)
                                .importedOn(null).build())
                        .viewPatientAttachmentsPanelFilter(ViewPatientAttachmentsPanelFilter.builder()
                                .additionalSearchFilters(AdditionalSearchFilters.builder()
                                        .importedOnDates(null).build())
                                .searchForExistingAttachments(SearchForExistingAttachments.builder()
                                        .status(SearchForExistingAttachments.Status.ACTIVE)

                                        .visitOrEffectiveDate(null).build()).build()).build())
                .downloadAttachmentsBehaviors(DownloadAttachmentsBehaviors.builder()
//                        .fileNameDetails(value7)
                        .recordInputFilter(RecordInputFilter.builder()
                                .attachmentType(RecordInputFilter.AttachmentType.EPISODE_ATTACHMENT).build())
                        .nameChangeNeeded(DownloadAttachmentsBehaviors.NameChangeNeeded.NO).build()).build();


        fbInput = FunctionBlockInput.builder()
                .payload(inputpayload)
                .fbName("DownloadAttachments")
                .options(FunctionBlockOption.builder().maximumAttempts(1).build())
                .genericType(DownloadAttachmentsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB for download attachments")
    public void user_runs_the_fb_for_download_attachments() {
        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(DownloadAttachmentsFB.class);
        functionBlockResponse = sandbox.startExecution(fbInput);
    }
    @Then("user gets the Fboutput for download attachments")
    public void user_gets_the_fboutput_for_download_attachments() {
        functionBlockOutput = functionBlockResponse.getFunctionBlockOutput();
    }
    @Then("User validates the result using for download attachments")
    public void user_validates_the_result_using_for_download_attachments() {
        System.out.println(functionBlockOutput);
        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
    }


}
