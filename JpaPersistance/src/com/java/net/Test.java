package com.java.net;

import javax.persistence.EntityManager;

public class Test {

	public static void main(String[] args) {
		 EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
	        entityManager.getTransaction().begin();

	        Student student = new Student("TestJpa1", "epac");
	        entityManager.persist(student);
	        entityManager.getTransaction().commit();
	        entityManager.close();

	        JPAUtil.shutdown();

	}

}
