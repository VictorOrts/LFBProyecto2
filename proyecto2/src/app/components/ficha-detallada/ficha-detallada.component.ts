import { Component, OnInit } from '@angular/core';
import { Contacto } from 'src/app/model/contacto.model';
import { Router } from '@angular/router';
import { ContactoService } from 'src/app/services/contacto.services';


@Component({
  selector: 'app-ficha-detallada',
  templateUrl: './ficha-detallada.component.html',
  styleUrls: ['./ficha-detallada.component.css']
})
export class FichaDetalladaComponent implements OnInit {
  contacto: Contacto;
  constructor( private router: Router,private contactoService:ContactoService ) {

  }

 
  ngOnInit() {
    this.contactoService.getUser().subscribe(data=> {this.contacto=data});
    console.log(this.contacto);
  };

}
