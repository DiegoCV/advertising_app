package co.com.agency.api.dealer;

import co.com.agency.api.dealer.model.DealerRequest;
import co.com.agency.api.dealer.model.DealerResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.groups.Default;

public interface DealerOperations {
    @Operation(summary = "Dealer information", operationId = "createDealer",
            description = "Dealer information operation", tags = "advertising")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Operation successfully executed",
            content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = DealerResponse.class))),
            @ApiResponse(responseCode = "400", description = "Wrong parameters or bad request",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class)))})
    @PostMapping(value = "/create-dealer", produces = {"application/json"}, consumes = {"application/json"})
    ResponseEntity<DealerResponse> createDealer(
            @Parameter(description = "Information related to dealer", required = true)
            @Validated({Default.class}) @RequestBody DealerRequest body
    );
}
