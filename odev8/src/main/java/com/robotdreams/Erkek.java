package com.robotdreams;

import java.util.Calendar;
import java.util.Date;

public class Erkek extends Personel{

    public Erkek(String name, String surName, Date birtDate) {
        super(name, surName, birtDate);
    }

    @Override
    public Date getRetireDate() {
        Calendar c = Calendar.getInstance();
        c.setTime(getBirtDate());
        c.add(Calendar.YEAR,65);
        return c.getTime();
    }
}
