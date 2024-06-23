import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-print-salary',
  templateUrl: './print-salary.component.html',
  styleUrls: ['./print-salary.component.css']
})
export class PrintSalaryComponent implements OnInit {
  
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
    // });
    this.month=this.router.getCurrentNavigation()?.extras.state?.["month"];
    this.year=this.router.getCurrentNavigation()?.extras.state?.["year"];
    alert(this.month)
    alert(this.year)
    this.myservice.allSalarybyMonth(this.month,this.year).subscribe((x)=>{
      this.allSalary=x;
      
    });
    // if(this.allSalary!=null){
    //   alert("Printing Process")
    //   window.print();
    // }
    // window.print();
   }

  ngOnInit(): void {
    setTimeout(() => {
      // Code to execute after the delay
      console.log('Delayed code executed after 2000 milliseconds');
      // alert('Delayed code executed after 2000 milliseconds');
      window.print();
    }, 2000); 
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
  
  

  monthModel(month:any){
    this.month=month;
    if(this.month!=null){
      this.monthtemplete="allEmployeeList";
    }
  }

}
