package com.visaApplication.module;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="userdetails")
public class VisaDetails {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long id;
		private String Name;
		private String email;
		private String password;
		private String PassportNumber;
		private String Gender;
		private String CountryOfNationality;
		private String TypeOfVisaApplication;
		private long TotalFee;
		private String ContactLanguage;
		private String PaymentReference;
		private String RelationalStatus;
		private String AnotherEmail;
		private Date DateOfBirth;		
		private String DurationOfVisa;
		private Date DateOfDeparture;
		private Date DateOfArrival;
		private Date IssueDate;
		private Date ExpiryDate;
//		private String ReasonForPayment;
//		private String guradian;
		private String UkDrivingLicence;
		private String Address;
		private String IdentityNumber;
		private String FamilyInUk;
		private String AnyOtherNationality;
		
		public VisaDetails(long id, String name, String email, String passportNumber, String gender,
				String countryOfNationality, String typeOfVisaApplication, long totalFee, String contactLanguage,
				String paymentReference, String relationalStatus, String anotherEmail, Date dateOfBirth,
				String durationOfVisa, Date dateOfDeparture, Date dateOfArrival, Date issueDate, Date expiryDate,
				String ukDrivingLicence, String address, String identityNumber, String familyInUk,
				String anyOtherNationality) {
			super();
			this.id = id;
			Name = name;
			email = email;
			PassportNumber = passportNumber;
			Gender = gender;
			CountryOfNationality = countryOfNationality;
			TypeOfVisaApplication = typeOfVisaApplication;
			TotalFee = totalFee;
			ContactLanguage = contactLanguage;
			PaymentReference = paymentReference;
			RelationalStatus = relationalStatus;
			AnotherEmail = anotherEmail;
			DateOfBirth = dateOfBirth;
			DurationOfVisa = durationOfVisa;
			DateOfDeparture = dateOfDeparture;
			DateOfArrival = dateOfArrival;
			IssueDate = issueDate;
			ExpiryDate = expiryDate;
			UkDrivingLicence = ukDrivingLicence;
			Address = address;
			IdentityNumber = identityNumber;
			FamilyInUk = familyInUk;
			AnyOtherNationality = anyOtherNationality;
		}
	
		public VisaDetails() {
			super();
		}

		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
//		public String getEmail() {
//			return email;
//		}
//		public void setEmail(String email) {
//			email = email;
//		}
		public String getPassportNumber() {
			return PassportNumber;
		}
		public void setPassportNumber(String passportNumber) {
			PassportNumber = passportNumber;
		}
		public String getGender() {
			return Gender;
		}
		public void setGender(String gender) {
			Gender = gender;
		}
		public String getCountryOfNationality() {
			return CountryOfNationality;
		}
		public void setCountryOfNationality(String countryOfNationality) {
			CountryOfNationality = countryOfNationality;
		}
		public String getTypeOfVisaApplication() {
			return TypeOfVisaApplication;
		}
		public void setTypeOfVisaApplication(String typeOfVisaApplication) {
			TypeOfVisaApplication = typeOfVisaApplication;
		}
		public long getTotalFee() {
			return TotalFee;
		}
		public void setTotalFee(long totalFee) {
			TotalFee = totalFee;
		}
		public String getContactLanguage() {
			return ContactLanguage;
		}
		public void setContactLanguage(String contactLanguage) {
			ContactLanguage = contactLanguage;
		}
		public String getPaymentReference() {
			return PaymentReference;
		}
		public void setPaymentReference(String paymentReference) {
			PaymentReference = paymentReference;
		}
		public String getRelationalStatus() {
			return RelationalStatus;
		}
		public void setRelationalStatus(String relationalStatus) {
			RelationalStatus = relationalStatus;
		}
		public String getAnotherEmail() {
			return AnotherEmail;
		}
		public void setAnotherEmail(String anotherEmail) {
			AnotherEmail = anotherEmail;
		}
		public Date getDateOfBirth() {
			return DateOfBirth;
		}
		public void setDateOfBirth(Date dateOfBirth) {
			DateOfBirth = dateOfBirth;
		}
		public String getDurationOfVisa() {
			return DurationOfVisa;
		}
		public void setDurationOfVisa(String durationOfVisa) {
			DurationOfVisa = durationOfVisa;
		}
		public Date getDateOfDeparture() {
			return DateOfDeparture;
		}
		public void setDateOfDeparture(Date dateOfDeparture) {
			DateOfDeparture = dateOfDeparture;
		}
		public Date getDateOfArrival() {
			return DateOfArrival;
		}
		public void setDateOfArrival(Date dateOfArrival) {
			DateOfArrival = dateOfArrival;
		}
		public Date getIssueDate() {
			return IssueDate;
		}
		public void setIssueDate(Date issueDate) {
			IssueDate = issueDate;
		}
		public Date getExpiryDate() {
			return ExpiryDate;
		}
		public void setExpiryDate(Date expiryDate) {
			ExpiryDate = expiryDate;
		}
		public String getUkDrivingLicence() {
			return UkDrivingLicence;
		}
		public void setUkDrivingLicence(String ukDrivingLicence) {
			UkDrivingLicence = ukDrivingLicence;
		}
		public String getIdentityNumber() {
			return IdentityNumber;
		}
		public void setIdentityNumber(String identityNumber) {
			IdentityNumber = identityNumber;
		}
		public String getFamilyInUk() {
			return FamilyInUk;
		}
		public void setFamilyInUk(String familyInUk) {
			FamilyInUk = familyInUk;
		}
		public String getAnyOtherNationality() {
			return AnyOtherNationality;
		}
		public void setAnyOtherNationality(String anyOtherNationality) {
			AnyOtherNationality = anyOtherNationality;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
			
}
