package com.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "terminals", catalog = "hiber_training")
public class Terminals implements java.io.Serializable {

	private static final long serialVersionUID = -528663863542330668L;
	private Integer id;
	private String lo;
	private String regions;
	private String spb;
	private String spbLo;
	private String exceptName;
	private String exceptTerm;
	private String idTerm;
	private String nameDistr;
	private String nameTerm;
	private String other;
	private String timeExcept;

	public Terminals() {
	}

	public Terminals(String lo, String regions, String spb, String spbLo, String exceptName, String exceptTerm,
			String idTerm, String nameDistr, String nameTerm, String other, String timeExcept) {
		this.lo = lo;
		this.regions = regions;
		this.spb = spb;
		this.spbLo = spbLo;
		this.exceptName = exceptName;
		this.exceptTerm = exceptTerm;
		this.idTerm = idTerm;
		this.nameDistr = nameDistr;
		this.nameTerm = nameTerm;
		this.other = other;
		this.timeExcept = timeExcept;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "Lo")
	public String getLo() {
		return this.lo;
	}

	public void setLo(String lo) {
		this.lo = lo;
	}

	@Column(name = "Regions")
	public String getRegions() {
		return this.regions;
	}

	public void setRegions(String regions) {
		this.regions = regions;
	}

	@Column(name = "Spb")
	public String getSpb() {
		return this.spb;
	}

	public void setSpb(String spb) {
		this.spb = spb;
	}

	@Column(name = "SpbLo")
	public String getSpbLo() {
		return this.spbLo;
	}

	public void setSpbLo(String spbLo) {
		this.spbLo = spbLo;
	}

	@Column(name = "except_name")
	public String getExceptName() {
		return this.exceptName;
	}

	public void setExceptName(String exceptName) {
		this.exceptName = exceptName;
	}

	@Column(name = "except_term")
	public String getExceptTerm() {
		return this.exceptTerm;
	}

	public void setExceptTerm(String exceptTerm) {
		this.exceptTerm = exceptTerm;
	}

	@Column(name = "id_term")
	public String getIdTerm() {
		return this.idTerm;
	}

	public void setIdTerm(String idTerm) {
		this.idTerm = idTerm;
	}

	@Column(name = "name_distr")
	public String getNameDistr() {
		return this.nameDistr;
	}

	public void setNameDistr(String nameDistr) {
		this.nameDistr = nameDistr;
	}

	@Column(name = "name_term")
	public String getNameTerm() {
		return this.nameTerm;
	}

	public void setNameTerm(String nameTerm) {
		this.nameTerm = nameTerm;
	}

	@Column(name = "other")
	public String getOther() {
		return this.other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	@Column(name = "time_except")
	public String getTimeExcept() {
		return this.timeExcept;
	}

	public void setTimeExcept(String timeExcept) {
		this.timeExcept = timeExcept;
	}
}
