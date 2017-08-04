package com.daoapi;

import java.sql.SQLException;
import java.util.List;

import com.entities.Terminals;


public interface TerminalsDao {

	public void addTerm (Terminals term) throws SQLException;
	public Terminals getTerm (int id) throws SQLException;
	public List<Terminals> getTerms (int first, int max) throws SQLException;
	public List<Terminals> getTerms (String id_term) throws SQLException;
	public Terminals getId_term(String id_term) throws SQLException;
	
}
