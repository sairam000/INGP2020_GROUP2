package com.visaApplication.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.visaApplication.module.VisaDetails;
import com.visaApplication.service.VisaService;


@CrossOrigin("*")
@RestController
public class VisaController {
	@Autowired
	VisaService visaService;
	@GetMapping("/Users")
	public  ResponseEntity<List<VisaDetails>> get()
	{
		List<VisaDetails> visaDetails=visaService.findAll();
		return new ResponseEntity<List<VisaDetails>>(visaDetails,HttpStatus.OK);
	}
	@PostMapping("/Register")
	
	public  VisaDetails Register(@RequestBody VisaDetails visaDetails) throws Exception
	{
		String tempEmail= visaDetails.getEmail();
		if(tempEmail!=null && !"".equals(tempEmail)) {
			VisaDetails visaDetails1 =visaService.checkByEmailId(tempEmail);
			if(visaDetails1!=null) {
				throw new Exception("user with"+ tempEmail +"is already exists");
			}
		}
		VisaDetails visaDetails1= null;
		visaDetails1=visaService.save(visaDetails);
		return visaDetails1;
	}
	@PostMapping("/Login")
	@CrossOrigin(origins="http://localhost:4200")
	public  VisaDetails Login(@RequestBody VisaDetails visaDetails) throws Exception
	{
		String tempEmail= visaDetails.getEmail();
		String tempPassword=visaDetails.getPassword();
		VisaDetails visaDetails1= null;
		if(tempEmail!=null && tempPassword!=null)
		{
			visaDetails1=visaService.checkByEmailIdAndPassword(tempEmail, tempPassword);
		}
		if(visaDetails1==null)
		{
			throw new Exception("given details are not valid");
		}
		return visaDetails1;
		
	}
	
//	@GetMapping("/Forms/{id}")
//	public  ResponseEntity<VisaDetails> get(@PathVariable("id") Long id)
//	{
//		VisaDetails visaDetails=visaService.findById(id);
//		return new ResponseEntity<VisaDetails>(visaDetails,HttpStatus.OK);
//	}

////	
//	@GetMapping("/Forms/{passport_number}")
//	
//	public List<Form> findBypassport_number(@PathVariable("passport_number") String passport_number)
//	{
//		return FormService.findBypassport_number(passport_number);
//	}

	
}
	

