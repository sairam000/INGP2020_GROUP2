import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { VisaForm } from '../user';

@Injectable({
  providedIn: 'root'
})
export class VisaService {
  private getUrl: string ="http://localhost:8085/Forms";

  constructor(private httpClient:HttpClient) { }

  getForms(): Observable<VisaForm[]> {
    return this.httpClient.get<VisaForm[]>(this.getUrl);

  }
  saveForm(visaForm: VisaForm): Observable<VisaForm> {
    let user= {
     id:                      visaForm.id,
     name:                    visaForm.Name,
     email:                   visaForm.Email,
     gender:                  visaForm.Gender,
     passport_number:         visaForm.passport_number,
     country_of_nationality:  visaForm.country_of_nationality,
     type_of_visa_application:visaForm.type_of_visa_application,
     total_fee:               visaForm.total_fee,
     contact_language:        visaForm.contact_language,
     payment_reference:       visaForm.payment_reference,
     relational_status:       visaForm.relational_status,
     another_email:           visaForm.another_email,
     date_of_birth:           visaForm.date_of_birth,
     duration_of_visa:        visaForm.duration_of_visa,
     date_of_departure:       visaForm.date_of_departure,
     date_of_arrival:         visaForm.date_of_arrival,
     issue_date:              visaForm.issue_date,
     expiry_date:             visaForm.expiry_date


     
    };
    console.log(user);

    return this.httpClient.post<VisaForm>(this.getUrl,user);
  }
  findById(id: number): Observable<VisaForm> {
    return this.httpClient.get<VisaForm>('${this.getUrl}/${id}');
  }
}
