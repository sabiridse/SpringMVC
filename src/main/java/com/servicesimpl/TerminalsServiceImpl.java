package com.servicesimpl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoapi.TerminalsDao;
import com.daoapi.UsersDao;
import com.entities.Terminals;
import com.servicesapi.TerminalsService;

@Service
public class TerminalsServiceImpl implements TerminalsService {
	
	@Autowired
    TerminalsDao terminalsDao;

	public void addTerm(Terminals term) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public Terminals getTerm(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Terminals> getTerms(int first, int max) throws SQLException {
			
		return terminalsDao.getTerms(first, max);
	}

	public List<Terminals> getTerms(String id_term) throws SQLException {

		
		return terminalsDao.getTerms(id_term);
	}
	
	public Terminals getId_term(String id_term) throws SQLException {

		return null;
	}

	
	
}
