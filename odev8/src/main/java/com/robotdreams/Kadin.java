package com.robotdreams;

import java.util.Calendar;
import java.util.Date;

public class Kadin extends Personel{
    public Kadin(String name, String surName, Date birtDate) {
        super(name, surName, birtDate);
    }
    @Override
    public Date getRetireDate() {
        Calendar c = Calendar.getInstance();
        c.setTime(getBirtDate());
        c.add(Calendar.YEAR,60);
        return c.getTime();
    }
}
