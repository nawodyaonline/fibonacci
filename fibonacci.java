import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int input = sc.nextInt();
        System.out.print("1 1 ");
        int output = 0, b = 1, c = 1;
        // 1 1 2 3 5 8 13

        while (output <= input) {
            output = b + c;
            if(output>=input)
                break;
            System.out.print(output + " ");
            b = c;
            c = output;
        }
        System.out.println();
    }
}