
public class Doctor {
    private String code ;
    private String name ;
    private String specilization ;
    private int avaibility ;

    public Doctor() {

    }

    public Doctor(String code, String name, String specilization, int avaibility) {
        this.code = code;
        this.name = name;
        this.specilization = specilization;
        this.avaibility = avaibility;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecilization() {
        return specilization;
    }

    public void setSpecilization(String specilization) {
        this.specilization = specilization;
    }

    public int getAvaibility() {
        return avaibility;
    }

    public void setAvaibility(int avaibility) {
        this.avaibility = avaibility;
    }
}
