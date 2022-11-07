import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(0, 200, 10);
        while (true) {
            System.out.println(" Enter your floor number: ");
            int floornumber = new Scanner(System.in).nextInt();
            System.out.println(" Enter your weigth: ");
            int weigth = new Scanner(System.in).nextInt();
            elevator.moveToFloor(floornumber, weigth);
        }
    }
}