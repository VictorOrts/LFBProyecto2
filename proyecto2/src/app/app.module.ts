import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {ContactoService} from './services/contacto.services';
import {HttpClientModule} from "@angular/common/http";
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
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ContactoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
