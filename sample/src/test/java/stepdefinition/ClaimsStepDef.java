package stepdefinition;

import com.e5.platform.core.domains.FunctionBlockSandboxResponse;
import com.e5.platform.core.event.Event;
import com.e5.platform.core.executionblock.functionblock.domain.FBStatus;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOption;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOutput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import com.google.common.cache.RemovalListener;
import e5.model.*;
import e5.wellsky.functionblock.generated.SendAllAvailableNOAsFB;
import e5.wellsky.functionblock.generated.SendClaimsFB;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClaimsStepDef {
   private static FunctionBlockInput<SendClaimsFBInputPayload> sendClaimsFBinput;
   private static FunctionBlockOutput<SendClaimsFBOutputPayload> sendClaimsFBoutput;
   private static FunctionBlockOutput<SendClaimsFBOutputPayload> functionBlockOutput;
   private static FunctionBlockSandboxResponse<SendClaimsFBOutputPayload> functionBlockResponse;



//    @Given("User builds the input")
//    public void user_builds_the_input() {
//        SendClaimsFBInputPayload inputPayload = SendClaimsFBInputPayload.builder()
//                .behaviors(Behaviors.builder()
//                        .batchSize(Behaviors.BatchSize._10)
//                        .includeEDI(Behaviors.IncludeEDI.IGNORE)
//                        .build())
//                .criteria(Criteria.builder()
//                        .serviceLine(Criteria.ServiceLine.HOME_HEALTH)
//                        .payer("All Insurance")
//                        .payerCategory(Criteria.PayerCategory.MANAGED_CARE_PRIMARY_PAYER)
//                        .location("Alaska")
//                        .exclusions(Exclusions.builder()
//                                .claimNum(List.of()).build())
//                        .inclusions(Inclusions.builder()
//                                .claimNum(List.of()).build()).build()).build();
//         sendClaimsFBinput = FunctionBlockInput.<SendClaimsFBInputPayload>builder()
//                .payload(inputPayload).build();
//
//    }
//    @When("user builds the mock response")
//   public void user_builds_the_mock_response() {
//        List <SendClaimDetail> output = new ArrayList<>();
//        SendClaimDetail outputPayloadOne = SendClaimDetail.builder()
//                .patientName("Test Name")
//                .mrn("12434567P99O8 Test")
//                .branch("Test Branch")
//                .insurance("Test Insurance")
//                .billingPeriod("90 days")
//                .claimNum("123445778Test")
//                .tob("Test")
//                .totalCharges("$1,050.00")
//                .build();
//        output.add(outputPayloadOne);
//        System.out.println(output);
//        SendClaimsFBOutputPayload sendClaimsOutput = SendClaimsFBOutputPayload.builder()
//                .sendClaimDetails(output).build();
//        functionBlockOutput = FunctionBlockOutput.<SendClaimsFBOutputPayload>builder()
//                .errors(List.of())
//                .fbName("SendClaimsFB")
//                .genericType("SendClaimsFB")
//                .idempotencyBreaches(List.of())
//                .partialSuccess(true)
//                .status(FBStatus.E5_FB_SUCCESS)
//                .payload(sendClaimsOutput).build();
//
//
//    }
//
//    @Then("user runs the FB with sandbox mock")
//    public void user_runs_the_fb_with_sandbox_mock() {
//        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(SendClaimsFB.class).withMockResponse(sendClaimsFBoutput);
//         functionBlockResponse = sandbox.startExecution(sendClaimsFBinput);
//        functionBlockOutput= functionBlockResponse.getFunctionBlockOutput();
//    }
//
//    @And("User validates the result")
//    public void user_validates_the_result() {
//        System.out.println(functionBlockOutput+".....................");
//        Assertions.assertEquals(sendClaimsFBoutput, functionBlockOutput);
//        List events = functionBlockResponse.getEvents();
//        events.forEach(System.out::println);
//
//    }



    @Given("user builds the input value")
    public void user_builds_the_input_value() {
        List <String> filter = new ArrayList<>();
        filter.add("48177004");
        filter.add("48177822");



        SendClaimsFBInputPayload inputPayload = SendClaimsFBInputPayload.builder()
                .behaviors(Behaviors.builder()
                        .batchSize(Behaviors.BatchSize.BATCHSIZE_10)
                        .includeEDI(Behaviors.IncludeEDI.IGNORE)
                        
                        .build())
                .criteria(Criteria.builder()
                        .serviceLine(Criteria.ServiceLine.HOSPICE)
//                        .payer("All Insurances")
                        .agencyName("Saunders")
//                        .branch("Team C")
                        .payerCategory(Criteria.PayerCategory.MEDICARE_CLAIMS_PROCESSING_CLAIMS_MANAGER)
//                        .location("CA - Sacramento")

                        .exclusions(Exclusions.builder()
                                .claimNum(filter)
                                .build())
                        .inclusions(Inclusions.builder()
                                .claimNum(List.of()).build()).build()).build();
        sendClaimsFBinput = FunctionBlockInput.<SendClaimsFBInputPayload>builder()
                .payload(inputPayload).build();

    }
    @When("user runs the FB")
    public void user_runs_the_fb() {
        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(SendClaimsFB.class);
        functionBlockResponse = sandbox.startExecution(sendClaimsFBinput);



    }
    @Then("user gets the Fboutput")
    public void user_gets_the_fboutput() {
        functionBlockOutput= functionBlockResponse.getFunctionBlockOutput();
//        Assertions.assertEquals(functionBlockOutput , "FunctionBlockOutput(errors=[PayloadError(errSrc=null, errorCode=E5.SCHEMA.VAL.FAILED, errorMessage=null found, object expected, fieldName=inputDetail[0].behaviors, fieldValue=null, timeStamp=1695974174076)], payload=null, " +
//                "idempotencyBreaches=null, status=E5_FB_PRE_VALIDATION_ERROR, " +
//                "partialSuccess=false, genericType=null, fbName=null)");

    }
    @Then("User validates the resul using Fboutput value")
    public void user_validates_the_resul_using_fboutput_value() {
        System.out.println(functionBlockOutput);
        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
    }






}
