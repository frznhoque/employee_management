import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LeaveRequestStatusComponent } from './leave-request-status.component';

describe('LeaveRequestStatusComponent', () => {
  let component: LeaveRequestStatusComponent;
  let fixture: ComponentFixture<LeaveRequestStatusComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LeaveRequestStatusComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LeaveRequestStatusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
