import { Component, OnInit } from '@angular/core';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-employee-leave-request-status',
  templateUrl: './employee-leave-request-status.component.html',
  styleUrls: ['./employee-leave-request-status.component.css']
})
export class EmployeeLeaveRequestStatusComponent implements OnInit {

  constructor(private myservice:ControllerService) {
    this.myservice.allleaveapplicationstatus().subscribe((x)=>{
      this.allrequestlist=x;
    })
   }

  ngOnInit(): void {
  }

  allrequestlist:any=[];
}
