export class VisaForm{
   
    constructor(
        public id:number,
        public Name:String,
        public Email:String,
        public Gender:String,
        public passport_number:String,
        public country_of_nationality:String,
        public type_of_visa_application:String,
        public total_fee:number,
        public contact_language:String,
        public payment_reference:String,
        public relational_status:String,
        public another_email:String,
        public date_of_birth:String,
        public duration_of_visa:String,
        public date_of_departure:String,
        public date_of_arrival:String,
        public issue_date:String,
        public expiry_date:String

    ){}
}