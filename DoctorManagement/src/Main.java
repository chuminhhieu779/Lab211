import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Ultility ultility = new Ultility();
        String choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("=========Doctor Management==========");
            System.out.println("1. Add Doctor");
            System.out.println("2. Update Doctor");
            System.out.println("3. Delete Doctor");
            System.out.println("4. Search Doctor");
            System.out.println("5. Exit ");
            System.out.print("Please choose your option:");
            choice = sc.nextLine();
            switch (choice) {
                case "1": {
                    Doctor doctor = new Doctor();
                    System.out.println("-------Add Doctor--------");
                    System.out.print("Enter Code:");
                    String code = sc.nextLine();
                    System.out.print("Enter Name:");
                    String name = sc.nextLine();
                    System.out.print("Enter Specialization:");
                    String spec = sc.nextLine();
                    int ava = ultility.validateVailability("Vailability:");
                    doctor.setCode(code);
                    doctor.setName(name);
                    doctor.setSpecilization(spec);
                    doctor.setAvaibility(ava);
                    try {
                        manager.addDoctor(doctor);
                        System.out.println("doctor is added ");
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                }
                case "2": {
                    System.out.println("--------- Update Doctor ---------");
                    Doctor doctor = new Doctor();
                    System.out.print("Enter Code:") ;
                    String code = sc.nextLine();
                    System.out.print("Enter Name:");
                    String name = sc.nextLine();
                    System.out.print("Enter Specialization:");
                    String spec = sc.nextLine();
                    int ava = ultility.validateVailability("Vailability:");
                    doctor.setName(name);
                    doctor.setSpecilization(spec);
                    doctor.setAvaibility(ava);
                    doctor.setCode(code);
                    try {
                        manager.updateDoctor(doctor);
                        System.out.println("doctor is updated ");
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                }
                case "3": {
                    System.out.println("--------- Delete Doctor ---------");
                    System.out.print("Code: ");
                    String codeRemove = sc.nextLine();
                    try {
                        manager.deleteDoctor(codeRemove);
                        System.out.println("doctor has removed ");
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                }
                case "4": {
                    System.out.println("--------- Search Doctor ---------");
                    System.out.println("Enter String:");
                    String enterSearch = sc.nextLine();
                    try {
                         System.out.println("--------Result--------");
                         manager.searchDoctor(enterSearch);
                         break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                }
            }
        } while (!choice.equals("5"));
    }
}