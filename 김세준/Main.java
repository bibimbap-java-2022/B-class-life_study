
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        System.out.println("김세준\n202211271");
        System.out.printf("%d@%d=%d\n",input1,input2,(input1+input2)*(input1-input2));
        System.out.println((input1+input2)%input3==((input1%input3)+(input2%input3))%input3);
        System.out.println((input1*input2)%input3==((input1%input3)*(input2%input3)%input3));
    }
}
