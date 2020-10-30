package com.visaApplication.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visaApplication.module.VisaDetails;
import com.visaApplication.repoistory.VisaRepoistory;
//implements FormService

//import com.sairam.demo.repoistory.Recordrepoistory;
@Service
public class VisaService{
	@Autowired
	private VisaRepoistory visaRepoistory;
//
	
	public List<VisaDetails> findAll() {
		return  (List<VisaDetails>) visaRepoistory.findAll();
	}
	
	public VisaDetails save(VisaDetails visaDetails) {
		visaRepoistory.save(visaDetails);
		return visaDetails;
	}
	public VisaDetails checkByEmailId(String email) {
		return visaRepoistory.findByEmail(email);
	}
	public VisaDetails checkByEmailIdAndPassword(String email,String password) {
		return visaRepoistory.findByEmailAndPassword(email, password);
	}
	
//	@Override
//	public Form findById(Long id) {
//		if(FormRepoistory.findById(id).isPresent())
//		{
//			return FormRepoistory.findById(id).get();
//		}
//		return null;
//	}
//	@Override
//	public Form findByPassportNumbe(String passport_number) {
//		if(FormRepoistory.findByPassportNumber(passport_number).isPresent())
//		{
//			return FormRepoistory.findByPassportNumber(passport_number).get();
//		}
//		return null;
//	}
//	@Override
//	public List<Form> findBypassport_number(String passport_number)
//	{
//		return FormRepoistory.findBypassport_number(passport_number);
//	}
//	@Override
//	public List<Form> findByName(String Name) {
//		return FormRepoistory.findByName(Name);
//	}
//	public Form findById(Long id) {
//		if(formRepoistory.findById(id).isPresent())
//			{
//				return formRepoistory.findById(id).get();
//			}
//			return null;
//	
//	}
	
		
	}

	



