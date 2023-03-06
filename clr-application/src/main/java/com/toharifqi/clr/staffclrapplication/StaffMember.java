package com.toharifqi.clr.staffclrapplication;

public class StaffMember {
    private String gUID;
    private String firstName;
    private String lastName;
    private Position position;

    public StaffMember() {
    }

    public StaffMember(String gUID, String firstName, String lastName, Position position) {
        this.gUID = gUID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public String getgUID() {
        return gUID;
    }

    public void setgUID(String gUID) {
        this.gUID = gUID;
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

    @Override
    public String toString() {
        return "StaffMember{" +
                "gUID='" + gUID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position=" + position +
                '}';
    }
}
