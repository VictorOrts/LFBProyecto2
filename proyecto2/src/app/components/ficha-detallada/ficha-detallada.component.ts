import { Component, OnInit , Input} from '@angular/core';
import { Contacto } from 'src/app/model/contacto.model';
import { ActivatedRoute,Router } from '@angular/router';
import { ContactoService } from 'src/app/services/contacto.services';
import { Observable } from 'rxjs';


@Component({
  selector: 'app-ficha-detallada',
  templateUrl: './ficha-detallada.component.html',
  styleUrls: ['./ficha-detallada.component.css']
})
export class FichaDetalladaComponent implements OnInit {
  contacto : Contacto;



  constructor( private route: ActivatedRoute ,private router: Router,private contactoService:ContactoService ) {



  }


  ngOnInit() {



  };

}
