package com.robotdreams;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (Planet p : Planet.values()){
            System.out.println("Planet:" + p.name() + " Number:" + p.getOrder() + " Distance(km):" + p.getDistance()+ " Diameter(km):"+ p.getDiameter()+ " RotateTime(Day):" + p.getDuration());
        }

    }
}