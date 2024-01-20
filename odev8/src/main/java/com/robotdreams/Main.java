package com.robotdreams;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Personel leadPersonel = new Erkek("Ali","Veli", new Date(82,Calendar.NOVEMBER,8));// year 1900+value = 1900+82 =1982
        Ekip newEkip = new Ekip(leadPersonel);
        Personel pr1 = new Kadin("Ayse","Seven",new Date(87, Calendar.NOVEMBER,14)); // year 1900+value = 1900+87 =1987
        Personel pr2 = new Erkek("Murat","Sezen",new Date(92,Calendar.AUGUST,20));
        //System.out.println(pr1);
        //System.out.println(pr2);
        newEkip.addPersonel(pr1);
        newEkip.addPersonel(pr2);

        newEkip.addUpdateTask("Rapor Olustur",false);
        newEkip.addUpdateTask("Sunum Olustur",false);


        Department dp = new Department();
        dp.addEkip(newEkip);

        System.out.println("======Initial Values=======");
        printValues(dp);

        Ekip updateEkip = dp.getEkipList().get(0);  // get first ekip
        updateEkip.addUpdateTask("Rapor Olustur",true); // completed task
        updateEkip.addUpdateTask("Sunum Olustur",true); // completed task
        updateEkip.updatePersonel(updateEkip.getPersonelList().get(0),"Elmas"); // update first personel surname
        updateEkip.removePersonel(updateEkip.getPersonelList().get(1)); // remove second person

        System.out.println("=======Updated Values==========");
        printValues(dp);

    }

    public static void printValues(Department dp){

        List<Ekip> ekipList = dp.getEkipList();
        ekipList.forEach(new Consumer<Ekip>() {
            @Override
            public void accept(Ekip ekip) {
                System.out.println("Lead:" + ekip.getLead());
                List<Personel> personelList = ekip.getPersonelList();
                personelList.forEach(new Consumer<Personel>() {
                    @Override
                    public void accept(Personel personel) {
                        System.out.println(personel);
                        System.out.println("Retire Date:" + personel.getRetireDate().toString());
                    }
                });
                Map<String,Boolean> taskMap = ekip.getTaskList();
                taskMap.forEach(new BiConsumer<String, Boolean>() {
                    @Override
                    public void accept(String s, Boolean aBoolean) {
                        System.out.println("Task:" + s +" status:" + aBoolean);
                    }
                });
            }
        });

    }
}