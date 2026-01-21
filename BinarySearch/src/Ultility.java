
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
    public int input() {
        Scanner sc = new Scanner(System.in);
        String size;
        int converted;
        while (true) {
            try {
                size = sc.nextLine();
                isValidData(size);
                converted = Integer.valueOf(size);
                return converted;
            } catch (InvalidNumberException | InputMismatchException | NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Please try again !!");
            }
        }
    }

    /**
     * to enter search number and validate
     *
     * @return : number to be found
     */
    public int enterSearchNumber() {
        Scanner sc = new Scanner(System.in);
        String number;
        int converted;
        while (true) {
            try {
                number = sc.nextLine();
                isValidData(number);
                converted = Integer.valueOf(number);
                return converted;
            } catch (InvalidNumberException | InputMismatchException | NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Please try again !!");
            }
        }
    }
    
    

    /**
     * check data in the range 0 - 9 digit
     *
     * @param size : the size of array
     * @throws InputMismatchException
     */
    public void isValidData(String size) throws InputMismatchException, NumberFormatException, InvalidNumberException {
        if (!size.matches("^\\d+$")) {
            throw new InputMismatchException("you have to enter a positive number");
        }
        if (!size.matches("^\\d+$")) {
            throw new InputMismatchException("you have to enter a positive number");
        }
        int converted = Integer.valueOf(size);
        if (converted <= 0) {
            throw new InvalidNumberException(("you have to enter a positive number"));
        }
    }

}
