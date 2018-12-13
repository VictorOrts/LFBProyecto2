import { ContactoService } from './../../services/contacto.services';
import { Component, OnInit } from '@angular/core';
import { Contacto } from '../../model/contacto.model';
import { Router } from '@angular/router';

@Component({

  templateUrl: './add-contacto.component.html'

})
export class AddContactoComponent{
contacto: Contacto = new Contacto();
constructor(private router: Router, private contactoService: ContactoService){

}
createContacto (): void {
  this.contactoService.createUser(this.contacto)
  .subscribe(data => {
    alert('¡USUARIO AÑADIRDO CORRECTAMENTE!');
    this.router.navigate(['/contactos']);
  });
}

}
