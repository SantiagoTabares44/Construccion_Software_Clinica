package clinica;

public class Patient extends Person{
    private Gender gender;
    private Contact contact;
    private Policy policy;


    public Patient(){

    }
    
    public Patient(String firstname,String lastName, String document, String email, String cellphone, java.time.LocalDate birthday, String address,
                   Gender gender, Contact contact, Policy policy){
        super(firstname,lastName, document, email, cellphone, birthday, address); // Llamada al constructor padre (Person)
        this.gender = gender;
        this.contact = contact;
        this.policy = policy;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender =  gender;

    }

    public Contact getContact() {
        return this.contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Policy getPolicy() {
        return this.policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }
}



