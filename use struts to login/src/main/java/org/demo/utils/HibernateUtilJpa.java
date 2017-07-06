package org.demo.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by langye on 2017/1/4.
 */
public class HibernateUtilJpa {
	private static EntityManagerFactory em;
	static {
		em = Persistence.createEntityManagerFactory("mysql_jpa");
	}
	public static EntityManager getEntityManager(){
		return em.createEntityManager();
	}

public static void main(String[] args) {
	System.out.println(getEntityManager());
}
}
