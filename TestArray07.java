//���ܣ�����һ������,�������±�Ϊ2��λ�������һ��Ԫ��91
import java.util.Scanner;
public class TestArray07{
	public static void main(String[] args){
		int[] arr = {23,45,34,5,76,45,23,34,46,454};
		//������ǰ������
		System.out.print("����ǰ�����飺");
		for(int i=0;i<arr.length;i++){
			if(i!=arr.length-1){
				System.out.print(arr[i]+",");
			}else{
				System.out.print(arr[i]);
			}
			
		}
		System.out.println();
		//���
		Scanner sc = new Scanner(System.in);
		System.out.print("��������Ҫ���Ԫ�ص��±꣺");
		int index = sc.nextInt();
		System.out.print("��������Ҫ��ӵ�ָ��Ԫ�أ�");
		int ele = sc.nextInt();
		insert(arr,index,ele);
		
		
		
		//�����Ӻ������
		System.out.print("\n���Ӻ�����飺");
		for(int i=0;i<arr.length;i++){
			if(i!=arr.length-1){
				System.out.print(+arr[i]+",");
			}else{
				System.out.print(arr[i]);
			}
			
		}
	}
	//��ȷ��Ԫ�أ����飬λ�ú�Ԫ��
	public static void insert(int[] arr,int index,int ele){
		for(int i = arr.length-1;i>=index+1;i--){
			arr[i] = arr[i-1];
		}
		arr[index] = ele;
	}
}