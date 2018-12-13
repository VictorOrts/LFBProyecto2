import { Component, OnInit , Input} from '@angular/core';
import { Contacto } from 'src/app/model/contacto.model';
import { ActivatedRoute,Router,ParamMap } from '@angular/router';
import { ContactoService } from 'src/app/services/contacto.services';
import { Observable,Subscription } from 'rxjs';
import { HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-ficha-detallada',
  templateUrl: './ficha-detallada.component.html',
  styleUrls: ['./ficha-detallada.component.css']
})
export class FichaDetalladaComponent implements OnInit {
  contacto : Contacto;
  id : string;
  sub: Subscription;

  constructor( private route: ActivatedRoute ,private router: Router,private contactoService:ContactoService ) {



  }


  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      this.id = params['idpersona']; 
    });
    
     //this.id = params['idpersona'];
    this.contactoService.getUser(this.id).subscribe(data=> {this.contacto=data});

  };

}
