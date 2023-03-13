package com.toharifqi.roomwebapp.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "EMPLOYEE")
public class StaffMember {
    @Id
    @Column(name="EMPLOYEE_ID")
    private String employeeId;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="POSITION")
    @Enumerated(EnumType.STRING)
    private Position position;

    public StaffMember() {
        this.employeeId = UUID.randomUUID().toString();
    }

    public StaffMember(String employeeId, String firstName, String lastName, Position position) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public String getgEmployeeId() {
        return employeeId;
    }

    public void setgEmployeeId(String gUID) {
        this.employeeId = gUID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
