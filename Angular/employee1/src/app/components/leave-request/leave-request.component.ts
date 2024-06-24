import { Component, OnInit } from '@angular/core';
import { Leave } from 'src/app/Model/leave';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-leave-request',
  templateUrl: './leave-request.component.html',
  styleUrls: ['./leave-request.component.css']
})
export class LeaveRequestComponent implements OnInit {

  constructor(private myservice:ControllerService) { }

  ngOnInit(): void {
  }
  
  fromDate:any;
  toDate:any;
  requestDate:any;
  description:any;
  status:any;
  employeeid:any;

  request:any;

  leaveRequest(){
    this.request=new Leave(null,this.fromDate,this.toDate,this.requestDate,this.description,this.status,this.employeeid);
    this.myservice.leaveRequest(this.request).subscribe(()=>{
      alert("Request Submitted!");
      this.fromDate="";
      this.toDate="";
      this.requestDate="";
      this.description="";
      this.status="";
    });
  }

}
