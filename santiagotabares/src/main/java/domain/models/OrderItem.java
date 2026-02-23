package clinica.santiagotabares.src.main.java.domain.models;

public class OrderItem {
    private int orderId;
    private Item item;
    private int itemNumber;


    public OrderItem(){

    }
    public OrderItem(int orderId, Item item, int itemNumber){
        this.orderId = orderId;
        this.item = item;
        this.itemNumber = itemNumber;
    }
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public int getItemNumber() {
        return itemNumber;
    }
    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }
    
    
}
