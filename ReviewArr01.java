//ʵ��һ�����ܣ�����һ������int[] arr = {12,3,7,4,8,125,9,45}; �������������������
public class ReviewArr01{
	public static void main(String[] args){
		int[] arr = {12,3,7,4,8,125,9,45};
		int MaxNum = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>MaxNum){
				MaxNum = arr[i];
			}
		}
		System.out.println("��������������:"+MaxNum);
	}
}