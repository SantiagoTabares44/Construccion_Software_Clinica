package clinica.santiagotabares.src.main.java.domain.models;
import java.time.LocalDate;

public class ClinicalRecords {
    private LocalDate date;
    private User doctor;
    private String motive;
    private String synthome;
    private String diagnosis;


    public ClinicalRecords(){

    }

    public ClinicalRecords(LocalDate date, User doctor, String motive, String synthome, String diagnosis) {
        this.date = date;
        this.doctor = doctor;
        this.motive = motive;
        this.synthome = synthome;
        this.diagnosis = diagnosis;
    }

    public LocalDate getDate() {
        return date;
    }   

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public User getDoctor() {
        return doctor;
    }
    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }
    public String getMotive() {
        return motive;
    }
    public void setMotive(String motive) {
        this.motive = motive;
    }
    public String getSynthome() {
        return synthome;
    }
    public void setSynthome(String synthome) {
        this.synthome = synthome;
    }
    public String getDiagnosis() {
        return diagnosis;
    }
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

}
