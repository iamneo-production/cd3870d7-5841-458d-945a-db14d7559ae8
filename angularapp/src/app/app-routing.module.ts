// import { NgModule } from '@angular/core';
// import { Routes, RouterModule } from '@angular/router';

// const routes: Routes = [];

// @NgModule({
//   imports: [RouterModule.forRoot(routes)],
//   exports: [RouterModule]
// })
// export class AppRoutingModule { }
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddCenterComponent } from './pages/admin/add-center/add-center.component';

import { LoginComponent } from './pages/auth/login/login.component';
import { SignupComponent } from './pages/auth/signup/signup.component';
import{HomepageComponent} from './pages/customer/homepage/homepage.component';
import { AdminGuard } from './service/admin.guard';
import { CustomerGuard } from './service/customer.guard';
const routes: Routes = [
  {
    path:'signup',
    component:SignupComponent,
    pathMatch:'full'
  },
  {
    path:'',
    component:LoginComponent,
    pathMatch:'full'
  },
  {
    path:'admin',
    component:AddCenterComponent,
    pathMatch:'full',
    canActivate:[AdminGuard]
  },
  {
    path:'customer',
    component:HomepageComponent,
    pathMatch:'full',
    canActivate:[CustomerGuard]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
