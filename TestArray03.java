//实现一个功能：给定一个数组int[] arr = {12,3,7,4,8,125,9,45}; ，求出数组中最大的数。
public class TestArray03{
	public static void main(String[] args){
		int[] arr = {12,3,7,4,8,125,9,45,777};
		int MaxNum = getMaxNum(arr);
		System.out.println("当前数组最大的数为："+MaxNum);
		
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