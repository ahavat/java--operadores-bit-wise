import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int n1 = sc.nextInt();

		System.out.print("Digite segundo numero: ");
		int n2 = sc.nextInt();

		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);

		sc.close();
	}

}
