//���ܣ�����һ������,ɾ��Ԫ��6��
import java.util.*;
public class ReviewArr10{
	public static void main(String[] args){
		//����һ������
		int[] arr = {65,45,6,76,4,76,777};
		//           0  1  2 3  4 5   6
		
		//���ɾ��ǰ������
		System.out.println("ɾ��ǰ������Ϊ��"+Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����������Ҫɾ����Ԫ�أ�");
		int num = sc.nextInt();
		
		//ɾ��
		//1.�ҳ�Ԫ�ض�Ӧ������
		int index = -1;
		for(int i =0;i<arr.length;i++){
			if(arr[i]==num){
				index = i;
				break;
			}			
		}
		
		//2.ɾ��ָ��λ�õ�Ԫ��
		if(index!=-1){
			for(int i=index;i<=arr.length-2;i++){
				arr[i] = arr[i+1];
			}
			arr[arr.length-1] = 0;
		}else{
			System.out.println("������û����Ҫɾ����Ԫ�أ�");
		}
		
		//���ɾ���������
			System.out.println("ɾ���������Ϊ��"+Arrays.toString(arr));
			
	}
}