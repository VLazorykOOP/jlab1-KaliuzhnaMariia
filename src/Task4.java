import java.util.Scanner;
public class Task4 {
    static Scanner input;

    public static void main(String[] args) {
        System.out.println("Task 4 (8)");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = input.nextLine();
        String[] words = text.split("[ ,.:;-?!]+");
        System.out.println("Result: ");
        for (int i = 0; i < words.length; i++){
            String word = words[i];
            if (word.length() % 2 == 0){
                System.out.print(word + " ");
            }
            input.close();
        }
    }
}
