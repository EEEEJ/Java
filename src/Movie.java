import java.util.Scanner;

public class Movie
{
   public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
        int children;
        int adult;
        int sum;
        int price = 0;
       
       System.out.print("�Ƶ� ��:");
       children = sc.nextInt();
       
       System.out.print("���� ��:");
       adult = sc.nextInt();
       
       sum = children + adult;
       
       System.out.println("�� ����:" + sum);
       
       price = children*6000 + adult*8000;
       
       System.out.println("�ݾ�:" + price);
   }
}