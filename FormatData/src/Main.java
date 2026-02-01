
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hieuchu
 */
public class Main {

    public static void main(String[] args) {
        
        Ultility ultility = new Ultility();
        Manager manager = new Manager();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("====== Management Student Program ======");
        while (true) {
            Student student = new Student();
            
            String enterName = ultility.inputString("Name:");
            String enterClasses = ultility.inputString("Classes:");
            double enterMath = ultility.inputNumber("Maths:");
            double enterChemistry = ultility.inputNumber("Chemistry:");
            double enterPhysics = ultility.inputNumber("Physics:");
            
            student.setName(enterName);
            student.setClassName(enterClasses);
            student.setMath(enterMath);
            student.setChemistry(enterChemistry);
            student.setPhysics(enterPhysics);
           
            manager.createStudent(student);
            
            System.out.print("Do you want to enter more student information?(Y/N):");
            String confirm = sc.nextLine();
            if (confirm.equalsIgnoreCase("N")) {
                break;
            }        
        }               
        manager.averageStudent();
        manager.displayResult();
        manager.displayStatistic();        
    }
}
