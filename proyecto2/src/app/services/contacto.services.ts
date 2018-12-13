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

    public deleteUser(id) {
      const borrado = `${this.host}/${id}`;
     return this.http.delete(borrado);

    }
}

