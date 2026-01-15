/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *  The class to use input , enter value , search , display array and index of number to be found
 *
 * @author hieuchu
 */
public class Main {

    public static void main(String[] args) {

        // Declare Ultility Object 
        Ultility ultility = new Ultility();

        // Step 1 : Enter the size of array 
        System.out.println("Enter number of array:");
        int size = ultility.input();

        // Declare SlectionSort Object 
        LinearSearch linearSearch = new LinearSearch(size);

        // Step 2 : Generate array 
        linearSearch.generateArray();

        // Step 3 : Enter search value 
        System.out.println("Enter search value");
        int searchValue = ultility.enterSearchNumber();

        // Step 4 : display array 
        System.out.print("The array: ");
        linearSearch.displayArray();
        System.out.println("");

        // Step 5 : search value in array 
        int index = linearSearch.searchIndexOfSearchValue(size, searchValue);
        System.out.print("Found " + searchValue + " at index: " + index + " ");
    }
}
