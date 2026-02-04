import java.util.HashMap;
import java.util.Map;

public class Manager {

    private final Map<String, Doctor> doctorMap = new HashMap();

    public boolean addDoctor(Doctor doctor) throws Exception {
        if (doctor == null) {
            throw new Exception("Data does not exits ");
        } else if (doctorMap == null) {
            throw new Exception("Database does not exist ");
        } else {
            if (doctorMap.containsKey(doctor.getCode())) {
                throw new Exception("Doctor code " + doctor.getCode() + " is duplicate");
            } else {
                doctorMap.put(doctor.getCode(), doctor);
                return true;
            }
        }
    }

    public boolean updateDoctor(Doctor doctor) throws Exception {
        if (doctor == null) {
            throw new Exception("Data does not exits ");
        } else if (doctorMap == null) {
            throw new Exception("Database does not exist ");
        } else {
            if (!doctorMap.containsKey(doctor.getCode())) {
                throw new Exception("Doctor code doesn't exist ");
            } else {
                doctorMap.put(doctor.getCode(), doctor);
                return true;
            }
        }
    }

    public boolean deleteDoctor(String code) throws Exception {
        if (code == null) {
            throw new Exception("Data does not exits ");
        } else if (doctorMap == null) {
            throw new Exception("Database does not exist ");
        } else {
            if (!doctorMap.containsKey(code)) {
                throw new Exception("Doctor code doesn't exist ");
            } else {
                doctorMap.remove(code);
                return true;
            }
        }
    }
    public HashMap<String, Doctor> searchDoctor(String input) throws Exception {
        HashMap<String, Doctor> found = new HashMap<>();
        if(doctorMap  == null) {
            throw new Exception("Database does not exist ");
        }
        for(Map.Entry<String, Doctor> entry : doctorMap.entrySet()){
            Doctor doctor = entry.getValue();
            String code = entry.getKey();
            if(doctor.getCode().contains(input) || doctor.getName().contains(input) || doctor.getSpecilization().contains(input)){
                found.put(code, doctor);
            }
        }
        return found;
    }
    public void display(HashMap<String, Doctor> map){
        for(Map.Entry<String , Doctor> entry : map.entrySet()){
            Doctor doctor = entry.getValue();
            System.out.println(doctor.getCode() + " " + doctor.getName() + " "+doctor.getSpecilization() + " " + doctor.getAvaibility());
        }
    }

}

