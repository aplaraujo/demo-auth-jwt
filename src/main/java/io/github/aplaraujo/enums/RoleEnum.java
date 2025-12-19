package io.github.aplaraujo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RoleEnum {
    ADMIN("ADMIN"), USER("USER");

    private final String role;
}
