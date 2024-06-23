import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrintAttendanceComponent } from './print-attendance.component';

describe('PrintAttendanceComponent', () => {
  let component: PrintAttendanceComponent;
  let fixture: ComponentFixture<PrintAttendanceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PrintAttendanceComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PrintAttendanceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
