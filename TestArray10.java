import java.util.*;
public class TestArray10{
	public static void main(String[] args){
		int[] arr1 = {23,43,45,67,78,66,55};
		int[] arr2 = new int[10];
		System.arraycopy(arr1,2,arr2,3,5);
		System.out.println(Arrays.toString(arr2));
	}
}