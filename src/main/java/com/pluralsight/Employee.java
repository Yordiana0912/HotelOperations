package com.pluralsight;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;

    private double totalPay;
    private double  hours;



    public Employee(int employeeID, String name, String department, double payRate, double totalPay, double hours) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.totalPay = totalPay;
        this.hours = hours;


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
        return hours;
    }

    public double setHours(double hours) {
        this.hours = hours;
        int regularHours = 40;
        if (hours < regularHours){
            return hours;
        }else {
            return regularHours;
        }

    }
    public double getOverTime(){
       int regularHours = 40;
       if(hours <= regularHours) {
           return 0;
       }else {
           return ( hours - regularHours);
       }

    }

    }


