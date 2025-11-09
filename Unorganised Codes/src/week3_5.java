import java.util.Scanner;

public class week3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, y1;
        double x2, y2;
        System.out.println("Enter x1 and y1 :");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        System.out.println("Enter x2 and y2 :");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        double dis = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.printf("Distance between %.2f, %.2f and %.2f, %.2f is %.2f",x1,y1,x2,y2,dis);
    }
}
// ex = (-3, 2), (3, 5) -> 6.71
/*
The System.out.printf() statement is used to print formatted Strings like we do in C.
It works just like printf() does in C. Format Specifiers are also mostly the same.
You can also just use System.out.println(), that'll work just fine, but you can use format specifiers in that.
*/