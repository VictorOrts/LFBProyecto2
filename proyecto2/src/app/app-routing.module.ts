import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import {ListarContactoComponent} from './components/listar-contacto/listar-contacto.component';


const routes: Routes = [
  { path:'contactos', component:ListarContactoComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
