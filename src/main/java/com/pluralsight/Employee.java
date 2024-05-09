package com.pluralsight;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private String employeeID , name , department;
    private double payRate;

    private double totalPay;
    private double  hours;
    private LocalTime startTime;

    public Employee(String employeeID, String name, String department, double payRate, double totalPay, double hours) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hours = hours;



    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String  employeeID) {
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
        return ;
    }

    public double getRegularHours() {
        return hours;
    }

    public double setHours(double hours) {
        this.hours = hours;
        if (this.hours <= 40){
            return hours;
        }else {
            return 40;
        }

    }
    public double getOverTime(){
      return  (this.hours > 40) ? this.hours -40: 0;

    }
    public void  punchIn (double startTime){
        this.startTime = startTime;

    }
    public void punchIn(){
        LocalDateTime now = LocalDateTime.now();
        this.startTime = LocalTime.ofSecondOfDay(now.getHour() + now.getMinute());
    }
    }



