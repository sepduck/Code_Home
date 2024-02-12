package com.k14.config;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class JdbcCon {
    public final static String dbname = "/ks";
    public final static String url = "jdbc:mysql://localhost:3306" + dbname;
    public final static String username = "root";
    public final static String password = "2511";
    public static Connection getCon(){
        try{

            Connection connection = DriverManager.getConnection(url,username,password);
            return connection;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
