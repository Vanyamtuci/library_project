package ru.vano.springstart.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "author")
public class Author {
	@Id
	@Column(name = "author_id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToMany(mappedBy = "author", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Book> books;

	
	@Column(name = "full_name")
	private String full_name;
	
	public Author() {}
	
	public Author(int id, String full_name) {
		this.id = id;
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
	
	public List<Book> getBooks(){
		return books;
	}
	
	public void setBooks(List<Book> books){
		this.books = books;
	}
	
	

}
