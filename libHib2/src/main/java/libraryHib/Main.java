package libraryHib;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.model.Book;
import com.model.Student;

public class Main {

	public static void main(String[] args) {
		System.out.println("Maven Project Running !!");
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try
		{
			emf = Persistence.createEntityManagerFactory("libPU");
			em = emf.createEntityManager();
			Book book = em.find(Book.class,101);
			System.out.println(book);
			Book book2 = em.find(Book.class,102);
			System.out.println(book2);
			Book book3 = em.find(Book.class,103);
			System.out.println(book3);
			
			Book book4 = em.find(Book.class,101);
			System.out.println(book4);
			
			Student student1 = em.find(Student.class, 2401);
			System.out.println(student1);
			
			em.getTransaction().begin();
			Book book114 = em.find(Book.class, 114);
			em.remove(book114);
			student1.setName("Akash Missing");
			Book newbook = new Book(0,"Java with ORM", "Rachit", "LPU");
			em.persist(newbook);
			System.out.println(newbook);
			em.getTransaction().commit();
			
			System.out.println();
			Query query = em.createQuery("from Student s where s.roll=2402");
			List list = query.getResultList();
			list.forEach(ob -> System.out.println(ob));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
			emf.close();
		}
	}

}