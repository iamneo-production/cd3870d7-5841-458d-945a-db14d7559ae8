import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ReviewServiceService {
  private httpHeaders:Object ={
    headers: new HttpHeaders(
      {
        'Content-Type':'application/json'
      }
    )
  }
  constructor(private http:HttpClient) { }
  public doRegistration(data:any):Observable<object>{
    console.log(data);
    return this.http.post("http://localhost:8080/admin/addReviews",data,this.httpHeaders);
  }
}
