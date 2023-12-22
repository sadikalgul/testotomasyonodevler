package com.robotdreams.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private final String departmentName;
    private List<Personal> personalList = new ArrayList<>();


    public Department(String departmentName, List<Personal> personalList) {
        this.departmentName = departmentName;
        this.personalList = personalList;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public List<Personal> getPersonalList() {
        return personalList;
    }
}
