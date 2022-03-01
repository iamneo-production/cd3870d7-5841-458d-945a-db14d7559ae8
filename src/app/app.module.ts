import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { ReactiveFormsModule } from '@angular/forms';
import {FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerNavbarComponent } from './components/customer-navbar/customer-navbar.component';
import { FooterComponent } from './components/footer/footer.component';
import { NavbarLoggedInComponent } from './components/navbar-loggedin/navbar.component';
import { NavbarComponent } from './components/navbar/nabar.component';
import { AddCenterComponent } from './pages/admin/addcenter.component';
import { LoginComponent } from './pages/auth/login/login.component';
import { HomepageComponent } from './pages/customer/homepage.component';
import {HttpClientModule} from '@angular/common/http';
import { authInterceptorProviders } from './services/auth.interceptor';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';




@NgModule({
  declarations: [
    AppComponent,
    CustomerNavbarComponent,
    FooterComponent,
    NavbarLoggedInComponent,
    NavbarComponent,
    AddCenterComponent,
    LoginComponent,
    HomepageComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [authInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
