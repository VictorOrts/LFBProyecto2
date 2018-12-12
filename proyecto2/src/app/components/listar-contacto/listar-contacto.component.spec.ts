import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarContactoComponent } from './listar-contacto.component';

describe('ListarContactoComponent', () => {
  let component: ListarContactoComponent;
  let fixture: ComponentFixture<ListarContactoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListarContactoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarContactoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
