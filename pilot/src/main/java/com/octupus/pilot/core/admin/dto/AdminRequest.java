package com.octupus.pilot.core.admin.dto;

public record AdminRequest(
    String nome,
    String documento,
    String email,
    String cargo
) {
}
