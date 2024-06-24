export class Leave {
    requestId:any;
    fromDate:any;
    toDate:any;
    requestDate:any;
    description:any;
    status:any;
    employeeId:any;
    constructor(requestId:any, fromDate:any,toDate:any,requestDate:any,description:any,status:any,employeeId:any){
        this.requestId=requestId;
        this.fromDate=fromDate;
        this.toDate=toDate;
        this.requestDate=requestDate;
        this.description=description;
        this.status=status;
        this.employeeId=employeeId;
    }

}
