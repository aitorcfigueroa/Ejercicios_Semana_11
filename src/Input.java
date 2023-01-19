import java.util.Scanner;

public class Input {
    public static String str() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static int num() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static String clean() {
        Scanner input = new Scanner(System.in);
        return input.next();
    }
}
