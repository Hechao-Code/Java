//实现一个功能：给定一个数组int[] arr = {12,3,7,4,8,125,9,45}; ，求出数组中最小的数。
public class TestArray04{
	public static void main(String[] args){
		int[] arr = {12,3,7,4,8,125,9,45,1};
		int MinNum = getMinNum(arr);
		
		System.out.println("当前数组中最小的数为："+MinNum);
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