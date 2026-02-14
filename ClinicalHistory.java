package clinica;

public class ClinicalHistory {
    private String document;
    private ClinicalRecords[] clinicalRecords;
    private int recordCount = 0;

    public ClinicalHistory(String document){
        this.document = document;
        this.clinicalRecords = new ClinicalRecords[100];
    }
    
    // Getters and Setters
    public String getDocument(){
        return document;
    }

    public void setDocument(String document){
        this.document = document;
    }
    
   
    
    public void addClinicalRecord(ClinicalRecords record){
        if(recordCount < clinicalRecords.length){
            clinicalRecords[recordCount++] = record;
        }
    }

    public ClinicalRecords getClinicalRecord(int index){
        if(index >=0 && index < recordCount) return clinicalRecords[index];
        return null;
    }

    public ClinicalRecords[] getAllClinicalRecords(){
        return clinicalRecords;
    }

    public int getTotalRecords(){
        return recordCount;
    }
    
}
