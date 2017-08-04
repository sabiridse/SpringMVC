package com.daoimpl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.daoapi.TerminalsDao;
import com.entities.Terminals;


@Repository
@Transactional
public class TerminalsImpl implements TerminalsDao{
	
	@Autowired
    SessionFactory session;

	public Terminals getTerm(int id) throws SQLException {
		return null;
	}	
	public Terminals getId_term(String id_term) throws SQLException {		
		return null;
	}
	
	public void addTerm(Terminals term) throws SQLException {			
//		Session session = null;		
//					try {
//							session.openSession();
//							session.beginTransaction();
//							session.save(term);
//					} catch(Exception e) {
//							session.getTransaction().rollback();
//							e.printStackTrace();
//					} finally {
//							session.getTransaction().commit();
//							session.close();
//					}		
	}

//**************список теремов С  и  ПО *******************************************
	
	@SuppressWarnings("unchecked")
	public List<Terminals> getTerms(int first, int max) throws SQLException {	
		List<Terminals> terms = null;
//		Session session = null;		
				try {
					Criteria criteria = session.getCurrentSession().createCriteria(Terminals.class);
						terms =criteria.setFirstResult(first)
								.setMaxResults(max).list();
				} catch(Exception e) {e.printStackTrace();}
//				finally {
//						//
//						HibernateUtil.getSessionfactory().close();
//				}		
		return terms;
	}
//********************************контекстный поиск**********************************	



	@SuppressWarnings("unchecked")
	public List<Terminals> getTerms(String number_term) throws SQLException {		
					
			return session.getCurrentSession()
						   .createCriteria(Terminals.class)
						   .add(Restrictions.or(
									Restrictions.like("nameTerm", number_term, MatchMode.ANYWHERE),
									Restrictions.eq("idTerm", number_term)))
							.list();

	}
	
}
