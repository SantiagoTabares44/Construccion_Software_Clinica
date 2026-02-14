package clinica;
import java.time.LocalDate;

public class Invoice {
    private Patient patient;
    private User doctor;
    private Order order;
    private Double copay;
    private LocalDate date;
    private Double total;


    public Invoice(){

    }

    public Invoice(Patient patient,User doctor,Order order,Double copay,LocalDate date,Double total){
        this.patient = patient;
        this.doctor = doctor;
        this.order = order;
        this.copay = copay;
        this.date = date;
        this.total = total;
    }

    public Patient getPatient(){
        return this.patient;
    }

    public void setPatient(Patient patient){
        this.patient = patient;
    }

    public User getDoctor(){
        return this.doctor;
    }

    public void setDoctor(User doctor){
        this.doctor = doctor;
    }
    
    public Order getOrder(){
        return this.order;
    }

    public void setOrder(Order order){
        this.order = order;
    
    }

    public Double getCopay(){
        return this.copay;
    }

    public void setCopay(Double copay){
        this.copay = copay;
    }
    
    public LocalDate getDate(){
        return this.date;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }

    public Double getTotal(){
        return this.total;
    }

    public void setTotal(Double total){
        this.total = total;
    }

}
