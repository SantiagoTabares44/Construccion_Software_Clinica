package clinica;
import java.time.LocalDate;

public class Policy{
    private Company company;
    private int id;
    private Boolean status;
    private LocalDate vigency;


    public Policy(){

    }   

    public Policy(Company company, int id, Boolean status, LocalDate vigency) {
        this.company = company;
        this.id = id;
        this.status = status;
        this.vigency = vigency;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDate getVigency() {
        return vigency;
    }

    public void setVigency(LocalDate vigency) {
        this.vigency = vigency;
    }


}
