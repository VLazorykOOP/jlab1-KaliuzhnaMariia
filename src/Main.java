import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Task 1 (4)");

        System.out.println("Version 1 (float in and out)");
        double fa = Input("fa", input);
        double fb = Input("fb", input);
        double rez1 = Res(fa, fb);
        System.out.println("Result for float: " + rez1);

        System.out.println("Version 2 (int in and float out)");
        int ia = (int) Input("ia", input);
        int ib = (int) Input("ib", input);
        double rez2 = Res(ia, ib);
        System.out.println("Result for float: " + rez2);

        System.out.println("Version 3 (float in and int out)");
        double da = Input("da", input);
        double db = Input("db", input);
        int rez3 = (int) Res(da, db);
        System.out.println("Result for int: " + rez3);
    }
    //Input function
    private static double Input(String v, Scanner input){
        System.out.print("Enter the " + v + "(float): ");
        return input.nextDouble();
    }
    //Result function
    private static double Res(double a,double b){
        return ((a * b - (a + b) * (a - b))/(Math.pow(b, 4) + Math.pow(a, 3)) + 5 * b);
    }
}
