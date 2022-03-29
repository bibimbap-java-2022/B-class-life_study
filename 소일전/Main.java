package com.company;
import java.util.Scanner;
public class Main {

    // Scanner 선언 및 생성
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
	System.out.println("소일전");
	System.out.println("202213522");

	    // A와 B를 받아 A@B 연산 결과를 출력하는 프로그램 작성
        // A@B = (A+B)*(A-B)
        System.out.println("Please enter a number A:");
        int A = sc.nextInt();
        System.out.println("Please enter a number B:");
        int B = sc.nextInt();
        System.out.println("(A+B)*(A-B)=" + (A+B)*(A-B));

        // (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
        // (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
        // 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성.
        System.out.println("Please enter a number C:");
        int C = sc.nextInt();
        System.out.print("(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?");
        System.out.println((A+B)%C == ((A%C)+(B%C))%C);
        System.out.println("(A+B)%C는 ((A%C) + (B%C))%C 와 같다.");
        System.out.print("(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?");
        System.out.println((A*B)%C == ((A%C) * (B%C))%C);
        System.out.println("(A×B)%C는 ((A%C) × (B%C))%C 와 같다.");
        System.out.println("네 가지 값의 결과는 다음과 같다.");
        System.out.println("(A+B)%C=" + (A+B)%C);
        System.out.println("((A%C)+(B%C))%C=" + ((A%C)+(B%C))%C);
        System.out.println("(A*B)%C=" + (A*B)%C);
        System.out.println("((A%C) * (B%C))%C=" + ((A%C) * (B%C))%C);

    }
}
