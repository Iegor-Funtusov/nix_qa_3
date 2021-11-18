import { Component, OnInit } from '@angular/core';
import {ContactModel} from "../../models/contact-model";
import {ContactService} from "../../services/contact.service";

@Component({
  selector: 'app-contact-list',
  templateUrl: './contact-list.component.html',
  styleUrls: ['./contact-list.component.scss']
})
export class ContactListComponent implements OnInit {

  contacts: ContactModel[] = [];

  constructor(private _contactService: ContactService) { }

  ngOnInit(): void {
    this.loadAll('desc', 'lastName');
  }

  private loadAll(sort: string, order: string): void {
    this._contactService.findAll(sort, order)
      .subscribe(res => {
        this.contacts = res;
      });
  }
}
