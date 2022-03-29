import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import {ApiService} from '../api.service'; 

@Component({
  selector: 'app-list-clients',
  templateUrl: './list-clients.component.html',
  styleUrls: ['./list-clients.component.scss']
})
export class ListClientsComponent implements OnInit {

  conseillers: any[any]; 
  httpClient: any;
  httpParams: any; 

  constructor(private api:ApiService) { }

  ngOnInit() {
    this.api.getConseillers().subscribe((conseiller) => {
      this.conseillers = conseiller; 
    })
  }

}
