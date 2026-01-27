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
        Utility utility = new Utility();
        int size = utility.input();
        QuickSort quickSort = new QuickSort(size);
        quickSort.generateArray();
        quickSort.displayArray();
        quickSort.sortArray2(0, size - 1);
        quickSort.displayArray();
    }
            
}
