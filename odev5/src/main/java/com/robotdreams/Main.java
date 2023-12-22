package com.robotdreams;

import com.robotdreams.model.Account;
import com.robotdreams.model.Personal;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Personal> personalList = new ArrayList<>();
        personalList.add(new Personal(1,"sadik","algul","otomasyon",750.55d,1000.00d));
        personalList.add(new Personal(2,"serkan","cura","otomasyon",250.55d,1000.00d));

        Account account = new Account(personalList);
        double salaryId1 = account.getTotalSalaryByDays(15,1);
        double salaryId2 = account.getTotalSalaryByDays(27,2);
        System.out.println("ID1 Salary:" + salaryId1 + " " + "ID2 Salary:" + salaryId2);
    }
}