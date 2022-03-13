import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Market } from '../market/market';

@Injectable({
  providedIn: 'root'
})
export class MarketService {
 
  constructor(private http : HttpClient) { }
  
  url="http://localhost:8080/market/getall"

  public getAllMarket(): Observable<Market[]>{
    return this.http.get<Market[]>(this.url)
  }


}
