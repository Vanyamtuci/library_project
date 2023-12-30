package ru.vano.springstart.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class author {
	@Id
	@Column(name = "author_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToMany(mappedBy = "fk_author_id")
    private List<book> books;

	
	@Column
	String full_name;
	
	public author() {}
	
	public author(String full_name) {
		this.full_name = full_name;
	}

	@Override
	public String toString() {
		return "author [author_id=" + id + ", full_name=" + full_name + "]";
	}

	public int getAuthor_id() {
		return id;
	}

	public void setAuthor_id(int id) {
		this.id = id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	
	

}
