//ʵ��һ�����ܣ�ɾ��ָ��Ԫ��
import java.util.*;
public class TestArray09{
	public static void main(String[] args){
		int[] arr = {23,54,34,546,57,343,33};
		//���ɾ��ǰ������
		System.out.println("ɾ��ǰ������Ϊ��"+Arrays.toString(arr));
				
		Scanner sc = new Scanner(System.in);
		System.out.print("��������Ҫɾ��������");
		int num = sc.nextInt();
		
		//�ҵ�Ҫɾ������������
		int index = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				index = i;
				break;
			}
		}
		
		//ɾ��
		if(index==-1){
			System.out.println("����û����Ҫɾ����Ԫ�أ�");
		}else{
			for(int i=index;i<=arr.length-2;i++){
			arr[i] = arr[i+1];
			
			}		
			arr[arr.length-1] = 0;
		}
		
		
		
		//���ɾ���������
		System.out.println("ɾ���������Ϊ��"+Arrays.toString(arr));
	}
}