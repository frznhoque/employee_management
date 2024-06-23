import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-print-attendance',
  templateUrl: './print-attendance.component.html',
  styleUrls: ['./print-attendance.component.css']
})
export class PrintAttendanceComponent implements OnInit {

  templete:any;
  allemployee:any;
  startDate:any;
  endDate:any;
  attendanceReport:any=[];

  attendanceDate:any;

  attendanceId:any;
	employeeId:any;
	// date:any;
	status:any;

  attendance:any;
  show(){
    
  }
  constructor(private myservice:ControllerService, private router:Router) {
    this.reportMonth=this.router.getCurrentNavigation()?.extras.state?.["reportMonth"];
    this.reportyear=this.router.getCurrentNavigation()?.extras.state?.["reportyear"];
    this.myservice.allemployee().subscribe((x)=>{
      this.allemployee=x;
    });
    this.report();
    
   }

  ngOnInit(): void {
    setTimeout(() => {
      // Code to execute after the delay
      console.log('Delayed code executed after 2000 milliseconds');
      // alert('Delayed code executed after 2000 milliseconds');
      window.print();
    }, 2000); 
  }
  reportMonth:any="Select Month";
  reportyear:any="Select Year";
  day:any;
  month:any;
  monthName:any;
  year:any;
  checkDate(){
    // alert(this.attendanceDate);
    // this.day=this.attendanceDate.getDate();
    this.day="a"+this.attendanceDate.substring(8,10);
    this.month=this.attendanceDate.substring(5,7);
    this.year=this.attendanceDate.substring(0,4);
    // alert("Day is : "+this.day);
    // alert("month is : "+this.month);
    // alert("year is : "+this.year);
    if(this.month=="01"){
      this.monthName="jan"
    }else if(this.month=="02"){
      this.monthName="feb"
    }else if(this.month=="03"){
      this.monthName="mar"
    }else if(this.month=="04"){
      this.monthName="apr"
    }else if(this.month=="05"){
      this.monthName="may"
    }else if(this.month=="06"){
      this.monthName="jun"
    }else if(this.month=="07"){
      this.monthName="jul"
    }else if(this.month=="08"){
      this.monthName="aug"
    }else if(this.month=="09"){
      this.monthName="sep"
    }else if(this.month=="10"){
      this.monthName="oct"
    }else if(this.month=="11"){
      this.monthName="nov"
    }else if(this.month=="12"){
      this.monthName="dec"
    }
    // alert("monthName is : "+this.monthName);
  }


  makeAttendance(id:any,status:any){
    this.checkDate()
    // alert("id => " + id);
    // alert("status => " + status);
    // this.attendance=new Attendance(this.attendanceId,id,this.attendanceDate,status);
    this.myservice.newAndUpdateAttendance(this.day,status,id,this.monthName,this.year).subscribe(()=>{
      // alert("Update Attendance")
    })

  }
  report(){
    this.myservice.attendanceReport(this.reportMonth,this.reportyear).subscribe((x)=>{
      this.attendanceReport=x;
      this.templete="attendanceFinalReport";
    })
  }

}
