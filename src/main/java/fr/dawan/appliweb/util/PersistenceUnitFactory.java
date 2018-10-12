package fr.dawan.appliweb.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUnitFactory {

	public static EntityManager createEntityManager(String persistenceUnitName) {
		// je crée un EntityManager 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);
		EntityManager em = emf.createEntityManager();

		return em;
	}
}
