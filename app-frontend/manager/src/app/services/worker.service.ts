import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class WorkerService {

  constructor(private http : HttpClient) { }
  
  url="http://localhost:8080/worker"
  
  public getWorkerByMarketId(marketId:number):Observable<Worker[]>{
      return this.http.get<Worker[]>(`${this.url}/getbymarketid/${marketId}`)
  }

  public getAllWorkers():Observable<Worker[]>{
   return  this.http.get<Worker[]>(`${this.url}\getall`)  
  }

  public addWorker(worker:Worker):Observable<Worker>{
    return this.http.post<Worker>(`${this.url}/add`,worker)
  }

}
