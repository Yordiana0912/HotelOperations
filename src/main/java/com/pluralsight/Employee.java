package com.pluralsight;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;

    private double totalPay;
    private double regularHours;
    private double overTime;

    public Employee(int employeeID, String name, String department, double payRate, double totalPay, double regularHours, double overTime) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.totalPay = totalPay;
        this.regularHours = regularHours;
        this.overTime = overTime;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public double getRegularHours() {
        return regularHours;
    }

    public void setRegularHours(double regularHours) {
        this.regularHours = regularHours;
    }

    public double getOverTime() {
        return overTime;
    }

    public void setOverTime(double overTime) {
        this.overTime = overTime;
    }
}


