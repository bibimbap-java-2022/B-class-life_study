import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("정민수"); 
		System.out.println("202211365");

		
		System.out.println("A를 입력하시오");
		int A = sc.nextInt();
		System.out.println("B를 입력하시오");
		int B = sc.nextInt();
		System.out.println("A@B="+(A+B)*(A-B));
		
		
		System.out.println("A를 입력하시오");
		A = sc.nextInt();
		System.out.println("B를 입력하시오");
		B = sc.nextInt();
		System.out.println("C를 입력하시오");
		int C = sc.nextInt();
		
		System.out.println("(A+B)%C="+(A+B)%C);
		System.out.println("((A%C) + (B%C))%C="+((A%C) + (B%C))%C);
		System.out.println("(A+B)%C=((A%C) + (B%C))%C");
		System.out.println("(AxB)%C="+(A*B)%C);
		System.out.println("((A%C) x (B%C))%C="+((A%C) * (B%C))%C);
		System.out.println("(A+B)%C=((A%C) x (B%C))%C");
	}

}
