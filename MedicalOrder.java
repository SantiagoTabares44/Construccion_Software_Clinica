package clinica;

public class MedicalOrder extends OrderItem{
    private double dose;
    private int duration;


    public MedicalOrder(){

    }

    public MedicalOrder(double dose, int duration){
        this.dose = dose;
        this.duration = duration;
    }

    // Constructor que inicializa campos heredados de OrderItem
    public MedicalOrder(int orderId, Item item, int itemNumber, double dose, int duration){
        super(orderId, item, itemNumber);
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
