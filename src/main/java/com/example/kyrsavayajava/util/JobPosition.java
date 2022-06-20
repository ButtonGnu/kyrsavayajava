package com.example.kyrsavayajava.util;

public enum JobPosition {
    MASTER("мастер-приемщик"),
    MOTOR_SPECIALIST("моторист"),
    ELECTRICIAN("электрик"),
    MASTER_GENERAL("мастер общего профиля"),
    BODY("кузовщик")
    ;

    private final String displayName;

    JobPosition(String displayName) {
        this.displayName = displayName;
    }
}
