package com.jlcindia.hibernate;


import org.hibernate.*;

public class Lab23A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		tx=session.beginTransaction();
		
		Address add=new Address();
		add.setCity("Blore");
		add.setStreet("BTM Layout");
		
		Customer cust=new Customer("sri",add);
		session.save(cust);
		tx.commit();
		session.close();
		}catch(Exception e) {
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}
	}

}
