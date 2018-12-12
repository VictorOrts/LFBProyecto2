import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddContactoComponent } from './components/add-contacto/add-contacto.component';
import { ListarContactoComponent } from './components/listar-contacto/listar-contacto.component';
import { FichaDetalladaComponent } from './components/ficha-detallada/ficha-detallada.component';

@NgModule({
  declarations: [
    AppComponent,
    AddContactoComponent,
    ListarContactoComponent,
    FichaDetalladaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
