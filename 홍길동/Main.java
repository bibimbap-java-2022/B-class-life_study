import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("���μ�"); 
		System.out.println("202211365");

		
		System.out.println("A�� �Է��Ͻÿ�");
		int A = sc.nextInt();
		System.out.println("B�� �Է��Ͻÿ�");
		int B = sc.nextInt();
		System.out.println("A@B="+(A+B)*(A-B));
		
		
		System.out.println("A�� �Է��Ͻÿ�");
		A = sc.nextInt();
		System.out.println("B�� �Է��Ͻÿ�");
		B = sc.nextInt();
		System.out.println("C�� �Է��Ͻÿ�");
		int C = sc.nextInt();
		
		System.out.println("(A+B)%C="+(A+B)%C);
		System.out.println("((A%C) + (B%C))%C="+((A%C) + (B%C))%C);
		System.out.println("(A+B)%C=((A%C) + (B%C))%C");
		System.out.println("(AxB)%C="+(A*B)%C);
		System.out.println("((A%C) x (B%C))%C="+((A%C) * (B%C))%C);
		System.out.println("(A+B)%C=((A%C) x (B%C))%C");
	}

}
