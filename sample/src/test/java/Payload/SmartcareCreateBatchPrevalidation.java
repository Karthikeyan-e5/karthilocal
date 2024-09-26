package Payload;
import e5.selectdataapi.model.smartcarecreatebatchfb.*;

public class SmartcareCreateBatchPrevalidation {


    public SmartcareCreateBatchFBInputPayload positiveFlow() {
        SmartcareCreateBatchFBInputPayload inputpayload = SmartcareCreateBatchFBInputPayload.builder()
                .createBatchCriteria(CreateBatchCriteria.builder()
                        .createBatchInputPayload(CreateBatchInputPayload.builder()
                                .clientId(1)
                                .facilityCode("qq1")
                                .firstName("ggg")
                                .lastName("hhh")
                                .episodeId(123)
                                .recordDate("2021-02-06T16:00:09.9473212-08:00").build())
                        .build()).build();

        return inputpayload;
    }

    public SmartcareCreateBatchFBInputPayload scenariopayload(int clientId, String facilityCode, String firstName, String lastName, int episodeId, String recordDate) {
        SmartcareCreateBatchFBInputPayload inputpayload = SmartcareCreateBatchFBInputPayload.builder()
                .createBatchCriteria(CreateBatchCriteria.builder()
                        .createBatchInputPayload(CreateBatchInputPayload.builder()
                                .clientId(clientId)
                                .facilityCode(facilityCode)
                                .firstName(firstName)
                                .lastName(lastName)
                                .episodeId(episodeId)
                                .recordDate(recordDate).build()).build()).build();

        return inputpayload;
    }

    public SmartcareCreateBatchFBInputPayload clientIdInt() {
        SmartcareCreateBatchFBInputPayload inputpayload = SmartcareCreateBatchFBInputPayload.builder()
                .createBatchCriteria(CreateBatchCriteria.builder()
                        .createBatchInputPayload(CreateBatchInputPayload.builder()
                                .clientId(null)
                                .facilityCode("ggdg")
                                .firstName("ggg")
                                .lastName("hhh")
                                .episodeId(123)
                                .recordDate("2023-01-06T00:00:00.000Z").build()).build()).build();

        return inputpayload;
    }

    public SmartcareCreateBatchFBInputPayload facilityCodemimchar() {
        SmartcareCreateBatchFBInputPayload inputpayload = SmartcareCreateBatchFBInputPayload.builder()
                .createBatchCriteria(CreateBatchCriteria.builder()
                        .createBatchInputPayload(CreateBatchInputPayload.builder()
                                .clientId(1)
                                .facilityCode("")
                                .firstName("ggg")
                                .lastName("hhh")
                                .episodeId(123)
                                .recordDate("2023-01-06T00:00:00.000Z").build()).build()).build();

        return inputpayload;
    }
    public SmartcareCreateBatchFBInputPayload firstnamemimchar() {
        SmartcareCreateBatchFBInputPayload inputpayload = SmartcareCreateBatchFBInputPayload.builder()
                .createBatchCriteria(CreateBatchCriteria.builder()
                        .createBatchInputPayload(CreateBatchInputPayload.builder()
                                .clientId(1)
                                .facilityCode("qqq")
                                .firstName("")
                                .lastName("hhh")
                                .episodeId(123)
                                .recordDate("2023-01-06T00:00:00.000Z").build()).build()).build();

        return inputpayload;
    }
    public SmartcareCreateBatchFBInputPayload lastnamemimchar() {
        SmartcareCreateBatchFBInputPayload inputpayload = SmartcareCreateBatchFBInputPayload.builder()
                .createBatchCriteria(CreateBatchCriteria.builder()
                        .createBatchInputPayload(CreateBatchInputPayload.builder()
                                .clientId(1)
                                .facilityCode("qqq")
                                .firstName("karthi")
                                .lastName("")
                                .episodeId(123)
                                .recordDate("2023-01-06T00:00:00.000Z").build()).build()).build();

        return inputpayload;
    }
    public SmartcareCreateBatchFBInputPayload episodeIdmin() {
        SmartcareCreateBatchFBInputPayload inputpayload = SmartcareCreateBatchFBInputPayload.builder()
                .createBatchCriteria(CreateBatchCriteria.builder()
                        .createBatchInputPayload(CreateBatchInputPayload.builder()
                                .clientId(1)
                                .facilityCode("qqq")
                                .firstName("karthi")
                                .lastName("ram")
                                .episodeId(-1)
                                .recordDate("2023-01-06T00:00:00.000Z").build()).build()).build();

        return inputpayload;
    }
    public SmartcareCreateBatchFBInputPayload episodeIdnull() {
        SmartcareCreateBatchFBInputPayload inputpayload = SmartcareCreateBatchFBInputPayload.builder()
                .createBatchCriteria(CreateBatchCriteria.builder()
                        .createBatchInputPayload(CreateBatchInputPayload.builder()
                                .clientId(1)
                                .facilityCode("qqq")
                                .firstName("karthi")
                                .lastName("ram")
                                .recordDate("2023-01-06T00:00:00.000Z").build()).build()).build();

        return inputpayload;
    }
    public SmartcareCreateBatchFBInputPayload recorddatemin() {
        SmartcareCreateBatchFBInputPayload inputpayload = SmartcareCreateBatchFBInputPayload.builder()
                .createBatchCriteria(CreateBatchCriteria.builder()
                        .createBatchInputPayload(CreateBatchInputPayload.builder()
                                .clientId(1)
                                .facilityCode("qqq")
                                .firstName("karthi")
                                .lastName("ram")
                                .episodeId(12)
                                .recordDate("").build()).build()).build();

        return inputpayload;
    }
    public SmartcareCreateBatchFBInputPayload createbatchnull() {
        SmartcareCreateBatchFBInputPayload inputpayload = SmartcareCreateBatchFBInputPayload.builder()
                .createBatchCriteria(CreateBatchCriteria.builder()

                        .build()).build();

        return inputpayload;
    }
    public SmartcareCreateBatchFBInputPayload criterianull() {
        SmartcareCreateBatchFBInputPayload inputpayload = SmartcareCreateBatchFBInputPayload.builder()
                .build();

        return inputpayload;
    }
}
