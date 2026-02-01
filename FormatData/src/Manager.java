
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hieuchu
 */
public class Manager {
    
    private final  List<Student> studentList = new ArrayList<>();

    public void createStudent(Student student) {
        studentList.add(student);
    }

    public void averageStudent() {
        for (Student x : studentList) {
            double math = x.getMath();
            double physics = x.getPhysics();
            double chemistry = x.getChemistry();
            double avg = (math + physics + chemistry) / 3;
            x.setAverage(avg);
            if (avg >= 7.5) {
                x.setType("A");
            } else if (avg >= 6) {
                x.setType("B");
            } else if (avg >= 4) {
                x.setType("C");
            } else {
                x.setType("D");
            }
        }
    }

    public HashMap<String, Double> getPercentTypeStudent() {
        HashMap<String, Double> map = new HashMap<>();
        int countA = 0, countB = 0, countC = 0, countD = 0;
        for (Student x : studentList) {
            if (x.getType().equals("A")) {
                countA++;
            } else if (x.getType().equals("B")) {
                countB++;
            } else if (x.getType().equals("C")) {
                countC++;
            } else {
                countD++;
            }
        }
        int totalStudent = studentList.size();
        double percentA = countA * 100.0 / totalStudent;
        double percentB = countB * 100.0 / totalStudent;
        double percentC = countC * 100.0 / totalStudent;
        double percentD = countD * 100.0 / totalStudent;
        map.put("A", percentA);
        map.put("B", percentB);
        map.put("C", percentC);
        map.put("D", percentD);
        return map;
    }
    
    public void displayStatistic(){
         HashMap<String, Double> map = getPercentTypeStudent();
        System.out.println("-------Classification Info -------");
        System.out.println("A:" + map.get("A") + "%");
        System.out.println("B:" + map.get("B") + "%");
        System.out.println("C:" + map.get("C") + "%");
        System.out.println("D:" + map.get("D") + "%");
    }
    
    public void displayResult() {
        int index = 1;
        for (Student s : studentList) {            
            System.out.println("-----Student" + index + " Info -----");
            System.out.println("Name:" + s.getName());
            System.out.println("Classes:" + s.getClassName());
            System.out.println("AVG:" + s.getAverage());
            System.out.println("Type:" + s.getType());
            index++;
        }
    }
}
