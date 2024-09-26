package Payload;

import e5.hchb.model.downloadattachmentsfb.*;

import java.util.ArrayList;
import java.util.List;


public class DownloadAttachmentspostvalidation {

        public DownloadAttachmentsFBOutputPayload positiveFlow() {
            List<ExportedFileDetail> export = new ArrayList<>();
            export.add(ExportedFileDetail.builder().exportedFileName("vgdfggdgd").exportedAttachmentToken("hfsdhfdg").build());
            DownloadAttachmentsFBOutputPayload outputPayload =DownloadAttachmentsFBOutputPayload.builder()
                    .exportedAttachments(ExportedAttachments.builder()
                            .exportedFileDetails(export).build())
                    .build();

            return outputPayload;
        }
    public DownloadAttachmentsFBOutputPayload exportattachmentnull() {
        List<ExportedFileDetail> export = new ArrayList<>();
        export.add(ExportedFileDetail.builder().exportedFileName("vgdfggdgd").exportedAttachmentToken("hfsdhfdg").build());
        DownloadAttachmentsFBOutputPayload outputPayload =DownloadAttachmentsFBOutputPayload.builder()
                .build();

        return outputPayload;
    }
    public DownloadAttachmentsFBOutputPayload exportfilenull() {
        DownloadAttachmentsFBOutputPayload outputPayload =DownloadAttachmentsFBOutputPayload.builder()
                .exportedAttachments(ExportedAttachments.builder()
                        .build())
                .build();
        return outputPayload;
    }
    public DownloadAttachmentsFBOutputPayload exportfileempty() {
        DownloadAttachmentsFBOutputPayload outputPayload =DownloadAttachmentsFBOutputPayload.builder()
                .exportedAttachments(ExportedAttachments.builder()
                        .exportedFileDetails(new ArrayList<>()).build())
                .build();

        return outputPayload;
    }
    public DownloadAttachmentsFBOutputPayload exportnamenull() {
        List<ExportedFileDetail> export = new ArrayList<>();
        export.add(ExportedFileDetail.builder().exportedFileName(null).exportedAttachmentToken("hfsdhfdg").build());
        DownloadAttachmentsFBOutputPayload outputPayload =DownloadAttachmentsFBOutputPayload.builder()
                .exportedAttachments(ExportedAttachments.builder()
                        .exportedFileDetails(export).build())
                .build();

        return outputPayload;
    }
    public DownloadAttachmentsFBOutputPayload attachmenttokennull() {
        List<ExportedFileDetail> export = new ArrayList<>();
        export.add(ExportedFileDetail.builder().exportedFileName("vgdfggdgd").exportedAttachmentToken(null).build());
        DownloadAttachmentsFBOutputPayload outputPayload =DownloadAttachmentsFBOutputPayload.builder()
                .exportedAttachments(ExportedAttachments.builder()
                        .exportedFileDetails(export).build())
                .build();

        return outputPayload;
    }
    public DownloadAttachmentsFBOutputPayload attachmenttokenmin() {
        List<ExportedFileDetail> export = new ArrayList<>();
        export.add(ExportedFileDetail.builder().exportedFileName("").exportedAttachmentToken("").build());
        DownloadAttachmentsFBOutputPayload outputPayload =DownloadAttachmentsFBOutputPayload.builder()
                .exportedAttachments(ExportedAttachments.builder()
                        .exportedFileDetails(export).build())
                .build();

        return outputPayload;
    }

}
