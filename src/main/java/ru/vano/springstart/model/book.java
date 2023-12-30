package ru.vano.springstart.model;
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


@Entity
@Table(name = "book")
public class book {
	@Id
	@Column 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int book_id;
	
	@Column
	private String title;
	
	@Column
	private String isbn;
	
	@ManyToOne()
    @JoinColumn(name = "author_id", referencedColumnName = "author_id", nullable = false)
    private author fk_author_id;
	
	
	public book() {}
	
	public book(String title, String isbn, author fk_author_id) {
		this.title = title;
		this.isbn = isbn;
		this.fk_author_id = fk_author_id;
		
	}

	@Override
	public String toString() {
		return "book [book_id=" + book_id + ", title=" + title + ", isbn=" + isbn + ", author_id=" + fk_author_id + "]";
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

	public author getAuthor_id() {
		return fk_author_id;
	}

	public void setAuthor_id(author fk_author_id) {
		this.fk_author_id = fk_author_id;
	}
	
	
	
	

	
	
}
	

