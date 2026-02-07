import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager {

    private final List<Doctor> doctorList = new ArrayList<>();

    public void addDoctor(Doctor doctor) throws Exception {
        if (!doctorList.isEmpty()) {
            for (Doctor doctor1 : doctorList) {
                if (doctor1.getCode().equalsIgnoreCase(doctor.getCode())) {
                    throw new Exception("Doctor code " + doctor.getCode() + " is duplicate");
                }
            }
        }
        doctorList.add(doctor);
    }

    public void updateDoctor(Doctor doctor) throws Exception {
        if (!doctorList.isEmpty()) {
            for (Doctor doctor1 : doctorList) {
                if (doctor1.getCode().equalsIgnoreCase(doctor.getCode())) {
                    doctor1.setName(doctor.getName());
                    doctor1.setSpecilization(doctor.getSpecilization());
                    doctor1.setAvaibility(doctor.getAvaibility());
                    return ;
                }
                throw new Exception("Doctor code " + doctor.getCode() + " is not exits ");
            }
        }
    }

    public void deleteDoctor(String code) throws Exception {
        if (!doctorList.isEmpty()) {
            for (Doctor doctor1 : doctorList) {
                if (doctor1.getCode().equalsIgnoreCase(code)) {
                    doctorList.remove(doctor1);
                    return ;
                }
                throw new Exception("Doctor code " + code + " is not exits ");
            }
        }
    }

    public void searchDoctor(String code) {
        System.out.println(String.format(
                "%-10s %-20s %-20s %-10s",
                "Code", "Name", "Specialization", "Availability"
        ));
        for (Doctor doctor : doctorList) {
            if (doctor.getCode().contains(code)) {
                System.out.println(String.format(
                        "%-10s %-20s %-20s %-10d",
                        doctor.getCode(),
                        doctor.getName(),
                        doctor.getSpecilization(),
                        doctor.getAvaibility()
                ));
            }
        }
    }

}

