import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MatchMasterDetailsComponent } from './match-master-details.component';

describe('MatchMasterDetailsComponent', () => {
  let component: MatchMasterDetailsComponent;
  let fixture: ComponentFixture<MatchMasterDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MatchMasterDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MatchMasterDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
