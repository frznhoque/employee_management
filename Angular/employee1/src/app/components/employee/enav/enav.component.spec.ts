import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EnavComponent } from './enav.component';

describe('EnavComponent', () => {
  let component: EnavComponent;
  let fixture: ComponentFixture<EnavComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EnavComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EnavComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
