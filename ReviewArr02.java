//ʵ��һ�����ܣ�����һ������int[] arr = {12,3,7,4,8,125,9,45}; �������������������
public class ReviewArr02{
	public static void main(String[] args){
		int[] arr = {12,3,7,4,8,125,9,45,333,555};
		int MaxNum = getMaxNum(arr);
		
		System.out.println("��������������:"+MaxNum);
	}
	//��ȡΪһ����������ȷ�����أ��ĸ�����
	public static int getMaxNum(int[] arr){
		int MaxNum = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>MaxNum){
				MaxNum = arr[i];
			}
		}
		return MaxNum;
	}
}