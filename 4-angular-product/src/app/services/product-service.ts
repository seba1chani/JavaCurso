import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Products } from '../models/products';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  
  private url: string= 'http://localhost:8080';
  constructor(private http: HttpClient){}
  findAll(): Observable<Products[]>{
    return this.http.get<Products[]>(this.url);
  }

  create(product:Products): Observable<Products>{
    return this.http.post<Products>(this.url, product);
  }

  update(product:Products):Observable<Products>{
    return this.http.put<Products>(`${this.url}/${product.id}`,product);
  }

  remove(id:number):Observable<Products>{
    return this.http.delete<Products>(`${this.url}/${id}`);
  }
}
