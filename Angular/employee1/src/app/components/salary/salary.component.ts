import { state } from '@angular/animations';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-salary',
  templateUrl: './salary.component.html',
  styleUrls: ['./salary.component.css']
})
export class SalaryComponent implements OnInit {

  // Salary Empose Variable_____________________________________
  id:any;
	employeeId:any;
	basic:any;
	house:any;
	communication:any;
	transport:any;
	medical:any;
	leave:any;
	leaveNotPay:any;
	bonous:any;
	total:any;
	emposeDate:any;

  //_____________________________________________________________
  allsalary:any;

  emposeSalary:any;

  templete:any;
  monthtemplete:any;
 
  allemployee:any;


  year:any="Select Year";

  month:any="Select Month";

  allSalary:any=[];
  constructor(private myservice:ControllerService, private router:Router) {
    // this.myservice.allSalary().subscribe((x)=>{
    //   this.allSalary=x;
    // })
   }

  ngOnInit(): void {
  }
  salaryEmpose(){
    if(this.month!="Select Month" && this.year!="Select Year"){
      this.myservice.salaryEmpose(this.month,this.year,this.emposeDate).subscribe(()=>{
        alert("Salary Emposed for "+this.month+ " "+this.year);
      })
    }else{
      alert("Select Month and Year");
    }
    
  }

  searchSalary(){
    this.myservice.allSalarybyMonth(this.month,this.year).subscribe((x)=>{
      this.allSalary=x;
    })
  }

  printsalary(){
    this.router.navigateByUrl("/printsalary",{state:{month:this.month,year:this.year}});
  }
  
  

  monthModel(month:any){
    this.month=month;
    if(this.month!=null){
      this.monthtemplete="allEmployeeList";
    }
  }

}
