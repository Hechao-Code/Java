//���ܣ�����һ������,ɾ���±�Ϊ2Ԫ��
import java.util.*;
public class ReviewArr09{
	public static void main(String[] args){
		//����һ������
		int[] arr = {23,35,65,34,43,6};
		//           0  1  2  3  4  5
		//���ɾ��ǰ������
		System.out.println("ɾ��ǰ������Ϊ��"+Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��������Ҫɾ��Ԫ�ص�λ�ã�");
		int index = sc.nextInt();
		delEle(arr,index);
		
		
		
		//���ɾ���������
		System.out.println("ɾ���������Ϊ��"+Arrays.toString(arr));
	}
	//��ȡΪһ����������ȷ�����أ��ĸ����飿ɾ���ĸ�λ�õ�Ԫ�أ�û�з���ֵ
	public static void delEle(int[] arr,int index){
		//ɾ��
		for(int i=index;i<=arr.length-2;i++){
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = 0;
		
	}
}