import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DisplayUserComponent } from './Admin/components/display-user/display-user.component';

const routes: Routes = [{ path: 'displayuser', component: DisplayUserComponent }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
