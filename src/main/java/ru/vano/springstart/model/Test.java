package ru.vano.springstart.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ru.vano.springstart.model.Author;
import ru.vano.springstart.model.Book;

public class Test {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class).addAnnotatedClass(Author.class).buildSessionFactory();

		try {
			Session session = factory.getCurrentSession();
			Author author = new Author(4,"Александр Пушкин");
			Book book = new Book(4,"Евгений Онегин", "9785433502758");
			book.setAuthor(author);
			session.beginTransaction();
			session.save(author);
			session.save(book);
			session.getTransaction().commit();
		}

		finally {
			factory.close();
		}

	}
	}

