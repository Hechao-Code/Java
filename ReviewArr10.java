//功能：给定一个数组,删除元素6：
import java.util.*;
public class ReviewArr10{
	public static void main(String[] args){
		//给定一个数组
		int[] arr = {65,45,6,76,4,76,777};
		//           0  1  2 3  4 5   6
		
		//输出删除前的数组
		System.out.println("删除前的数组为："+Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入你想要删除的元素：");
		int num = sc.nextInt();
		
		//删除
		//1.找出元素对应的索引
		int index = -1;
		for(int i =0;i<arr.length;i++){
			if(arr[i]==num){
				index = i;
				break;
			}			
		}
		
		//2.删除指定位置的元素
		if(index!=-1){
			for(int i=index;i<=arr.length-2;i++){
				arr[i] = arr[i+1];
			}
			arr[arr.length-1] = 0;
		}else{
			System.out.println("数组里没有你要删除的元素！");
		}
		
		//输出删除后的数组
			System.out.println("删除后的数组为："+Arrays.toString(arr));
			
	}
}