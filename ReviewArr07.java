 //���ܣ�����һ������,�������±�Ϊ2��λ�������һ��Ԫ��91
 import java.util.*;
 public class ReviewArr07{
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
		 //���÷���
		 insert(arr,num,index);
		 

		  
		 //�����Ӻ������
		  System.out.println("����������Ϊ��"+Arrays.toString(arr));
	 }
	 //��ȡһ����������ȷ�����أ��ĸ����飿����ĸ�Ԫ�أ��ĸ�λ�ã� ���÷���
	 public static void insert(int[] arr,int ele,int index){
		 //���
		 for(int i=arr.length-1;i>=index+1;i--){
			 arr[i] = arr[i-1];
		 }
		 arr[index] = ele;
	 }
 }