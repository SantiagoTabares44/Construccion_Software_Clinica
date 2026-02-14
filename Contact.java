package clinica;

public class Contact extends Person{
    private String relation;


    public Contact(){

    }
    
    public Contact(String firstName,String lastName, String document, String email, String cellphone, java.time.LocalDate birthday, String address, String relation){
        super(firstName, lastName,document, email, cellphone, birthday, address);// Campos de la clase padre (Person)
        this.relation = relation;
    }

    public String getRelation(){
        return relation;
    }

    public void setRelation(String relation){
        this.relation = relation;
    }


}
