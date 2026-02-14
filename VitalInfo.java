package clinica;

public class VitalInfo {
    private String pressure;
    private int temp;
    private String pulse;
    private String oxygen;

    public VitalInfo(){

    }

    public VitalInfo(String pressure, int temp, String pulse, String oxygen) {
        this.pressure = pressure;
        this.temp = temp;
        this.pulse = pulse;
        this.oxygen = oxygen;
    }
    
    
    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getOxygen() {
        return oxygen;
    }

    public void setOxygen(String oxygen) {
        this.oxygen = oxygen;
    }

    
}
