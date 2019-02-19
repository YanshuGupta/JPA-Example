import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateEmployee {
	
   public static void main( String[ ] args ) {
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
      
      EntityManager entitymanager = emfactory.createEntityManager( );
      entitymanager.getTransaction().begin();
      
      Employee employee = entitymanager.find(Employee.class, 20);
      
      //before update
      System.out.println(employee);
      
      //updating
      employee.setFirstName("OKOK");
      entitymanager.getTransaction().commit();
      
      //after update
      System.out.println(employee);
      entitymanager.close();
      emfactory.close();
   }
}