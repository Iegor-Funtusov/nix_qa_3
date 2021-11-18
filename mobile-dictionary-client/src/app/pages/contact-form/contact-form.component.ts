import { Component, OnInit } from '@angular/core';
import {ContactService} from "../../services/contact.service";
import {ContactModel} from "../../models/contact-model";

@Component({
  selector: 'app-contact-form',
  templateUrl: './contact-form.component.html',
  styleUrls: ['./contact-form.component.scss']
})
export class ContactFormComponent implements OnInit {

  contacts: ContactModel[] = [];

  constructor(private _contactService: ContactService) { }

  ngOnInit(): void {
  }

}
