package com.company;

public class Employee {

    private String name;
    private String email;
    private double hourRate;
    private int capacity;
    private int freeDays;


    public Employee (String name, String email, double hourRate, int capacity, int freeDays)
    {
        this.email = email;
        this.name = name;
        this.hourRate = hourRate;
        this.capacity = capacity;
        this.freeDays = freeDays;

    }

    public double calculateDailyIncome() {
        return hourRate * capacity * (1 - (freeDays / 22.0));

    }

    public double calculateMonthly() {
        return calculateDailyIncome() * 22;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    public void setFreeDays(int freeDays) {
        this.freeDays = freeDays;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getEmail() {
        return email;
    }

    public int getFreeDays() {
        return freeDays;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getHourRate() {
        return hourRate;
    }
}
