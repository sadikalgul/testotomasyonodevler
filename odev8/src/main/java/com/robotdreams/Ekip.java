package com.robotdreams;

import java.util.*;

public class Ekip {
    private Personel Lead;
    private List<Personel> personelList = new ArrayList<>();
    private Map<String,Boolean> taskList = new HashMap<>();

    public Ekip(Personel lead) {  // ekip lead ile beraber olusturulur
        Lead = lead;
    }

    public void setLead(Personel lead) {  // change lead
        Lead = lead;
    }

    public void addPersonel(Personel personel){
        personelList.add(personel);
    }

    public void removePersonel(Personel personel){
        personelList.remove(personel);
    }

/*    public void updatePersonel(Personel person)
    {
        Optional<Personel> findPersonel = personelList.stream().filter(personel -> Objects.equals(personel.getName(), person.getName())).findFirst();
        if (findPersonel.isPresent()){
            Personel personel = findPersonel.get();
        }
    }*/

    public void addUpdateTask(String task,Boolean status){
        taskList.put(task,status);
    }

    public List<Personel> getPersonelList() {
        return personelList;
    }

    public Map<String, Boolean> getTaskList() {
        return taskList;
    }

    public Personel getLead() {
        return Lead;
    }
}
