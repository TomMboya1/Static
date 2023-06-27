package org.example;

public class Tester {
    public static void main(String[] args) {
        // Create two new Employee objects
        Employee employee1 = new Employee("joan", "wamboi", "kahawa,mwihoko ");
        Employee employee2 = new Employee("tom", "mboya", "kibra drive ");

        // Create badges for the employees
        Badge badge1 = new Badge(employee1);
        Badge badge2 = new Badge(employee2);

        // Show badge details
        badge1.showBadgeDetails();
        System.out.println();
        badge2.showBadgeDetails();
    }
}
