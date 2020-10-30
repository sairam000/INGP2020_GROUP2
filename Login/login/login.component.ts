import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { VisaService } from '../../sevice/visa.service';
import { VisaForm } from '../../user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  visaForm =new VisaForm();
  msg='';

  constructor(private visaService: VisaService,
    private router: Router) { }

  ngOnInit(): void {
  }
  LoginUser()
  {
this.visaService.loginUserFrom(this.visaForm).subscribe(
  data=>{
    console.log("response received");
    this.router.navigate(["/userdetails"])
  
  },
  error=>{
    console.log("exception occured");
    this.msg="details not valid";
  }
)

}
}
