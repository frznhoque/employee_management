package com.project.employee;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.project.employee.Repository.salary_Repository;

@RestController
//@RequestMapping("/api/employees")
@CrossOrigin("*")
public class EmployeeController {

//	@Autowired
//	private EmployeesRepo employeeRepo;
//	@Autowired
//	private UserRepo userRepo;
//	@Autowired
//	private AttendanceRepo attendanceRepo;
//	@Autowired
//	private DepartmentRepo departmentRepo;
//	@Autowired
//	private RoleRepo roleRepo;
	
//	@Autowired
//	private salary_Repository repo;
	
	
	
	//___________________________All Employee Data_______________________________________
	
	public List<Employees> employees=new ArrayList<>();
	
	@GetMapping("/all-employee")
    public List<Employees> getAllEmployees() {
//       this.employees=employeeRepo.findAll();
		EmployeeDA da=new EmployeeDA();
		employees=da.allemployees();
        
        return employees;
        
        
    }
	
	//-------------------------------Add Employee-------------------------------------
	@PostMapping("/create-employee")
	public void addEmployee(@RequestBody Employees e) {
		System.out.println("controller");
		EmployeeDA da=new EmployeeDA();
		da.addEmployee(e);
	}
	
	
	
	
	//_________________________________Login ___________________________________________
	
	@GetMapping("/{userName}/{password}")
	public User login(@PathVariable String userName, @PathVariable String password) {
		UserDA da=new UserDA();
		return da.loginUser(userName, password);
	}
	
	
	//-------------------------------------All Department---------------------------------
	
	@GetMapping("/departments")
	public List<Department> allDepartments() {
		DepartmentDA da = new DepartmentDA();
       
       return da.alldepartment();
   }
	
	//--------------------------------All Role---------------------------------------------
	@GetMapping("/roles")
	public List<Role> allRole() {
		RoleDA da = new RoleDA();
       
       return da.allrole();
   }
	
	
	//------------------------------Create Departments--------------------------------------
	@PostMapping("/departments/{departmentName}")
	public void login(@PathVariable String departmentName) {
		DepartmentDA da = new DepartmentDA();
		da.createDepartment(departmentName);
	}
	
	//--------------------------Attendance insert and update------------------------------
	@PostMapping("/attendance")
	public void attendance(@RequestBody Attendance a) {
		AttendanceDA da=new AttendanceDA();
		da.makeAttendance(a);
	}
	
	@GetMapping("/makeattendance/{field}/{fieldValue}/{id}/{month}/{year}")
	public void makeattendance(@PathVariable String field, @PathVariable String fieldValue, @PathVariable int id, @PathVariable String month, @PathVariable String year) {
		System.out.println("apiField name => "+field);
		System.out.println("apiField value => "+fieldValue);
		System.out.println("apiid  => "+id);
		System.out.println("apimonth  => "+month);
		System.out.println("apiyear  => "+year);
		AttendanceDA da=new AttendanceDA();
		da.attendance(field,fieldValue,id,month,year);
	}
	
	//_________________________Attendance Report__________________________________
	@GetMapping("/attendancereport/{month}/{year}")
	public List<AttendanceReport> report(@PathVariable String month, @PathVariable String year) {
		AttendanceReportDA da= new AttendanceReportDA();
		return da.report(month, year);
   }
	
	//_____________________________Salary Empose_____________________________________
	@GetMapping("/salary/{month}/{year}/{date}")
	public void salaryEmpose(@PathVariable String month, @PathVariable int year, @PathVariable Date date ) {
		SalaryEmposeDA da= new SalaryEmposeDA(); 
		da.insertSalary(month, year, date);
	}
	
	@PostMapping("/saveVoucher")
	public void saveVoucher(@RequestBody Voucher v) {
		System.out.println("voucher works");
		VoucherDA da=new VoucherDA();
		da.saveVoucher(v);
	}
	
	@GetMapping("/getAllRequestVoucher")
	public List<Voucher> getAllRequestVoucher() {
		System.out.println("voucher works");
		VoucherDA da=new VoucherDA();
		return da.getRequestVoucher();
	}
	
	//------------------------------------All Salary---------------------------------------
	@GetMapping("/allsalary")
	public List<SalaryEmpose> allsalaryEmpose( ) {
		SalaryEmposeDA da= new SalaryEmposeDA(); 
		System.out.println("controller");
		return da.allemployeeSalary();
	}
	
	//------------------------------------Salary By Month and year---------------------------------------
		@GetMapping("/salarybymonthyear/{month}/{year}")
		public List<SalaryEmpose> allsalarybymonth(@PathVariable String month, @PathVariable int year ) {
			SalaryEmposeDA da= new SalaryEmposeDA(); 
			System.out.println("controller");
			return da.employeeSalary(month,year);
		}
		
		
		
		
		//-----------------------------------leave request-----------------------------------------
		
		@PostMapping("/leave-requests")
		public void saveLeaveRequest(@RequestBody LeaveRequest v) {
			System.out.println("Leave Request Controller works");
			LeaveRequestDA da=new LeaveRequestDA();
			da.leaveRequest(v);
		}
		
		//--------------------------------------all leave request-----------------------------------
		
		@GetMapping("/allrequestleave")
		public List<LeaveRequest> allLeaveRequest() {
			LeaveRequestDA da= new LeaveRequestDA(); 
			System.out.println("controller");
			return da.allRequestList();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}
