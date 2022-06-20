package com.example.kyrsavayajava.util;

public enum RequestStatus {
    NEW_REQUEST("Новая заявка"),
    DIAGNOSTICS("Проведена диагностика"),
    DONE("Проведена работа");

    private final String displayName;

    private RequestStatus(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
