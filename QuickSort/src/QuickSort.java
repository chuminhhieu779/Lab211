
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hieuchu
 */
public class QuickSort {
    /**
     * the array attribute
     */
    private final int[] array;

    /**
     * the constructor of SelectionSort
     * @param size
     */
    public QuickSort(int size) {
        array = new int[size];
    }

    /**
     * generate randomly array
     *
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
     * @param indexA : the first index
     * @param indexB : the second index
     *
     */
    private void swap(int indexA, int indexB) {
        int tmp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = tmp;
    }

    /**
     * sort array by the quick sort
     */
    private int partition(int left , int right) {
     
        int pivot = (left + right) / 2 ;
        int i = left ;
        int j = right ;
        while(i <= j){
            while(array[i] < array[pivot]){
                i++;
            }
            while(array[j] > array[pivot]){
                j--;
            }
            if(i <= j){
                swap(i, j);
                i++;
                j--;
            }
        }
        return i ;
    }

    public void sortArray2(int left , int right) {        
        if(left >= right) return ;
        int index = partition(left, right); 
        sortArray2(left, index - 1);
        sortArray2(index, right);
    }

}
