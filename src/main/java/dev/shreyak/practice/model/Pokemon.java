package dev.shreyak.practice.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Pokemon(
        @NotNull Integer id,
        @NotBlank String name,
        String url
) { }