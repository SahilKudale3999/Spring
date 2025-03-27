package SpringMVC.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOImp implements IEmployeeDAO {

	JdbcTemplate jt;
	
	@Autowired
	public EmployeeDAOImp(JdbcTemplate jt) {
		super();
		this.jt = jt;
	}

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("addemployee");
		jt.update("insert into employee values (?,?,?,?,?,?)",8,"dev","bhau",5,200,"23-03-2024");
		
	}

	@Override
	public int getEmployee(int id) {
		// TODO Auto-generated method stub
		System.out.println("getemployee");

		return 0;
	}

	@Override
	public List getAllEmployees() {
		// TODO Auto-generated method stub
		System.out.println("getAllEmployee");

		return null;
	}

	@Override
	public void updateSalary(int id, int salary) {
		// TODO Auto-generated method stub
		System.out.println("updatedsalary");

		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		System.out.println("deletedemployee");

		
	}

}
