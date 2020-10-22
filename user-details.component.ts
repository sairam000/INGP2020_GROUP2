import { Component, OnInit } from '@angular/core';
import { VisaService } from '../sevice/visa.service';
import { VisaForm } from '../user';


@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.scss']
})
export class UserDetailsComponent implements OnInit {
  visaForms: VisaForm[];
 

  constructor(private visaService: VisaService) { }
  getForms(){
    
  this.visaService.getForms().subscribe(data => this.visaForms=data);
  }

  ngOnInit(): void {

    this.getForms();
  
  }

}