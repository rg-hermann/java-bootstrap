package com.example.adapter.rest.dto;

import java.time.LocalDateTime;
import java.util.Map;

public record ErrorResponse(int status, String message, LocalDateTime timestamp, Map<String, String> errors) {
    public ErrorResponse {
        errors = (errors == null) ? null : Map.copyOf(errors);
    }
    // Com Map.copyOf no construtor, o erro de "Expose Representation" 
    // costuma desaparecer em versões mais recentes do SpotBugs.
}