import { Component, OnInit } from '@angular/core';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-leave-request-status',
  templateUrl: './leave-request-status.component.html',
  styleUrls: ['./leave-request-status.component.css']
})
export class LeaveRequestStatusComponent implements OnInit {

  constructor(private myservice:ControllerService) {
    this.myservice.allleaveapplicationstatus().subscribe((x)=>{
      this.allrequestlist=x;
    })
   }

  ngOnInit(): void {
  }

  allrequestlist:any=[];

}
