package clinica;

public class SupportOrder extends OrderItem {
    private boolean specialRequired;
    private Specialist specialist;
    private double quantity;

    public SupportOrder(){

    }


    
    public SupportOrder(int orderId, Item item, int itemNumber, boolean specialRequired, Specialist specialist, double quantity){
        super(orderId, item, itemNumber);// campos del padre (OrderItem)
        this.specialRequired = specialRequired;
        this.specialist = specialist;
        this.quantity = quantity;
    }

    public boolean getSpecialRequired() {
        return specialRequired;
    }

    public void setSpecialRequired(boolean specialRequired) {
        this.specialRequired = specialRequired;
    }

    public Specialist getSpecialist() {
        return specialist;
    }

    public void setSpecialist(Specialist specialist) {
        this.specialist = specialist;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    
}
