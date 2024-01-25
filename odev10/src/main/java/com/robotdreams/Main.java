package com.robotdreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     System.out.println("========Odev 1. Kisim========");
     List<GenericDisplay> genericDisplayList = Arrays.asList(new GenericDisplay<>("RobotDreams",100),new GenericDisplay<>(100.5d,100),new GenericDisplay<>("RobotDreams","Serkan Cura"));
     genericDisplayList.forEach(System.out::println); // print by to string function
     genericDisplayList.forEach(GenericDisplay::print); // print by class print method

     System.out.println("========Odev 2. Kisim=======");
     List<Integer> values = Arrays.asList(10,20,27,30,40,100,90);
     System.out.println("Find Value:" + findValue(27,values)); // return 27
     System.out.println("Find Value:" + findValue(2,values)); // return -1

    }

    public static int findValue(int findVal,List<Integer> values){
        Optional<Integer> val = values.stream().filter(s->s.equals(findVal))
                .findFirst();
        return (val.orElse(-1));

    }
}