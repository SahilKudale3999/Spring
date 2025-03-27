package SpringMVC.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

	EmployeeDAOImp ed;
    @Autowired
	public EmployeeService(EmployeeDAOImp ed) {
		//
    	super();
		this.ed = ed;
	}
	
	 public void getEmp() {
		 System.out.println(ed.getEmployee(0));
		 ed.addEmployee(null);
	 }

	
	
}
