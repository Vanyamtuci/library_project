package ru.vano.springstart.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ru.vano.springstart.model.author;
import ru.vano.springstart.model.book;

public class Test {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(author.class).addAnnotatedClass(book.class).buildSessionFactory();

		try {
			Session session = factory.getCurrentSession();
			author author = new author("Александр Пушкин");
			session.beginTransaction();
			session.save(author);
			session.getTransaction().commit();
		}

		finally {
			factory.close();
		}

	}
	}

