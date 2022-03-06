import { Component, OnInit } from '@angular/core';

import { Router, RouterLink } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';
import { LocationStrategy } from '@angular/common';
import { FormGroup, FormControl , Validators } from '@angular/forms';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  
  LoginData={
    email:'',
    password:''
  }

  loginData={
    username:'',
    password:''
  }

  constructor(private location: LocationStrategy,private login:LoginService,private router:Router) { 
    history.pushState(null,window.location.href);  
    this.location.onPopState(() => {  
    history.pushState(null,  window.location.href);
});  
  }

  ngOnInit(): void {
  }
  Loginfg = new FormGroup({
    emailfg : new FormControl('',[Validators.required,Validators.email]),
    passwordfg : new FormControl('',[Validators.required,Validators.minLength(3),Validators.maxLength(50)])
  }
  )
 
  formSubmit(){
    this.loginData.username = this.LoginData.email
    this.loginData.password = this.LoginData.password
    if(this.LoginData.email.trim()=='' || this.LoginData.email==null){
      
      this.LoginData.password=''
    }
    else if(this.LoginData.password.trim()==''|| this.LoginData.password==null){
      
      this.LoginData.email=''
      return;
    }

    this.login.LoginData(this.loginData,this.loginData.username).subscribe((data:any)=>{
      console.log("success");
      console.log(data);

      //login...
      this.login.loginUser(data.token);
      //refeer interceptor file
      this.login.getCurrentUser().subscribe((user:any)=>{
        this.login.setUser(user);
        console.log(user);
        if(user.password == this.loginData.password){
            // redirect if admin
          // redirect if normal 
          if(this.login.getUserRole()=='admin'){
            //adimin dashboard
            // window.location.href="/admin"
            this.router.navigate(['admin'])
            this.login.loginStatusSubject.next(true);
          }
          else if(this.login.getUserRole()=='customer'){
            //normal user
            // window.location.href="/user-dashboard"
            this.router.navigate(['customer'])
            this.login.loginStatusSubject.next(true);
          }
        }
        else{
         
          this.LoginData.email=''
          this.LoginData.password=''
          this.router.navigate([''])
          
       } 
     })
    },
    (error)=>{
      console.log("error")
      console.log(error)
      
    })
  }
}