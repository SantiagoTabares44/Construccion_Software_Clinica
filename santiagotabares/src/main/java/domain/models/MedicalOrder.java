package clinica.santiagotabares.src.main.java.domain.models;

public class MedicalOrder extends OrderItem{
    private double dose;
    private int duration;


    public MedicalOrder(){

    }


    
    public MedicalOrder(int orderId, Item item, int itemNumber, double dose, int duration){
        super(orderId, item, itemNumber);// campos heredados del padre(OrderItem)
        this.dose = dose;
        this.duration = duration;
    }
    public double getDose() {
        return dose;
    }   
    public void setDose(double dose) {
        this.dose = dose;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    
}
