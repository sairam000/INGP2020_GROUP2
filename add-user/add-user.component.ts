import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { VisaService } from '../sevice/visa.service';
import { VisaForm } from '../user';
import {FormControl,FormBuilder, FormGroup,Validators} from '@angular/forms'

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.scss']
})
export class AddUserComponent implements OnInit {
  // form=new FormGroup({
  //   Name:new FormControl('',Validators.required),
  //   Email: new FormControl('',[Validators.required, Validators.email]),
  //   Gender: new FormControl('',Validators.required),
  //   passport_number: new FormControl('',Validators.required),
  //   country_of_nationality: new FormControl('',Validators.required),
  //   total_fee: new FormControl('',Validators.required)
  // })
  visaForm: VisaForm=new VisaForm();
  // validForm: FormGroup;



  constructor(private visaService: VisaService,
              private router: Router
            ) { }

  ngOnInit(): void {
    // this.validForm=this.fb.group({
    //   Name:['',Validators.required]
    // })
   
  }

  saveForm(){
    this.visaService.saveForm(this.visaForm).subscribe(data =>this.visaForm=data);
      this.gotoList();
  }
  onSubmit() {
    this.saveForm();
  }
  gotoList(){
    this.router.navigateByUrl("/app-login");
  }
  // 0,"","","","","","","",0,"","","","","","","","","","","","","","",""
  // this.validform= this.fb.group({
  //     'Name':[null,Validators.required],
  //      'Email':[null,Validators.required]
  //      });
        
}

