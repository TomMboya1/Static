package org.example;


import java.util.Random;

public class Badge {
    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }

    private String generateBadgeIdCode() {
        String randomCode1 = generateRandomCode();
        String randomCode2 = generateRandomCode();
        return randomCode1 + employee.name + employee.surname + randomCode2;
    }

    private String generateRandomCode() {
        Random random = new Random();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder randomCode = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(alphabet.length());
            randomCode.append(alphabet.charAt(index));
        }
        return randomCode.toString();
    }

    public void showBadgeDetails() {
        System.out.println("Total number of employees tracked by the badges: " + totalNumberOfEmployees);
        System.out.println("Employee Details: " + employee.getEmployeeDetails());
        System.out.println("Badge ID Code: " + badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode();
    }

}
