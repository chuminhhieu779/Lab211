
import java.util.Arrays;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hieuchu
 */
public class BinarySearch {

    private int[] array;

    public BinarySearch(int size) {
        array = new int[size];
    }

    public void generateArray() {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(array.length);
        }
    }

    public void displaySortedArray() {
        Arrays.sort(array);
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

    public int searchIndexOfNumberFound(int numberFound) {
        // array.length tránh l + r = chỉ số nằm ngoài mảng 
        // left <= right : bao gồm trường hợp 1 phần tủ
        // set left pointer = 0 and right pointer = last index as a scope to search 
        int left = 0, right = array.length - 1 ;
        // loop until left > right 
        while (left <= right) {
            // declare middle index in a middle range [ left, right ]
            int middleIndex = (left + right) / 2;
            // if middle element == numberFound , return the middle index 
            if (array[middleIndex] == numberFound) {
                return middleIndex;
            }                     
            // if midElement < numberFound , the numberFound must be located in the right half                   
            else if (array[middleIndex] < numberFound) {
                // discard the elements in left half and middle element  
                left = middleIndex + 1;
            } else {
            // if midElement > numberFound , the numberFound must be located in the left half 
            // then discard the elements in right half and middle element 
                right = middleIndex - 1;
            }
        }
        return -1;
    }
}
