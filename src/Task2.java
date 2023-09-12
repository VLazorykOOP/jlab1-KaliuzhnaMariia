import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Task 2 (7)");

        System.out.print("Enter the n: ");
        int n = input.nextInt();
        if(n > 400){
            System.out.println("This array is too big. Please choose another n");
        }

        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("A["+ i + "] = ");
            a[i] = input.nextInt();
        }

        boolean foundUnique = false;
        int max = a[0];
        for (int i = 0; i < n; i++){
            boolean rep = false;
            for (int j = 0; j < n; j++){
                if (i != j && a[i] == a[j]){
                    rep = true;
                    break;
                }
            }
            if (!rep){
                if (!foundUnique) {
                    max = a[i];
                    foundUnique = true;
                } else if (a[i] > max) {
                    max = a[i];
                }
            }
        }
        if (foundUnique) {
            System.out.println("Unique maximum number: " + max);
        } else {
            System.out.println("No unique numbers in array");
        }
    }
}
