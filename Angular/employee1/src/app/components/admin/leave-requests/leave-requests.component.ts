import { TitleCasePipe, UpperCasePipe } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-leave-requests',
  templateUrl: './leave-requests.component.html',
  styleUrls: ['./leave-requests.component.css']
})
export class LeaveRequestsComponent implements OnInit {

  allrequest:any=[];
  constructor(private myservice:ControllerService) {
    this.myservice.allleaveapplication().subscribe((x)=>{
      this.allrequest=x;
    });
   }

  ngOnInit(): void {
  }

  rejectAccept(id:any,status:any){
    this.myservice.rejectAccept(id,status).subscribe(()=>{
      // alert(TitleCasePipe.transform(status));
      this.getAllRequest();
    });
    // rejected
  }

  getAllRequest(){
    this.myservice.allleaveapplication().subscribe((x)=>{
      this.allrequest=x;
    });
  }


  //=================================accept section===================================================
  startsDate:any;
  date:any;
  endsDate:any;
  endDate:any;
  accept(id:any,empId:any,startDate:any,endDate:any){
    this.startsDate=new Date(startDate);
    this.endsDate=new Date(endDate);
    this.endDate=this.endsDate.getDate();
    // date=Date.UTC(startsDate.getDate());
    this.date=this.startsDate.getDate();
    let startDateMonth=this.startsDate.getMonth()+1;
    this.month="0"+startDateMonth.toString();
    this.year=this.startsDate.getFullYear();
    // let nextDay=this.date+1;
    let i;
    for(i=this.date;i<=this.endDate;i++){
      // alert(i+"hjfhs");
      if (i>0 && i<10){
        this.day="a0"+i.toString();
        this.month=startDate.substring(5,7);
        this.year=startDate.substring(0,4);
        // this.checkDate();
        // alert(this.day+" "+this.monthName+" "+this.year)
        this.makeAttendance(empId,"L");
      }else if(i>=10){
        this.day="a"+i.toString();
        this.month=startDate.substring(5,7);
        this.year=startDate.substring(0,4);
        // this.checkDate();
        // alert(this.day+" "+this.monthName+" "+this.year);
        this.makeAttendance(empId,"L");
      }
    
    }
    this.rejectAccept(id,"accepted");
    
  }


  day:any;
  month:any;
  monthName:any;
  year:any;
 
  checkDate(){
    // alert(this.attendanceDate);
    // this.day=this.attendanceDate.getDate();
    // this.day="a"+this.attendanceDate.substring(8,10);
    // this.month=this.attendanceDate.substring(5,7);
    // this.year=this.attendanceDate.substring(0,4);
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

}
