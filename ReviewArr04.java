//��ѯָ��Ԫ�ص�λ��--���ҳ�Ԫ�ض�Ӧ������ 
import java.util.Scanner;
public class ReviewArr04{
	public static void main(String[] args){
		int[] arr = {234,45,34,4,666,45,3};
		//�ҳ�Ԫ��666��Ӧ������
		Scanner sc = new Scanner(System.in);
		System.out.print("����������Ҫ�ҵ�Ԫ�أ�");
		int num = sc.nextInt();
		int index = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				index = i;
				break;
			}
		}
		if(index!=-1){
			System.out.println("��Ԫ�ض�Ӧ������Ϊ��"+index);
		}else{
			System.out.println("û���ҵ���Ԫ��");
		}
	}
}