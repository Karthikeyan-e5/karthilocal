//package stepdefinition;
//import com.e5.platform.core.domains.FunctionBlockSandboxResponse;
//import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
//import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOption;
//import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOutput;
//import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
//import e5.ftps.functionblock.generated.DownloadFilesFromFTPFB;
//import e5.ftps.functionblock.generated.MoveFilesInFTPFB;
//import e5.model.*;
//import e5.noetracker.functionblock.generated.AddNOEFB;
//import e5.noetracker.functionblock.generated.SubmitNoticesFB;
//import e5.waystar.functionblock.generated.DownloadPaymentFilesFB;
//import e5.waystar.functionblock.generated.GetAllAvailablePaymentInformationFB;
//import e5.waystar.functionblock.generated.TriggerAnExportOfAllAvailableRecordsFB;
//import e5.wellsky.functionblock.generated.ExtractAllNOEDetailsFB;
//import e5.wellsky.functionblock.generated.SendAllAvailableNOAsFB;
//import e5.wellsky.functionblock.generated.UploadEOBFilesFB;
//import e5.wellsky.functionblock.generated.UploadERAFilesFB;
//import e5.wellskyservicesportal.functionblock.generated.AddDenialReasonsFB;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static e5.model.FilterValue.Field.PAYMENT_FROM_DATE;
//import static e5.model.FilterValue.builder;
//
//
//
//public class TriggerAnExportwithoutmock {
//    FunctionBlockInput<Object> fbInput;
//    FunctionBlockInput<UploadEOBFilesFBInputPayload>  fbInput1;
//    FunctionBlockInput<UploadERAFilesFBInputPayload> fbInput2;
//    FunctionBlockSandboxResponse<Object> functionBlockResponse;
//    FunctionBlockOutput<Object> functionBlockOutput;
//    FunctionBlockInput<ExtractAllNOEDetailsFBInputPayload> fbextract;
//    FunctionBlockInput<AddNOEFBInputPayload> fbadd;
//    FunctionBlockInput<SubmitNoticesFBInputPayload> fbSubmit;
//
//    FunctionBlockInput<AddDenialReasonsFBInputPayload> fbDenials;
//    FunctionBlockInput<Object> fbDownload;
//    private static FunctionBlockInput<SendAllAvailableNOAsFBInputPayload> sendFBinput;
//
//
//    @Given("user builds the input value for trigger an export")
//    public void user_builds_the_input_value_for_trigger_an_export() {
//        List <FilterValue> filter = new ArrayList<FilterValue>();
////        filter.add(builder().field(PAYMENT_FROM_DATE).value("11/01/2023").build());
////        filter.add(builder().field(FilterValue.Field.PAYMENT_TO_DATE).value("11/22/2023").build());
//
//        filter.add(builder().field(FilterValue.Field.RECEIVED_FROM_DATE).value("2/1/2024").build());
//        filter.add(builder().field(FilterValue.Field.RECEIVED_TO_DATE).value("2/22/2024").build());
//        filter.add(builder().field(FilterValue.Field.VIEW_OPTIONS).value("All").build());
//        filter.add(builder().field(FilterValue.Field.INCLUDE_ZERO_PAYMENTS).value(Boolean.FALSE).build());
////        filter.add(builder().field(FilterValue.Field.INCLUDE_DUPLICATES).value("oo").build());
//        TriggerAnExportOfAllAvailableRecordsFBInputPayload input = TriggerAnExportOfAllAvailableRecordsFBInputPayload
//                .builder()
//                .location("Hospice & Home Healthcare of Saunders County (220907)")
//                .paymentFilter(PaymentFilter.builder()
//                        .filterType(PaymentFilter.FilterType.SEARCH)
//                        .filterValues(filter)
//
//                        .build())
//                .exportFileName("SAUNDERS_HH_CP_11_22_2023_11_11_11")
//                .agencyName("Saunders")
//                .needToArchive(Boolean.FALSE)
//
//                .exportType(TriggerAnExportOfAllAvailableRecordsFBInputPayload.ExportType.EXCEL).build();
//        fbInput = FunctionBlockInput.builder().payload(input)
//                .options(FunctionBlockOption.builder().maximumAttempts(1).build())
//                .genericType(TriggerAnExportOfAllAvailableRecordsFBInputPayload.class.getName()).build();
//
//
//    }
//
//
//    @When("user runs the FB for trigger")
//    public void user_runs_the_fb_for_trigger() {
//
//        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(TriggerAnExportOfAllAvailableRecordsFB.class);
//        functionBlockResponse = sandbox.startExecution(fbInput);
//
//    }
//    @Then("user gets the Fboutput for trigger")
//    public void user_gets_the_fboutput_for_trigger() {
//        functionBlockOutput= functionBlockResponse.getFunctionBlockOutput();
//
//    }
//    @Then("User validates the result using trigger")
//    public void user_validates_the_result_using_trigger() {
//        System.out.println(functionBlockOutput);
//        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
//    }
//
//    @Given("user builds the input value for download payment")
//    public void user_builds_the_input_value_for_download_payment() {
//        List<FilterValue> filter = new ArrayList<>();
//            filter.add(FilterValue.builder().field(FilterValue.Field.PAYMENT_ID).value("810770549").build());
//        List<Export> filter1 = new ArrayList<>();
////        filter1.add(Export.builder().exportType(Export.ExportType.FILETYPE_EOB).exportFileName("luffyQQ!").build());
////        filter1.add(Export.builder().exportType(Export.ExportType.FILETYPE_835).exportFileName("Dragon").build());
//        filter1.add(Export.builder().exportType(Export.ExportType.FILETYPE_SPR).exportFileName("Dragon111").outputType(Export.OutputType.CONVERTED)
//                .includePdf(Boolean.TRUE
//                ).build());
//        DownloadPaymentFilesFBInputPayload inputPayload = DownloadPaymentFilesFBInputPayload.builder()
//               .location("Elite Home Health LLC (255703)")
//               .downloadFilter(DownloadFilter.builder()
//                        .filterType(DownloadFilter.FilterType.ID_SEARCH)
//                        .filterValues(filter)
//                        .build())
//                .exports(filter1)
//                .agencyName("Saunders")
//                .build();
//        fbInput = FunctionBlockInput.builder().payload(inputPayload)
//                .genericType(DownloadPaymentFilesFB.class.getName()).build();
//
//    }
//    @When("user runs the FB for download payment")
//    public void user_runs_the_fb_for_download_payment() {
//        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(DownloadPaymentFilesFB.class);
//        functionBlockResponse = sandbox.startExecution(fbInput);
//
//    }
//    @Then("user gets the Fboutput for download payment")
//    public void user_gets_the_fboutput_for_download_payment() {
//        functionBlockOutput= functionBlockResponse.getFunctionBlockOutput();
//
//    }
//    @Then("User validates the result download payment")
//    public void user_validates_the_result_download_payment() {
//        System.out.println(functionBlockOutput);
//        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
//
//    }
//    @Given("user builds the input value for get all payment")
//    public void user_builds_the_input_value_for_get_all_payment() {
//        GetAllAvailablePaymentInformationFBInputPayload inputPayload = GetAllAvailablePaymentInformationFBInputPayload.builder()
//                .location("Hospice & Home Healthcare of Saunders County (220907)")
//                .uniqueIdentifier(UniqueIdentifier.builder()
//                        .exportFileName("test_1")
//                        .build()).build();
//        fbInput = FunctionBlockInput.builder().payload(inputPayload)
//                .genericType(GetAllAvailablePaymentInformationFB.class.getName()).build();
//
//    }
//    @When("user runs the FB for download get all payment")
//    public void user_runs_the_fb_for_download_get_all_payment() {
//        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(GetAllAvailablePaymentInformationFB.class);
//        functionBlockResponse = sandbox.startExecution(fbInput);
//
//    }
//    @Then("user gets the Fboutput for get all payment")
//    public void user_gets_the_fboutput_for_get_all_payment() {
//        functionBlockOutput= functionBlockResponse.getFunctionBlockOutput();
//
//    }
//    @Then("User validates the result get all payment")
//    public void user_validates_the_result_get_all_payment() {
//        System.out.println(functionBlockOutput);
//        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
//
//    }
//
//    @Given("user builds the input value for upload eight")
//    public void user_builds_the_input_value_for_upload_eight() {
//        List<String> filter = new ArrayList<>();
//        filter.add("Managed Care");
//        UploadEOBFilesFBInputPayload load = UploadEOBFilesFBInputPayload.builder()
////                .location("CA - OMC")
//                .fileLocationEOB("eyJ2IjogIjEuMSIsICJzdG9yYWdlSW5mbyI6IHsia2V5IjogIjA0MDIyMDI0L0Q6XFxVc2Vyc1xca2FydGhpa2V5YW4ucmFcXERvd25sb2Fkc1xcRmlsZSB3aXRob3V0IGdsb3NzYXJ5LnppcCIsICJyZWdpb24iOiAidXMtd2VzdC0yIiwgImJ1Y2tldF9uYW1lIjogImR1cGxvc2VydmljZXMtZGV2MDEtZTUtYm90LWRvY3MtMjQ4MjAyMzc3OTI5In0sICJzdG9yYWdlVHlwZSI6ICJTMyJ9")
//                .uploadFileNameEOB("BCBS_Nebraska_12_19_2023.pdf")
//                .agencyName("Saunders")
//                .gridFilter(GridFilter.builder()
//                       .searchByValue("51046265111111111111111111111111")
//                       .groupByValue("Insurance")
//                       .depositStartDate("01/01/2024")
//                        .depositEndDate("01/04/2024")
//                        .groupedFilter(GroupedFilter.builder()
//                                .payerType(PayerType.builder().isSelectAll(Boolean.TRUE).build())
//                                .remittanceStatus(RemittanceStatus.builder().isSelectAll(Boolean.TRUE).build())
//                                .insurance(Insurance.builder().isSelectAll(Boolean.TRUE)
//                                        .build()).build())
//                        .build())
//                .uploadAction(UploadEOBFilesFBInputPayload.UploadAction.SAVE_AND_COMPLETE)
//                .build();
//        fbInput1 = FunctionBlockInput.<UploadEOBFilesFBInputPayload>builder().payload(load)
//                .genericType(UploadEOBFilesFBInputPayload.class.getName()).build();
//
//    }
//    @When("user runs the FB for download for upload eight")
//    public void user_runs_the_fb_for_download_for_upload_eight() {
//        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(UploadEOBFilesFB.class);
//        functionBlockResponse = sandbox.startExecution(fbInput1);
//    }
//    @Then("user gets the Fboutput for upload eight")
//    public void user_gets_the_fboutput_for_upload_eight() {
//        functionBlockOutput= functionBlockResponse.getFunctionBlockOutput();
//
//    }
//    @Then("User validates the result for upload eight")
//    public void user_validates_the_result_for_upload_eight() {
//        System.out.println(functionBlockOutput);
//        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
//    }
//    @Given("user builds the input value for upload")
//    public void user_builds_the_input_value_for_upload() {
//        UploadERAFilesFBInputPayload inputPayload5 = UploadERAFilesFBInputPayload.builder()
////                .location("Chennai")
//                .fileLocation835("eyJ2IjogIjEuMSIsICJzdG9yYWdlSW5mbyI6IHsia2V5IjogIjA1MTQyMDI0L0Q6XFxVc2Vyc1xca2FydGhpa2V5YW4ucmFcXERvd25sb2Fkc1xcZHVtbXkuemlwIiwgInJlZ2lvbiI6ICJ1cy13ZXN0LTIiLCAiYnVja2V0X25hbWUiOiAiZHVwbG9zZXJ2aWNlcy1kZXYwMS1lNS1ib3QtZG9jcy0yNDgyMDIzNzc5MjkifSwgInN0b3JhZ2VUeXBlIjogIlMzIn0=")
//                .uploadFileName835("abcd.edi")
//                .agencyName("Saunders")
//                .build();
//        fbInput2 = FunctionBlockInput.<UploadERAFilesFBInputPayload>builder().payload(inputPayload5)
//                .genericType(UploadERAFilesFB.class.getName()).build();
//    }
//    @When("user runs the FB for download for upload")
//    public void user_runs_the_fb_for_download_for_upload() {
//        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(UploadERAFilesFB.class);
//        functionBlockResponse = sandbox.startExecution(fbInput2);
//    }
//    @Then("user gets the Fboutput for upload")
//    public void user_gets_the_fboutput_for_upload() {
//        functionBlockOutput= functionBlockResponse.getFunctionBlockOutput();
//    }
//    @Then("User validates the result for upload")
//    public void user_validates_the_result_for_upload() {
//        System.out.println(functionBlockOutput);
//        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
//    }
//    @Given("user builds the input value for extractnoe")
//    public void user_builds_the_input_value_for_extractnoe() {
//        ExtractAllNOEDetailsFBInputPayload extract = ExtractAllNOEDetailsFBInputPayload.builder()
//                .extractAllNoeCriteria(ExtractAllNoeCriteria.builder()
//                        .search("11")
//                        .location("11")
//                        .agencyName("Saunders")
//                        .build())
//                .extractAllNoeBehaviors(ExtractAllNoeBehaviors.builder()
//                        .batchSize(ExtractAllNoeBehaviors.BatchSize.BATCHSIZE_100)
//                        .extractType(ExtractAllNoeBehaviors.ExtractType.BULK)
//                        .extractMethod(ExtractAllNoeBehaviors.ExtractMethod.SCREEN)
//                        .savePdf(Boolean.TRUE)
//                        .build())
//                .build();
//        fbextract = FunctionBlockInput.<ExtractAllNOEDetailsFBInputPayload>builder().payload(extract)
//                .genericType(ExtractAllNOEDetailsFB.class.getName()).build();
//    }
//    @When("user runs the FB for download for extractnoe")
//    public void user_runs_the_fb_for_download_for_extractnoe() {
//        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(ExtractAllNOEDetailsFB.class);
//        functionBlockResponse = sandbox.startExecution(fbextract);
//    }
//    @Then("user gets the Fboutput for extractnoe")
//    public void user_gets_the_fboutput_for_extractnoe() {
//        functionBlockOutput= functionBlockResponse.getFunctionBlockOutput();
//    }
//    @Then("User validates the result for extractnoe")
//    public void user_validates_the_result_for_extractnoe() {
//        System.out.println(functionBlockOutput);
//        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
//    }
//    @Given("user builds the input value for Addnoe")
//    public void user_builds_the_input_value_for_addnoe() {
//        AddNOEFBInputPayload add = AddNOEFBInputPayload.builder()
//                .addNoeCriteria(AddNoeCriteria.builder()
//                        .agencyName("Saunders").build())
//                .addNoeBehaviors(AddNoeBehaviors.builder()
//                        .addNOEFormData(AddNOEFormData.builder()
//                                .agency("GIRMAL ENTERPRISES LLC - 1598410755")
//                                .dateOfBirth("03/27/2024")
//                                .firstName("e5")
//                                .lastName("e5")
//                                .memberId("4XJ3RN3VN191111111111111111")
////                                .suffix("JR")
//                                .build()).build()).build();
//         fbadd = FunctionBlockInput.<AddNOEFBInputPayload>builder().payload(add)
//                .genericType(AddNOEFB.class.getName()).build();
//    }
//    @When("user runs the FB for download for Addnoe")
//    public void user_runs_the_fb_for_download_for_addnoe() {
//        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(AddNOEFB.class);
//        functionBlockResponse = sandbox.startExecution(fbadd);
//
//    }
//    @Then("user gets the Fboutput for Addnoe")
//    public void user_gets_the_fboutput_for_addnoe() {
//        functionBlockOutput= functionBlockResponse.getFunctionBlockOutput();
//    }
//    @Then("User validates the result for Addnoe")
//    public void user_validates_the_result_for_addnoe() {
//        System.out.println(functionBlockOutput);
//        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
//    }
//    @Given("user builds the input value for Submitnoe")
//    public void user_builds_the_input_value_for_submitnoe() {
//        SubmitNoticesFBInputPayload submit = SubmitNoticesFBInputPayload.builder()
//                .submitNoticesCriteria(SubmitNoticesCriteria.builder()
//                        .search("Search")
//                        .status(SubmitNoticesCriteria.Status.ALL_STATUSES)
//                        .agency("St. Joseph Homecare & Hospice (Alternative Health Services) - 1972503365")
//                        .agencyName("Saunders")
//                        .build())
//                .submitNoticesBehaviors(SubmitNoticesBehaviors.builder()
//                        .batchSize(SubmitNoticesBehaviors.BatchSize.BATCHSIZE_50)
//                        .submitAction(SubmitNoticesBehaviors.SubmitAction.SUBMIT_TO_DDE)
//                        .gridAction(SubmitNoticesBehaviors.GridAction.EDIT_NOE)
//                        .submitNoticesFormData(SubmitNoticesFormData.builder()
//                                .primaryDiagnosis("j449")
//                                .patientControlNumber("Valerian Hospice - 1992139893")
//                                .admissionDate("11/02/2021")
//                                .physicianNpi("1114305083")
//                                .build())
//                        .identifiers(Identifiers.builder()
//                                .noeId("noeId")
//                                .hicn("hicn")
//                                .tob("81A")
//                                .build())
//                        .build())
//                .build();
//         fbSubmit = FunctionBlockInput.<SubmitNoticesFBInputPayload>builder().payload(submit)
//                .genericType(SubmitNoticesFB.class.getName()).build();
//
//    }
//    @When("user runs the FB for download for Submitnoe")
//    public void user_runs_the_fb_for_download_for_submitnoe() {
//        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(SubmitNoticesFB.class);
//        functionBlockResponse = sandbox.startExecution(fbSubmit);
//    }
//    @Then("user gets the Fboutput for Submitnoe")
//    public void user_gets_the_fboutput_for_submitnoe() {
//        functionBlockOutput= functionBlockResponse.getFunctionBlockOutput();
//    }
//    @Then("User validates the result for Submitnoe")
//    public void user_validates_the_result_for_submitnoe() {
//        System.out.println(functionBlockOutput);
//        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
//    }
//    @Given("user builds the input value for notr")
//    public void user_builds_the_input_value_for_notr() {
//        SubmitNoticesFBInputPayload submitnotr = SubmitNoticesFBInputPayload.builder()
//                .submitNoticesCriteria(SubmitNoticesCriteria.builder()
//                        .search("5V99C47AA47")
//                        .status(SubmitNoticesCriteria.Status.ALL_STATUSES)
//                        .agency("All Agencies")
//                        .agencyName("Saunders")
//                        .build())
//                .submitNoticesBehaviors(SubmitNoticesBehaviors.builder()
//                        .batchSize(SubmitNoticesBehaviors.BatchSize.BATCHSIZE_50)
//                        .submitAction(SubmitNoticesBehaviors.SubmitAction.SUBMIT_TO_DDE)
//                        .gridAction(SubmitNoticesBehaviors.GridAction.SEND_8_XB)
//                        .submitNoticesFormData(SubmitNoticesFormData.builder()
//                                .revocationDate("11/11/2023")
//                                .statementFromDate("11/11/2023")
//                                .statementToDate("11/11/2023")
//                                .admissionDate("11/14/2023")
//                                .build())
//                        .identifiers(Identifiers.builder()
//                                .hicn("5V99C47AA47")
//                                .tob("81A")
//                                .patientName("BARTEK, ROSE MARIE")
//                                .build())
//                        .build())
//                .build();
//        fbSubmit = FunctionBlockInput.<SubmitNoticesFBInputPayload>builder().payload(submitnotr)
//                .genericType(SubmitNoticesFB.class.getName()).build();
//    }
//    @When("user runs the FB for download for notr")
//    public void user_runs_the_fb_for_download_for_notr() {
//        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(SubmitNoticesFB.class);
//        functionBlockResponse = sandbox.startExecution(fbSubmit);
//    }
//    @Then("user gets the Fboutput for notr")
//    public void user_gets_the_fboutput_for_notr() {
//        functionBlockOutput= functionBlockResponse.getFunctionBlockOutput();
//    }
//    @Then("User validates the result for notr")
//    public void user_validates_the_result_for_notr() {
//        System.out.println(functionBlockOutput);
//        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
//    }
//    @Given("user builds the input value for downloadfile")
//    public void user_builds_the_input_value_for_downloadfile() {
//        DownloadFilesFromFTPFBInputPayload inputPayload = DownloadFilesFromFTPFBInputPayload.builder()
//                .agencyName("loc")
//                .fileDetail(List.of(FileDetail.builder().newFileName("Sample.txt")
//
//                        .downloadFilePath("/Saunders County/Test/Test1/Test.txt").build()))
//
//                .build();
//        fbDownload = FunctionBlockInput.builder()
//                .genericType(e5.model.DownloadFilesFromFTPFBInputPayload.class.getName())
//                .payload(inputPayload)
//                .build();
//        System.out.println(fbDownload);
//
//    }
//    @When("user runs the FB for download for downloadfile")
//    public void user_runs_the_fb_for_download_for_downloadfile() {
//        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(DownloadFilesFromFTPFB.class);
//        functionBlockResponse = sandbox.startExecution(fbDownload);
//    }
//    @Then("user gets the Fboutput for downloadfile")
//    public void user_gets_the_fboutput_for_downloadfile() {
//        functionBlockOutput= functionBlockResponse.getFunctionBlockOutput();
//    }
//    @Then("User validates the result for downloadfile")
//    public void user_validates_the_result_for_downloadfile() {
//        System.out.println(functionBlockOutput);
//        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
//    }
//    @Given("user builds the input value for Movefile")
//    public void user_builds_the_input_value_for_movefile() {
//        MoveFilesInFTPFBInputPayload inputPayload = MoveFilesInFTPFBInputPayload.builder()
//                .agencyName("kl")
//                .filesToMove(List.of(FilesToMove.builder()
//                        .destinationFolder("/Saunders County/Test/Test2")
//                        .sourcePath("/Saunders County/Test/Test1/Test.txt").build()))
//                .build();
//        fbDownload = FunctionBlockInput.builder()
//                .genericType(e5.model.DownloadFilesFromFTPFBInputPayload.class.getName())
//                .payload(inputPayload)
//                .build();
//        System.out.println(fbDownload);
//    }
//    @When("user runs the FB for download for Movefile")
//    public void user_runs_the_fb_for_download_for_movefile() {
//        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(MoveFilesInFTPFB.class);
//        functionBlockResponse = sandbox.startExecution(fbDownload);
//    }
//    @Then("user gets the Fboutput for Movefile")
//    public void user_gets_the_fboutput_for_movefile() {
//        functionBlockOutput= functionBlockResponse.getFunctionBlockOutput();
//    }
//    @Then("User validates the result for Movefile")
//    public void user_validates_the_result_for_movefile() {
//        System.out.println(functionBlockOutput);
//        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
//    }
//
//    @Given("user builds the input value for noa")
//    public void user_builds_the_input_value_for_noa() {
//        SendAllAvailableNOAsFBInputPayload inputPayload = SendAllAvailableNOAsFBInputPayload.builder()
//                .noaCriteria(NoaCriteria.builder()
//                        .location("CA - Sacramento")
////                        .search("Jack")
//                        .agencyName("Saunders")
//                        .noaFilter(NoaFilter.builder()
//                                .branch(Branch.builder().isSelectAll(Boolean.TRUE).build())
//                                .daysLeft(DaysLeft.builder().isSelectAll(Boolean.TRUE).build())
////                                .patientName("Jack Sparrow")
//                                .payer(Payer.builder().isSelectAll(Boolean.TRUE).build())
//                                .status(Status.builder().isSelectAll(Boolean.FALSE).statusValue(List.of(StatusValue.READY_TO_SEND)).build())
//                                .errors(Errors.builder().isSelectAll(Boolean.TRUE).build())
//                                .build())
//                        .build())
//                .noaBehaviors(NoaBehaviors.builder().batchSize(NoaBehaviors.BatchSize.BATCHSIZE_10).returnType(NoaBehaviors.ReturnType.RAW).build())
//                .build();
//        sendFBinput = FunctionBlockInput.<SendAllAvailableNOAsFBInputPayload>builder()
//                .payload(inputPayload).build();
//    }
//    @When("user runs the FB for download for noa")
//    public void user_runs_the_fb_for_download_for_noa() {
//        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(SendAllAvailableNOAsFB.class);
//        functionBlockResponse = sandbox.startExecution(sendFBinput);
//    }
//    @Then("user gets the Fboutput for noa")
//    public void user_gets_the_fboutput_for_noa() {
//        functionBlockOutput= functionBlockResponse.getFunctionBlockOutput();
//    }
//    @Then("User validates the result for noa")
//    public void user_validates_the_result_for_noa() {
//        System.out.println(functionBlockOutput);
//        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
//    }
//    @Given("user builds the input value for denials")
//    public void user_builds_the_input_value_for_denials() {
//        AddDenialReasonsFBInputPayload add= AddDenialReasonsFBInputPayload.builder()
//                .addDenialsReasonBehaviors(AddDenialsReasonBehaviors.builder()
//                        .denialComments("OA    Other adjustments\n" +
//                                "\n" +
//                                "23    The impact of prior payer(s) adjudication including payments and/or adjustments. (Use only with Group \n" +
//                                "      Code OA)  ")
//                        .mfaOption(AddDenialsReasonBehaviors.MfaOption.EMAIL_AUTHENTICATION)
//                        .build())
//                .addDenialsReasonCriteria(AddDenialsReasonCriteria.builder()
//                        .agencyName("Saunders")
//                        .addDenialsReasonFilter(AddDenialsReasonFilter.builder()
////                                 .serviceStartDate("9/23/2022")
//                                .claimNumber("45664476")
//                                .includeClosedClaim(Boolean.TRUE)
//                                .patientName("ZAVODNY")
//                                .clientName("Saunders Home Health")
//                                .build()).build())
//                .build();
//
//        fbDenials= FunctionBlockInput.<AddDenialReasonsFBInputPayload>builder()
//                .payload(add)
//                .genericType(AddDenialReasonsFBInputPayload.class.getName()).build();
//
//    }
//    @When("user runs the FB for download for denials")
//    public void user_runs_the_fb_for_download_for_denials() {
//        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(AddDenialReasonsFB.class);
//        functionBlockResponse = sandbox.startExecution(fbDenials);
//    }
//    @Then("user gets the Fboutput for denials")
//    public void user_gets_the_fboutput_for_denials() {
//        functionBlockOutput= functionBlockResponse.getFunctionBlockOutput();
//    }
//    @Then("User validates the result for denials")
//    public void user_validates_the_result_for_denials() {
//        System.out.println(functionBlockOutput);
//        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
//    }
//
//}
