import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateAccountEpargneComponent } from './update-account-epargne.component';

describe('UpdateAccountEpargneComponent', () => {
  let component: UpdateAccountEpargneComponent;
  let fixture: ComponentFixture<UpdateAccountEpargneComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateAccountEpargneComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateAccountEpargneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
