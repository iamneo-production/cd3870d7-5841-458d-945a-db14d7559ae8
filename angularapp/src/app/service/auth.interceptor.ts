// import { Injectable } from '@angular/core';
// import {
//   HttpRequest,
//   HttpHandler,
//   HttpEvent,
//   HttpInterceptor
// } from '@angular/common/http';
// import { Observable } from 'rxjs';

// @Injectable()
// export class AuthInterceptor implements HttpInterceptor {

//   constructor() {}

//   intercept(request: HttpRequest<unknown>, next: HttpHandler): Observable<HttpEvent<unknown>> {
//     return next.handle(request);
//   }
// }
//this hold the api,make changes and forward the api call
import { HttpEvent, HttpHandler, HttpInterceptor, HttpRequest, HTTP_INTERCEPTORS } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { LoginService } from "./login.service";
//to do
@Injectable()
export class AuthInterceptor implements HttpInterceptor{
    constructor(private login:LoginService){}

    intercept(
        req: HttpRequest<any>, 
        next: HttpHandler): 
        Observable<HttpEvent<any>> 
        {   
        let authReq = req;     
        const token = this.login.getToken();
        console.log("Inside Inceptor");
        
        if(token != null || token != ''){
            authReq=authReq.clone({
                setHeaders:{Authorization: `Bearer ${token}`},
        })
    
        }
        return next.handle(authReq);
    }
}

//parrt of configuration
export const authInterceptorProviders=[
    {
        provide:HTTP_INTERCEPTORS,
        useClass:AuthInterceptor,
        multi:true,
    }
]