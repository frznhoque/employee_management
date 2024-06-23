export class Voucher {
    
	voucherNumber:any;
	heading:any;
	description:any;
	ammount:any;
	status:any;
    requesterId:any;

    constructor(voucherNumber:any,heading:any,description:any,ammount:any,status:any,requesterId:any){
        
        this.voucherNumber=voucherNumber;
        this.heading=heading;
        this.description=description;
        this.ammount=ammount;
        this.status=status;
        this.requesterId=requesterId;

    }
}
