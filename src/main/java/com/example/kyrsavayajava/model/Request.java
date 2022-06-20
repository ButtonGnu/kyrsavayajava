package com.example.kyrsavayajava.model;

import com.example.kyrsavayajava.util.ExecutionStage;
import com.example.kyrsavayajava.util.RequestStatus;

public class Request {
    private long id;

    private long customerId;
    private long employeeId;
    private ExecutionStage executionState;
    private RequestStatus requestStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public ExecutionStage getExecutionState() {
        return executionState;
    }

    public void setExecutionState(ExecutionStage executionState) {
        this.executionState = executionState;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }
}
