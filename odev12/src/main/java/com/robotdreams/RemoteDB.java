package com.robotdreams;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.StatementException;

public class RemoteDB {
    public static void main(String[] args) {

        //jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11682724

        String url = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11682724";
        String kullaniciAdi = "sql11682724";
        String sifre = "L347ivWtmU";

        Jdbi jdbi = Jdbi.create(url,kullaniciAdi,sifre);

        try (Handle handle = jdbi.open()) {
        // SQL sorgusunun hazırlanması ve çalıştırılması
            handle.execute("CREATE TABLE IF NOT EXISTS users (id SERIAL PRIMARY KEY, name VARCHAR(100))");
            handle.execute("INSERT INTO users (name) VALUES (?)", "Sadik Algul");
            handle.execute("INSERT INTO users (name) VALUES (?)", "Bilge Algul");
            handle.execute("INSERT INTO users (name) VALUES (?)", "Ilke Algul");

            //delete row
            handle.execute("DELETE FROM users WHERE id = ?", 2);


  /*          String result = handle.createQuery("SELECT name FROM users WHERE id = :id")
                    .bind("id", 1)
                    .mapTo(String.class)
                    .one();
            System.out.println("Result: " + result);*/

        } catch (StatementException e) {
            e.printStackTrace();
        }



    }
}
