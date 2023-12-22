package com.robotdreams.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Account {

    private static final int BONUS_DAY_LIMIT = 25;
    private List<Personal> personalList = new ArrayList<>();

    public Account(List<Personal> personalList) {
        this.personalList = personalList;
    }


    public double getTotalSalaryByDays(int days,int id){
        Optional<Personal> personalOptional = personalList.stream().filter(personal1 -> personal1.getId() == id).findFirst();
        double amount = 0;
        if (personalOptional.isPresent())
        {
            Personal person = personalOptional.get();
            amount = days * person.getDailySalary();
            if (days > BONUS_DAY_LIMIT)
                amount += (days - BONUS_DAY_LIMIT) * person.getDailyBonus();
        }
        return amount;
    }
}
