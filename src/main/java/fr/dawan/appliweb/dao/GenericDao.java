package fr.dawan.appliweb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.hibernate.dialect.lock.OptimisticEntityLockException;

import fr.dawan.appliweb.beans.Record;



public class GenericDao {

	public <T extends Record> List<T> findAll(Class<T> clazz, int begin, int nbResult, EntityManager em, boolean closeConnection) {
		// je crée une requette sql en langage JPQL qui veut dire select tous from
		// table=class		
		//faut un espace après from dans la requette et un espace avant entity
		TypedQuery<T> query = em.createQuery("select entity from " + clazz.getName() + " entity", clazz); // ex:"select stag from Stagiaire + stag
																										
		List<T> result = query.setFirstResult(begin).setMaxResults(nbResult).getResultList(); // pour écupérer ma liste de résultats =result
		
		if (closeConnection)
			em.close();

		return result;

	}
	
	public <T extends Record> void saveOrUpdate(T item, EntityManager em, boolean closeConnection) {
		// item est l'objet que je veux persister en BDD-qui en JpaLauncher était de
		// type Session, mais ici c'est une classe générique
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			// si l'id de l'objet est null - je vais un persist, sinon je fais qu'un update:

			if ( item.getId() == null ) { 
				em.persist(item); // je sauvegarde l'objet

			} else {
				em.merge(item); // je fais un update sur l'objet
			}
			tx.commit();

		} catch (Exception e) {
			try {
				tx.rollback();
			} catch (OptimisticEntityLockException e1) {
				e1.printStackTrace();
			}
		}
		if (closeConnection) // si la connexion est ouverte alors je la ferme
			em.close();

	}

	// méthode pour supprimer l'objet item de la BDD:

	public <T extends Record> void delete(T item, EntityManager em, boolean closeConnection) {
		if (item.getId() != null) {
			em.remove(item);
		}
		if (closeConnection)
			em.close();
	}

	// méthode pour rechercher un element de la BDD en fonction de son id et de sa
	// classe, clazz=class

	public <T extends Record> T findById(Class<T> clazz, int id, EntityManager em, boolean closeConnection) {
		T result = em.find(clazz, id);
		if (closeConnection)
			em.close();
		return result;

	}

	// une methode qui permet d'afficher l'integralite des éléments de la bdd dans la console, et pas
	// qu'un seul élément comme celles d'avant
	// langage de requetage JPQL = la norme por le JPA
	// le langage de requetage Hibernate = HQL
}
