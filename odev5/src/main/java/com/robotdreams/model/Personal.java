package com.robotdreams.model;

public class Personal {


    private final int id;
    private final String name;
    private final String surname;
    private final String department;
    private final double dailySalary;
    private final double dailyBonus;


    public Personal(int id, String name, String surname, String department, double dailySalary, double dailyBonus) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.dailySalary = dailySalary;
        this.dailyBonus = dailyBonus;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDepartment() {
        return department;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public double getDailyBonus() {
        return dailyBonus;
    }
}
