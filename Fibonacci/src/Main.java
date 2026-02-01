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
        int range =  5 ;
        Fibonacci fibonacci = new Fibonacci(range);
        fibonacci.generateArray();
        fibonacci.displayArray();
    }
}
