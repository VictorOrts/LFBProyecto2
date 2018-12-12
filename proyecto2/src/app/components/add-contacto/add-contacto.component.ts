import { Component } from '@angular/core';
import  { Contacto } from '../../model/contacto.model'


@Component({
  templateUrl: './add-contacto.component.html'
})
export class AddContactoComponent {

  contacto: Contacto = new Contacto();

  constructor( ) { }

  ngOnInit() {
  }

}
