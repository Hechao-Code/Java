//���ܣ�����һ������,ɾ���±�Ϊ2Ԫ��
import java.util.Arrays;
public class TestArray08{
	public static void main(String[] args){
		int[] arr = {23,54,34,546,57,343,33};
		//���ɾ��ǰ������
		System.out.println("ɾ��ǰ������Ϊ��");
		System.out.println(Arrays.toString(arr));
		
		
		//ɾ��
		int index = 2;
		for(int i=index;i<=arr.length-2;i++){
			arr[i] = arr[i+1];
			
		}		
		arr[arr.length-1] = 0;
		
		
		//���ɾ���������
		System.out.println("ɾ���������Ϊ��");
		System.out.println(Arrays.toString(arr));
	}
}