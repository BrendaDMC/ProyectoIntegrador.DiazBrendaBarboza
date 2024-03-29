import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { persona } from '../model/persona.model';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {
  //Online
url= "https://back-endportfolio.herokuapp.com/personas/";
//Local
/* url= "http://localhost:8080/personas/"; */
  constructor(private http: HttpClient) { }

  public getPersona(): Observable<persona>{
    return this.http.get<persona>(this.url+"traer/perfil");

  }
}

