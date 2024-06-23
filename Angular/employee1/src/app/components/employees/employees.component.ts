import { Component, OnInit } from '@angular/core';
import { Employees } from 'src/app/Model/employees';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css']
})
export class EmployeesComponent implements OnInit {

  constructor(private myservice:ControllerService) {
   
    this.myservice.allRole().subscribe((x)=>{
      this.role=x;
    })
    this.myservice.alldepartment().subscribe((x)=>{
      this.departments=x;
    })

    this.myservice.allRequestVoucher().subscribe((x)=>{
      this.allrequestedVouchers=x;
     
    })

   }

  ngOnInit(): void {
  }

  employeeId:any;
	name:any;
	email:any;
	phoneNo:any;
	departmentId:any;
	roleId:any;
	dateOfJoining:any;
	salary:any;
	address:any;
  attendancestatus:any;

  templete:any;
  allemployees:any=[];
  departments:any=[];
  role:any=[];

  allrequestedVouchers:any=[];

  employee:any;

  show(){
    this.myservice.allemployee().subscribe((x)=>{
      this.allemployees=x;
    })
  }

  changeRole(i:any){
    this.roleId=this.role[i].roleId;
  }
  changeDepartment(i:any){
    this.departmentId=this.departments[i].departmentId;
  }
//(employeeId:any,name:any,email:any,phoneNo:any,departmentId:any,roleId:any,dateOfJoining:any,salary:any,address:any)
  addNewEmployee(){
    this.employee=new Employees(this.employeeId,this.name,this.email,this.phoneNo,this.departmentId,this.roleId,this.dateOfJoining,this.salary,this.address,this.attendancestatus);
    this.myservice.addEmploye(this.employee).subscribe(()=>{
      alert("New Employee added");
      
    });
  }


  // allVoucher(){
  //   this.myservice.allRequestVoucher().subscribe((x)=>{
  //     this.allrequestedVouchers=x;
     
  //   })
  // }

}
