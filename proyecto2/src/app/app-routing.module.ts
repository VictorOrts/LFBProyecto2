import { AddContactoComponent } from './components/add-contacto/add-contacto.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import {ListarContactoComponent} from './components/listar-contacto/listar-contacto.component';


const routes: Routes = [
  { path: 'contactos', component: ListarContactoComponent},
  { path: 'addcontacto', component: AddContactoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
