package com.shsz.jpa.manage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Wyh2 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "wyh2", catalog = "wyh1")
public class Wyh2 implements java.io.Serializable {

	// Fields

	private Integer id;
	private String names;

	// Constructors

	/** default constructor */
	public Wyh2() {
	}

	/** full constructor */
	public Wyh2(String names) {
		this.names = names;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "names", length = 20)
	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

}