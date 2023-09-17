import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Task 1 (4)");

        System.out.println("Version 1 (float in and out)");
        double fa = input("fa", input);
        double fb = input("fb", input);
        double rez1 = res(fa, fb);
        System.out.println("Result for float: " + rez1);

        System.out.println("Version 2 (int in and float out)");
        int ia = (int) input("ia", input);
        int ib = (int) input("ib", input);
        double rez2 = res(ia, ib);
        System.out.println("Result for float: " + rez2);

        System.out.println("Version 3 (float in and int out)");
        double da = input("da", input);
        double db = input("db", input);
        int rez3 = (int) res(da, db);
        System.out.println("Result for int: " + rez3);
        input.close();
    }
    //Input function
    private static double input(String v, Scanner input){
        System.out.print("Enter the " + v + " : ");
        return input.nextDouble();
    }
    //Result function
    private static double res(double a,double b){
        return ((a * b - (a + b) * (a - b))/(Math.pow(b, 4) + Math.pow(a, 3)) + 5 * b);
    }
}
