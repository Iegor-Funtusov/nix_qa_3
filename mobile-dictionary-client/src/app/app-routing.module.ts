import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContactListComponent } from "./pages/contact-list/contact-list.component";
import { ContactFormComponent } from "./pages/contact-form/contact-form.component";

const routes: Routes = [
  {
    path: '', pathMatch: 'full', redirectTo: '/contacts'
  },
  {
    path: 'contacts', component: ContactListComponent
  },
  {
    path: 'contacts/new', component: ContactFormComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
