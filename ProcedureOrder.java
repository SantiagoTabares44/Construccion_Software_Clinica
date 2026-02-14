package clinica;

public class ProcedureOrder extends OrderItem{
    private double quantity;
    private String frequency;
    private Boolean specialRequired;
    private Specialist specialist;

    public ProcedureOrder(){

    }   

    public ProcedureOrder(int orderId, Item item, int itemNumber, double quantity, String frequency, Boolean specialRequired, Specialist specialist){
        super(orderId, item, itemNumber); //Llamado de la clase padre (OrderItem)
        this.quantity = quantity;
        this.frequency = frequency;
        this.specialRequired = specialRequired;
        this.specialist = specialist;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Boolean getSpecialRequired() {
        return specialRequired;
    }

    public void setSpecialRequired(Boolean specialRequired) {
        this.specialRequired = specialRequired;
    }

    public Specialist getSpecialist() {
        return specialist;
    }

    public void setSpecialist(Specialist specialist) {
        this.specialist = specialist;
    }

}
