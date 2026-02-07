import java.util.Scanner;

public class Ultility {

    public int validateVailability(String s) {
        Scanner sc = new Scanner(System.in);
        int data;
        while (true) {
            System.out.print(s);
            data = sc.nextInt();
            if (data >= 0) break;
            System.out.println("Availability >= 0");
        }
        return data;
    }
    public String validateInput(String s) {
        Scanner sc = new Scanner(System.in);
        String data ;
        while (true) {
            System.out.print(s);
            data = sc.nextLine();
            if (!data.trim().isEmpty()) break;
            System.out.println("Availability >= 0");
        }
        return data;
    }
}
