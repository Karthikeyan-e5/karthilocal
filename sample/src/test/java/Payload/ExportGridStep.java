package Payload;

import e5.hchb.model.exportgridfromworkflowconsolefb.*;
import e5.model.*;

import java.util.HashSet;
import java.util.Set;

public class ExportGridStep {
    public ExportGridFromWorkflowConsoleFBInputPayload Positive() {
        Set<String> filter = new HashSet<>();
        filter.add("Soc/Recret");
        filter.add("Followup");
        filter.add("Resumption");
        ExportGridFromWorkflowConsoleFBInputPayload inputPayload = ExportGridFromWorkflowConsoleFBInputPayload.builder()
                .exportGridFromWorkflowConsoleCriteria(ExportGridFromWorkflowConsoleCriteria.builder()

                        .workflowConsoleType(ExportGridFromWorkflowConsoleCriteria.WorkflowConsoleType.PATIENT_RELATED_TASKS)

                        .workflowConsolePanelFilter(WorkflowConsolePanelFilter.builder()
                                .workflowConsoleStages(WorkflowConsoleStages.builder()
                                        .status(WorkflowConsoleStages.Status.ACTIVE)
                                        .searchBy("Stage")
                                        .value(Set.of("Edit/Lock OASIS", "followup")).build())
                                .workflowConsoleEvents(WorkflowConsoleEvents.builder()
                                        .searchBy("Event")
                                        .status(WorkflowConsoleEvents.Status.ACTIVE)
                                        .value(Set.of("Soc/Recret")).build()).build())
                        .build())
                .exportGridFromWorkflowConsoleBehaviors(ExportGridFromWorkflowConsoleBehaviors.builder()
                        .exportType(ExportGridFromWorkflowConsoleBehaviors.ExportType.E_5_STORAGE).build())

                .build();
        return inputPayload;
    }

    public ExportGridFromWorkflowConsoleFBInputPayload stagenull() {
        Set<String> filter = new HashSet<>();
        filter.add("Soc/Recret");
        filter.add("Followup");
        filter.add("Resumption");
        ExportGridFromWorkflowConsoleFBInputPayload inputPayload = ExportGridFromWorkflowConsoleFBInputPayload.builder()
                .exportGridFromWorkflowConsoleCriteria(ExportGridFromWorkflowConsoleCriteria.builder()

                        .workflowConsoleType(ExportGridFromWorkflowConsoleCriteria.WorkflowConsoleType.PATIENT_RELATED_TASKS)

                        .workflowConsolePanelFilter(WorkflowConsolePanelFilter.builder()
//                                .workflowConsoleStages(WorkflowConsoleStages.builder()
//                                        .status(WorkflowConsoleStages.Status.ACTIVE)
//                                        .searchBy("Stage")
//                                        .value(Set.of("Edit/Lock OASIS","followup")).build())
                                .workflowConsoleEvents(WorkflowConsoleEvents.builder()
                                        .searchBy("Event")
                                        .status(WorkflowConsoleEvents.Status.ACTIVE)
                                        .value(Set.of("Soc/Recret")).build()).build())
                        .build())
                .exportGridFromWorkflowConsoleBehaviors(ExportGridFromWorkflowConsoleBehaviors.builder()
                        .exportType(ExportGridFromWorkflowConsoleBehaviors.ExportType.E_5_STORAGE).build())

                .build();
        return inputPayload;
    }

    public ExportGridFromWorkflowConsoleFBOutputPayload output() {
        Set<String> filter = new HashSet<>();
        filter.add("Soc/Recret");
        filter.add("Followup");
        filter.add("Resumption");
        ExportGridFromWorkflowConsoleFBOutputPayload outputPayload = ExportGridFromWorkflowConsoleFBOutputPayload.builder()
                .extractedWorkflowConsole(ExtractedWorkflowConsole.builder()
                        .workflowConsoleExportE5Storagepath("dd").build()).build();
        return outputPayload;
    }
}
