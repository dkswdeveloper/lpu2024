package libraryHib;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Department;
import com.model.Employee;
import com.model.Parking;
import com.model.Player;
import com.model.PlayerKit;
import com.model.Project;
import com.model.Team;

// create class Team, Player, PlayingKit  

public class Main2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try
		{
			emf = Persistence.createEntityManagerFactory("libPU");
			em = emf.createEntityManager();
			System.out.println("db connected , Persistence Unit created ");
//			System.out.println("finding employee");
//			Employee employee = em.find(Employee.class, 101);
//			System.out.println(employee);
//			System.out.println("now finding department");
//			Department dep3 = em.find(Department.class, 3);
//			System.out.println(dep3);
//			em.getTransaction().begin();
//			Parking p1 =new Parking();
//			p1.setFloornum(1);
//			em.persist(p1);
//			em.getTransaction().commit();
			em.getTransaction().begin();
//			PlayerKit kit1= new PlayerKit(); kit1.setNumBats(5);
//			Team team1 = new Team(); team1.setName("Mumbai Indians"); team1.setTeamid(85);
//			Player p1 = new Player(); p1.setName("Rohit");
//			p1.setTeam(team1);
//			p1.setKit(kit1);
//			em.persist(p1);
//			em.persist(team1);
//			em.persist(kit1);
			Employee emp = em.find(Employee.class,101);
			List<Project> projects = emp.getProjects();
			System.out.println("employee 101 is working on :");
			projects.forEach(pr -> System.out.println(pr.getTitle()));
			
			em.getTransaction().commit();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
			emf.close();
			System.out.println("emf closed");
		}

	}

}
