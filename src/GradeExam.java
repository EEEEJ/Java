import java.util.Scanner;

public class GradeExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Grade me = new Grade();
		System.out.print("����, ����, ���� ������ 3���� ���� �Է� >> ");
		me.m = sc.nextInt();
		me.s = sc.nextInt();
		me.e = sc.nextInt();
		System.out.print("����� "+ me.average());
	}
	
}

class Grade{
	int m, s, e;
	int average() {
		return (m+s+e)/3;
	}
}