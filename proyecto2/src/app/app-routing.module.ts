import { AddContactoComponent } from './components/add-contacto/add-contacto.component';

import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import {ListarContactoComponent} from './components/listar-contacto/listar-contacto.component';
import {FichaDetalladaComponent} from './components/ficha-detallada/ficha-detallada.component';

const routes: Routes = [
  { path: 'contactos/contacto', component: AddContactoComponent},
  { path: 'contactos', component: ListarContactoComponent},
  { path: 'contactos/ficha/:idpersona' , component: FichaDetalladaComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
