package com.robotdreams;

import com.robotdreams.builder.DbConnector;
import com.robotdreams.singleton.DatabaseInstance;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DbConnector dbConnector = DatabaseInstance.getInstance();
        System.out.println("First Instance Value" + dbConnector);
        DbConnector dbConnector1 = DatabaseInstance.getInstance();
        System.out.println("Second Instance Value" + dbConnector1);
        if (dbConnector.equals(dbConnector1))
            System.out.println("Same Instance");
    }
}