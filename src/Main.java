import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Task 1");

        System.out.println("Version 1 (float in and out)");
        double fa = Input("fa", input);
        double fb = Input("fb", input);
        double rez1 = (fa * fb - (fa + fb) * (fa - fb))/(Math.pow(fb, 4) + Math.pow(fa, 3)) + 5 * fb;
        System.out.println("Result for float: " + rez1);

        System.out.println("Version 2 (int in and float out)");
        int ia = (int) Input("ia", input);
        int ib = (int) Input("ib", input);
        double rez2 = (ia * ib - (ia + ib) * (ia - ib))/(Math.pow(ib, 4) + Math.pow(ia, 3)) + 5 * ib;
        System.out.println("Result for float: " + rez2);
    }
    //Input function
    private static double Input(String v, Scanner input){
        System.out.print("Enter the " + v + "(float): ");
        return input.nextDouble();
    }
}
