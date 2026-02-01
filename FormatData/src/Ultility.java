
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hieuchu
 */
public class Ultility {

    /**
     * receive data from user and validate it until user enter valid data
     *
     * @return a positive integer
     */
    public double inputNumber(String subject) {
        Scanner sc = new Scanner(System.in);
        String data;
        while (true) {
            try {
                System.out.print(subject);
                data = sc.nextLine();
                double convertData = Double.parseDouble(data);
                if (convertData > 10) {
                    System.out.println(subject + " is less than equal ten");
                } else if (convertData <= -1) {
                    System.out.println(subject + " is greater than equal hero");
                } else {
                    return convertData;
                }
            } catch (NumberFormatException s) {
                System.out.println(subject + " is digit");
            }
        }
    }

    public String inputString(String attribute) {
        Scanner sc = new Scanner(System.in);
        String data;
        while (true) {
            System.out.print(attribute);
            data = sc.nextLine();
            if (!data.trim().isEmpty()) {
                return data;
            }
        }
    }

}
