package com.example.kyrsavayajava.util;

public enum ExecutionStage {
    NEW_REQUEST("новая заявка"),
    DIAGNOSTICS("диагностика"),
    REPAIR("ремонт"),
    COMPLETED("выполнена");

    private final String displayName;

    private ExecutionStage(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
