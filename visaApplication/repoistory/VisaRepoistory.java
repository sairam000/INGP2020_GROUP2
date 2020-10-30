package com.visaApplication.repoistory;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.visaApplication.module.VisaDetails;

@Repository
public interface VisaRepoistory extends JpaRepository<VisaDetails,Long> {
// List<Form> findBypassport_number(String passposrt_number);
	public VisaDetails findByEmail(String email);
	public VisaDetails findByEmailAndPassword(String email,String Password);

}
