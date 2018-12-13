import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

import {Contacto} from '../../model/contacto.model';
import {ContactoService} from '../../services/contacto.services';

@Component({
  selector: 'app-listar-contacto',
  templateUrl: './listar-contacto.component.html',
  styleUrls: ['./listar-contacto.component.css']
})
export class ListarContactoComponent implements OnInit {
  Contactos : Contacto[];
  constructor(private router: Router,private contactoService:ContactoService) {
  }

  ngOnInit() {
      this.contactoService.getUsers().subscribe(data=> {this.Contactos=data});
      console.log(this.Contactos);
  };
deleteContacto(contacto: Contacto): void {
  this.contactoService.deleteContacto(contacto)
  .subscribe( data => {
    this.Contactos = this.Contactos.filter(u => u !== contacto);
  })
};
listaDetallada(contacto: Contacto): void {
  this.contactoService.getUser(contacto.idpersona)
  .subscribe( data => {
    this.Contactos = this.Contactos.filter(u => u !== contacto);
  })
};

}