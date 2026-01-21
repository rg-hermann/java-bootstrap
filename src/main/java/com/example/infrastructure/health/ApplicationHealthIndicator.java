package com.example.infrastructure.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Custom health indicator for application dependencies.
 */
@Component("applicationHealth")
public class ApplicationHealthIndicator implements HealthIndicator {

  @Override
  public Health health() {
    boolean isHealthy = checkApplicationHealth();
    if (isHealthy) {
      return Health.up()
          .withDetail("version", "1.0.0")
          .withDetail("java", System.getProperty("java.version"))
          .build();
    } else {
      return Health.down().withDetail("reason", "Application check failed").build();
    }
  }

  private boolean checkApplicationHealth() {
    return true;
  }
}
