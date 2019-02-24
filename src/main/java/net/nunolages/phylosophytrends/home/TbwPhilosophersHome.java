// Generated Feb 24, 2019 12:02:22 AM by Hibernate Tools 5.3.6.Final

package net.nunolages.phylosophytrends.home;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import net.nunolages.phylosophytrends.domain.TbwPhilosophers;

/**
 * Home object for domain model class TbwPhilosophers.
 * 
 * @see .TbwPhilosophers
 * @author Hibernate Tools
 */
public class TbwPhilosophersHome {

	private static final Log log = LogFactory.getLog(TbwPhilosophersHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(TbwPhilosophers transientInstance) {
		log.debug("persisting TbwPhilosophers instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TbwPhilosophers instance) {
		log.debug("attaching dirty TbwPhilosophers instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TbwPhilosophers instance) {
		log.debug("attaching clean TbwPhilosophers instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TbwPhilosophers persistentInstance) {
		log.debug("deleting TbwPhilosophers instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TbwPhilosophers merge(TbwPhilosophers detachedInstance) {
		log.debug("merging TbwPhilosophers instance");
		try {
			TbwPhilosophers result = (TbwPhilosophers) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TbwPhilosophers findById(int id) {
		log.debug("getting TbwPhilosophers instance with id: " + id);
		try {
			TbwPhilosophers instance = (TbwPhilosophers) sessionFactory.getCurrentSession().get("TbwPhilosophers", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TbwPhilosophers instance) {
		log.debug("finding TbwPhilosophers instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("TbwPhilosophers")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
