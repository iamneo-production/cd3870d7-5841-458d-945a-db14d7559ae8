
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DisplayUserComponent } from './Admin/components/display-user/display-user.component';
import { AddCenterComponent } from './pages/admin/addcenter.component';
import { LoginComponent } from './pages/auth/login/login.component';

import{HomepageComponent} from './pages/customer/homepage.component';
import { AdminGuard } from './services/admin.guard';
import { CustomerGuard } from './services/customer.guard';

const routes: Routes = [{ path: 'displayuser', component: DisplayUserComponent }  ,
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
  }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

