import java.util.Scanner;

public class AddExam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b, c = 0;
		
		System.out.print("���� ����: ");
		a = sc.nextInt();
		System.out.print("������ ����: ");
		b = sc.nextInt();
		
		for(int i=a; i<=b; i++) {
			c+=i;
		}
		System.out.println(a + "���� " + b + "������ ���� " + c);

	}

}
