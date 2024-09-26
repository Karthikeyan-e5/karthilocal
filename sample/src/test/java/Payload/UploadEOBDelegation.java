package Payload;

import e5.model.*;

import java.util.ArrayList;
import java.util.List;

public class UploadEOBDelegation {
    public UploadEOBFilesFBInputPayload Positive() {
        List<String> filter = new ArrayList<>();
        filter.add("Aetna");
        UploadEOBFilesFBInputPayload inputPayload = UploadEOBFilesFBInputPayload.builder()
                .location("London")
                .agencyName("Saunders")
                .fileLocationEOB("fileManager")
                .uploadFileNameEOB("Explanation of Benifits.pdf")
                .gridFilter(GridFilter.builder()
                        .searchByValue("Managed Care")
                        .groupByValue("Insurance")
                        .depositStartDate("10/02/2023")
                        .depositEndDate("11/02/2023")
                        .groupedFilter(GroupedFilter.builder()
                                .payerType(PayerType.builder().isSelectAll(Boolean.TRUE).build())
                                .remittanceStatus(RemittanceStatus.builder().isSelectAll(Boolean.TRUE).build())
                                .insurance(Insurance.builder().isSelectAll(Boolean.TRUE)
                                        .values(filter)
                                        .build()).build())
                        .build())
                .uploadAction(UploadEOBFilesFBInputPayload.UploadAction.SAVE_AND_COMPLETE)

                .build();
        return inputPayload;
    }

    public UploadEOBFilesFBInputPayload FileLocationNull() {
        List<String> filter = new ArrayList<>();
        filter.add("Aetna");
        UploadEOBFilesFBInputPayload inputPayload = UploadEOBFilesFBInputPayload.builder()
                .location("London")
                .uploadFileNameEOB("Explanation of Benifits")
                .gridFilter(GridFilter.builder()
                        .searchByValue("Managed Care")
                        .groupByValue("Insurance")
                        .depositStartDate("10/02/2023")
                        .depositEndDate("11/02/2023")
                        .groupedFilter(GroupedFilter.builder()
                                .payerType(PayerType.builder().isSelectAll(Boolean.TRUE).build())
                                .remittanceStatus(RemittanceStatus.builder().isSelectAll(Boolean.TRUE).build())
                                .insurance(Insurance.builder().isSelectAll(Boolean.TRUE)
                                        .values(filter)
                                        .build()).build())
                        .build())
                .uploadAction(UploadEOBFilesFBInputPayload.UploadAction.SAVE_AND_COMPLETE)
                .build();
        return inputPayload;
    }

    public List<com.e5.platform.core.event.PayloadError> listedError() {
        List<com.e5.platform.core.event.PayloadError> payloadErrorList = new ArrayList<>();

        com.e5.platform.core.event.PayloadError error01 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("BE_002")
                .errorMessage("Error message")
                .errSrc("Delegation")
                .build();
        payloadErrorList.add(error01);
        return payloadErrorList;

    }

    public List<com.e5.platform.core.event.PayloadError> UnKnownError() {
        List<com.e5.platform.core.event.PayloadError> payloadErrorList = new ArrayList<>();

        com.e5.platform.core.event.PayloadError error01 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("E5_WELLSKY_FB_UPLOADEOBFILES_BE_0010")
                .errorMessage("Error message")
                .errSrc("Delegation")
                .build();

        payloadErrorList.add(error01);

        return payloadErrorList;
    }


    public List<com.e5.platform.core.event.PayloadError> MultipleErrors() {
        List<com.e5.platform.core.event.PayloadError> payloadErrorList = new ArrayList<>();

        com.e5.platform.core.event.PayloadError error02 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("BE_001")
                .errorMessage("Error message")
                .errSrc("Delegation")
                .build();
        com.e5.platform.core.event.PayloadError error03 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("BE_002").errSrc("Delegation")
                .errorMessage("Error message")
                .build();
        com.e5.platform.core.event.PayloadError error04 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("BE_003").errSrc("Delegation")
                .errorMessage("Error message")
                .build();
        com.e5.platform.core.event.PayloadError error05 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("BE_004").errSrc("Delegation")
                .errorMessage("Error message")
                .build();
        com.e5.platform.core.event.PayloadError error06 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("SE_001").errSrc("Delegation")
                .errorMessage("Error message")
                .build();
        com.e5.platform.core.event.PayloadError error07 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("SE_002").errSrc("Delegation")
                .errorMessage("Error message")
                .build();
        com.e5.platform.core.event.PayloadError error08 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("SE_003").errSrc("Delegation")
                .errorMessage("Error message")
                .build();
        com.e5.platform.core.event.PayloadError error09 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("BE_005").errSrc("Delegation")
                .errorMessage("Error message")
                .build();
        com.e5.platform.core.event.PayloadError error10 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("BE_006").errSrc("Delegation")
                .errorMessage("Error message")
                .build();
        com.e5.platform.core.event.PayloadError error11 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("BE_007").errSrc("Delegation")
                .errorMessage("Error message")
                .build();
        payloadErrorList.add(error02);
        payloadErrorList.add(error03);
        payloadErrorList.add(error04);
        payloadErrorList.add(error05);
        payloadErrorList.add(error06);
        payloadErrorList.add(error07);
        payloadErrorList.add(error08);
        payloadErrorList.add(error09);
        payloadErrorList.add(error10);
        payloadErrorList.add(error11);
        return payloadErrorList;
    }

    public List<com.e5.platform.core.event.PayloadError> UnknownMultipleErrors() {
        List<com.e5.platform.core.event.PayloadError> payloadErrorList = new ArrayList<>();

        com.e5.platform.core.event.PayloadError error001 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("E5_WELLSKY_FB_UPLOADEOBFILES_BE_0010")
                .errorMessage("Error message")
                .errSrc("Delegation")
                .build();
        com.e5.platform.core.event.PayloadError error002 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("E5_WELLSKY_FB_UPLOADEOBFILES_BE_0042")
                .errorMessage("Error message")
                .errSrc("Delegation")
                .build();
        com.e5.platform.core.event.PayloadError error003 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("E5_WELLSKY_FB_UPLOADEOBFILES_BE_0073")
                .errorMessage("Error message")
                .errSrc("Delegation")
                .build();
        payloadErrorList.add(error001);
        payloadErrorList.add(error002);
        payloadErrorList.add(error003);
        return payloadErrorList;
    }

    public List<com.e5.platform.core.event.PayloadError> CombinationofListedandUnknownErrors() {
        List<com.e5.platform.core.event.PayloadError> payloadErrorList = new ArrayList<>();

        com.e5.platform.core.event.PayloadError error001 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("E5_WELLSKY_FB_UPLOADEOBFILES_BE_0010")
                .errorMessage("Error message")
                .errSrc("Delegation")
                .build();
        com.e5.platform.core.event.PayloadError error002 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("E5_WELLSKY_FB_UPLOADEOBFILES_BE_0042")
                .errorMessage("Error message")
                .errSrc("Delegation")
                .build();
        com.e5.platform.core.event.PayloadError error003 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("E5_WELLSKY_FB_UPLOADEOBFILES_BE_0073")
                .errorMessage("Error message")
                .errSrc("Delegation")
                .build();
        com.e5.platform.core.event.PayloadError error004 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("E5_WELLSKY_FB_UPLOADEOBFILES_BE_003")
                .errorMessage("Error message")
                .errSrc("Delegation")
                .build();
        com.e5.platform.core.event.PayloadError error005 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("E5_WELLSKY_FB_UPLOADEOBFILES_BE_004")
                .errorMessage("Error message")
                .errSrc("Delegation")
                .build();
        com.e5.platform.core.event.PayloadError error006 = com.e5.platform.core.event.PayloadError.builder()
                .errorCode("E5_WELLSKY_FB_UPLOADEOBFILES_BE_005")
                .errorMessage("Error message")
                .errSrc("Delegation")
                        .build();
        payloadErrorList.add(error001);
        payloadErrorList.add(error002);
        payloadErrorList.add(error003);
        payloadErrorList.add(error004);
        payloadErrorList.add(error005);
        payloadErrorList.add(error006);
        return payloadErrorList;

    }
}

