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

        System.out.println("Enter number of array:");
        int size = ultility.input();

        System.out.println("Enter search value: ");
        int numberFound = ultility.enterSearchNumber();

        BinarySearch binarySearch = new BinarySearch(size);

        binarySearch.generateArray();

        System.out.print("Sorted array: ");
        binarySearch.displaySortedArray();

        int index = binarySearch.searchIndexOfNumberFound(numberFound);
        System.out.println("");
        System.out.println("Found " + numberFound + " at index : " + index);
    }
}
