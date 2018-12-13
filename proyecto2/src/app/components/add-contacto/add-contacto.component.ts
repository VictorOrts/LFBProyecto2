import { ContactoService } from './../../services/contacto.services';
import { Component } from '@angular/core';
import { Contacto } from '../../model/contacto.model';
import { Router } from '@angular/router';

@Component({

  templateUrl: './add-contacto.component.html'

})
export class AddContactoComponent {

  contacto: Contacto = new Contacto();

  constructor( private router: Router, private contactoService: ContactoService) {

  }

 createUser(): void{
   this.contactoService.createUSer(this.contacto)
   .subscribe(data => {
     alert('User created succesfully');
   });
 }

}
