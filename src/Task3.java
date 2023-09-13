import java.util.Scanner;
public class Task3 {
    static Scanner input;
    //Input function
    static int[][] Input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = input.nextInt();
        if(n > 15){
            System.out.println("This array is too big. Please choose another n");
        }

        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("A["+ i + "][" + j + "] = ");
                a[i][j] = input.nextInt();
            }
        }
        return a;
    }
    //Function for task changes
    static void Task(int[][] a){
        int maxr = 0;
        int maxel = a[0][0];
        int[][] rez = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                if (a[i][j] > maxel){
                    maxel = a[i][j];
                    maxr = i;
                }
            }
        }
        System.out.println("Result: ");
    }
    public static void main(String[] args) {
        System.out.println("Task 3 (12)");
        int[][] a = Input();
        Task(a);
    }
}
