package clinica;

public class ClinicalVisit {
    
    private Patient patient;
    private User nurse;
    private VitalInfo vitalInfo;
    private Order order;
    private Item item;
    private String obs;


    public ClinicalVisit(){

   }

   public ClinicalVisit(Patient patient, User nurse, VitalInfo vitalInfo, Order order, Item item, String obs) {
        this.patient = patient;
        this.nurse = nurse;
        this.vitalInfo = vitalInfo;
        this.order = order;
        this.item = item;
        this.obs = obs;
    }

    public Patient getPatient(){
        return this.patient;
    }

    public void setPatient(Patient patient){
        this.patient = patient;
    }

    public User getNurse(){
        return this.nurse;
    }

    public void setNurse(User nurse){
        this.nurse = nurse;
    }

    public VitalInfo getVitalInfo(){

        return this.vitalInfo;
    }   
    
    public void setVitalInfo(VitalInfo vitalInfo){
        this.vitalInfo = vitalInfo;
    }
    
    public Order getOrder(){
        return this.order;
    }
    
    public void setOrder(Order order){
        this.order = order;
    }
    
    public Item getItem(){
        return this.item;
    }
    
    public void setItem(Item item){
        this.item = item;
    }
    
    public String getObs(){
        return this.obs;
    }
    
    public void setObs(String obs){
        this.obs = obs;
    }

}
