package demowebshop.api.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LogInPost {
    LOG_IN_POST("/login");
    private final String endpoint;
}
