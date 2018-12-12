import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FichaDetalladaComponent } from './ficha-detallada.component';

describe('FichaDetalladaComponent', () => {
  let component: FichaDetalladaComponent;
  let fixture: ComponentFixture<FichaDetalladaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FichaDetalladaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FichaDetalladaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
