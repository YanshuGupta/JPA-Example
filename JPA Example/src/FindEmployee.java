import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindEmployee {
   public static void main( String[ ] args ) {
   
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
      EntityManager entitymanager = emfactory.createEntityManager();
      Employee employee = entitymanager.find( Employee.class, 20);

      System.out.println("employee ID = " + employee.getId( ));
      System.out.println("employee NAME = " + employee.getFirstName());
      System.out.println("employee DESIGNATION = " + employee.getLastName());
   }
}