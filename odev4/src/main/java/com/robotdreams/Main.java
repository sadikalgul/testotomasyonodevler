package com.robotdreams;

import com.robotdreams.model.Department;
import com.robotdreams.model.Personal;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Personal> personalList = new ArrayList<>();
        personalList.add(new Personal("sadik","algul",42));
        personalList.add(new Personal("serkan","cura",50));
        personalList.add(new Personal("albert","einstein",65));

        Department department = new Department("TestOtomasyon",personalList);

        department.getPersonalList().forEach(System.out::println);



    }
}