import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrintSalaryComponent } from './print-salary.component';

describe('PrintSalaryComponent', () => {
  let component: PrintSalaryComponent;
  let fixture: ComponentFixture<PrintSalaryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PrintSalaryComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PrintSalaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
