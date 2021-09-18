 //功能：给定一个数组,在数组下标为2的位置上添加一个元素91
 import java.util.*;
 public class ReviewArr06{
	 public static void main(String[] args){
		 //给定一个数组
		 int[] arr = {23,543,65,335,45,4,777};
		 //           0   1  2   3  4  5  6
		 //输出添加前的数组
		 System.out.println("输出前的数组为："+Arrays.toString(arr));
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("请输入你要添加的元素:");
		 int num = sc.nextInt();
		 System.out.print("请输入你要添加元素的位置:");
		 int index = sc.nextInt();
		 
		 //添加
		 for(int i=arr.length-1;i>=index+1;i--){
			 arr[i] = arr[i-1];
		 }
		 arr[index] = num;
		  
		 //输出添加后的数组
		  System.out.println("输出后的数组为："+Arrays.toString(arr));
	 }
 }