//实现一个功能：给定一个数组int[] arr = {12,3,7,4,8,125,9,45}; ，求出数组中最大的数。
public class ReviewArr02{
	public static void main(String[] args){
		int[] arr = {12,3,7,4,8,125,9,45,333,555};
		int MaxNum = getMaxNum(arr);
		
		System.out.println("数组中最大的数是:"+MaxNum);
	}
	//提取为一个方法，不确定因素：哪个数组
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