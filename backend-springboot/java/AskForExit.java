import java.util.Scanner;
public class AskForExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a specific string or exit: ");
        String input=sc.nextLine();
        while(!input.equals("exit")){
            System.out.print("Enter a specific String or exit: ");
            input=sc.nextLine();
        }
        sc.close();
    }
}
