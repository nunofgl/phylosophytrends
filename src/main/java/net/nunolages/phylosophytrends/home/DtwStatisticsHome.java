// Generated Feb 24, 2019 12:02:22 AM by Hibernate Tools 5.3.6.Final

package net.nunolages.phylosophytrends.home;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import net.nunolages.phylosophytrends.domain.DtwStatistics;
import net.nunolages.phylosophytrends.domain.DtwStatisticsId;

/**
 * Home object for domain model class DtwStatistics.
 * 
 * @see .DtwStatistics
 * @author Hibernate Tools
 */
public class DtwStatisticsHome {

	private static final Log log = LogFactory.getLog(DtwStatisticsHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(DtwStatistics transientInstance) {
		log.debug("persisting DtwStatistics instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(DtwStatistics instance) {
		log.debug("attaching dirty DtwStatistics instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DtwStatistics instance) {
		log.debug("attaching clean DtwStatistics instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(DtwStatistics persistentInstance) {
		log.debug("deleting DtwStatistics instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DtwStatistics merge(DtwStatistics detachedInstance) {
		log.debug("merging DtwStatistics instance");
		try {
			DtwStatistics result = (DtwStatistics) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DtwStatistics findById(DtwStatisticsId id) {
		log.debug("getting DtwStatistics instance with id: " + id);
		try {
			DtwStatistics instance = (DtwStatistics) sessionFactory.getCurrentSession().get("DtwStatistics", id);
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

	public List findByExample(DtwStatistics instance) {
		log.debug("finding DtwStatistics instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("DtwStatistics")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
