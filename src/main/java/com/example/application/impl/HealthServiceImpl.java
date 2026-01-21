package com.example.application.impl;

import com.example.application.HealthService;
import org.springframework.stereotype.Service;

/**
 * Implementation of health check service.
 */
@Service
public class HealthServiceImpl implements HealthService {

  @Override
  public String getStatus() {
    return "UP";
  }
}
