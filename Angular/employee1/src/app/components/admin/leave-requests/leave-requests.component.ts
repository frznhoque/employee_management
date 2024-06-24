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
    })
   }

  ngOnInit(): void {
  }

}
