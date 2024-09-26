package Payload;

import com.e5.platform.core.event.PayloadError;
import e5.selectdataapi.model.smartcarecreatebatchfb.*;

import java.util.ArrayList;
import java.util.List;

public class SmartcareCreateBatchDelegationPayload {
    public SmartcareCreateBatchFBInputPayload positiveFlow() {
        SmartcareCreateBatchFBInputPayload inputpayload = SmartcareCreateBatchFBInputPayload.builder()
                .createBatchCriteria(CreateBatchCriteria.builder()
                        .createBatchInputPayload(CreateBatchInputPayload.builder()
                                .clientId(1)
                                .facilityCode("qq1")
                                .firstName("ggg")
                                .lastName("hhh")
                                .episodeId(123)
                                .recordDate("2021-05-04T07:00:00.000Z").build())
                        .build()).build();

        return inputpayload;
    }
    public SmartcareCreateBatchFBOutputPayload outputpositiveFlow() {
        SmartcareCreateBatchFBOutputPayload outputPayload = SmartcareCreateBatchFBOutputPayload.builder()
                .createBatchOutputPayload(CreateBatchOutputPayload.builder()
                        .batchId("qqq")
                        .documentTypeId("D_5")
                        .batchStatusId(777)
                        .encompassId("1")
                        .recommendFileType("ree")
                        .batchName("aa")
                        .uploadedDate("2024-08-06T04:03:55.6416775-07:00")
                        .version("AAAAAAABQFI=").build())
                .build();

        return outputPayload;
    }
    public SmartcareCreateBatchFBOutputPayload empty() {
        SmartcareCreateBatchFBOutputPayload outputPayload = SmartcareCreateBatchFBOutputPayload.builder()
                .build();

        return outputPayload;
    }
    public SmartcareCreateBatchFBInputPayload invalidpositiveFlow() {
        SmartcareCreateBatchFBInputPayload inputpayload = SmartcareCreateBatchFBInputPayload.builder()
                .createBatchCriteria(CreateBatchCriteria.builder()
                        .createBatchInputPayload(CreateBatchInputPayload.builder()
//                                .clientId(1)
                                .facilityCode("qq1")
                                .firstName("ggg")
                                .lastName("hhh")
                                .episodeId(123)
                                .recordDate("2021-05-04T07:00:00.000Z").build())
                        .build()).build();

        return inputpayload;
    }
    public SmartcareCreateBatchFBOutputPayload invalidoutput() {
        SmartcareCreateBatchFBOutputPayload outputPayload = SmartcareCreateBatchFBOutputPayload.builder()
                .createBatchOutputPayload(CreateBatchOutputPayload.builder()
                        .batchId("qqq")
                        .documentTypeId("D_5")
                        .batchStatusId(777)
                        .recommendFileType("ree")
                        .batchName("aa")
                        .uploadedDate("2024-08-06T04:03:55.6416775-07:00")
                        .version("AAAAAAABQFI=").build())
                .build();

        return outputPayload;
    }
    public List<PayloadError> UnknownError() {
        List<PayloadError> payloadErrorList = new ArrayList<>();

        PayloadError error01 = PayloadError.builder()
                .errorCode("BE_111")
                .errorMessage("Error message")
                .errSrc("Delegation")
                .build();
        payloadErrorList.add(error01);
        return payloadErrorList;

    }
    public List<PayloadError> MultipleError() {
        List<PayloadError> payloadErrorList = new ArrayList<>();

        // Add the additional errors
        payloadErrorList.add(PayloadError.builder().errorCode("BE_001").errorMessage("Username is invalid - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_002").errorMessage("Password is invalid - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_003").errorMessage("App hostname is invalid - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_004").errorMessage("Bad request - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_005").errorMessage("Unauthorized access - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_006").errorMessage("Forbidden access - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_007").errorMessage("Resource not found - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_008").errorMessage("Internal server - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_009").errorMessage("Bad gateway in create batch fb").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_010").errorMessage("Service unavailable - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_011").errorMessage("Request failed for post request- Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_012").errorMessage("User id is invalid- Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_013").errorMessage("Username is invalid- Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_014").errorMessage("Home url is invalid- Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_015").errorMessage("Cookie is invalid- Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_016").errorMessage("Invalid response payload- Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_017").errorMessage("Client id is invalid- Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_018").errorMessage("Facility code is invalid - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_019").errorMessage("First name is invalid - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_020").errorMessage("Last name is invalid - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_021").errorMessage("Episode id is invalid - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_022").errorMessage("Record date is invalid - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_023").errorMessage("Cookie is invalid - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_024").errorMessage("Bad request - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_025").errorMessage("Unauthorized access - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_026").errorMessage("Forbidden access - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_027").errorMessage("Resource not found - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_028").errorMessage("Internal server - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_029").errorMessage("Bad gateway - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_030").errorMessage("Service unavailable - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_031").errorMessage("Request failed for post request - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_032").errorMessage("Batch id invalid for create batch response").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_033").errorMessage("Encompass id invalid for create batch response").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_034").errorMessage("Invalid response payload for create batch response").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_001").errorMessage("Request timeout - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_002").errorMessage("Unknown error occured- Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_003").errorMessage("Request timeout - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_004").errorMessage("Unknown error occured for create batch response").errSrc("Delegation").build());

        return payloadErrorList;
    }
    public List<PayloadError> MultipleunknownError() {
        List<PayloadError> payloadErrorList = new ArrayList<>();

        // Add the additional errors
        payloadErrorList.add(PayloadError.builder().errorCode("BE_0011111").errorMessage("Username is invalid - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_0022222").errorMessage("Password is invalid - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_003222222").errorMessage("App hostname is invalid - Create Batch").errSrc("Delegation").build());
        return payloadErrorList;
    }
    public List<PayloadError> MultipleknownunknownError() {
        List<PayloadError> payloadErrorList = new ArrayList<>();

        // Add the additional errors
        payloadErrorList.add(PayloadError.builder().errorCode("BE_001").errorMessage("Username is invalid - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_002").errorMessage("Password is invalid - Create Batch").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_003222222").errorMessage("App hostname is invalid - Create Batch").errSrc("Delegation").build());
        return payloadErrorList;
    }
    public List<PayloadError> singleknownError() {
        List<PayloadError> payloadErrorList = new ArrayList<>();

        // Add the additional errors
        payloadErrorList.add(PayloadError.builder().errorCode("BE_001").errorMessage("Username is invalid - Create Batch").errSrc("Delegation").build());
        return payloadErrorList;
    }

}
