package SpringMVC.springmvc;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOImp implements IEmployeeDAO {

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("addemployee");
		
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
