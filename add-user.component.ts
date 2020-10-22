import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { VisaService } from '../sevice/visa.service';
import { VisaForm } from '../user';
import {FormControl, FormGroup,Validators} from '@angular/forms'

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.scss']
})
export class AddUserComponent implements OnInit {
  visaForm: VisaForm=new VisaForm(0,"","","","","","",0,"","","","","","","","","","");
  



  constructor(private visaService: VisaService,
              private router: Router
            ) { }

  ngOnInit(): void {
   
  }

  saveForm(){
    this.visaService.saveForm(this.visaForm).subscribe(data =>this.visaForm=data);
      this.gotoList();
  }
  onSubmit() {
    this.saveForm();
  }
  gotoList(){
    this.router.navigateByUrl("/user-details");
  }
        
}

