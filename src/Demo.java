import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Введите три числа через Enter");

        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        if (first == second || first == third){
            System.out.print(first + " ");
        }

        if (second == first || second == third){
            System.out.print(second + " ");
        }

        if (third == first || third == second){
            System.out.print(third);
        }

        scanner.close();
    }
}

