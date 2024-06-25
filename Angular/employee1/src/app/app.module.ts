import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeesComponent } from './components/employees/employees.component';
import { FormsModule } from '@angular/forms';
import {  HttpClientModule} from '@angular/common/http';
import { LoginComponent } from './components/login/login.component';
import { AdminComponent } from './components/admin/admin.component';
import { DashboardComponent } from './components/admin/dashboard/dashboard.component';
import { ControllerService } from './service/controller.service';
import { DepartmentsComponent } from './components/departments/departments.component';
import { AttendanceComponent } from './components/attendance/attendance.component';
import { SalaryComponent } from './components/salary/salary.component';
import { EmployeeComponent } from './components/employee/employee.component';
import { EnavComponent } from './components/employee/enav/enav.component';
import { EdashboardComponent } from './components/employee/edashboard/edashboard.component';
import { VoucherComponent } from './components/employee/voucher/voucher.component';
import { PrintSalaryComponent } from './components/salary/print-salary/print-salary.component';
import { PrintAttendanceComponent } from './components/attendance/print-attendance/print-attendance.component';
import { NoticeComponent } from './notice/notice.component';
import { LeaveRequestComponent } from './components/leave-request/leave-request.component';
import { LeaveRequestsComponent } from './components/admin/leave-requests/leave-requests.component';
import { LeaveRequestStatusComponent } from './components/admin/leave-request-status/leave-request-status.component';
import { EmployeeLeaveRequestStatusComponent } from './components/employee-leave-request-status/employee-leave-request-status.component';



@NgModule({
  declarations: [
    AppComponent,
    EmployeesComponent,
    LoginComponent,
    AdminComponent,
    DashboardComponent,
    DepartmentsComponent,
    AttendanceComponent,
    SalaryComponent,
    EmployeeComponent,
    EnavComponent,
    EdashboardComponent,
    VoucherComponent,
    PrintSalaryComponent,
    PrintAttendanceComponent,
    NoticeComponent,
    LeaveRequestComponent,
    LeaveRequestsComponent,
    LeaveRequestStatusComponent,
    EmployeeLeaveRequestStatusComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ControllerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
