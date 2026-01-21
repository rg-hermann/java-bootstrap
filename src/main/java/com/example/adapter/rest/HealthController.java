package com.example.adapter.rest;

import com.example.adapter.rest.dto.HealthResponse;
import com.example.application.HealthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for health check endpoint.
 */
@RestController
@RequestMapping("/api/health")
@Tag(name = "Health", description = "Health check endpoints")
public class HealthController {

  private final HealthService healthService;

  public HealthController(HealthService healthService) {
    this.healthService = healthService;
  }

  /**
   * Check application health status.
   *
   * @return UP status
   */
  @GetMapping
  @Operation(summary = "Health check", description = "Returns the application health status")
  @ApiResponse(
      responseCode = "200",
      description = "Application is healthy",
      content =
          @Content(
              mediaType = "application/json",
              schema = @Schema(implementation = HealthResponse.class)))
  public ResponseEntity<HealthResponse> health() {
    return ResponseEntity.ok(new HealthResponse(healthService.getStatus()));
  }
}
