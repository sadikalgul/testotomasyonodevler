package com.robotdreams.singleton;

import com.robotdreams.builder.DbConnector;
import lombok.Value;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class DatabaseInstance {

    private static DbConnector dbConnector;
    private DatabaseInstance() {
    }
    public static DbConnector getInstance(){

        if (dbConnector == null){

            try (InputStream input = new FileInputStream("odev11/src/main/resources/application.properties")) {

                System.out.println("Connector Initiliazing.....");
                Properties prop = new Properties();
                // load a properties file
                prop.load(input);
                dbConnector = DbConnector.builder()
                        .serverName(prop.getProperty("hostName"))
                        .serverPort(Integer.parseInt(prop.getProperty("port")))
                        .databaseName(prop.getProperty("databaseName"))
                        .databaseTimeOut(Integer.parseInt(prop.getProperty("databaseTimeOut")))
                        .dbPassWord(Integer.parseInt(prop.getProperty("password")))
                        .build();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return dbConnector;
    }

}
