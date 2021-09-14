/*public class TestMethod01{
	
	public static int add(int num1,int num2){
			int sum = 0;
			sum+=num1;
			sum+=num2;
			return sum;
	}		
	public static void main(String[] args){
		
		int sum = add(20,30);
		System.out.println(sum);
	}
}
*/
public class TestMethod01{
	
	public static void add(int num1,int num2){
		int sum = 0;
		sum += num1;
		sum += num2;
		System.out.println(sum);
	}
	public static void main(String[] args){
		add(20,70);
	}
}