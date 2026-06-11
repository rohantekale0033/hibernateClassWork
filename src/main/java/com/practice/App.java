package com.practice;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import com.practice.Utility.HibernateUtility;

  
public class App 
{
    public static void main( String[] args )
    {
      // HibernateUtility.getSessionFactory(); 
    	SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
	}
      
    }

