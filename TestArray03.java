//ʵ��һ�����ܣ�����һ������int[] arr = {12,3,7,4,8,125,9,45}; �������������������
public class TestArray03{
	public static void main(String[] args){
		int[] arr = {12,3,7,4,8,125,9,45,777};
		int MaxNum = getMaxNum(arr);
		System.out.println("��ǰ����������Ϊ��"+MaxNum);
		
	}
	public static int getMaxNum(int[] arr){
		int MaxNum = arr[0];
		for(int i=0;i<=8;i++){
			if(arr[i]>MaxNum){
				MaxNum = arr[i];
			}
		}
		return MaxNum;
	}
}