import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';

import {Contacto} from '../model/contacto.model';

const httpOptions = {headers: new HttpHeaders({'Content-Type': 'application/json'})};

@Injectable()
export class ContactoService {
    constructor(private http: HttpClient) {}

    private host = 'http://localhost:8080/contactos';
    public getUsers(){
        return this.http.get<Contacto[]>(this.host);

    }
    public createUser(contacto) {
      return this.http.post<Contacto>(this.host, contacto);
    }

    public getUser() {
        return this.http.get<Contacto>(this.host + '/{id}');
    }
public deleteContacto(contacto){
return this.http.delete(this.host + '/' + contacto.idpersona )
}
    }



