import { Component, OnInit } from '@angular/core';
import { Voucher } from 'src/app/Model/voucher';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-voucher',
  templateUrl: './voucher.component.html',
  styleUrls: ['./voucher.component.css']
})
export class VoucherComponent implements OnInit {
  voucherId:any;
  voucherHead:any;
  voucherBody:any;
  ammount:any;
  status:any;
  requesterId:any;
  dvoucher:any;


  allrequestedVoucher:any=[];


  addvoucher(){
    this.dvoucher=new Voucher(this.voucherId,this.voucherHead,this.voucherBody,this.ammount,this.status,this.requesterId);
    this.myservice.saveVoucher(this.dvoucher).subscribe(()=>{
      alert("Voucher Added");
      this.voucherHead=null;
      this.voucherBody=null;
      this.ammount=null;
    })
  }

  allVoucher(){
    this.myservice.allRequestVoucher().subscribe((x)=>{
      this.allrequestedVoucher=x;
    })
  }



  constructor(private myservice:ControllerService) {
    
   }

  ngOnInit(): void {
  }

  templete:any;
  voucher:any;
}
