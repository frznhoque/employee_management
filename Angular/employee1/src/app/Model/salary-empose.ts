export class SalaryEmpose {
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
	month:any;
    year:any;
	emposeDate:any;
    constructor(id:any,employeeId:any,basic:any,house:any,communication:any,transport:any,medical:any,leave:any,leaveNotPay:any,bonous:any,total:any,month:any,year:any,emposeDate:any){

        this.id=id;
        this.employeeId=employeeId;
        this.basic=basic;
        this.house=house;
        this.communication=communication;
        this.transport=transport;
        this.medical=medical;
        this.leave=leave;
        this.leaveNotPay=leaveNotPay;
        this.bonous=bonous;
        this.total=total;
        this.month=month;
        this.year=year;
        this.emposeDate=emposeDate;
    }
}