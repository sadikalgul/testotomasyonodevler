package com.robotdreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     List<GenericDisplay> genericDisplayList = Arrays.asList(new GenericDisplay<>("RobotDreams",100),new GenericDisplay<>(100.5d,100),new GenericDisplay<>("RobotDreams","Serkan Cura"));
     genericDisplayList.forEach(System.out::println);
     genericDisplayList.forEach(GenericDisplay::print);

    }
}