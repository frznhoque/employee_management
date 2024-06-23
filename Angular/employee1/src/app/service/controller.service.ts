import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employees } from '../Model/employees';
import { User } from '../Model/user';
import { Department } from '../Model/department';
import { Role } from '../Model/role';
import { Attendance } from '../Model/attendance';
import { Salary } from '../Model/salary';
import { SalaryEmpose } from '../Model/salary-empose';
import { Voucher } from '../Model/voucher';

@Injectable({
  providedIn: 'root'
})
export class ControllerService {

  url:any="http://localhost:8080/";

  constructor(private http:HttpClient) { }

  //All Employee
  public allemployee():Observable<Employees>{
    this.url="http://localhost:8080/all-employee";
    return this.http.get<Employees>(this.url);
  }

  //__________________Create Employee________________________________-

  public addEmploye(employee:any):Observable<Employees>{
    alert("Angular Service")
    this.url="http://localhost:8080/create-employee";
    return this.http.post<Employees>(this.url,employee);
  }

//---------------------Login-----------------------

public login(userName:any,password:any):Observable<User>{
  this.url="http://localhost:8080/"+userName+"/"+password;
  return this.http.get<User>(this.url);
}

//------------------------all department-----------------------
public alldepartment():Observable<Department>{
  this.url="http://localhost:8080/departments";
  return this.http.get<Department>(this.url);
}

//______________________________create Department___________________________________

public createDepartment(departmentName:any):Observable<Department>{
  this.url="http://localhost:8080/departments/"+departmentName;
  return this.http.post<Department>(this.url,departmentName);
}

//-----------------------------All Role-------------------------------------

public allRole():Observable<Role>{
  this.url="http://localhost:8080/roles";
  return this.http.get<Role>(this.url);
}


//------------------Make Attendance________________________________________

public makeAttendance(a:Attendance):Observable<Attendance>{
  this.url="http://localhost:8080/attendance";
  return this.http.post<Attendance>(this.url,a);
}

public newAndUpdateAttendance(field:any,fieldvalue:any,id:any,month:any,year:any):Observable<Attendance>{
  this.url="http://localhost:8080/makeattendance/"+field+"/"+fieldvalue+"/"+id+"/"+month+"/"+year;
  return this.http.get<Attendance>(this.url);
}

//________________________Attendance Report_________________________________

public attendanceReport(startDate:any,endDate:any):Observable<Attendance>{
  this.url="http://localhost:8080/attendancereport/"+startDate+"/"+endDate;
  return this.http.get<Attendance>(this.url);
}
//-------------------------------All Salary before empose----------------------

public salaryBeforeImpose():Observable<Salary>{
  this.url="http://localhost:8080/salarybeforeempose";
  return this.http.get<Salary>(this.url);
}

//_________________________________Salary Empose______________________________

public salaryEmpose(month:any,year:any,date:any):Observable<SalaryEmpose>{
  this.url="http://localhost:8080/salary/"+month+"/"+year+"/"+date;
  return this.http.get<SalaryEmpose>(this.url);
}

//___________________________________save voucher-------------------------

public saveVoucher(v:any):Observable<Voucher>{
  this.url="http://localhost:8080/saveVoucher";
  return this.http.post<Voucher>(this.url,v);
}

//__________________________All Request Voucher__________________________________

public allRequestVoucher():Observable<Voucher>{
  this.url="http://localhost:8080/getAllRequestVoucher";
  return this.http.get<Voucher>(this.url);
}


//_____________________________All Salary_______________________________________
public allSalary():Observable<SalaryEmpose>{
  this.url="http://localhost:8080/allsalary";
  return this.http.get<SalaryEmpose>(this.url);
}

//_____________________________ Salary By Month_______________________________________
public allSalarybyMonth(month:any,year:any):Observable<SalaryEmpose>{
  this.url="http://localhost:8080/salarybymonthyear/"+month+"/"+year;
  return this.http.get<SalaryEmpose>(this.url);
}
}
