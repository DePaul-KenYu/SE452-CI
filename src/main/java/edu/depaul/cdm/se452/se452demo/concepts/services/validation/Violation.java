package edu.depaul.cdm.se452.se452demo.concepts.services.validation;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Violation {
    private final String fieldName;
    private final String message;
}
