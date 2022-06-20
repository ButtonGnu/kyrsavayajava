package com.example.kyrsavayajava.model;

import com.example.kyrsavayajava.util.ExecutionStage;
import com.example.kyrsavayajava.util.RequestStatus;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "requests")
public class Request {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;
    @Column(name = "execution_stage")
    @Enumerated(EnumType.STRING)
    private ExecutionStage executionStage;
    @Column(name = "request_status")
    @Enumerated(EnumType.STRING)
    private RequestStatus requestStatus;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    @OneToMany(mappedBy = "request")
    private Set<Damage> damages;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ExecutionStage getExecutionStage() {
        return executionStage;
    }

    public void setExecutionStage(ExecutionStage executionState) {
        this.executionStage = executionState;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
