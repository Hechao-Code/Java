//ʵ��һ�����ܣ�����һ������int[] arr = {12,3,7,4,8,125,9,45}; �������������С������
public class TestArray04{
	public static void main(String[] args){
		int[] arr = {12,3,7,4,8,125,9,45,1};
		int MinNum = getMinNum(arr);
		
		System.out.println("��ǰ��������С����Ϊ��"+MinNum);
	}
	
	public static int getMinNum(int[] arr){
		int MinNum = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<MinNum){
				MinNum = arr[i];
			}
		}
		return MinNum;
	}
}