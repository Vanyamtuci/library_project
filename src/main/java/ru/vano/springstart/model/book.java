package ru.vano.springstart.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.MapKey;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.ForeignKey;
import ru.vano.springstart.model.Author;


@Entity
@Table(name = "book")
public class Book {
	@Id
	@Column(name = "book_id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int book_id;
	
	@Column(name= "title")
	private String title;
	
	@Column(name = "isbn")
	private String isbn;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id", referencedColumnName = "author_id", nullable = false)
    private Author author;
	
	
	public Book() {}
	
	public Book(int book_id, String title, String isbn) {
		this.book_id = book_id;
		this.title = title;
		this.isbn = isbn;
		
	}

	@Override
	public String toString() {
		return "book [book_id=" + book_id + ", title=" + title + ", isbn=" + isbn ;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	
	

	
	
}
	

