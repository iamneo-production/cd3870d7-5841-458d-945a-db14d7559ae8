
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AdminNavComponent } from './Admin/components/admin-nav/admin-nav.component';
import { DisplayUserComponent } from './Admin/components/display-user/display-user.component';

import { HttpClientModule } from '@angular/common/http';
import { MatButtonModule } from '@angular/material/button';
import { MatDialogModule } from '@angular/material/dialog';
import { MatIconModule } from '@angular/material/icon';
import { MatInputModule } from '@angular/material/input';
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatSortModule } from '@angular/material/sort';
import { MatTableModule } from '@angular/material/table';
import { MatToolbarModule } from '@angular/material/toolbar';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { EditUserDialogComponent } from './Admin/components/edit-user-dialog/edit-user-dialog.component';
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
    AdminNavComponent,
    DisplayUserComponent,
    EditUserDialogComponent,
    
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
    AppRoutingModule,
    BrowserAnimationsModule,
    MatButtonModule,
    HttpClientModule,
    MatDialogModule,
    FormsModule,
    MatButtonModule,
    MatInputModule,
    MatIconModule,
    MatSortModule,
    MatTableModule,
    MatToolbarModule,
    MatPaginatorModule,
    ReactiveFormsModule,
 
    
   


  ],
  providers: [authInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }

