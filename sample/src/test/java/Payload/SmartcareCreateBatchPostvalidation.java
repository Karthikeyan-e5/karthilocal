package Payload;


import e5.selectdataapi.model.smartcarecreatebatchfb.*;


public class SmartcareCreateBatchPostvalidation {
    public SmartcareCreateBatchFBOutputPayload positiveFlow() {
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
    public SmartcareCreateBatchFBOutputPayload scenariopayload(String batchId, String documentTypeId, int batchStatusId, String encompassId, String recommendFileType, String batchName, String uploadedDate, String version) {
        SmartcareCreateBatchFBOutputPayload outputPayload = SmartcareCreateBatchFBOutputPayload.builder()
                .createBatchOutputPayload(CreateBatchOutputPayload.builder()
                        .batchId(batchId)
                        .documentTypeId(documentTypeId)
                        .batchStatusId(batchStatusId)
                        .encompassId(encompassId)
                        .recommendFileType(recommendFileType)
                        .batchName(batchName)
                        .uploadedDate(uploadedDate)
                        .version(version).build())
                .build();

        return outputPayload;
    }
    public SmartcareCreateBatchFBOutputPayload batchidmin() {
        SmartcareCreateBatchFBOutputPayload outputPayload = SmartcareCreateBatchFBOutputPayload.builder()
                .createBatchOutputPayload(CreateBatchOutputPayload.builder()
                        .batchId("")
                        .documentTypeId("D_255")
                        .batchStatusId(777)
                        .encompassId("1")
                        .recommendFileType("ree")
                        .batchName("aa")
                        .uploadedDate("2024-08-06T04:03:55.6416775-07:00")
                        .version("AAAAAAABQFI=").build())
                .build();

        return outputPayload;
    }
    public SmartcareCreateBatchFBOutputPayload encompass() {
        SmartcareCreateBatchFBOutputPayload outputPayload = SmartcareCreateBatchFBOutputPayload.builder()
                .createBatchOutputPayload(CreateBatchOutputPayload.builder()
                        .batchId("sss")
                        .documentTypeId(null)
                        .batchStatusId(777)
                        .encompassId("")
                        .recommendFileType("ree")
                        .batchName("aa")
                        .uploadedDate("2024-08-06T04:03:55.6416775-07:00")
                        .version("AAAAAAABQFI=").build())
                .build();

        return outputPayload;
    }
    public SmartcareCreateBatchFBOutputPayload batchstsid() {
        SmartcareCreateBatchFBOutputPayload outputPayload = SmartcareCreateBatchFBOutputPayload.builder()
                .createBatchOutputPayload(CreateBatchOutputPayload.builder()
                        .batchId("sss")
                        .documentTypeId(null)
                        .encompassId("")
                        .recommendFileType("ree")
                        .batchName("aa")
                        .uploadedDate("2024-08-06T04:03:55.6416775-07:00")
                        .version("AAAAAAABQFI=").build())
                .build();

        return outputPayload;
    }

}
