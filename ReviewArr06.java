 //���ܣ�����һ������,�������±�Ϊ2��λ�������һ��Ԫ��91
 import java.util.*;
 public class ReviewArr06{
	 public static void main(String[] args){
		 //����һ������
		 int[] arr = {23,543,65,335,45,4,777};
		 //           0   1  2   3  4  5  6
		 //������ǰ������
		 System.out.println("���ǰ������Ϊ��"+Arrays.toString(arr));
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("��������Ҫ��ӵ�Ԫ��:");
		 int num = sc.nextInt();
		 System.out.print("��������Ҫ���Ԫ�ص�λ��:");
		 int index = sc.nextInt();
		 
		 //���
		 for(int i=arr.length-1;i>=index+1;i--){
			 arr[i] = arr[i-1];
		 }
		 arr[index] = num;
		  
		 //�����Ӻ������
		  System.out.println("����������Ϊ��"+Arrays.toString(arr));
	 }
 }