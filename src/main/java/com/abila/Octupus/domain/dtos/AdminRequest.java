package com.abila.Octupus.domain.dtos;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AdminRequest(
        @NotBlank String nome,
        @Min(15) @Max(100) Integer idade,
        @NotBlank @Size(min = 11, max = 14) String documento,
        String cargo
) {
}
