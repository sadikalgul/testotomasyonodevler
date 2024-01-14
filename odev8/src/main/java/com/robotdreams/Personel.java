package com.robotdreams;

import java.util.Date;

public abstract class Personel {
    private final String name;
    private String surName;
    private final Date birtDate;

    public Personel(String name, String surName, Date birtDate) {
        this.name = name;
        this.surName = surName;
        this.birtDate = birtDate;
    }

    public abstract Date getRetireDate();

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public Date getBirtDate() {
        return birtDate;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", birtDate=" + birtDate +
                '}';
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
