// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first number");
        int num1 = scanner.nextInt();
        System.out.println("Write second number");
        int num2 = scanner.nextInt();
        System.out.println("Write third number");
        int maxNum;
        int num3 = scanner.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            maxNum = num1;
        }
        else if (num2 >= num1 && num2 >= num3) {
            maxNum = num2;
    } else {
            maxNum = num3;
        }System.out.println(maxNum);


    }
}