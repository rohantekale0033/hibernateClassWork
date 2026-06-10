package com.practice;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        SessionFactory factory= new Configuration()
        		.configure("hibernate.cfg.xml")
        		.buildSessionFactory();
    }
}
