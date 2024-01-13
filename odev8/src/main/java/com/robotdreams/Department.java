package com.robotdreams;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private List<Ekip> ekipList = new ArrayList<>();

    public List<Ekip> getEkipList() {
        return ekipList;
    }

    public void addEkip(Ekip ekip){
        ekipList.add(ekip);
    }
}
