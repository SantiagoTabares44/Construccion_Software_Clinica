package clinica;
import java.time.LocalDate;

public class Order {
    private int id;
    private OrderItem[] orderItem;
    private LocalDate date;
    private Patient patient;
    private User doctor;
    private int itemCount = 0;

        public Order(){
    
        }
        public Order(int id,OrderItem[] orderItem,LocalDate date,Patient patient,User doctor){
            this.id = id;
            this.orderItem = orderItem;
            this.date = date;
            this.patient = patient;
            this.doctor = doctor;
            // Contar items no-null en el array
            this.itemCount = 0;
            if(this.orderItem != null){
                for(OrderItem item : this.orderItem){
                    if(item != null) this.itemCount++;
                }
            }
        }
        public int getId(){
            return this.id;
        }
        public void setId(int id){
            this.id = id;
        }
        public OrderItem[] getOrderItem(){
            return this.orderItem;
        }
        public void setOrderItem(OrderItem[] orderItem){
            this.orderItem = orderItem;
        }   
        public LocalDate getDate(){
            return this.date;
        }
        public void setDate(LocalDate date){
            this.date = date;
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

        // Métodos de conveniencia para manejar OrderItem[]
        public void addOrderItem(OrderItem item){
            if(this.orderItem == null){
                this.orderItem = new OrderItem[50];
            }
            if(itemCount < this.orderItem.length){
                this.orderItem[itemCount++] = item;
            }
        }

        public OrderItem getOrderItemAt(int index){
            if(orderItem == null) return null;
            if(index >=0 && index < itemCount) return orderItem[index];
            return null;
        }

        public int getTotalOrderItems(){
            return itemCount;
        }

    
}
