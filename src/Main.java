import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Task 1");

        System.out.println("First version(input and output float): ");
        System.out.print("Enter the a (float):");
        double fa = input.nextDouble();
        System.out.print("Enter the b (float):");
        double fb = input.nextDouble();
        double rez1 = (fa * fb - (fa + fb) * (fa - fb))/(Math.pow(fb, 4) + Math.pow(fa, 3)) + 5 * fb;
        System.out.println("Result for float: " + rez1);


    }
}
