package com.zensar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;

/**
 * @author Dipankar Chakraborty
 * @creation_date 1 October 2019 10:37 AM
 * @modification_date 1 October 2019 10:37 AM
 * @version 1.0
 * @copyright Zensar Technologies. All rights reserved.
 *
 */
public class HibernateMain 
{
    public static void main( String[] args )
    {
    	Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		Product p = new Product();
		p.setProductId(1000);
		p.setName("AC");
		p.setBrand("Daikin");
		p.setPrice(30000);
		
		s.save(p);
		System.out.println("Product is Saved");
		t.commit();
		s.close();
    }
}
