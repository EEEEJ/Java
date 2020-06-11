import java.util.Scanner;

public class GradeExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Grade me = new Grade();
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		me.m = sc.nextInt();
		me.s = sc.nextInt();
		me.e = sc.nextInt();
		System.out.print("평균은 "+ me.average());
	}
	
}

class Grade{
	int m, s, e;
	int average() {
		return (m+s+e)/3;
	}
}