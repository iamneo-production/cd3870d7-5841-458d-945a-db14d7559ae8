import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppointmentComponent } from './pages/customer/appointment/appointment.component';
import { UpdateAppointmentComponent } from './pages/customer/update-appointment/update-appointment.component';

const routes: Routes = [
  {
    path:'appointment/:id',
        component:AppointmentComponent
  },
  {
    path:'updateAppointment/:pId',
        component:UpdateAppointmentComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
