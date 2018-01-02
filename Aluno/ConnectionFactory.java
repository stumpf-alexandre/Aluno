package Aluno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection(){
        try {

            Class.forName("org.sqlite.JDBC");  //Usado para indicar o driver que deve ser carregado.
            return DriverManager.getConnection("jdbc:sqlite:teste2.db");

        } catch (Exception e) {
            throw new RuntimeException(e);        }
    }
}
