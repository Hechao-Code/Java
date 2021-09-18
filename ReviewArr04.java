//查询指定元素的位置--》找出元素对应的索引 
import java.util.Scanner;
public class ReviewArr04{
	public static void main(String[] args){
		int[] arr = {234,45,34,4,666,45,3};
		//找出元素666对应的索引
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入你想要找的元素：");
		int num = sc.nextInt();
		int index = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				index = i;
				break;
			}
		}
		if(index!=-1){
			System.out.println("此元素对应的索引为："+index);
		}else{
			System.out.println("没有找到此元素");
		}
	}
}