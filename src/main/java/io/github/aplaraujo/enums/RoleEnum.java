package io.github.aplaraujo.enums;

public enum RoleEnum {
    ADMIN("ADMIN"), USER("USER");

    private String role;

    RoleEnum(String role) {
        this.role = role;
    }
}
