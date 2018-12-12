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
  constructor(private router: Router) { 
    var tmp  = new Contacto();
    tmp.idcontacto=55;
    tmp.nombre="Victor";
    tmp.apellido1="Orts";
    this.Contactos.push(tmp);
    this.Contactos.push(tmp);
    this.Contactos.push(tmp);
  }

  ngOnInit() {

  };

}
