package Payload;

import Base.Downloadattachmentprevalidtaionbase;
import com.e5.platform.core.event.PayloadError;
import e5.hchb.model.downloadattachmentsfb.*;

import java.util.ArrayList;
import java.util.List;

public class DownloadAttachmentsDelegation extends Downloadattachmentprevalidtaionbase {

    public DownloadAttachmentsFBInputPayload positiveFlow() {
        DownloadAttachmentsFBInputPayload inputpayload = DownloadAttachmentsFBInputPayload.builder()
                .downloadAttachmentsCriteria(DownloadAttachmentsCriteria.builder()
                        .clinicalInputGridFilter(ClinicalInputGridFilter.builder()
                                .soeDate(SoeDate.builder()
                                        .filterBasedOn(SoeDate.FilterBasedOn.ALL)
                                        .values(value0())
                                        .build()).build())
                        .clinicalInputPanelFilter(ClinicalInputPanelFilter.builder()
                                .clinicalInput(ClinicalInput.builder()
                                        .episodeStatus(Value1())
                                        .build())
                                .commonFilter(CommonFilter.builder()
                                        .patientStatus(CommonFilter.PatientStatus.ACTIVE)
                                        .serviceLines(Value2()).build())
                                .search(Search.builder().episodeId("123")
                                        .mrNo("").build()).build())
                        .viewPatientAttachmentsGridFilter(ViewPatientAttachmentsGridFilter.builder()
                                .attachmentLocation(AttachmentLocation.builder()
                                        .filterBasedOn(AttachmentLocation.FilterBasedOn.ALL)
                                        .values(Value3()).build())
                                .attachmentType(AttachmentType.builder()
                                        .filterBasedOn(AttachmentType.FilterBasedOn.ALL)
                                        .values(Value4()).build())
                                .fileNames(FileNames.builder()
                                        .filterBasedOn(FileNames.FilterBasedOn.ANY)
                                        .values(Value5()).build())
                                .importedOn(ImportedOn.builder()
                                        .filterBasedOn(ImportedOn.FilterBasedOn.ANY)
                                        .values(Value6()).build()).build())
                        .viewPatientAttachmentsPanelFilter(ViewPatientAttachmentsPanelFilter.builder()
                                .additionalSearchFilters(AdditionalSearchFilters.builder()
                                        .importedOnDates(ImportedOnDates.builder()
                                                .from("02/11/1578")
                                                .to("02/11/1578").build()).build())
                                .searchForExistingAttachments(SearchForExistingAttachments.builder()
                                        .status(SearchForExistingAttachments.Status.ACTIVE)
                                        .visitOrEffectiveDate(VisitOrEffectiveDate.builder()
                                                .from("02/11/1578")
                                                .to("02/11/1578").build()).build()).build()).build())
                .downloadAttachmentsBehaviors(DownloadAttachmentsBehaviors.builder()
                        .fileNameDetails(Value7())
                        .recordInputFilter(RecordInputFilter.builder()
                                .attachmentType(RecordInputFilter.AttachmentType.EPISODE_ATTACHMENT).build())
                        .nameChangeNeeded(DownloadAttachmentsBehaviors.NameChangeNeeded.YES).build()).build();

        return inputpayload;
    }
    public DownloadAttachmentsFBOutputPayload outputpositiveFlow() {
        List<ExportedFileDetail> export = new ArrayList<>();
        export.add(ExportedFileDetail.builder().exportedFileName("vgdfggdgd").exportedAttachmentToken("hfsdhfdg").build());
        DownloadAttachmentsFBOutputPayload outputPayload =DownloadAttachmentsFBOutputPayload.builder()
                .exportedAttachments(ExportedAttachments.builder()
                        .exportedFileDetails(export).build())
                .build();

        return outputPayload;
    }
    public DownloadAttachmentsFBInputPayload invalidInput() {
        DownloadAttachmentsFBInputPayload inputpayload = DownloadAttachmentsFBInputPayload.builder()
                .downloadAttachmentsCriteria(DownloadAttachmentsCriteria.builder()
                        .clinicalInputGridFilter(ClinicalInputGridFilter.builder()
                                .soeDate(SoeDate.builder()
                                        .filterBasedOn(SoeDate.FilterBasedOn.ALL)
                                        .values(value0())
                                        .build()).build())
                        .clinicalInputPanelFilter(ClinicalInputPanelFilter.builder()
                                .clinicalInput(ClinicalInput.builder()
                                        .episodeStatus(Value1())
                                        .build())
                                .commonFilter(CommonFilter.builder()
                                        .patientStatus(CommonFilter.PatientStatus.ACTIVE)
                                        .serviceLines(Value2()).build())
                                .search(Search.builder()
                                        .build()).build())
                        .viewPatientAttachmentsGridFilter(ViewPatientAttachmentsGridFilter.builder()
                                .attachmentLocation(AttachmentLocation.builder()
                                        .filterBasedOn(AttachmentLocation.FilterBasedOn.ALL)
                                        .values(Value3()).build())
                                .attachmentType(AttachmentType.builder()
                                        .filterBasedOn(AttachmentType.FilterBasedOn.ALL)
                                        .values(Value4()).build())
                                .fileNames(FileNames.builder()
                                        .filterBasedOn(FileNames.FilterBasedOn.ANY)
                                        .values(Value5()).build())
                                .importedOn(ImportedOn.builder()
                                        .filterBasedOn(ImportedOn.FilterBasedOn.ANY)
                                        .values(Value6()).build()).build())
                        .viewPatientAttachmentsPanelFilter(ViewPatientAttachmentsPanelFilter.builder()
                                .additionalSearchFilters(AdditionalSearchFilters.builder()
                                        .importedOnDates(ImportedOnDates.builder()
                                                .from("02/11/1578")
                                                .to("02/11/1578").build()).build())
                                .searchForExistingAttachments(SearchForExistingAttachments.builder()
                                        .status(SearchForExistingAttachments.Status.ACTIVE)
                                        .visitOrEffectiveDate(VisitOrEffectiveDate.builder()
                                                .from("02/11/1578")
                                                .to("02/11/1578").build()).build()).build()).build())
                .downloadAttachmentsBehaviors(DownloadAttachmentsBehaviors.builder()
                        .fileNameDetails(Value7())
                        .recordInputFilter(RecordInputFilter.builder()
                                .attachmentType(RecordInputFilter.AttachmentType.EPISODE_ATTACHMENT).build())
                        .nameChangeNeeded(DownloadAttachmentsBehaviors.NameChangeNeeded.YES).build()).build();

        return inputpayload;
    }
    public DownloadAttachmentsFBOutputPayload invalidOutput() {
        List<ExportedFileDetail> export = new ArrayList<>();
        export.add(ExportedFileDetail.builder().exportedFileName("vgdfggdgd").exportedAttachmentToken("hfsdhfdg").build());
        DownloadAttachmentsFBOutputPayload outputPayload =DownloadAttachmentsFBOutputPayload.builder()
                .exportedAttachments(ExportedAttachments.builder()
                        .build())
                .build();

        return outputPayload;
    }

    public DownloadAttachmentsFBOutputPayload empty() {
        DownloadAttachmentsFBOutputPayload outputPayload =DownloadAttachmentsFBOutputPayload.builder()

                .build();

        return outputPayload;
    }

    public List<PayloadError> unknownError() {
        List<PayloadError> payloadErrorList = new ArrayList<>();
        payloadErrorList.add(PayloadError.builder().errorCode("BE_003222222").errorMessage("App hostname is invalid - Create Batch").errSrc("Delegation").build());
        return payloadErrorList;
    }
    public List<PayloadError> MultipleError() {
        List<PayloadError> payloadErrorList = new ArrayList<>();
        payloadErrorList.add(PayloadError.builder().errorCode("BE_000").errorMessage("Unknown error occurred").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_001").errorMessage("Username is not editable").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_002").errorMessage("Password is not editable").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_003").errorMessage("Log button not enabled").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_004").errorMessage("Valid credential").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_005").errorMessage("Detect citrix popup button disabled").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_006").errorMessage("Already stalled button disabled").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_007").errorMessage("Database icon not enabled").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_008").errorMessage("Database open button not enabled").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_009").errorMessage("Search icon not enabled").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_010").errorMessage("Database field not enabled").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_011").errorMessage("Duplicate record found").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_012").errorMessage("Record not found").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_013").errorMessage("Unable to access included medical records").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_014").errorMessage("Unable to access status").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_015").errorMessage("Unable to access visit effective date").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_016").errorMessage("Unable to access last updated date").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_017").errorMessage("Unable to access existing attachment button").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_018").errorMessage("Unable to access additional attachment button").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_019").errorMessage("Unable to access file name textbox").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_020").errorMessage("Unable to access load button").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_021").errorMessage("Unable to access type grid filters").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_022").errorMessage("Unable to access location grid filters").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_023").errorMessage("Unable to access file name grid filters").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_024").errorMessage("Unable to access imported on grid filters").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_025").errorMessage("Unable to access grid header").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_026").errorMessage("Unable to access context menu").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_027").errorMessage("No folder file side extracted file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_028").errorMessage("Settings icon not enabled").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_029").errorMessage("Logout button not enabled").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_030").errorMessage("Search limit popup still exist").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_031").errorMessage("Record not found in download attachments").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_002").errorMessage("Error while loading log credentials").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_003").errorMessage("Log page not found error").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_004").errorMessage("Unable to access username").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_005").errorMessage("Unable to access password").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_006").errorMessage("Unable to access log button").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_007").errorMessage("Unable to detect citrix popup").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_008").errorMessage("Unable to access detect citrix popup button").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_009").errorMessage("Open citrix popup not found").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_010").errorMessage("Unable to click citrix popup button").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_011").errorMessage("Database page not found").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_012").errorMessage("Unable to access already stalled button").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_013").errorMessage("Unable to access database").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_014").errorMessage("Unable to access database open button").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_015").errorMessage("Unable to access search field").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_016").errorMessage("Unable to access database field").errSrc("Delegation").build());
        return payloadErrorList;
    }
    public List<PayloadError> knownError() {
        List<PayloadError> payloadErrorList = new ArrayList<>();
        payloadErrorList.add(PayloadError.builder().errorCode("BE_000").errorMessage("Unknown error occurred").errSrc("Delegation").build());
        return payloadErrorList;
    }
    public List<PayloadError> unknownmultipleError() {
        List<PayloadError> payloadErrorList = new ArrayList<>();
        payloadErrorList.add(PayloadError.builder().errorCode("BE_00011").errorMessage("Unknown error occurred").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_00011111").errorMessage("Unknown error occurred").errSrc("Delegation").build());
        return payloadErrorList;
    }
    public List<PayloadError> knownunknownError() {
        List<PayloadError> payloadErrorList = new ArrayList<>();
        payloadErrorList.add(PayloadError.builder().errorCode("BE_00011").errorMessage("Unknown error occurred").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_000").errorMessage("Unknown error occurred").errSrc("Delegation").build());
        return payloadErrorList;
    }
}
