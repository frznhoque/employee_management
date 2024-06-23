export class Salary {
    salaryId:any;
	basic:any;
	house:any;
	communication:any;
	transport:any;
	medical:any;
	employeeId:any;
    constructor(salaryId:any,basic:any,house:any,communication:any,transport:any,medical:any,employeeId:any){
        this.salaryId=salaryId;
        this.basic=basic;
        this.house=house;
        this.communication=communication;
        this.transport=transport;
        this.medical=medical;
        this.employeeId=employeeId;
    }
}
