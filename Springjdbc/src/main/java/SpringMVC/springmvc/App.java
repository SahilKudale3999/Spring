  package SpringMVC.springmvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con = new AnnotationConfigApplicationContext(Configjdbc.class);
        EmployeeService es = (EmployeeService) con.getBean("employeeService");
//     Employee e = new Employee();
//        e.setId(5);
//        e.setName("kate");
//        e.setDepartment("it");
        es.getEmp();
    }
}
