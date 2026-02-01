
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hieuchu
 */
public class Fibonacci {
    private long[] arr ;
    
    public Fibonacci(int size){
        arr = new long[size];
    }
     /**
     * generate randomly array    
     */
    public void generateArray() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = fibonacci(i);
        }
    }

    /**
     * calculate fibonacci 
     * @param index : the index of fibonacci number 
     * @return  : the fibonacci number at index 
     */
    
    public int fibonacci(int index){
        // return first fibonacci number
        if(index == 0){
            return 0 ;
        }
        // return second fibonacci number 
        if(index == 1){
            return 1 ;
        }
       return fibonacci(index - 1) + fibonacci(index - 2 ) ;
    }
    public void displayArray() {
        int count = 0;
        System.out.print("[");
        for (long x : arr) {
            if (count >= 1 && count < arr.length) {
                System.out.print(",");
            }
            System.out.print(x);
            count++;
        }
        System.out.print("]");
    }
}
