import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { AdminComponent } from './components/admin/admin.component';
import { DashboardComponent } from './components/admin/dashboard/dashboard.component';
import { EmployeesComponent } from './components/employees/employees.component';
import { DepartmentsComponent } from './components/departments/departments.component';
import { AttendanceComponent } from './components/attendance/attendance.component';
import { SalaryComponent } from './components/salary/salary.component';
import { EmployeeComponent } from './components/employee/employee.component';
import { EdashboardComponent } from './components/employee/edashboard/edashboard.component';
import { VoucherComponent } from './components/employee/voucher/voucher.component';
import { PrintSalaryComponent } from './components/salary/print-salary/print-salary.component';
import { PrintAttendanceComponent } from './components/attendance/print-attendance/print-attendance.component';

const routes: Routes = [
  {path:'',component:LoginComponent},
  {path:'admin',component:AdminComponent,
    children:[
      {path:'',component:DashboardComponent},
      {path:'all-employees',component:EmployeesComponent},
      {path:'departments',component:DepartmentsComponent},
      {path:'staffAttendance',component:AttendanceComponent},
      {path:'salary',component:SalaryComponent},
     
    ]
  },
  {path:'employee',component:EmployeeComponent,
    children:[
      {path:'',component:EdashboardComponent},
      {path:'voucher',component:VoucherComponent}
    ]
  },
  {path:'printsalary',component:PrintSalaryComponent},
  {path:'printattendance',component:PrintAttendanceComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
