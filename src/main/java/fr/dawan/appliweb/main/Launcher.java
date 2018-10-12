package fr.dawan.appliweb.main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import fr.dawan.appliweb.beans.Event;
import fr.dawan.appliweb.dao.GenericDao;
import fr.dawan.appliweb.dao.JsonTools;
import fr.dawan.appliweb.util.PersistenceUnitFactory;

public class Launcher {

	public static void main(String[] args) {

		EntityManager em = PersistenceUnitFactory.createEntityManager("appliWeb");
		GenericDao dao = new GenericDao();

		// récupérer la list d'events:
		List<Event> events = new ArrayList<>(JsonTools.importAllEventsFromJson());
		dao.saveOrUpdate(events, em, false);
		em.close();
	}

}
