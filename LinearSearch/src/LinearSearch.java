
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Class include generate array , display array , search array method
 *
 * @author hieuchu
 */
public class LinearSearch {

    /**
     * the array attribute
     */
    private int[] array;

    /**
     * the constructor of LinearSearch
     */
    public LinearSearch(int size) {
        array = new int[size];
    }

    /**
     * generate randomly array    
     */
    public void generateArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }
    }

    /**
     * show array
     */
    public void displayArray() {
        int count = 0;
        System.out.print("[");
        for (int x : array) {
            if (count >= 1 && count < array.length) {
                System.out.print(",");
            }
            System.out.print(x);
            count++;
        }
        System.out.print("]");
    }

    /**
     *
     * @param size : the size of array
     * @param number : the number to be found
     * @return : the index of the number to be found or not found
     */
    public int searchIndexOfSearchValue(int size, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }        
}
