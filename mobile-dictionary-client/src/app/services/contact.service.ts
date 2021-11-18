import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders, HttpParams} from "@angular/common/http";
import {map, Observable} from "rxjs";
import {ContactModel} from "../models/contact-model";

@Injectable({
  providedIn: 'root'
})
export class ContactService {

  private url = 'http://localhost:8080/api/contacts';

  constructor(private _http: HttpClient) { }

  findAll(sort: string, order: string): Observable<ContactModel[]> {
    const params: HttpParams = new HttpParams().set('sort', sort).set('order', order);
    return this._http.get(this.url, this._getOptionsParams(params)).pipe(
      map((res: any) => {
        return res
      })
    );
  }

  createContact(model: ContactModel): Observable<boolean> {
    return this._http.post(this.url, model, this._getOptions()).pipe(
      map((res: any) => {
        return res
      })
    );
  }

  private _getOptionsParams(params: HttpParams): any {
    return {
      headers: new HttpHeaders({}),
      params: params
    };
  }

  private _getOptions(): any {
    return {
      headers: new HttpHeaders({})
    };
  }
}
