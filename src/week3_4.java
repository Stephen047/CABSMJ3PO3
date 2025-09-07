import java.util.Scanner;

public class week3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three numbers :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double avg = (a+b+c)/3.0;
        System.out.println("Average = "+avg);
    }
}
