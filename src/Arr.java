import java.util.Scanner;

public class Arr
{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       
       int arr[] = new int[5];
       int max = 0;
       int num = 0;
       
       
       for(int i=0; i<5; i++){
       System.out.print(i+1+"�� �Է�:");
       arr[i] = sc.nextInt();
       }
       
       for(int j=0; j<5; j++){
           
           if(max<arr[j]){
               max = arr[j];
               num+=1;
           }
       }
       
        System.out.print("���� ū ���� " + num + "��° ������ " + max);
   }
}