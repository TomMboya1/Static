package org.example;
import java.util.Random;
public class Employee {
    public String name;
    public String surname;
    private String address;

    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress) {
        name = newEmployeeName;
        surname = newEmployeeSurname;
        address = newEmployeeAddress;
    }

    public String getEmployeeDetails() {
        return "Name: " + name + ", Surname: " + surname + ", Address: " + address;
    }

    // Other methods can be added here
}

